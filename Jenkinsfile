@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Hello World') {
            steps {
                script {
                    // Call the HelloWorld class method
                    org.example.Dependency.sayHello()
                }
            }
        }
    }
}
