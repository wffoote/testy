#!/bin/sh
cd `dirname $0`/..
rm -rf out
mkdir -p out/classes
javac -Xlint:unchecked -Xlint:deprecation -sourcepath src -d out/classes \
	src/edu/calpoly/testy/*.java
if [ $? != 0 ] ; then
    exit 1
fi
cd out/classes
jar cf ../testy.jar *
echo "Created out/testy.jar"
