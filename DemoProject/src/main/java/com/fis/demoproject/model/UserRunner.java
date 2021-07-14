package com.fis.demoproject.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.demoproject.model.ElectronicDevice;

public class UserRunner
{
	public static void main(String[] args)
	{
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		  ElectronicDevice e1 = (ElectronicDevice)spring.getBean("electronics1");
		  System.out.println(e1);
		 
		ElectronicDevice e2 = (ElectronicDevice)spring.getBean("electronics2");
		System.out.println(e2);
	}
}
