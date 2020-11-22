node{
 stage('build'){
 
  }
 stage('SCM Checkout'){
      git 'https://github.com/vamshithota/jenkins-maven'
        if (env.BRANCH_NAME == 'master') {
            echo 'I only execute on the master branch'
        }
  }
 stage('Compile-Package'){
      sh 'mvn package'
  }
 stage('Email Notification'){
      mail bcc: '', body: 'hi from jenkins', cc: '', from: '', replyTo: '', subject: 'testing through jenkins', to: 'vamshi.thota4@gmail.com'
   }
}
