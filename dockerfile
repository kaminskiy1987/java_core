FROM bellsoft/liberica-openjdk-alpine:17.0.7
WORKDIR /app
COPY ./bin .
CMD java -classpath . ru.geekbrains.hw1.Main.Main