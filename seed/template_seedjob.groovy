#!groovy

@Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
def sout = new StringBuilder(), serr= new StringBuilder()

print "hello there muneeb"

println "=================="
//config = new ConfigSlurper().parse(new File('authorization.groovy').toURL())
def myconfig = new ConfigSlurper().parse(new File('authorization.groovy').toURL())
println(myconfig)
println "==================="


