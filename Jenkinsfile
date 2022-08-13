pipeline {
    
    agent any

    environment {
        MY_VARIABLE = 'Mark Durkot'
    }

    tools {
        maven 'Maven-3-8-6'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }   

        stage('Test') {
            sh 'echo This is a test stage'
        }

    }

}