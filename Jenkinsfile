pipeline {
    
    agent any

    environment {
        MY_VARIABLE = 'Mark Durkot'
    }

    stages {

        stage('Testing') {
            steps {
                echo "${MY_VARIABLE}"
            }
        }

    }

}