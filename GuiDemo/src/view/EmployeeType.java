package view;

import java.awt.*;

import Container.MyWindowListener;
import model.Employee;

public class EmployeeType extends Frame {
	Label lbsalesman,lbAdmin,lb,lbHr;
	public EmployeeType(Employee e1) {
		MyWindowListener m1= new MyWindowListener(this);
		this.addWindowListener(m1);
		this.setVisible(true);
		this.setBounds(150, 150, 320, 450);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
	
		lbsalesman=new Label("Employee Id="+e1.getName());
		this.add(lbsalesman);
		
		
	}
}
