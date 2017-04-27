#!groovy

@Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
def sout = new StringBuilder(), serr= new StringBuilder()

def cfg = readFileFromWorkspace('seed/authorization.groovy')
def config = new ConfigSlurper().parse(cfg)
println(config)
println "==================="


