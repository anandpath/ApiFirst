pipeline {
    agent any
    stages {
        stage('Clean Workspace') {
            steps {
                deleteDir()
            }
        }
        stage('Clone Project') {
            steps {
                checkout scm
            }
        }
        stage("build") {
            steps {
                sh "${projectDir}./gradlew clean build"
            }
        }
    }
}
