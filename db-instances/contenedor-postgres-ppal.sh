docker run --name postgres-ppal --network challenge-postgres \
    -v "$PWD/ppal-postgres.conf":/etc/postgresql/postgresql.conf \
    -e POSTGRES_HOST_AUTH_METHOD=md5 \
    -e POSTGRES_PASSWORD=postgres \
    -p 5432:5432 -d postgres \
    -c 'config_file=/etc/postgresql/postgresql.conf'