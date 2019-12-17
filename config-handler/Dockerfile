FROM java:8

VOLUME /tmp

EXPOSE 9100

COPY ./target/config-handler-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch config-handler-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","config-handler-0.0.1-SNAPSHOT.jar"]