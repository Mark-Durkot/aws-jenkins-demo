pipeline {
    
    agent any

    stages {

        stage('Build') {
            steps { 
                sh './mvnw clean'
                archiveArtifacts artifacts: '*.jar', fingerprint: true
            }
        }

    }

}