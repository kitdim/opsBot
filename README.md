### Tests and linter status:
[![Java CI](https://github.com/kitdim/opsBot/actions/workflows/java-ci.yml/badge.svg?branch=main)](https://github.com/kitdim/opsBot/actions/workflows/java-ci.yml)
[![Maintainability](https://api.codeclimate.com/v1/badges/91a4f2b3f4ce124bd2a0/maintainability)](https://codeclimate.com/github/kitdim/opsBot/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/bd38b1474a43a5fd696e/test_coverage)](https://codeclimate.com/github/kitdim/opsBot/test_coverage)
### botOps
An application for quickly creating applications in noumenon systems. Based on telegram bot.
### Settings
The settings for the telegram bot are located in the config folder.
In the BotConfig.java file, the bot name and token are specified as constants. They can be obtained through BotFather.

public static final String BOT_NAME = "Name";

public static final String TOKEN = "token";

In the ItSupportConfig file, the constant contains the id of the telegram channel where notifications from users will be sent.

public static final String ID_GROUP = "id";
