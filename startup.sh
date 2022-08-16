#!/bin/bash

kill $(/usr/sbin/lsof -t -i:8081)

nohup java -jar aws-jenkins-demo-0.0.1-SNAPSHOT.jar > ~/log.txt 2>&1 &

echo $! > pid.file