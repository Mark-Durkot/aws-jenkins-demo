pipeline {
    
    agent any

    environment {
        MY_VARIABLE = 'Mark Durkot'
    }

    tools {
        maven 'maven-3.6.3' 
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }   

    }

}