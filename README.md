# A simple maven based JPA2 over Hibernate application
This is a simple command line JPA2 maven application template. 
This mvn project generates shaded jar aka. uberjar. The output 
is a one fat (target/jpa-1.0-SNAPSHOT.jar) that bundles the 
application jar along with all it's dependencies using the
mvn shade plugin. 

Within pom.xml, I have also commented out plugin configuration
to copy dependencies into target/lib and maven-jar-plugin to generate
the appropriate META-INF/MANIFEST.MF with Main-Class and 
Classpath entries.

Generate jar and run it as so
```bash
mvn package
java -jar target/jpa-1.0-SNAPSHOT.jar
```
