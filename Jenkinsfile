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

                withCredentials([string(credentialsId: 'gold_hub', variable: 'Docker-Hub')]) {
                  sh 'docker login -u zohanizna -p ${Docker-Hub}'
                }


                  sh 'docker push zeeshan/publisher'
                }
            }
        }
    }
}
