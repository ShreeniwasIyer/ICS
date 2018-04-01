### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac edu/kaplan/Student.java edu/mit/Student.java PackageExample.java
```

### Run
```
java PackageExample
```
