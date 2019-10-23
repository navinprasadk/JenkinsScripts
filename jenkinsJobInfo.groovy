/*This script shows how to get basic information about a job and its builds*/
def jenkins = Jenkins.getInstance()
def jobName = "myJob"
def job = jenkins.getItem(jobName)

println "Job type: ${job.getClass()}"
println "Is building: ${job.isBuilding()}"
println "Is in queue: ${job.isInQueue()}"
println "Last successfull build: ${job.getLastSuccessfulBuild()}"
println "Last failed build: ${job.getLastFailedBuild()}"
println "Last build: ${job.getLastBuild()}"
println "All builds: ${job.getBuilds().collect{ it.getNumber()}}"