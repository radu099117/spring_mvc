package spring_mvc_annotation_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//load context from the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from context
		Teacher teacher = context.getBean("phisicsTeacher",Teacher.class);
		
		//call bean method
		System.out.println(teacher.getAssignments());
		System.out.println(teacher.getFeedback());
		
		//close context
		context.close();
	}
}
