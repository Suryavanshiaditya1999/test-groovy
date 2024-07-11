// Jenkinsfile

@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Setup Environment') {
            steps {
                script {
                    org.example.dependency.setupVirtualEnvironment()
                }
            }
        }
        // Add more stages as needed
    }

    // Post-build actions, etc.
}
