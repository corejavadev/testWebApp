package com.support.redmine.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.support.redmine.domain.RedmineDetail;
import com.support.redmine.dto.RedmineDetailDTO;
import com.support.redmine.exceptions.ApplicationServiceException;
import com.support.redmine.iface.RedmineService;
import com.support.redmine.repository.RedmineRepository;
import com.support.redmine.utils.WebUtils;

@Service
public class RedmineServiceImpl implements RedmineService  {
	
	@Autowired
	private RedmineRepository redmineRepository;
	
	public RedmineDetailDTO getRedmine(Long redmineNumber) throws ApplicationServiceException {
		RedmineDetailDTO redmineDetailDTO = null;
		try {
			if(redmineNumber != null) {
				
				RedmineDetail redmineDetail = redmineRepository.findOne(redmineNumber);
				
				redmineDetailDTO = redmineDetail.buildRedmineDetailDTO();
			}
		} catch (Exception ex) {
			throw new ApplicationServiceException(ex,"getRedmine");
		}
		return redmineDetailDTO;
	}

	public List<RedmineDetailDTO> getSearchRedmineResults() throws ApplicationServiceException {
		try {
			
			List<RedmineDetailDTO> redmineDetailDTOs = null;
			
			List<RedmineDetail> redmines = null;
			
			redmines = redmineRepository.findAll();
			
			redmineDetailDTOs = WebUtils.buildRedmineList(redmines);
			
			return redmineDetailDTOs;
			
		} catch (Exception ex) {
			throw new ApplicationServiceException(ex,"getSearchRedmineResults");
		}
	}

	public RedmineDetail saveRedmine(RedmineDetailDTO redmineDetailDTO) throws ApplicationServiceException {
		RedmineDetail redmineDetail = null;
		try {
			if(redmineDetailDTO != null) {
				if(redmineDetailDTO.getId() != null) {
					
					redmineDetail = redmineRepository.findOne(redmineDetailDTO.getId());
					
					redmineDetail.buildUpdateRedmineEntity(redmineDetailDTO);
					
				}else {
					redmineDetail = redmineDetailDTO.buildRedmineEntity();
				}
			}
			
			if(redmineDetail != null) {
				redmineDetail = redmineRepository.save(redmineDetail);
			}
		} catch (Exception ex) {
			throw new ApplicationServiceException(ex,"saveRedmine");
		}
		return redmineDetail;
	}
}
