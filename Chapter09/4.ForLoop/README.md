### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp -v "$PWD/../..":/usr/src/myclasspath openjdk /bin/bash
```

### Compile
```
javac -cp /usr/src/myclasspath/junit-4.10.jar PrimeTester.java PrimeTester_T.java
```

### Run
```
java -cp /usr/src/myclasspath/junit-4.10.jar:. org.junit.runner.JUnitCore PrimeTester_T
```
