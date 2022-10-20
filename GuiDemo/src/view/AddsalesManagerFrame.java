package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Container.MyWindowListener;
import model.SalesManager;

public class AddsalesManagerFrame extends Frame implements ActionListener {
	Label lbId,lbName,lbSalary,lbIncentive,lbTarget;
	TextField txtId,txtName,txtSalary,txtIncentive,txtTarget;
	Button btAdd;
	public AddsalesManagerFrame(){
		lbId=new Label("Enter Id");
		lbName=new Label("Enter Name");
		lbSalary=new Label("Enter Salary");
		lbIncentive=new Label("Enter Incentive");
		lbTarget=new Label("Enter Target");
		txtId = new TextField(22);
		txtName = new TextField(20);
		txtSalary=new TextField(20);
		txtIncentive=new TextField(20);
		txtTarget=new TextField(24);
		btAdd=new Button("Add");
		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbIncentive);
		this.add(txtIncentive);
		this.add(lbTarget);
		this.add(txtTarget);
		this.add(btAdd);
		MyWindowListener m1= new MyWindowListener(this);
		this.addWindowListener(m1);
		btAdd.addActionListener(this);
		
		this.setVisible(true);
		this.setBounds(150, 150, 320, 450);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btAdd) {
			//model.SalesManager s1=new model.SalesManager();
		model.Employee e1=new model.SalesManager(); //upcasting
		
		e1.setId(Integer.parseInt(txtId.getText()));
			e1.setName(txtName.getText());
			e1.setSalary(Double.parseDouble(txtSalary.getText()));
			if(e1 instanceof  model.SalesManager ) //is  downcasting
		      {
			model.SalesManager s1=( model.SalesManager) e1;
			s1.setIncentive(Double.parseDouble(txtIncentive.getText()));
		      }
			if(e1 instanceof  model.SalesManager ) //is
		      {
			model.SalesManager s1=( model.SalesManager) e1;
			s1.setTarget(Integer.parseInt(txtTarget.getText()));
		      }
			db.EmpDAO d1=new db.EmpDAO();
			if(d1.insert(e1)==true) {
				JOptionPane.showMessageDialog(this, "Salesmanager added Successfully");
				
				System.out.println("ID="+e1.getId());
				System.out.println("Name="+e1.getName());
				System.out.println("Salary="+e1.getSalary());
				if(e1 instanceof model.SalesManager)
				{
					model.SalesManager s1=( model.SalesManager) e1;
					System.out.println("Incentive="+s1.getIncentive());
				}
				if(e1 instanceof model.SalesManager)
				{
					model.SalesManager s1=(model.SalesManager)e1;
					System.out.println("Target="+s1.getTarget());
					System.out.println("Total Salary is="+s1.calsal());
				}
				
			//	System.out.println("Target="+e1.getTarget());
				
				this.dispose();
				//new AddsalesManagerFrame();
			}else {
				JOptionPane.showMessageDialog(this,"Registration Fail");	
			}	
			
		}
}
}	
	
	


