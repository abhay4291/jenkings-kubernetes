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

        stage('Package JAR') {
            steps {
                sh 'jar cfe LoginApp.jar LoginApp LoginApp.class'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '*.jar', fingerprint: true
            }
        }

        stage('Deploy (Run JAR)') {
            steps {
                sh 'java -jar LoginApp.jar'
            }
        }
    }
}
