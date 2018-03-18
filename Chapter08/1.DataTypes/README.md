### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac DataTypes.java
```

### Run
```
java DataTypes
```

### Output
```
root@176f44b26cff:/usr/src/myapp# java DataTypes



Is Singapore Great? true
Singapore trades in $
Singapore hosts some of the 8700000 species on earth
Singapore hosts some of the 7600000000 humans on earth
Low Precision Output 12.666429
High Precision Output 12.666428727762776



root@176f44b26cff:/usr/src/myapp#
```

### Notes
Do you notice that the low precision output printed a truncated version of the input, but high precision output was perfect? This is because float has lower precision than double.
