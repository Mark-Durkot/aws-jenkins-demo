pipeline {
    
    agent any

    stages {

        stage('Build') {
            steps { 
                sh './mvnw clean'
                archiveArtifacts artifacts: "**/target/*.jar", fingerprint: true
            }
        }

    }

}