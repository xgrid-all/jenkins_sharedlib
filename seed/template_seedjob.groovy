#!groovy

@Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
def sout = new StringBuilder(), serr= new StringBuilder()

print "hello there muneeb"
def scriptDir = getClass().protectionDomain.codeSource.location.path

println(scriptDir)

def cfg = readFileFromWorkspace('seed/authorization.groovy')
println(cfg)

println "=================="
//config = new ConfigSlurper().parse(new File('authorization.groovy').toURL())
//def myconfig = new ConfigSlurper().parse(new File('src/authorization.groovy').toURL())
def config = new ConfigSlurper().parse(cfg)
println(config)
println "==================="


