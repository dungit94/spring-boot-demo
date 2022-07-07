pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Welcome to clean!!!'
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello test!!!'
                sh 'gradle test'
            }
        }
    }
}