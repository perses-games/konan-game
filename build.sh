#!/usr/bin/env bash

DIR=.
PATH=../kotlin-native/dist/bin:$PATH
IOP=$DIR/klib

# -lcsfml-graphics -lcsfml-audio -lcsfml-window -lcsfml-network -lcsfml-system -lGLESv2
LINKER_ARGS_linux="-L/usr/lib/x86_64-linux-gnu -lcsfml-graphics -lcsfml-audio -lcsfml-window -lcsfml-network -lcsfml-system -lGL"

if [ x$TARGET == x ]; then
case "$OSTYPE" in
  darwin*)  TARGET=macbook ;;
  linux*)   TARGET=linux ;;
  *)        echo "unknown: $OSTYPE" && exit 1;;
esac
fi

var=CFLAGS_${TARGET}
CFLAGS=${!var}
var=LINKER_ARGS_${TARGET}
LINKER_ARGS=${!var}
var=COMPILER_ARGS_${TARGET}
COMPILER_ARGS=${!var} # add -opt for an optimized build.

IFS=$'\n';SOURCE_FILES=(`find $DIR/src -name '*.kt'`)
SOURCE_FILES=${SOURCE_FILES[*]}

kotlinc $COMPILER_ARGS -target $TARGET $SOURCE_FILES -l $IOP/sfml -l $IOP/math -l $IOP/gles2 -l $IOP/stdio -linkerOpts "$LINKER_ARGS" -o test.kexe -opt || exit 1
