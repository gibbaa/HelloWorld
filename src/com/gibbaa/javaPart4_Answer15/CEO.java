package com.gibbaa.javaPart4_Answer15;

final public class CEO extends Employee {
	
	public CEO(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
		this.setPosition("CEO");
		this.setEmploymentType(EmploymentType.PERMANANT);
	}
	
	@Override
	public void work() {
		System.out.println("CEO work 2 days a week!!");
	}
	
	@Override
	public void setPosition(String positionInput) {
		// make this method can not change input if it already set.
		
		if (this.getPosition() != null) {
			System.out.println("Position is alredy set to \"" + this.getPosition() + "\"" );
			return;
		}
		super.setPosition(positionInput);
	}
	
	@Override
	public void info() {
		System.out.println(this.firstname + " " + this.lastname + 
				" is " + this.getPosition() + " of this company.");
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
