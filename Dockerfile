FROM java:8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY ./target/springboot-1.0-SNAPSHOT.jar  /app/springboot-1.0-SNAPSHOT.jar
WORKDIR /app
RUN bash -c 'touch /springboot-1.0-SNAPSHOT.jar'
#EXPOSE 8089
ENV JAVA_OPTS="-Dlogback.path=/opt/logs/springboot -Dspring.profiles.active=dev -Xms64M -Xmx64M"
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar springboot.jar" ]