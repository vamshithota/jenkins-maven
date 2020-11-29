pipeline{
	agent any
	environment{
		new_version='1.0.0'
		USER_ID = 1234
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
			environment{
				USER_PATH = "/home/vamsh"
			}
			steps{
				echo "BUILD_NUMBER = ${env.BUILD_NUMBER}"
				sh 'echo BUILD_NUMBER = $BUILD_NUMBER'
				
				echo "Current user is ${env.USER_NAME}"
				echo "Current user id is ${env.USER_ID} (type: ${env.USER_ID.class})"
				echo "Current user path is ${env.USER_PATH}"
				script{
					env.USER_GROUP = "users"
				}
				
				echo "current user group is ${env.USER_GROUP}"
				
				//withEnv(["USER_PWD=secret","USER_IS_ADMIN=false"]){
				//	echo "current user password id ${env.USER_PWD}"
				//	sh 'is current user is admin? : $USER_IS_ADMIN'
			//	}
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

