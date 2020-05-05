pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/bnasslahsen/ddd-sample.git', credentialsId: 'git-login', branch: 'develop')
      }
    }
    stage('Compile') {
      steps {
       withMaven(maven: 'maven') {
          sh 'mvn clean compile'
        }

      }
    }
    stage('Test') {
      steps {
        withMaven(maven: 'maven') {
          sh 'mvn test'
        }

      }
    }
    stage('Package') {
      steps {
       withMaven(maven: 'maven') {
          sh 'mvn package -DskipTests'
        }

      }
    }
    stage('Quality') {
      steps {
       withMaven(maven: 'maven') {
          sh 'mvn sonar:sonar -Dsonar.projectKey="ddd-sample-develop"'
        }

      }
    }
  }
}
