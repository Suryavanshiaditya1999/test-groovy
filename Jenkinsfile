// Jenkinsfile

@Library('my-shared-lib') _

import org.example.Dependency

pipeline {
    agent any

    stages {
        stage('Setup Environment') {
            steps {
                script {
                    def dependency = new Dependency()
                    def setupFunction = dependency.setupVirtualEnvironment()
                    setupFunction.call()
                }
            }
        }
        // Add more stages as needed
    }

    // Post-build actions, etc.
}
