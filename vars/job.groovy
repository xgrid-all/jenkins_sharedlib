#!groovy

def call(body) {

  def args = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = args
  body()
  
  println "========== Loading configuration ======="
  // Load default configurations
  @Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
  node('master'){
  def cfg_file = readFile 'config.ini'
    
  def config = new ConfigSlurper().parse(cfg_file)
  
  // Loading jenkins jenkinsLibrary
  def lib = new utils.JenkinsLibrary()
  
  
  def repourl = config.git_url + "${args.clone_repos}.git"
  println(repourl)
  }
  //def repo = "ssh://git@172.19.0.77:29418/source/${args.clone_repos}.git"
  
    node(args.label)
    {
      
      echo "$args.clone_repos"
      
      step([$class: 'WsCleanup'])

      stage ('Clone')
      {
          git credentialsId: 'jenkins', url: repourl
      }

      def value = lib.countStages(args)

      for(int iter = 0; iter<value; iter++)
      {
        lib.stag(iter,args)
      }

      archiveArtifacts allowEmptyArchive: true, artifacts: args.artifacts
    }
  
}
