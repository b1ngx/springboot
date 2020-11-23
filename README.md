# Spring Boot

## JDK

#### Install

```shell script
brew install java
```

#### Caveats
For the system Java wrappers to find this JDK, symlink it with
```
sudo ln -sfn /usr/local/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
```

openjdk is keg-only, which means it was not symlinked into /usr/local,
because it shadows the macOS `java` wrapper.

If you need to have openjdk first in your PATH run:
```shell script
echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc
```

For compilers to find openjdk you may need to set:
```shell script
export CPPFLAGS="-I/usr/local/opt/openjdk/include"
```

#### Summary
🍺  /usr/local/Cellar/openjdk/15.0.1: 614 files, 324.9MB

## H2 Database
[Spring Boot Java H2 Database Setup in IntelliJ](https://youtu.be/8QBJMxyXIqc)

## Annotation
[Spring 常用注解](https://juejin.im/post/6844904136492711950)

## Swagger
[Spring Boot整合swagger使用教程](https://www.cnblogs.com/progor/p/13297904.html)

[在 Spring Boot 项目中使用 Swagger 文档](https://developer.ibm.com/zh/articles/j-using-swagger-in-a-spring-boot-project/)