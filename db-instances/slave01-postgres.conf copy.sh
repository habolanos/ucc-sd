docker run -i --rm -e POSTGRES_HOST_AUTH_METHOD=trust \
    -v "$PWD/slave-1-initdb":/docker-entrypoint-initdb.d postgres