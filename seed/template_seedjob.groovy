#!groovy

@Grab(group='org.apache.commons', module='commons-io', version='1.3.2')
//def sout = new StringBuilder(), serr= new StringBuilder()

//println("-----1------")
def cfg = readFileFromWorkspace('config.cfg')
def config = new ConfigSlurper().parse(cfg)

//println("----- 2 -----")
println(config.git_url)

//println("printing myurl: ")
def myurl = config.git_url + 'ats.git'
println "==================="
println(myurl)



