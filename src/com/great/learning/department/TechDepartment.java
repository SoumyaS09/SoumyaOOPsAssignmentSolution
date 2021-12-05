package com.great.learning.department;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		String departmentName = "Welcome to Tech Department ";
		return departmentName;

	}

	public String getTodaysWork() {
		String getTodaysWork = "Complete coding of module 1";
		return getTodaysWork;		
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	
	}

	public String getTechStackInformation () {
		String getTechStackInformation = "core Java";
		return getTechStackInformation;
	}
}
