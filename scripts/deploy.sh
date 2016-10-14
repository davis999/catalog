#! /bin/sh

#删除rc
echo "\n----------------------------------start delete cust-catalog rc-----------------------------------------------\n"
curl -X DELETE http://54.200.161.225:8080/api/v1/namespaces/default/replicationcontrollers/cust-catalog
echo "\n----------------------------------end delete cust-catalog rc-------------------------------------------------\n"

#获取到所有的pods
echo "\n----------------------------------start get all cust-catalog pod---------------------------------------------\n"
podList=$(curl -X GET http://54.200.161.225:8080/api/v1/namespaces/default/pods)
echo "\n----------------------------------end get all cust-catalog pod-----------------------------------------------\n"

#删除所有cust-catalog的pod
echo "\n----------------------------------start delete all cust-catalog pod------------------------------------------\n"
for podName in $(echo $podList | grep -oE 'cust-catalog-[a-zA-Z0-9]{1,5}')
do
	curl -X DELETE http://54.200.161.225:8080/api/v1/namespaces/default/pods/$podName
done
echo "\n----------------------------------end delete all cust-catalog pod--------------------------------------------\n"

#提交json，新建rc
echo "------------------------------------start post cust-catalog-rc.yaml to k8s-------------------------------------\n"
curl -X POST http://54.200.161.225:8080/api/v1/namespaces/default/replicationcontrollers \
	  -H "Content-Type:application/yaml" --data-binary "@./scripts/cust-catalog-rc.yaml"
echo "\n----------------------------------end post cust-catalog-rc.yaml to k8s---------------------------------------\n"