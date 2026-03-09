pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Show Project Files') {
            steps {
                sh 'ls -la'
            }
        }

        stage('Show Java Version') {
            steps {
                sh 'java -version'
            }
        }
    }
}