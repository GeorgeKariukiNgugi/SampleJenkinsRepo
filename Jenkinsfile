pipeline {

    agent any

    stages {
  stage('maven Install') {
    steps {      
withMaven(globalMavenSettingsConfig: '--- Use system default settings or file path ---', jdk: 'Java17', maven: 'Maven 3', mavenSettingsConfig: '--- Use system default settings or file path ---') {
      echo '===================='
      echo 'This is the build Phase'
      echo '===================='
      sh 'mvn --v'
      echo '===================='
      sh 'mvn clean install'    
}
    }
  } 
 }
}
