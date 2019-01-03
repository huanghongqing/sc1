FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD sc1-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#ENTRYPOINT [ "sh", "-c", "java  -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=peer2"]
#EXPOSE 1112