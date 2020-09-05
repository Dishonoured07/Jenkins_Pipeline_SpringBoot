pipeline {
    agent any
    tools{
        maven 'MyMaven'
        jdk 'JAVA'
    }
    stages {
        stage ('Git pull'){
            steps{
                git 'https://github.com/Dishonoured07/Jenkins_Pipeline_SpringBoot'
        
                
            }
        }
        stage('Compile Stage') {
            steps {
                  sh 'mvn clean compile'             
            }
        }
        
        stage('Package Stage') {
            steps {
                  sh 'mvn  package'             
            }
        }
        
         stage('Build  Stage') {
            steps {
            
               echo 'Building ...' 
                withEnv(['JENKINS_NODE_COOKIE=DontKillME']){
                sh 'java -jar /var/jenkins_home/workspace/Jenkins_Pipeline_SpringBoot@2/target/spring-boot-mysql-2.jar > /var/jenkins_home/workspace/Jenkins_Pipeline_SpringBoot@2/jenkinsmavenlog.txt'
                }
                     
                
            }
        }
        
         stage('Deployment  Stage') {
            steps {
            
               echo 'Deploying' 
                 
                
            }
        }
        
    }
}
