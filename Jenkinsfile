@Library('my-shared-lib') _

node {
    stage('Checkout') {
        // Check out the repository
        checkout([$class: 'GitSCM', 
                  branches: [[name: '*/main']], 
                  doGenerateSubmoduleConfigurations: false, 
                  extensions: [], 
                  submoduleCfg: [], 
                  userRemoteConfigs: [[url: 'https://github.com/OT-MICROSERVICES/attendance-api.git']]
                 ])
    }

    stage('Setup and Coverage') {
        // Call the function from the shared library
        dependency.call()
    }
}
