pipeline {
    agent any
    stages {
//         stage('Build') {
//             steps {
//                 echo 'Hello world Build!'
//             }
//         }
        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
    }
}