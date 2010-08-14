#!/bin/sh

export ANT_OPTS=-mx1024M

ant -Ddetyper.jar=none clean compile
rm -f stock-tests.out
for i in 1 2 3 4 5 6 7 8 9 10; do
    /usr/bin/time -a -o stock-tests.out ant tests
done

ant clean compile
rm -f ductile-tests.out
for i in 1 2 3 4 5 6 7 8 9 10; do
    /usr/bin/time -a -o ductile-tests.out ant tests
done
