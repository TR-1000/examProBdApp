pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -D clean package'
      }
    }

  }
}