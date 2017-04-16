#!/usr/bin/env bash

DIR=.
PATH=../kotlin-native/dist/bin:$PATH
IOP=$DIR/def/interop

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

konanc $COMPILER_ARGS -target $TARGET $SOURCE_FILES -library $IOP/sfml.kt.bc -library $IOP/math.kt.bc -library $IOP/gles2.kt.bc -library $IOP/stdio.kt.bc -linkerArgs "$LINKER_ARGS" -o shooter.kexe -opt || exit 1
