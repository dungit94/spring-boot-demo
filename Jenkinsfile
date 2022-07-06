pipeline {
    agent any
    docker {
        image 'openjdk:11'
        args '-v "$PWD":/app'
        reuseNode true
    }
    stages {
//         stage('Build') {
//             steps {
//                 echo 'Hello world Build!'
//             }
//         }
        stage('Test') {
            steps {
               sh './gradlew clean build'
            }
        }
    }
}