pipeline {
    agent any
     environment {
        DOCKER_IMAGE = "dungnqitedu/spring-boot-image"
     }
    stages {
        stage('Test') {
            steps {
                echo 'Hello test!!!'
                bat 'gradle test'
            }
        }
        stage('Build') {
            steps {
                echo 'Welcome to Build!!!'
                bat 'gradle build'
            }
        }
        stage('Build Docker') {
            steps {
                echo 'Welcome to Docker!!!'
                bat 'docker build -t ${DOCKER_IMAGE} .'
				withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'dungnq.itedu@gmail.com', passwordVariable: 'Bon@123456')]) {
					bat 'echo Bon@123456 | docker login --username dungnq.itedu@gmail.com --password-stdin'
					bat 'docker push ${DOCKER_IMAGE}'
				}
                
            }
        }
    }
    post {
        always {
            echo 'End program!!!'
        }
        success {
            echo 'I Success Program!!!'
        }
        failure {
            echo 'I Failed Program!!!'
        }
    }
}