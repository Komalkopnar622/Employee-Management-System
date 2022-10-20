package model;

public class Admin extends Employee {
	
	double allowance;
	

	public double getAllowance() {
		return allowance;
	}


	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}


	@Override
	public double calsal() {
		// TODO Auto-generated method stub
		return salary+allowance;
	}

}
