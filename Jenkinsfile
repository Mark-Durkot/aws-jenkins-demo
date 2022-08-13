pipeline {
    
    agent any

    environment {
        MY_VARIABLE = 'Mark Durkot'
    }

    stages {

        stage('Testing') {
            steps {
                sh 'echo $MY_VARIABLE'
                acricher
            }
        }

    }

    post {

        always {
            sh 'echo ALWAYS'
        }

        failure {
            sh 'echo FAILURE'
        }

    }

}