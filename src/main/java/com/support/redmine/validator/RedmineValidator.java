package com.support.redmine.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.support.redmine.dto.RedmineDetailDTO;

@Component
public class RedmineValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return RedmineDetailDTO.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		
		RedmineDetailDTO redmineDetailDTO = (RedmineDetailDTO) target;
		
		if(redmineDetailDTO.getRedmine() == null){
			errors.rejectValue("redmine", "error.redmine", "Redmine Number is required");
		}
		
		if(StringUtils.isBlank(redmineDetailDTO.getPriority())){
			errors.rejectValue("priority", "error.priority", "Priority is required");
		}
		
		if(StringUtils.isBlank(redmineDetailDTO.getTracker())){
			errors.rejectValue("tracker", "error.tracker", "Tracker is required");
		}
		
		if(StringUtils.isBlank(redmineDetailDTO.getSubject())){
			errors.rejectValue("subject", "error.subject", "Subject is required");
		}
	}
}
