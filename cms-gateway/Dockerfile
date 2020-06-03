FROM java:8-jre

ADD ./target/cms-gateway-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/cms-gateway-0.0.1-SNAPSHOT.jar"]

EXPOSE 8011