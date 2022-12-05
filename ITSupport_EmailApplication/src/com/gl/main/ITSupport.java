package com.gl.main;

import java.util.*;

import com.gl.credservice.CredentialsServices;
import com.gl.empdetails.Employee;
import com.gl.interfaces.empCred;



public class ITSupport {
	
	public static void main(String[] args) {
		
		//user input for their name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you first name");
		String FIRST_NAME = sc.nextLine();
		System.out.println("Enter your Last name");
		String LAST_NAME = sc.nextLine();
		
		Employee emp = new Employee(FIRST_NAME,LAST_NAME);
		
		//user input options for departments
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		Scanner choice = new Scanner(System.in);
		int Option = choice.nextInt();
		
		empCred cs = new CredentialsServices();
		String genEMAIL = null, genPASSWORD = null;
		
		switch(Option) {
		case 1: {
			//For Technical Department
			genEMAIL = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),
										emp.getLastName().toLowerCase(), "tech");
			genPASSWORD = cs.generatePassword();
			break;
		}
		case 2: {
			//For Admin Department
			genEMAIL = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),
										emp.getLastName().toLowerCase(), "admin");
			genPASSWORD = cs.generatePassword();
			break;
		}
		case 3: {
			//For HR Department
			genEMAIL = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),
										emp.getLastName().toLowerCase(), "hr");
			genPASSWORD = cs.generatePassword();
			break;
		}
		case 4: {
			//For Legal Department
			genEMAIL = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),
										emp.getLastName().toLowerCase(), "legal");
			genPASSWORD = cs.generatePassword();
			break;
		}
		default : {
			System.out.println("Department does not exist");
		}
	}
		emp.seteMail(genEMAIL);
		emp.setPassword(genPASSWORD);
		cs.showCredentials(emp);
		
		choice.close();
	}

}
