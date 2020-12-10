pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Deploy') {
      steps {
        sh '''mv target/examPro-0.0.1-SNAPSHOT.war /home/ec2-user/apache-tomcat-8.5.60/webapps/examPro.war
'''
      }
    }

  }
}