pipeline {
    agent any
     environment {
        DOCKER_IMAGE = "dungnqitedu/spring-boot-image"
     }
    stages {
        stage('Test') {
            steps {
                echo 'Hello test!!!'
                sh 'gradle test'
            }
        }
        stage('Build') {
            steps {
                echo 'Welcome to Build!!!'
                sh 'gradle build'
            }
        }
        stage('Build Docker') {
            steps {
                echo 'Welcome to Docker!!!'
				withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
					sh 'echo $DOCKER_PASSWORD | docker login --username $DOCKER_USERNAME --password-stdin'
				}
				sh 'docker build -t dungnqitedu/spring-boot-image .'
				sh 'docker push dungnqitedu/spring-boot-image'
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