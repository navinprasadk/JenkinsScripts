/* This scripts shows how to get basic information about Jenkins instance */
def jenkins = Jenkins.getInstance()
println "Jenkins version: ${jenkins.getVersion()}"
println "Available JDKs: ${jenkins.getInstance().getJDKs()}"
println "Connected Nodes:"
jenkins.getNodes().each{ 
  println it.displayName
}
println "Configured labels: ${jenkins.getLabels()}"