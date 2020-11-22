pipeline{
	agent any
	environment{
		new_version='1.0.0'
		//server_credentials= credentails('newuser-1')
	}
	stages{
		stage("build"){
			steps{
				echo 'build the app'
				echo "building with version ${new_version}"
			}
		}
		stage("test"){
			steps{
				echo 'testing the app'
			}
		}
		stage("deploy"){
			steps{
				echo 'deploying the app'
				withCredentials([
					usernamePassword(credentials:'server_credentials',usernameVariable: USER,passwordVariable:PWD)
				]) {
					sh "some script ${USER} ${PWD}"
				}
			}
		}
	}	
}
