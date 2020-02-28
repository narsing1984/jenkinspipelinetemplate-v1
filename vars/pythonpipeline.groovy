def call() {
  node {    
    def p = pipelineCfg()
    stage('Build') {
                sh """
                cd /var/lib/jenkins/workspace/${JOB_NAME}/
                echo 'Building..'
                docker build -t Your docker registery name/${p.appname}:v1 .
                """
    }
            }
        }
