#!/bin/bash
nohup java -jar aws-jenkins-demo-0-0-1-SNAPSHOT.jar
echo $! > pid.file