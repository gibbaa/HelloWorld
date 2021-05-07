package com.gibbaa.javaPart4_Answer15;

public abstract class Employee {
	public String firstname;
	public String lastname;
	private String position;
	private String employmentType;

	public enum EmploymentType {
		PERMANANT, 
		DAILY,
		TEMPORALY
	}

	public Employee(String firstnameInput, String lastnameInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
	}

	public abstract void work();
	
	public abstract void info();
	
	public void setPosition(String positionInput) {
		if (position != null) {
			System.out.println("Position is alredy set to \"" + this.position + "\"" );
			return;
		}
		this.position = positionInput;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setEmploymentType(EmploymentType type) {
	  switch (type) {
	  	case PERMANANT : 
	  		employmentType = type.PERMANANT.toString(); 
	  		break; 
		case DAILY :
			employmentType = type.DAILY.toString(); 
			break; 
		case TEMPORALY : 
			employmentType = type.TEMPORALY.toString(); 
			break; 
		default: employmentType = "NOT HIRE!!"; 
			break;
	  }
	  
	}

	public String getEmploymentType() {
		return this.employmentType;
	}

}
