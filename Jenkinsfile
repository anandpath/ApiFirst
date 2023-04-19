pipeline {
    agent any
    parameters {
        choice(choices: ["A", "B", "C"], description: "What is your choice?", name: "selectionChoice")
    }
    stages {
        stage("Demo") {
            steps {
                echo "Selected: ${selectionChoice}"
            }
        }
    }
}
