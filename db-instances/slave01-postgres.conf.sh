docker run -i --network challenge-postgres \
    -v "$PWD/slave-1-initdb":/docker-entrypoint-initdb.d -d postgres