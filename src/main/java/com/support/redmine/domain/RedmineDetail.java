package com.support.redmine.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.support.redmine.dto.RedmineDetailDTO;

@Entity
@Table(name = "REDMINE_DETAIL")
public class RedmineDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "REDMINE")
	private Integer redmine;

	@Column(name = "PRIORITY")
	private String priority;

	@Column(name = "TRACKER")
	private String tracker;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "DUEDATE")
	private Date dueDate;

	@Column(name = "ACTUAL_END_DATE")
	private Date actualEndDate;

	@Column(name = "ESTIMATED_EFFORT")
	private Double estimatedEffort;

	@Column(name = "ACTUAL_EFFORT")
	private Double actualEffort;

	@Column(name = "RE_OPEN_COUNT")
	private Integer reOpenCount;

	@Column(name = "HAS_VARIANCE")
	private Boolean hasVariance;

	@Column(name = "HAS_SCHEDULE_VERIANCE")
	private Boolean hasScheduleVariance;

	@Column(name = "HAS_EFFORT_VERIANCE")
	private Boolean hasEffortVariance;

	@Column(name = "IS_RE_OPEN")
	private Boolean isReOpen;

	@Column(name = "ROOT_CAUSE_TYPE")
	private String rootCauseType;

	@Column(name = "ROOT_CAUSE")
	private String rootCasue;

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

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
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
	
	public void buildUpdateRedmineEntity(RedmineDetailDTO redmineDetailDTO) {
		setRedmine(redmineDetailDTO.getRedmine());
		setTracker(redmineDetailDTO.getTracker());
		setPriority(redmineDetailDTO.getPriority());
		setSubject(redmineDetailDTO.getSubject());
	}

	public RedmineDetailDTO buildRedmineDetailDTO() {
		
		RedmineDetailDTO redmineDetailDTO = new RedmineDetailDTO();

		redmineDetailDTO.setId(getId());
		redmineDetailDTO.setRedmine(getRedmine());
		redmineDetailDTO.setPriority(getPriority());
		redmineDetailDTO.setTracker(getTracker());
		redmineDetailDTO.setSubject(getSubject());
		redmineDetailDTO.setDueDate(getDueDate());
		redmineDetailDTO.setActualEndDate(getActualEndDate());
		redmineDetailDTO.setEstimatedEffort(getEstimatedEffort());
		redmineDetailDTO.setActualEffort(getActualEffort());
		redmineDetailDTO.setReOpenCount(getReOpenCount());
		redmineDetailDTO.setHasVariance(getHasVariance());
		redmineDetailDTO.setHasScheduleVariance(getHasScheduleVariance());
		redmineDetailDTO.setHasEffortVariance(getHasEffortVariance());
		redmineDetailDTO.setIsReOpen(getIsReOpen());
		redmineDetailDTO.setRootCauseType(getRootCauseType());
		redmineDetailDTO.setRootCasue(getRootCasue());

		return redmineDetailDTO;
	}
}
