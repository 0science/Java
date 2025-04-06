# Java学习笔记

## 一、配置Java环境

### 1.JDK

1. 下载JDK

    https://www.oracle.com/cn/java/technologies/downloads/

2. 安装JDK

### 2.环境变量

1. 此电脑 -> 属性 -> 高级系统设置 -> 环境变量
2. 系统变量 -> 新建Java_Home -> 填写Java_Home路径
3. 点击 Path -> 新建%Java_Home%\bin -> %Java_Home%\jre\bin
4. cmd -> java -version

### 3.配置Maven

1. 下载Idea Community版

    https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC

2. 下载Maven

   https://maven.apache.org/download.cgi

3. 配置镜像仓库
   apache-maven-3.6.1 -> conf -> sttings.xml
   在146行位置，mirrors添加代码

```
<mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
      <mirrorOf>central</mirrorOf>        
</mirror>
```

4. 配置本地依赖仓库

   Maven -> 新建repository文件夹
   Maven -> apache-maven-3.6.1 -> conf -> settings.xml
   在49行位置 

```
<localRepository>D:\SoftWare\Maven\repository</localRepository>
```

5. 配置Maven环境变量

   1. 此电脑 -> 属性 -> 高级系统设置 -> 环境变量
   2. 系统变量 -> 新建MAVEN_HOME -> 填写 MAVEN_HOME文件夹路径
   3. 点击 Path -> 新建%MAVEN_HOME%\bin
   4. cmd -> mvn -version

### 开发工具Idea

1. 文件 -> 设置 -> 构建、执行、部署 -> 构建工具 -> Maven

![image-20250405212023105](https://image.dingjm.top/course/image-20250405212023105.png)

2. 

## 二、

## 三、



## 技术选型

### 编程语言

### 开发框架

### 数据库

### 开发工具

### 前端技术

### 服务器软件

### 云计算

### 项目构建

### 开源技术


## 项目选型

|      |      |
| ---- | ---- |
|      |      |



![jyshare-markmap](https://image.dingjm.top/course/jyshare-markmap.png)

# Java实战



# Java问答

