#!/bin/bash

kill -15 < pid.file


nohup java -jar aws-jenkins-demo-0.0.1-SNAPSHOT.jar > ~/log.txt 2>&1 &

echo $! > pid.file