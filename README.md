# FKPayrollDesign

First Go to SourceCode dircetory.
Then compile any file(file_name.java) with the following command

```
javac -cp json-simple-1.1.jar file_name.java
```
Then run with the following command

```
java -cp .:json-simple-1.1.jar file_name
```

This is because of external json.simple library. It did not add properly to classpath, hence this modification is done in compiling and running.
