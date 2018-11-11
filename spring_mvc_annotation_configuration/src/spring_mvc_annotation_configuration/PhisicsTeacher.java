package spring_mvc_annotation_configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")//define scope of the bean
public class PhisicsTeacher implements Teacher {
	
	//field injection
	@Autowired
	private FeedbackService feedbackService;
	
	//inject value from properties file
	@Value("${name}")
	private String name;

	@Override
	public String getAssignments() {
		return "Do your homework";
	}
	
	//method injection
	@Autowired
	//when there are many implementations you need to specify
	//which one to use with @Qualifier and the default id or the id 
	//of the implementation
	@Qualifier("positiveFeedbackService")
	private void printFeedback(FeedbackService feedbackService) {
		System.out.println(feedbackService.provideFeedback());
	}

	@Override
	public String getFeedback() {
		return this.feedbackService.provideFeedback();
	}
	
	@Autowired
	private void printName() {
		System.out.println(name);
	}
	
	@PostConstruct
	private void init() {
		System.out.println("First");
	}
	
	@PreDestroy
	private void last() {
		System.out.println("Last");
	}

}
