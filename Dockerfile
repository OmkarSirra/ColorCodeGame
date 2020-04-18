FROM tomcat:alpine

RUN ["rm", "-fr", "/usr/local/tomcat/webapps/ROOT"]
EXPOSE 8081:8081
COPY ./ccgame-sb-maven-0.0.1.war /usr/local/tomcat/ccgame-sb-maven-0.0.1.war
