#!/bin/sh

java -Dcom.sun.management.jmxremote \
     -Dcom.sun.management.jmxremote.port=1617 \
     -Dcom.sun.management.jmxremote.authenticate=false \
     -Dcom.sun.management.jmxremote.ssl=false \
     helloworld.SimpleAgent
