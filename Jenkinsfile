@Library('my-shared-lib') _

import org.example.Depen

node {
    def workspaceDir = "${WORKSPACE}"
    
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
        // Call the function from the shared library with workspaceDir as argument
        new Depen().call(workspaceDir)
    }
    
    stage('Clean up') {
        echo 'Cleaning up...'
        sh 'deactivate'
        sh 'rm -rf myenv'
    }
}
