#!/bin/bash

# Ruta al archivo pg_hba.conf
PG_HBA_CONF="$PGDATA/pg_hba.conf"

# Añadir la línea para permitir la conexión de replicación
echo "host    replication     replica     all     md5" >> "$PG_HBA_CONF"

# Recargar la configuración de PostgreSQL
pg_ctl reload -D "$PGDATA"
