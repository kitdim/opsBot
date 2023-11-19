### Tests and linter status:
[![Java CI](https://github.com/kitdim/opsBot/actions/workflows/java-ci.yml/badge.svg?branch=main)](https://github.com/kitdim/opsBot/actions/workflows/java-ci.yml)
[![Maintainability](https://api.codeclimate.com/v1/badges/91a4f2b3f4ce124bd2a0/maintainability)](https://codeclimate.com/github/kitdim/opsBot/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/91a4f2b3f4ce124bd2a0/test_coverage)](https://codeclimate.com/github/kitdim/opsBot/test_coverage)
### botOps
An application for quickly creating applications in noumenon systems. Based on telegram bot.

### Requirements
1) JDK 20 or above
2) Make or use gradle tasks
3) Gradle 8.2 or above

### Usage
1) Download library from GitHub
2) Run in CLI

### Commands
1) make build or ./gradlew clean build, for build
2) make install or ./gradlew clean install, for clean & install
3) make run or ./gradlew run, for run

### Settings
The settings for the telegram bot are located in the config folder.
In the BotConfig.java file, the bot name and token are specified as constants. They can be obtained through BotFather:
```java
public static final String BOT_NAME = "Name";
public static final String TOKEN = "token";
```

In the ItSupportConfig file, the constant contains the id of the telegram channel where notifications from users will be sent:
```java
public static final String ID_GROUP = "id";
```

### Example
1. The user sends an appeal.
   ![1](image/1.jpg)
2. The appeal was received in the pre-created chat room.
   ![2](image/2.jpg)
