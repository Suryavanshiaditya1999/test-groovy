// Jenkinsfile

@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Setup Environment') {
            steps {
                script {
                    def setupFunction = org.example.dependency.setupVirtualEnvironment()
                    setupFunction()
                }
            }
        }
        // Add more stages as needed
    }

    // Post-build actions, etc.
}
