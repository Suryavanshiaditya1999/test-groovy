@Library('my-shared-lib') _

import org.example.Depen

pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                script {
                    // Call your function from shared library
                    Depen()
                }
            }
        }
    }
}
