FROM java:8-jre

ADD ./target/cms-poc-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/cms-poc-0.0.1-SNAPSHOT.jar"]

EXPOSE 9080