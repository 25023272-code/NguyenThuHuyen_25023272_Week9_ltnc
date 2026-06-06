ROOT_DIR=$(pwd)
SRC_DIR="$ROOT_DIR/src"
BUILD_DIR="$ROOT_DIR/build"

mkdir -p "$BUILD_DIR"

java -jar "lib/checkstyle-10.12.3-all.jar" -c "$SRC_DIR/google_checks.xml" "$SRC_DIR"/*.java

javac -cp "lib/*" -d build src/*.java

java -cp "build;lib/*" Main