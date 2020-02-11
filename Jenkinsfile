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
       withMaven(maven: 'maven') {
         		if(isUnix()) {
              sh "mvn clean compile" 
            } else { 
              bat "mvn clean compile" 
            } 
        }

      }
    }
    stage('Test') {
      steps {
        withMaven(maven: 'maven') {
          	if(isUnix()) {
              sh "mvn test" 
            } else { 
              bat "mvn test" 
            } 
        }

      }
    }
    stage('Package') {
      steps {
       withMaven(maven: 'maven') {
         if(isUnix()) {
              sh "mvn package -DskipTests" 
            } else { 
              bat "mvn package -DskipTests"  
            } 
        }
      }
    }
    stage('Quality') {
      steps {
       withMaven(maven: 'maven') {
           if(isUnix()) {
              sh 'mvn sonar:sonar -Dsonar.projectKey="ddd-sample-master"'
            } else { 
              bat 'mvn sonar:sonar -Dsonar.projectKey="ddd-sample-master"'
            } 
        }

      }
    }
  }
}
