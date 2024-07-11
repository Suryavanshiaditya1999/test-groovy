import org.example.Depen

def depen = new Depen()

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
        // Pass both workspaceDir and env to the setupAndRunTests method
        depen.setupAndRunTests(env, workspaceDir)
    }
    
    stage('Clean up') {
        echo 'Cleaning up...'
        sh 'deactivate'  // Deactivate the virtual environment
        sh 'rm -rf myenv' // Remove the virtual environment
    }
}
