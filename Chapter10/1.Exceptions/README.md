### Enter docker container first
```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk /bin/bash
```

### Compile
```
javac ExceptionExample.java
```

### Run
```
java ExceptionExample
```

### Output
```
Dividing 10 by 5 2
Calling catching_function
Trying to divide 13 by 0
We caught the exception here. / by zero
Calling function_letting_exception_go with 10, 5 4
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionExample.throwing_function(ExceptionExample.java:6)
	at ExceptionExample.function_letting_exception_pass(ExceptionExample.java:21)
	at ExceptionExample.main(ExceptionExample.java:30)

```
