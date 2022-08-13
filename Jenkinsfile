pipeline {
    
    agent any

    stages {

        stage('Build') {
            steps { 
                sh './mvnw clean'
                arciveArticatcs artifacts: "**/target/*.jar", fingerprint: true
            }
        }

    }

}