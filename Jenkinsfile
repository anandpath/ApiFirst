pipeline {
    agent any
//     parameters {
//         choice(choices: ["A", "B", "C"], description: "What is your choice?", name: "selectionChoice")
//     }
    stages {
//         stage("Demo") {
//             steps {
//                 echo "${selectionChoice} was selected"
//             }
//         }
            stage("build") {
                steps {
                    gradlew clean build
                }
            }
    }
}
