package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev 
{
//	@Autowired
	//Laptop laptop;                                   //field injection

	//	public Dev(Laptop laptop)                //constructor injection
//	{
//		super();
//		this.laptop = laptop;
//	}
	
//	@Autowired                                    //setter injection
//	public void setLaptop(Laptop laptop)
//	{
//		this.laptop = laptop;
//	}
	
	@Autowired
	@Qualifier("laptop")
	
	Computer comp;
	public void show()
	{
		comp.run();
		System.out.println("Success");
	}
}
