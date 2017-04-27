#!groovy

@Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
def sout = new StringBuilder(), serr= new StringBuilder()

def cfg = readFileFromWorkspace('config.cfg')
def config = new ConfigSlurper().parse(cfg)
println(config.git_url)

def myurl = '$config.git_url' + 'ats.git'
println "==================="
println(myurl)



