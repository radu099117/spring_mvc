package spring_mvc_xml_configuration;

public class MathTeacher implements Teacher {

	private Student student;
	
	public MathTeacher() {}
	
	public MathTeacher(Student student) {
		this.student = student;
	}
	
	@Override
	public String printAssignment() {
		return "Do your homework!";
	}
	
	@Override
	public String printStudent() {
		return this.student.getName();
	}
	
	@Override
	public int printStudentAge() {
		return this.student.getAge();
	}
	
	@Override 
	public String printStudentGender() {
		return this.student.getGender();
	}

}
