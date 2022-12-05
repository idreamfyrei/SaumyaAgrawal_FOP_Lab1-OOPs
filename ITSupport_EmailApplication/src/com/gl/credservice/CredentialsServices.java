package com.gl.credservice;

import java.security.SecureRandom;

import com.gl.empdetails.Employee;
import com.gl.interfaces.empCred;

public class CredentialsServices implements empCred {
//generate email address and return it
	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept) {
		String emailAddress = firstName+lastName+"@"+dept+".gl.com";
		return emailAddress;
	}

	//generate password
	@Override
	public String generatePassword() {
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMBER = "0123456789";
        String SPECIAL_CHAR = "!@#$%^&*()";
        
        //concat 4 strings
        String randString = CHAR_LOWER + CHAR_UPPER + NUMBER+SPECIAL_CHAR;
        SecureRandom random = new SecureRandom();
        
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            
            int rndCharAt = random.nextInt(randString.length());
            char rndChar = randString.charAt(rndCharAt);

            s.append(rndChar);
        }

        return s.toString();
    }
	

	@Override
	//display Employee Credentials
	public void showCredentials(Employee employee) {
		
		System.out.println("Dear "+employee.getFirstName() + " your generated credentials are as follows:");
		System.out.println("Email ID : " + employee.geteMail());
		System.out.println("Password : " +employee.getPassword());
		
	}

}
