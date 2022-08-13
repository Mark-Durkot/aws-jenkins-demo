pipeline {
    
    agent any

    stages {

        stage('Build') {
            steps { 
                sh './mvnw clean'
                archiveArticatcs artifacts: "**/target/*.jar", fingerprint: true
            }
        }

    }

}