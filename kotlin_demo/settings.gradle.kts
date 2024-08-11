// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
pluginManagement {
  repositories {
      mavenLocal()
    maven { url=uri("https://maven.aliyun.com/repository/public/") }
    mavenCentral()
    gradlePluginPortal()
  }
}

rootProject.name = "kotlin_demo"
