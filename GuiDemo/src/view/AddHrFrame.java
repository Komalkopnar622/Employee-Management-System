package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Container.MyWindowListener;

public class AddHrFrame extends Frame implements ActionListener {
	Label lbId,lbName,lbSalary,lbCommission;
	Button btAdd;
	TextField txtId,txtName,txtSalary,txtCommission;
	public  AddHrFrame() {
		this.lbId=new Label("Enter the id");
		this.lbName=new Label("Enter the Name");
		this.lbSalary=new Label("Enter the Salary");
		this.lbCommission=new Label("Enter the Commition");
		this.txtId=new TextField(20);
		this.txtName=new TextField(20);
		this.txtSalary=new TextField(20);
		this.txtCommission=new TextField(20);
		this.btAdd=new Button("Add");
		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbCommission);
		this.add(txtCommission);
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
			model.Employee e1=new model.Hr();
			e1.setId(Integer.parseInt(txtId.getText()));
			e1.setName(txtName.getText());
			e1.setSalary(Double.parseDouble(txtSalary.getText()));
			if(e1 instanceof model.Hr) {
				model.Hr a1= ( model.Hr) e1;
				a1.setCommission(Double.parseDouble(txtCommission.getText()));
			}
			
			db.EmpDAO d1=new db.EmpDAO();
			
			if(d1.insert(e1)==true) {
				System.out.println(e1.getId());
				System.out.println(e1.getName());
				System.out.println(e1.getSalary());
				if(e1 instanceof model.Hr) {
					model.Hr a1=(model.Hr)e1;
					System.out.println(a1.getCommission());
				}
				JOptionPane.showMessageDialog(this,"Hr Added Sucessfully");
				this.dispose();
				//new AddHrFrame();
			}
			else {
				JOptionPane.showMessageDialog(this,"Registration Fail");
			}
				
			
		
	}

}
}
