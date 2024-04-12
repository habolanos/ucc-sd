FROM gcc:latest
COPY . /app
WORKDIR /app
# Capa de compilacion
RUN g++ -o application application.c++
CMD ["./application"]