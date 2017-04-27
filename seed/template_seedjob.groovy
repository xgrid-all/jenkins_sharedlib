#!groovy

@Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
def sout = new StringBuilder(), serr= new StringBuilder()

def cfg = readFileFromWorkspace('vars/authorization')
def config = new ConfigSlurper().parse(cfg)
println(config.github_token)
println "==================="


