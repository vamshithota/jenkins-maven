pipeline{
	agent any
	environment{
		new_version='1.0.0'
	}
	tools{
		maven 'M3'
	}
	stages{
		stage("build"){
			steps{
				echo 'build the app'
				echo "building with version ${new_version}"
				sh "mvn install"
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
				/*withCredentials([
					usernamePassword(credentials:'newuser-1',usernameVariable: USER,passwordVariable:PWD)
				]) {
					sh "some script ${USER} ${PWD}"
				}*/
			}
		}
	}	
}
