ROOT_DIR=$(pwd)

mvn clean package -f "$ROOT_DIR/pom.xml"
mvn test -f "$ROOT_DIR/pom.xml"