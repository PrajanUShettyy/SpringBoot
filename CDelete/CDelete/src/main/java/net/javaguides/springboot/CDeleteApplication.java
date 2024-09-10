package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDeleteApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(CDeleteApplication.class, args);
		Dev obj=context.getBean(Dev.class);
		obj.show();
	}

}
