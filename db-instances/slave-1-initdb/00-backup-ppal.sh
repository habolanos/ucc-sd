#!/bin/bash

# Espera a que PostgreSQL esté listo
#until pg_isready -h "localhost" -U "postgres"; do
#  echo "Esperando a que Postgres Ppal esté listo..."
#  sleep 2
#done

# Ejecuta el comando pg_basebackup

MASTER_HOSTNAME=postgres-ppal
MASTER_USER=replica
MASTER_PASS=replica
PATH_CONFIG=/docker-entrypoint-initdb.d/backup

PGPASSWORD=$MASTER_PASS pg_basebackup -D $PATH_CONFIG -h $MASTER_HOSTNAME -X stream -c fast -U $MASTER_USER -W