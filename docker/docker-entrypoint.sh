#!/bin/bash

set -e

echo "[Entrypoint] Apache SkyWalking Docker Image"

EXT_LIB_DIR=/skywalking/ext-libs
EXT_CONFIG_DIR=/skywalking/ext-config

# Override configuration files
cp -vfR ${EXT_CONFIG_DIR}/* config/ || true

CLASSPATH="config:$CLASSPATH"
for i in oap-libs/*.jar
do
    CLASSPATH="$i:$CLASSPATH"
done
for i in ${EXT_LIB_DIR}/*.jar
do
    CLASSPATH="$i:$CLASSPATH"
done

echo "Configuration files:"
ls -lt /skywalking/config

set -ex
exec java ${JAVA_OPTS} -classpath ${CLASSPATH} org.apache.skywalking.oap.server.starter.OAPServerStartUp "$@"
