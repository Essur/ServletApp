# Use the official Tomcat base image
FROM tomcat:9.0

COPY /target/ServletApp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]
