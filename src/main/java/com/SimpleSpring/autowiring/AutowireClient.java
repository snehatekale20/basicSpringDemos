package com.SimpleSpring.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutowireClient {

	public static void main(String[] args) {
		
		Resource resourse = new ClassPathResource("Bean.xml");
		BeanFactory factory = new XmlBeanFactory(resourse);
		
		Human human = (Human) factory.getBean("human");
		human.startPumping();
	}
}
