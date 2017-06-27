FROM openjdk

VOLUME /tmp
ADD maven/@docker.project.name@.jar @docker.project.name@.jar
RUN sh -c 'touch @docker.project.name@.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/@docker.project.name@.jar"]