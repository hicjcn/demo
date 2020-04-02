
# Demo

First Demo project for Spring Boot

## 需要的运行环境
 
+ Maven
+ Docker

## Maven执行指令

> mvn clean package docker:build -Dmaven.test.skip=true -DpushImageTag

+ `docker:build`：Docker构建镜像
+ `-Dmaven.test.skip=true`：忽略测试代码的编译测试
+ `-DpushImageTag`：推送镜像的Tag标签
