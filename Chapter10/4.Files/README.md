### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac *.java
```

### Run
```
java FileReadExample

## if you have run code before, delete it first
rm output.txt
## then run the program and print new output.txt
java FileWriteExample && cat output.txt
```
