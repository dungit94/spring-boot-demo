pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Welcome to clean!!!'
                bat 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello test!!!'
                bat 'gradle test'
            }
        }
    }
}