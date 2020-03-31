package com.validator;

import java.util.ArrayList;
import java.util.List;

public class FormSubmissionValidator {
	
	public List validate(String param1,int param2) {
		
		List<String> errList = new ArrayList<String>();
		//Null check
		if(param1.isEmpty()) {
			errList.add("The first field is empty");
		}
		if(param2 == 0) {
			errList.add("The second field is empty");
		}
		//Length check
		if(param1.length()>30) {
			errList.add("First field is more than 30 characters");
		}
		if(param2 > 6) {
			errList.add("Second field is more than 30 characters");
		}
		//Regular expression checks
		return errList;
	}
}
