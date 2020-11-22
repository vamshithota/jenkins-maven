pipeline{
	agent any
	environment{
		new_version='1.0.0'
	}
	stages{
		stage("build"){
			steps{
				echo 'build the app'
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
			}
		}
	}	
}
