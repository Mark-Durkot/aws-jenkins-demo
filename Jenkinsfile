pipeline {
    
    agent any

    tools {
        maven 'Maven-3-8-6'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn package -DSkipTests'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }   

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([file(credentialsId: 'server-app-instance-keys', variable: 'KEYS')]) {
                    // copy the artifact to remote EC2 instance using ssh and scp
                    echo 'copying...'
                    sh "scp -o StrictHostKeyChecking=no -i ${KEYS} target/*.jar ec2-user@ec2-52-54-168-66.compute-1.amazonaws.com:~"

                    // run the startup.sh script on remote EC2 instance using ssh
                    echo 'running...'
                    sh "ssh -o StrictHostKeyChecking=no -i ${KEYS} ec2-user@ec2-52-54-168-66.compute-1.amazonaws.com 'bash -s' < startup.sh"
                }

                echo 'Deploy stage to be done'
            }
        }

    }

}

