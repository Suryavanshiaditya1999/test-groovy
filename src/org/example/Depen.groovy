package org.example

class Depen {
    void call() {
        def workspaceDir = "${WORKSPACE}"
        println "Current directory: ${pwd()}"
        println "Workspace directory: ${workspaceDir}"
        sh """
            ls -la ${workspaceDir}
            python3 -m venv myenv
            . myenv/bin/activate
            echo "Workspace directory: ${workspaceDir}"
            pip install -r ${workspaceDir}/requirements.txt
            pip install coverage
            pip install pytest
            coverage run -m pytest
            coverage report -m
        """
    }
}
