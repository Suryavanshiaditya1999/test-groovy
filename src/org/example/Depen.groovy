package org.example

class Depen {
    void setupAndRunTests(String workspaceDir) {
        // Execute shell commands directly in the Jenkinsfile
        // This method is designed to set up the environment and run tests
        echo "Current directory: ${pwd()}"
        echo "Workspace directory: ${workspaceDir}"
        // You can optionally log the contents of the workspace directory
        sh "ls -la ${workspaceDir}"
        sh "python3 -m venv myenv"
        sh ". myenv/bin/activate"
        sh "pip install -r ${workspaceDir}/requirements.txt"
        sh "pip install coverage"
        sh "pip install pytest"
        sh "coverage run -m pytest"
        sh "coverage report -m"
    }
}
