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
                bat 'docker build -t dungnqitedu/spring-boot-image .'
				withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'dungnq.itedu@gmail.com', passwordVariable: 'Bon@123456')]) {
					bat 'docker login --username dungnq.itedu@gmail.com --password Bon@123456'
					bat 'docker push dungnqitedu/spring-boot-image'
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