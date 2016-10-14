#! /bin/sh

#删除rc
curl -X DELETE http://54.200.161.225:8080/api/v1/namespaces/default/replicationcontrollers/cust-catalog

#删除pod
curl -X DELETE http://54.200.161.225:8080/api/v1/namespaces/default/pods/cust-catalog-tvhcy

#提交json，新建rc
curl -X POST http://54.200.161.225:8080/api/v1/namespaces/default/replicationcontrollers \
	  -H "Content-Type:application/yaml" --data-binary "@cust-catalog-rc.yaml"