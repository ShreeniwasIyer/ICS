### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac Convert.java
```

### Run
```
java Convert
```

### Output
```
root@568d7ee40a48:/usr/src/myapp# java Convert
Enter temperature in fahrenheit: 78
Temperature in celsius is 25.555555555555557
```
