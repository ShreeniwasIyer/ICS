### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac Relational.java
```

### Correct the error
You will perhaps see the following error.
```
Relational.java:1: error: class RelationalOperations is public, should be declared in a file named RelationalOperations.java
public class RelationalOperations {
       ^
1 error

```
In Java the name of the Class must match the name of the file. Correct it by renaming the file
```
mv Relational.java RelationalOperations.java
```
OR changing the name of the class in the file to
```
public class Relational
```

Compile with the new name

### Run
You know the run command by now!
