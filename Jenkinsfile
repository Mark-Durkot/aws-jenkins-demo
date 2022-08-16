pipeline {
    
    agent any

    tools {
        maven 'Maven-3-8-6'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn package -DSkipTests'
            }
        }   

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            // steps {
            //     // copy the artifact to remote EC2 instance using ssh and scp

            //     // run the startup.sh script on remote EC2 instance using ssh
            // }
        }

    }

}

