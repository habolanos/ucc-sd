docker run --name postgres-slave01 --network challenge-postgres \
    -v "$PWD/slave01-postgres.conf":/etc/postgresql/postgresql.conf \
    -e POSTGRES_HOST_AUTH_METHOD=md5 \
    -e POSTGRES_PASSWORD=postgres \
    -p 5433:5432 -d postgres \
    -c 'config_file=/etc/postgresql/postgresql.conf'