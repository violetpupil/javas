# [studio](https://developer.android.com/studio)

[文档](https://developer.android.com/studio/intro)

## 安装

Android SDK Location: %USERPROFILE%\AppData\Local\Android\Sdk

工具: %USERPROFILE%\AppData\Local\Android\Sdk\platform-tools

## 新项目

New Project -> Phone and Tablet -> Empty Activity -> 项目命名大驼峰

## faq

Q: 预览编译报错

Dependency '' requires libraries and applications that depend on it to compile against version 34 or later of the Android APIs.

:app is currently compiled against android-33.

A: 修改 app/build.gradle.kts 文件，compileSdk = 34
