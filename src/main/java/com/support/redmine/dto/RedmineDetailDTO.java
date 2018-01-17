package com.support.redmine.dto;

import java.io.Serializable;
import java.util.Date;

import com.support.redmine.domain.RedmineDetail;

public class RedmineDetailDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Integer redmine;

	private String priority;

	private String tracker;

	private String subject;

	private Date dueDate;

	private Date actualEndDate;

	private Double estimatedEffort;

	private Double actualEffort;

	private Integer reOpenCount;

	private Boolean hasVariance;

	private Boolean hasScheduleVariance;

	private Boolean hasEffortVariance;

	private Boolean isReOpen;

	private String rootCauseType;

	private String rootCasue;

	public RedmineDetailDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRedmine() {
		return redmine;
	}

	public void setRedmine(Integer redmine) {
		this.redmine = redmine;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(Date actialEndDate) {
		this.actualEndDate = actialEndDate;
	}

	public Double getEstimatedEffort() {
		return estimatedEffort;
	}

	public void setEstimatedEffort(Double estimatedEffort) {
		this.estimatedEffort = estimatedEffort;
	}

	public Double getActualEffort() {
		return actualEffort;
	}

	public void setActualEffort(Double actualEffort) {
		this.actualEffort = actualEffort;
	}

	public Integer getReOpenCount() {
		return reOpenCount;
	}

	public void setReOpenCount(Integer reOpenCount) {
		this.reOpenCount = reOpenCount;
	}

	public Boolean getHasVariance() {
		return hasVariance;
	}

	public void setHasVariance(Boolean hasVariance) {
		this.hasVariance = hasVariance;
	}

	public Boolean getHasScheduleVariance() {
		return hasScheduleVariance;
	}

	public void setHasScheduleVariance(Boolean hasScheduleVariance) {
		this.hasScheduleVariance = hasScheduleVariance;
	}

	public Boolean getHasEffortVariance() {
		return hasEffortVariance;
	}

	public void setHasEffortVariance(Boolean hasEffortVariance) {
		this.hasEffortVariance = hasEffortVariance;
	}

	public Boolean getIsReOpen() {
		return isReOpen;
	}

	public void setIsReOpen(Boolean isReOpen) {
		this.isReOpen = isReOpen;
	}

	public String getRootCauseType() {
		return rootCauseType;
	}

	public void setRootCauseType(String rootCauseType) {
		this.rootCauseType = rootCauseType;
	}

	public String getRootCasue() {
		return rootCasue;
	}

	public void setRootCasue(String rootCasue) {
		this.rootCasue = rootCasue;
	}
	
	public RedmineDetail buildRedmineEntity() {
		RedmineDetail redmineDetail = new RedmineDetail();
		
		redmineDetail.setRedmine(getRedmine());
		redmineDetail.setTracker(getTracker());
		redmineDetail.setPriority(getPriority());
		redmineDetail.setSubject(getSubject());
		
		return redmineDetail;
	}
}
