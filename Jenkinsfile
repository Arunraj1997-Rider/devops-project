pipeline {
    agent any

    stages {

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t hello-devops .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8080:81 hello-devops'
            }
        }
    }
}


