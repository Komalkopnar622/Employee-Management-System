package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Container.MyWindowListener;
import db.EmpDAO;

public class CalSalFrame extends Frame {
	double sal;
	Label empDtails,lbSal,lbId,lbName,lbSalary;
	
	public CalSalFrame(){
		this.empDtails=new Label("Employee Details and salary");
		this.add(empDtails);
		this.setVisible(true);
		this.setBounds(300,150,350,300);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw);
		EmpDAO d1=new EmpDAO();
		if(d1.Calsal()!=0) {
			//sal=d1.Calsal();
			lbSal=new Label(Double.toString(d1.Calsal()));
			
			this.add(lbSal);
			
		

	}
	
}
}
