node{
  stage('SCM Checkout'){
    git 'https://github.com/vamshithota/jenkins-maven'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
  stage('Email Notification'){
    mail bcc: '', body: 'hi from jenkins', cc: '', from: '', replyTo: '', subject: 'testing through jenkins', to: 'vamshi.thota4@gmail.com'
  }
}
