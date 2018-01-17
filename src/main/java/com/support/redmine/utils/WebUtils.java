package com.support.redmine.utils;

import java.util.ArrayList;
import java.util.List;

import com.support.redmine.domain.RedmineDetail;
import com.support.redmine.dto.RedmineDetailDTO;

public final class WebUtils {

	public static List<RedmineDetailDTO> buildRedmineList(List<RedmineDetail> redmines){
		List<RedmineDetailDTO> redmineDetailDTOs = new ArrayList<RedmineDetailDTO>();
		
		for(RedmineDetail redmine : redmines) {
			redmineDetailDTOs.add(redmine.buildRedmineDetailDTO());
		}
		return redmineDetailDTOs;
	}
}
