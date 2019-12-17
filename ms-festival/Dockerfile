FROM java:8

VOLUME /tmp

EXPOSE 9002

COPY ./target/ms-festival-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch ms-festival-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","ms-festival-0.0.1-SNAPSHOT.jar"]