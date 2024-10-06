# EcoBitsCurrency
How to setup your Maven plugin to get a players ecobits balance and adjust the players ecobits balance

1. Follow the example in Main.java.
2. Download the EcoBitCurrency.java and put it in your project.
3. Be sure to add your EcoBit currency name to the config.yml file. The EcoBit currency name is case sensitive.
4. To be able to compile add the eco-6.74.1-all.jar to your project library.
5. You will need to add the following to your pom.xml

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
