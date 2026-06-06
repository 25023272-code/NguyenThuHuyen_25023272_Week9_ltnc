ROOT_DIR=$(pwd)
mvn clean package --file "$ROOT_DIR/pom.xml"
java -jar "$ROOT_DIR/target/Bai08-1.0-SNAPSHOT.jar"