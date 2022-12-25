pipeline {

    agent any

    stages {
  stage('maven Install') {
    steps {
      // One or more steps need to be included within the steps block.
      echo 'This is the build Phase'
      withMaven(
      globalMavenSettingsConfig: '--- Use system default settings or file path ---', jdk: '--- Use system default JDK ---', maven: '--- Use system default Maven ---', mavenSettingsConfig: '--- Use system default settings or file path ---') {
    // some block
    sh 'mvn clean install'
}
    }
  } 
 }
}
