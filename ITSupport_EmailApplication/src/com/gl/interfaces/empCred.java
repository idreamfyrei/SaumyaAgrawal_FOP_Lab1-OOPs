package com.gl.interfaces;

import com.gl.empdetails.Employee;

public interface empCred {
	//generates email address
	public String generateEmailAddress(String firstName, String lastName, String dept);
	
	//generates password
	public String generatePassword();
	
	//display credentials for new hires
	public void showCredentials (Employee employee);
}
