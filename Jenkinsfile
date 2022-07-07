pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Welcome to clean!!!'
                sh './gradlew clean'
                echo 'Welcome to build!!!'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello test!!!'
                sh './gradlew test'
            }
        }
    }
}