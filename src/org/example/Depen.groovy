package org.example

class Depen {
    void setupAndRunTests(Map<String, String> env, String workspaceDir) {
        // Now you can access the env object directly
        echo "Current directory: ${env.WORKSPACE}"
        echo "Workspace directory: ${workspaceDir}"
        
        // Your existing setup and test execution commands...
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
