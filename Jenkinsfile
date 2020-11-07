pipeline{
  stages{
   stage('SCM Checkout'){
      git 'https://github.com/vamshithota/jenkins-maven'
    }
    stage('Compile-Package'){
      sh 'mvn package'
    }
  }
}


