FROM alpine/java:21-jdk
WORKDIR /app
COPY src /app
COPY libs /app
COPY resources /app
RUN javac -d build main/java/co/edu/ucc/sd/*.java && \
    jar cfm app-cliente-java.jar META-INF/MANIFEST.MF -C build/ . &&\
    rm -rf build
CMD ["java", "-cp", "postgresql-42.7.4.jar:app-cliente-java.jar", "co.edu.ucc.sd.RandomQueryApp"]