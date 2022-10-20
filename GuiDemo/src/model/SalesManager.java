package model;

public class SalesManager extends Employee{
	
	double incentive;
	int target;
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public double calsal() {
	
		return salary+incentive;
		
	}
	@Override
	public String toString() {
		return super.toString()+"SalesManager [incentive=" + incentive + ", target=" + target + "]";
	}
	
	
	

}
