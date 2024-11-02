docker run --name postgres-slave-1 --network challenge-postgres \
    #-v "$PWD/slave-1-postgres.conf":/etc/postgresql/postgresql.conf \
    -v "$PWD/slave-1-initdb":/docker-entrypoint-initdb.d \
    -e POSTGRES_HOST_AUTH_METHOD=md5 \
    -e POSTGRES_PASSWORD=postgres \
    -p 5433:5432 -d postgres \
    -c 'config_file=/etc/postgresql/postgresql.conf'