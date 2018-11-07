Creating Spring Project

used https://start.spring.io/ to create a project. 
Added following dependencies 
 --- Web
 --- Security 
 --- Session
 --- MySQL
 --- Java 8

Using Gradle, Jave 8, and  creating a war file 
       **My environment is running Gradle 4.8.1, and Java 10

Went with a War instead of a Jar because it is a web applicataion

********************* Optional --- Probably not necessary *****************************************
INSTALLING GRADLE
 --- Use chocolate to install gradle on Windows: $ choco install gradle
 --- Use homebrew or MacPorts for Mac: $ brew/port install gradle
 --- Or go to https://gradle.org/releases/ to install the version of Gradle you want/need (install the binary only) 

ONCE GRADLE IS INSTALLED 
 ---Go into project folder and run gradlew when you first get project 
***************************************************************************************************

Open project folder in terminal
 --- run gradlew 
 --- run gradlew eclipse
 --- run gradlew build

Possible tasks 
 --- gradlew bootRun -> Runs project as a spring boot application
 --- gradlew build -> Assemble and tests project
 --- gradlew clean -> Delees the build directory
 --- gradlew war -> Generates a war archive with all needed contents


IMPORT PROJECT INTO INTELLIJ
    --- Click Import
    --- Find project folder and select build.gradle file
    --- Check auto-import
    --- click OK
    --- Click on finish

RUNNING THE PROGRAM
    --- Click on Configure
    --- Click on + and select JAR Application
    --- In Path to Jar enter: .../Pokemon---Team-Assumption/pokemon-spring/build/libs/pokemon-spring-0.0.1-SNAPSHOT.war
    --- Add pokemon-spring file path
    --- Select your JRE
    --- Click OK
