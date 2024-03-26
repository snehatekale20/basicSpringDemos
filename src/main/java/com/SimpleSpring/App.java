package com.SimpleSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SimpleSpring.beanSetterInjection.Employee;
import com.SimpleSpring.beanSetterInjection.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("Bean.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	//Employee emp =(Employee) factory.getBean("emp");
    //	System.out.println("EmpId : "+emp.getEmpId());
    //	System.out.println("EmpName : "+emp.getEmpName());
    //	System.out.println("EmpEmail : "+emp.getEmpEmail());
    	
    	Student student = (Student) factory.getBean("student");
    	student.show();
    	
    }
}
