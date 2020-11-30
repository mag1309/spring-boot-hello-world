# spring-boot-hello-world
Development of "Hello World" web application with Spring Boot

1.	Go to Eclipse -> Help -> Market Place and search “Spring Tools” to install.
 
2.	After Spring Boot tool installation, Lets create a spring boot starter project. Here, Project name is “HelloWorld”.

3.	Let’s check the pom.xml and set java version as 8 if it’s different.
 
4.	Spring Boot will create a “HelloWorldApplication.java” class in the “com.example.hello” package. This class will be annotated with @SpringBootApplication. This is the entry point of the spring boot application to start. 
package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

		public static void main(String[] args) {
			SpringApplication.run(HelloWorldApplication.class, args);
		}
}

5.	Now run the created project as “Spring Boot App”. This will start the inbuilt servlet container and run the application. By default, web application will run at port 8080.
Let’s check the application in browser http://localhost:8080/.  It will show error message as we haven’t created any request handler.

6.	Let’s create a Controller which will accept request. The controller class will have various annotation like @Controller, @GetMapping to handle the GET request.
a.	@Controller: To inform Framework that this class is controller
b.	@GetMapping: To inform framework about GET request mapping for a specific path. Here path is defined as “hello”
Model is used to transfer data from Controller to View.

7.	In the above example, the controller return “hello”. This will force framework to redirect transfer control to hello.html file. Here make sure hello.html file is available inside resource/templates directory. 

8.	We have used Themeleaf template. Spring DevTools helps to update container on runtime i.e.  changes will be automatically pushed to container. Let’s check the web application http://localhost:8080/hello
 
Hope this quick tutorial will help in basic understating and encourage you to develop more complex applications.
