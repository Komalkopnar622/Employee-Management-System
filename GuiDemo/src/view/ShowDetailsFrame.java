package view;

import java.awt.*;

import Container.MyWindowListener;
import model.Admin;
import model.Employee;
import model.Hr;
import model.SalesManager;

public class ShowDetailsFrame extends Frame {
	Label lbName,lbId,lbSalary,lbIncentive,lbTarget,lbAllowance,lbCommission,lbTotalsal;
	
	public  ShowDetailsFrame (Employee e1) {
		lbId=new Label("Id is:"+e1.getId());
		lbName=new Label("Name is:"+e1.getName());
		lbSalary=new Label("Salary is"+e1.getSalary());
		lbTotalsal=new Label("Total salary is:"+e1.calsal());
		this.setVisible(true);
		this.add(lbId);
		this.add(lbName);
		this.add(lbSalary);
		
		if(e1 instanceof SalesManager) {
			SalesManager s1=(SalesManager)e1;
			lbIncentive=new Label("Incentive is:"+s1.getIncentive());
			lbTarget=new Label("Target"+s1.getTarget());
			this.add(lbIncentive);
			this.add(lbTarget);
		}
		if(e1 instanceof Admin ) {
			Admin a1=(Admin)e1;
			lbAllowance=new Label("Allowance is:"+a1.getAllowance());
			this.add(lbAllowance);
			
		}
		if(e1 instanceof Hr ) {
			Hr a1=(Hr)e1;
			lbCommission=new Label("Commission is:"+a1.getCommission());
			this.add(lbCommission);
			
		}
		this.add(lbTotalsal);
		
		this.setBounds(150, 150, 150, 250);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		MyWindowListener ml= new MyWindowListener(this);
		 this.addWindowListener(ml);
		
		
		
		
	}

}
