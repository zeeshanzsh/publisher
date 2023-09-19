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
        withEnv(['docker_hub="ZohanIzna&1617"']) {
                sh "docker login -u zohanizna -p $docker_hub"
                }



                  sh 'docker push zeeshan/publisher'
                }
            }
        }
    }
}
