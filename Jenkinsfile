pipeline {
    agent any
    tools{
        maven 'Maven_latest'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Madhu-TYP502/QSP-DB-Trainer-ws']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t trainer-ws/trainer-ws .'
                }
            }
        }
         stage('Push image to Hub')
         {
            steps
            {
                script
                {
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) 
                   {
                    sh 'docker login -u madhutyp502 -p ${dockerhubpwd}'
                   }
                   sh 'docker push madhutyp502/trainer-ws'
                }
            }
         }
}
}