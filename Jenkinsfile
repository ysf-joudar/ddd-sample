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
        withMaven(maven: 'MAVEN-3', jdk: 'JDK-8') {
          sh 'mvn clean compile'
        }

      }
    }
    stage('Test') {
      steps {
        withMaven(jdk: 'JDK-8', maven: 'MAVEN-3') {
          sh 'mvn test'
        }

      }
    }
    stage('Package') {
      steps {
        withMaven(jdk: 'JDK-8', maven: 'MAVEN-3') {
          sh 'mvn package -DskipTests'
        }

      }
    }
    stage('Quality') {
      steps {
        withMaven(jdk: 'JDK-8', maven: 'MAVEN-3') {
          sh 'mvn sonar:sonar'
        }

      }
    }
  }
}