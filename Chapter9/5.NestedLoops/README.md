### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac Pattern.java
```

### Run
```
java Pattern
```

### Output
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```
