@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Setup Environment') {
            steps {
                script {
                    org.dependency.setupVirtualEnvironment()
                }
            }
        }
       
    }
}
