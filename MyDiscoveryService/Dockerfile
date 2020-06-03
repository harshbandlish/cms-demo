FROM java:8-jre

ADD ./target/MyDiscoveryService-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/MyDiscoveryService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761