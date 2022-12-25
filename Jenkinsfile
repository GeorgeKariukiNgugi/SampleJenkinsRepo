pipeline {

    agent any

    stages {
  stage('maven Install') {
    steps {
      // One or more steps need to be included within the steps block.   
      echo '===================='
      echo 'This is the build Phase'
      echo '===================='
      sh 'echo mvn --v'
      echo '===================='
withMaven(globalMavenSettingsConfig: '--- Use system default settings or file path ---', jdk: 'Java17', maven: 'Maven 3', mavenSettingsConfig: '--- Use system default settings or file path ---') {
    // some block
    sh 'mvn clean install'    
}
    }
  } 
 }
}
