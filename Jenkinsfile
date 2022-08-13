pipeline {
    
    agent any

    stages {

        stage('Build') {
            steps { 
                sh './mvnw'
                arciveArticatcs artifacts: "**/target/*.jar", fingerprint: true
            }
        }

    }

}