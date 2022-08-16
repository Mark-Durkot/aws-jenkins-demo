#!/bin/bash

echo 'Proccesses on port 8081 before cleaning:'
sudo lsof -i:8080

kill -15 < pid.file

echo 'Proccesses on port 8081 after cleaning:'
sudo lsof -i:8080

kill -15 $(sudo lsof -t -i:8081)

nohup java -jar aws-jenkins-demo-0.0.1-SNAPSHOT.jar > ~/log.txt 2>&1 &

echo $! > pid.file