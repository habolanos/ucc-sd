FROM postgres:latest
RUN apk add postgresql-client
RUN psql -h localhost -U postgres -d postgres -c "CREATE TABLE ejemplo (id SERIAL PRIMARY KEY, nombre VARCHAR(50));"