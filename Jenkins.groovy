pipeline {
  agent any
  stages {
    stage('Clone Repo') {
      steps {
        git 'https://github.com/your-repo/devops-project.git'
      }
    }
    stage('Build Docker Image') {
      steps {
        sh 'docker build -t devops-app .'
      }
    }
    stage('Run Container') {
      steps {
        sh 'docker run -d -p 80:80 devops-app'
      }
    }
  }
}
