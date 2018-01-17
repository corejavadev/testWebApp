package com.support.redmine.iface;

import java.util.List;

import com.support.redmine.domain.RedmineDetail;
import com.support.redmine.dto.RedmineDetailDTO;
import com.support.redmine.exceptions.ApplicationServiceException;

public interface RedmineService {
	
	RedmineDetailDTO getRedmine(Long redmineNumber) throws ApplicationServiceException;
	
	List<RedmineDetailDTO> getSearchRedmineResults() throws ApplicationServiceException;
	
	RedmineDetail saveRedmine(RedmineDetailDTO redmineDetailDTO) throws ApplicationServiceException;

}
