pipeline{
	agent any
	environment{
		new_version='1.0.0'
	}
	tools{
		maven 'M3'
	}
	parameters{
		//string(name:'VERSION',defaultValue:'',description:'version to deploy')
		choice(name:'VERSION',choices:['1.1.0','1.2.0','1.3.0'],description:'')
		booleanParam(name:'executeTests',defaultValue:true,description:'')
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
				echo "deploying the version params.VERSION"
				/*withCredentials([
					usernamePassword(credentials:'newuser-1',usernameVariable: USER,passwordVariable:PWD)
				]) {
					sh "some script ${USER} ${PWD}"
				}*/
			}
		}
	}	
}
