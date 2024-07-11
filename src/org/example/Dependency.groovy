package org.example

class HelloWorld {
    static void sayHello() {
        println "Hello, World!"
        setupPythonEnvironment()
    }

    static void setupPythonEnvironment() {
        sh 'git clone https://github.com/OT-MICROSERVICES/attendance-api.git'
        sh 'cd attendance'
        sh 'python3 -m venv myenv'
        sh '. myenv/bin/activate'
        sh 'snyk test --file=poetry.lock'

    }
}
