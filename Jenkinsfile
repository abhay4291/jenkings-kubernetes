pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'javac LoginApp.java'
            }
        }

        stage('Test Run') {
            steps {
                sh 'echo "admin" | java LoginApp || true'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: '*.class', fingerprint: true
            }
        }
    }
}

