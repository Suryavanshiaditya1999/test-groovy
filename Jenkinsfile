@Library('my-shared-lib') _

import org.example.Dependency

pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                script {
                    Dependency()
                }
            }
        }
    }
}
