package org.example

class Depen {
    void call(workspaceDir) {
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
