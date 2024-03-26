package com.SimpleSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SimpleSpring.beanconstructorInjection.EmpConstructor;
import com.SimpleSpring.beanconstructorInjection.StudConstructor;

public class ConstructorClient {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("Bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
	//	EmpConstructor empcon = (EmpConstructor) factory.getBean("empcon");
	//	empcon.show();
		
		StudConstructor studcon=(StudConstructor) factory.getBean("studcon");
		studcon.print();
	}

}
