pipeline{
	agent any
	environment{
		new_version='1.0.0'
	}
	tools{
		maven 'M3'
	}
	parameters{
		choice(name:'VERSION',choices:['1.1.0','1.2.0','1.3.0'],description:'')
		booleanParam(name:'executeTests',defaultValue:true,description:'')
	}
	stages{
		stage("list env vars"){
			steps{
				sh "printenv | sort"
			}
		}
		stage("using env vars"){
			steps{
				echo "BUILD_NUMBER = ${env.BUILD_NUMBER}"
				sh 'echo BUILD_NUMBER = $BUILD_NUMBER'
			}
		}
		stage("build"){
			steps{
				echo 'build the app'
				echo "building with version ${new_version}"
				sh "mvn install"
			}
		}
		stage("test"){
			when{
				expression{
			 	 params.executeTests	
			    }
			}
			steps{
				echo 'testing the app'
			}
		}
		stage("deploy"){
			steps{
				echo 'deploying the app'
		    }   
	    }
    }	
}

