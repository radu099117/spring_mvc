package spring_mvc_annotation_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component the default bean id will be mathTeacher
//the default bean id is the name of the class with lowercase
@Component("myTeacher")
public class MathTeacher implements Teacher {

	private FeedbackService feedbackService;
	
	public MathTeacher() {}
	
	//constructor injection
	@Autowired
	public MathTeacher(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	@Override
	public String getAssignments() {
		return "Do your homework!";
	}
	
	@Override 
	public String getFeedback() {
		return feedbackService.provideFeedback();
	}

}
