def call(String, stagename){
  if ("${stagename}" == "Build"){
	sh "mvn clean package"}
  else if ("${stagename}" == "SonarQube Report"){
	sh "mvn clean sonar:sonar"}
  else if ("${stagename}" == "Upload Into Nexus"){
	sh "mvn clean deploy"}
}
