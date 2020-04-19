FROM tomcat:alpine
COPY ./target/ccgame-sb-maven-0.0.1.war /usr/local/tomcat/webapps/ccgame-sb-maven-0.0.1.war
