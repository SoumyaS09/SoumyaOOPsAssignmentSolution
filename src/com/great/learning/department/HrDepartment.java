package com.great.learning.department;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
       String departmentName = "Welcome to Hr Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "Fill today’s timesheet and mark your attendance";
		return getTodaysWork;	
	}

	public String getWorkDeadline() {
	  	String getWorkDeadline = "Complete by EOD";
	  	return getWorkDeadline;
	}

	public String doActivity() {
		String doActivity = "team Lunch";
		return doActivity;
	}
}
