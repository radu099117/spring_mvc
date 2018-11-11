package spring_mvc_annotation_configuration;

import org.springframework.stereotype.Component;

@Component
public class PositiveFeedbackService implements FeedbackService {

	@Override
	public String provideFeedback() {
		return "Very good Job!";
	}

}
