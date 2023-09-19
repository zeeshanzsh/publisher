pipeline {
    agent any

    environment {
            // Define environment variables for Docker Hub credentials
            DOCKER_HUB_USERNAME = credentials('dockerhub-username')
            DOCKER_HUB_PASSWORD = credentials('dockerhub-password')
     }
    stages {
        stage('Build project') {
            steps {
                git 'https://github.com/zeeshanzsh/publisher.git'
                sh '/opt/homebrew/bin/mvn clean install'
            }
        }
        stage('Docker build image'){
            steps{
                script{
                    sh 'docker build -t zohanizna/publisher .'
                }
            }
        }
        stage('Push Image to Docker-Hub'){
            steps{
                script{
                    withEnv(['docker_hub="ZohanIzna&1617"']) {
                        sh 'docker login -u $DOCKER_HUB_USERNAME -p $docker_hub'
                }
                  sh 'docker push zohanizna/publisher'
                }
            }
        }
    }
}
