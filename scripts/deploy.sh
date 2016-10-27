#! /bin/sh

#设置名字
serviceName="cust-catalog"
readonly serviceName

#删除rc
echo "\n----------------------------------start delete ${serviceName} rc---------------------------------------------\n"
curl -X DELETE https://35.161.132.35:8080/api/v1/namespaces/default/replicationcontrollers/${serviceName}
echo "\n----------------------------------end delete ${serviceName} rc-----------------------------------------------\n"

#获取到所有的pods
echo "\n----------------------------------start get all ${serviceName} pod-------------------------------------------\n"
podList=$(curl -X GET https://35.161.132.35:8080/api/v1/namespaces/default/pods)
echo "\n----------------------------------end get all ${serviceName} pod---------------------------------------------\n"

#删除所有pod
echo "\n----------------------------------start delete all ${serviceName} pod----------------------------------------\n"
for podName in $(echo $podList | grep -oE ${serviceName}"-[a-zA-Z0-9]{1,5}")
do
	curl -X DELETE https://35.161.132.35:8080/api/v1/namespaces/default/pods/$podName
done
echo "\n----------------------------------end delete all ${serviceName} pod------------------------------------------\n"

#提交yaml文件，新建rc
echo "------------------------------------start post cust-catalog-rc.yaml to k8s-------------------------------------\n"
curl -X POST https://35.161.132.35:8080/api/v1/namespaces/default/replicationcontrollers \
	  -H "Content-Type:application/yaml" --data-binary "@./scripts/cust-catalog-rc.yaml"
echo "\n----------------------------------end post cust-catalog-rc.yaml to k8s---------------------------------------\n"
