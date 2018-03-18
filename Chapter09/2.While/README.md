### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp -v "$PWD/../..":/usr/src/myclasspath openjdk /bin/bash
```

### Compile
```
javac -cp /usr/src/myclasspath/junit-4.10.jar Converter.java Converter_T.java
```

### Run
```
java -cp /usr/src/myclasspath/junit-4.10.jar:. org.junit.runner.JUnitCore Converter_T
```

### Output
```
root@64d39cc7199d:/usr/src/myapp# java -cp /usr/src/myclasspath/junit-4.10.jar:. org.junit.runner.JUnitCore Converter_T
JUnit version 4.10
.
Time: 0.007

OK (1 test)
```
