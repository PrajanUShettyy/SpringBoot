package net.javaguides.springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Component, Spring will automatically detect it during component scanning, create an
//object (instance) of that class, and manage it within the Spring IoC (Inversion of Control) container.
@Primary
public class Desktop implements Computer
{
	public void run()
	{
		System.out.println("Successsssss");
	}
}
