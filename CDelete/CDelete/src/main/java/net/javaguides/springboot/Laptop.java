package net.javaguides.springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component                
@Primary       //when both laptop and desktop implements computer(comp) object we prefer Laptop class by using Primary Annotation
public class Laptop implements Computer
{
	public void run()
	{
		System.out.println("Ssssssss");
	}
}
