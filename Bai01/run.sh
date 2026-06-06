ROOT_DIR=$(pwd)
SRC_DIR="$ROOT_DIR/src"
BUILD_DIR="$ROOT_DIR/build"
LIB_DIR="$ROOT_DIR/lib"

mkdir -p "$BUILD_DIR"

javac -cp "$LIB_DIR/*" -d "$BUILD_DIR" "$SRC_DIR"/*.java

java -cp "$BUILD_DIR;$LIB_DIR/*" Main