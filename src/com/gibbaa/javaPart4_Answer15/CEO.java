package com.gibbaa.javaPart4_Answer15;

final public class CEO extends Employee {
	final public String position = "CEO";
	
	public CEO(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
		this.setEmploymentType(EmploymentType.PERMANANT);
	}

	@Override
	public void work() {
		System.out.println("CEO work 2 days a week!!");
	}
	
	@Override
	public void info() {
		System.out.println(this.firstname + " " + this.lastname + 
				" is " + this.position + " of this company.");
	}
	
	public void getPosition() {
		System.out.println(position);
	}
	
	final public void paySalary(Employee em) {
		if (em.getEmploymentType() == "PERMANANT") {
			System.out.println(em.firstname + " is " + em.getEmploymentType() + 
					" staff, " + this.firstname + " will pay monthly.");
		}
		else if (em.getEmploymentType() == "DAILY") {
			System.out.println(em.firstname + " is work " + em.getEmploymentType() + 
					" staff, " + this.firstname + " will pay monthly.");
		}
		else if (em.getEmploymentType() == "TEMPORALY") {
			System.out.println(em.firstname + " is work " + em.getEmploymentType() + 
					" staff, " + this.firstname + " will pay monthly untill end of contract.");
		}
	}

}
