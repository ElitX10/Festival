FROM java:8

VOLUME /tmp

EXPOSE 9001

COPY ./target/zuul-server-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch zuul-server-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","zuul-server-0.0.1-SNAPSHOT.jar"]