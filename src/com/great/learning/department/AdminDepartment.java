package com.great.learning.department;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName = "Welcome to Admin Department";
		return departmentName;

	}

	public String getTodaysWork() {
		String getTodaysWork = "Complete your documents Submission";
		return getTodaysWork;
		
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	 }

}
