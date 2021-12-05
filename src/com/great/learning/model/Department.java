package com.great.learning.model;

public class Department {
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodayAHoliday;
	private String doActivity;
	private String getTechStackInformation;
	public Department(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday,
			String doActivity, String getTechStackInformation) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = isTodayAHoliday;
		this.doActivity = doActivity;
		this.getTechStackInformation = getTechStackInformation;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the getTodaysWork
	 */
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	/**
	 * @param getTodaysWork the getTodaysWork to set
	 */
	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	/**
	 * @return the getWorkDeadline
	 */
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
	/**
	 * @param getWorkDeadline the getWorkDeadline to set
	 */
	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	/**
	 * @return the isTodayAHoliday
	 */
	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
	/**
	 * @param isTodayAHoliday the isTodayAHoliday to set
	 */
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
	/**
	 * @return the doActivity
	 */
	public String getDoActivity() {
		return doActivity;
	}
	/**
	 * @param doActivity the doActivity to set
	 */
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}
	/**
	 * @return the getTechStackInformation
	 */
	public String getGetTechStackInformation() {
		return getTechStackInformation;
	}
	/**
	 * @param getTechStackInformation the getTechStackInformation to set
	 */
	public void setGetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;
	}
	
}
