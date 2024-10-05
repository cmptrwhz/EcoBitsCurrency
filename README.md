# EcoBitsCurrency
How to setup your Maven plugin to get a players ecobits balance and adjust the players ecobits balance

You will need to add the following to your pom.xml
```xml
<repositories>
	<repository>
		<id>auxilor-repo</id>
		<url>https://repo.auxilor.io/repository/maven-public/</url>
	</repository>
</repositories>

<dependencies>
	<dependency>
		<groupId>com.willfp</groupId>
		<artifactId>EcoBits</artifactId>
		<version>1.8.4</version>
		<scope>provided</scope>
	</dependency>
</dependencies>
```

to be able to compile I also added the eco-6.74.1-all.jar to my project library.
