# Spring Example 

This meant to be a small composed example on how to use the Spring Boot framework and Thymeleaf. 

## How to Build

- Install Gradle
- Run `gradle wrapper` 
- Run ./gradlew bootRun

## Notes 

- ./gradlew bootRun may hang at a certain percentage. This is a werid bug the daemon not updating correctly. If you see a message like running localhost:8080 then you are good to go. 
- The build script will be build to JDK 8 objects so if you need a younger version then you'll have to adjust it in the build.gradle file. 





