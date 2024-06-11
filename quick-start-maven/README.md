mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Dpackagename=quick-start-maven -DarchetypeArtifactId=maven-archetype-quickstart

mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=project-parent -Darchetype=maven-quick-start
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=core -Darchetype=maven-quick-start -DinteractiveMode=false
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=service -Darchetype=maven-quick-start -DinteractiveMode=false
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=controller -Darchetype=maven-quick-start -DinteractiveMode=false

## COMANDOS (fases) -- Maven Build Lifecycle
- mvn compile
- mvn test
- mvn package (cria o .jar)
- mvn install (cria repositório local na pasta .m2)
- mvn clean (limpa o diretório)
... (são plugins jar)

- mvn [plugin-name]:[goal-name]
mvn dependency:help

- javadoc
pom.xml
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-javadoc-plugin</artifactId>
        <version>3.3.1</version>
      </plugin>
    </plugins>
  </build>

mvn javadoc:javadoc
pastadoprojeto -> target -> site -> apidocs -> index.html