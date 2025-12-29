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
                sh 'docker run -d -p 80:81 hello-devops'
            }
        }
    }
}

