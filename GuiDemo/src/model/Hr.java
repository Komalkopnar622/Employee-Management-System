package model;

public class Hr extends Employee {
	double commission;
	

	public double getCommission() {
		return commission;
	}


	public void setCommission(double commition) {
		this.commission = commition;
	}


	@Override
	public double calsal() {
		// TODO Auto-generated method stub
		return salary+commission;
	}

}
