# Crud-Example
***Requirements:-***
The following are required in order to properly follow along this tutorial the following are required
-   An IDE (Preferably [IntelliJ IDEA](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC))
 - Update version  JDK 8 +

[Windows 10](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)  

[Linux](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html)
 -  *Latest Version [Sbt](https://www.scala-sbt.org/)* 
 -  *Play-Frameworks*([Click to Documentation](https://www.playframework.com/))

## Difficulty Level
Intermediate

### Adding some dependencies

We need to add some dependencies for play slick and play evolutions, so we go to this location`test/build.sbt`  and type in the following dependencies

 

      libraryDependencies += "com.typesafe.play" %% "play-slick" % "3.0.3"
      libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "3.0.3"

So to add the MySQL depency add the following code to the build.sbt file

  

      libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.34"

## Mysql Connection:
So open the  `conf/application.conf`  file and the following code

    slick.dbs.default.driver = "slick.driver.MySQLDriver$"
    slick.dbs.default.db.driver = "com.mysql.jdbc.Driver"
    slick.dbs.default.db.url = "jdbc:mysql://localhost/yourDBName"
    slick.dbs.default.db.user = "root"
    slick.dbs.default.db.password = "

***Play-Framework  :-***

 - This project is intended for people who know how to use Play and want to get started right away
 
**Java seed template :-**

sbt new playframework/play-java-seed.g8

 **Scala seed template:-**

sbt new playframework/play-scala-seed.g8
