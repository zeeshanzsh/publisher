pipeline {
    agent any
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
                    sh 'docker build -t zeeshan/publisher .'
                }
            }
        }
        stage('Push Image to Docker-Hub'){
            steps{
                script{
                  withCredentials([string(credentialsId: 'docker-hubpwd', variable: 'docker-pwd')]) {
                    sh 'echo ${docker-pwd}'
                    sh 'docker login -u zohanizna -p ${docker-pwd}'
                  }

                  sh 'docker push zeeshan/publisher'
                }
            }
        }
    }
}
