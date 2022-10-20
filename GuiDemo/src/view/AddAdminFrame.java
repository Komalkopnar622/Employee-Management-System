package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Container.MyWindowListener;

public class AddAdminFrame extends Frame implements  ActionListener{
	Label lbId,lbName,lbSalary,lbAllowance;
	Button btAdd;
	TextField txtId,txtName,txtSalary,txtAllowance;
	public AddAdminFrame() {
		this.lbId=new Label("Enter the Id");
		this.lbName=new Label("Enter the Name");
		this.lbSalary=new Label("Enter the Salary");
		this.lbAllowance=new Label("Enter the Allowance");
		this.txtId=new TextField(17);
		this.txtName=new TextField(15);
		this.txtSalary=new TextField(15);
		this.txtAllowance=new TextField(17);
		this.btAdd=new Button("Add");
		
		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbAllowance);
		this.add(txtAllowance);
		this.add(btAdd);
		
        this.setVisible(true);
		
        this.setBounds(150, 150, 320, 450);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		MyWindowListener ml= new MyWindowListener(this);
		this.addWindowListener(ml);
		btAdd.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btAdd) {
			model.Employee e1=new model.Admin();
			e1.setId(Integer.parseInt(txtId.getText()));
			e1.setName(txtName.getText());
			e1.setSalary(Double.parseDouble(txtSalary.getText()));
			if(e1 instanceof model.Admin) {
				model.Admin a1= ( model.Admin) e1;
				a1.setAllowance(Double.parseDouble(txtAllowance.getText()));
			}
			
			db.EmpDAO d1=new db.EmpDAO();
			if(d1.insert(e1)==true) {
				System.out.println(e1.getId());
				System.out.println(e1.getName());
				System.out.println(e1.getSalary());
				if(e1 instanceof model.Admin) {
					model.Admin a1=(model.Admin)e1;
					System.out.println(a1.getAllowance());
				}
				JOptionPane.showMessageDialog(this,"Admin Added Sucessfully");
				this.dispose();
				//new AddAdminFrame();
			}
			else {
				JOptionPane.showMessageDialog(this,"Registration Fail");
			}
				
			
		}
		
	}

}

