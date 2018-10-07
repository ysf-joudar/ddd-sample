pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/bnasslahsen/ddd-sample.git', credentialsId: 'git-login', branch: 'master')
      }
    }
    stage('Compile') {
      steps {
       withMaven(maven: 'maven-3.5.4') {
          sh 'mvn clean compile'
        }

      }
    }
    stage('Test') {
      steps {
        withMaven(maven: 'maven-3.5.4') {
          sh 'mvn test'
        }

      }
    }
    stage('Package') {
      steps {
       withMaven(maven: 'maven-3.5.4') {
          sh 'mvn package -DskipTests'
        }

      }
    }
    stage('Quality') {
      steps {
       withMaven(maven: 'maven-3.5.4') {
          sh 'mvn sonar:sonar -Dsonar.projectKey="ddd-sample-master"'
        }

      }
    }
  }
}
