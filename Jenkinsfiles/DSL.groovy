pipeline {
  agent any 
  stages {
    stage ('Build') {
      steps {
       echo 'Hi,welcome to Build stage'
      }
    }
    stage ('Test') {
      steps {
       echo 'Hi,welcome to Test stage'
      }
    }
    stage ('Deploy') {
      steps {
       echo 'Hi,welcome to Deploy stage'
      }
    }
  }
}
