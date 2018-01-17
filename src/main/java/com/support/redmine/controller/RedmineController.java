package com.support.redmine.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.support.redmine.dto.RedmineDetailDTO;
import com.support.redmine.iface.RedmineService;
import com.support.redmine.validator.RedmineValidator;

@Controller
public class RedmineController {
	
	@Autowired
	private RedmineService redmineService;
	
	@Autowired
	RedmineValidator redmineValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(redmineValidator);
	}
		
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getSearchRedmineResults(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView("redmineSearchResult");
		
        List<RedmineDetailDTO> redmines = redmineService.getSearchRedmineResults();
        
        modelAndView.addObject("redmines",redmines);
        
        return modelAndView;
    }
	
	@RequestMapping(value="/addRedmine", method = RequestMethod.GET)
	public ModelAndView addRedmine(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView("redmineAddEdit");
		
		modelAndView.addObject("redmine",new RedmineDetailDTO());
		  
        return modelAndView;
    }
	
	@RequestMapping(value="/getRedmine/{redmineId}", method = RequestMethod.GET)
	public ModelAndView getRedmine(@PathVariable("redmineId") Long redmineId, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView("redmineAddEdit");
		
		RedmineDetailDTO redmineDetailDTO = redmineService.getRedmine(redmineId);
		
		modelAndView.addObject("redmine",redmineDetailDTO);
		  
        return modelAndView;
    }
	
	@RequestMapping(method = RequestMethod.POST, params="saveRedmine")
	public ModelAndView saveRedmine(@ModelAttribute("redmine") @Validated RedmineDetailDTO redmineDetailDTO, BindingResult result,Model model) throws Exception {

		ModelAndView modelAndView =  new ModelAndView("redirect:/");
		
		if(result.hasErrors())
		{
			modelAndView = new ModelAndView("redmineAddEdit");
			
			modelAndView.addObject("redmine", redmineDetailDTO);
			
		}else {
			redmineService.saveRedmine(redmineDetailDTO);
		}	
        return modelAndView;
    }
}
