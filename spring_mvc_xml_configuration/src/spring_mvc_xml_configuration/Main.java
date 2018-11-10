package spring_mvc_xml_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		Teacher teacher = context.getBean("myTeacher",Teacher.class);
		
		//call methods on the bean
		System.out.println(teacher.printAssignment());
		System.out.println(teacher.printStudent());
		System.out.println(teacher.printStudentAge());
		System.out.println(teacher.printStudentGender());
		
		//close the context
		context.close();
	}
}
