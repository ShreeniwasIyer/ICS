### Preparing your local environment by pulling JDK

```
# Pull the Java Development Kit (JDK) from docker registry
# This should be a one time effort
# This takes about 200 MB of download. So please plan the download accordingly
docker pull openjdk
```

### Compiling your first program
```
# This should compile the HelloWorld.java
docker run --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk javac HelloWorld.java
```

### Find the .class files

```
# If there are no errors in your code, you can check that there is a HelloWorld.class that is
# created after the command runs
SG00255-ml:1.HelloWorld siyer$ ls -al
total 20
drwxrwxrwx  1 siyer  staff  2048 Feb 25 10:13 .
drwxrwxrwx  1 siyer  staff  2048 Feb 25 10:03 ..
-rwxrwxrwx  1 siyer  staff   479 Feb 25 10:13 HelloWorld.class
-rwxrwxrwx  1 siyer  staff   179 Feb 25 10:04 HelloWorld.java
-rwxrwxrwx  1 siyer  staff   153 Feb 25 10:07 README.md
```

### Now run the program
```
docker run --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk java HelloWorld
```

### Output
```
Hello World!
I am a newbie to Java Programming!
```
