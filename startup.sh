#!/bin/bash

echo 'On port 8081 before kill'
lsof -i:8081

kill $(lsof -t -i:8081)

echo 'On port 8081 after kill'
lsof -i:8081

nohup java -jar aws-jenkins-demo-0.0.1-SNAPSHOT.jar > ~/log.txt 2>&1 &
echo $! > pid.file

echo 'On port 8081 after start'
lsof -i:8081