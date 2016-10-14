#! /bin/sh

#删除rc
echo "--------------------------------------------------------------------------------------------------\n"
echo "delete cust-catalog rc\n"
curl -X DELETE -s http://54.200.161.225:8080/api/v1/namespaces/default/replicationcontrollers/cust-catalog
echo "--------------------------------------------------------------------------------------------------\n"

echo "--------------------------------------------------------------------------------------------------\n"
echo "delete cust-catalog pod\n"
#删除pod
curl -X DELETE -s http://54.200.161.225:8080/api/v1/namespaces/default/pods/cust-catalog-6mreq
echo "--------------------------------------------------------------------------------------------------\n"

echo "--------------------------------------------------------------------------------------------------\n"
echo "post cust-catalog-rc.yaml to k8s\n"
#提交json，新建rc
curl -X POST http://54.200.161.225:8080/api/v1/namespaces/default/replicationcontrollers \
	  -H "Content-Type:application/yaml" --data-binary "@./scripts/cust-catalog-rc.yaml"
echo "--------------------------------------------------------------------------------------------------\n"