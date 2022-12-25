pipeline {

    agent any

    stages {
  stage('maven Install') {
    steps {      
withMaven(jdk: 'Java17', maven: 'Maven 3') {
      echo '===================='
      echo 'This is the build Phase'
      echo '===================='
      sh 'mvn --v'
      echo '===================='
      sh 'mvn clean install -s mvn-settings.xml'    
}
    }
  } 
 }
}
