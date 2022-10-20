package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Container.MyWindowListener;

public class RemoveEmpFrame extends Frame implements ActionListener{
	
	Label lbId;
	TextField txtId;
	Button btRemove;
	public RemoveEmpFrame() {
		this.lbId=new Label("Enter The Id");
		this.txtId=new TextField(20);
		this.btRemove=new Button("Remove");
		this.add(lbId);
		this.add(txtId);
		this.add(btRemove);
		this.setVisible(true);
		
		this.setBounds(150, 150, 320, 450);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		MyWindowListener ml= new MyWindowListener(this);
	    this.addWindowListener(ml);
		btRemove.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btRemove) {
			db.EmpDAO d1=new db.EmpDAO();
		int id=Integer.parseInt(txtId.getText());
		int result=d1.remove(id);
		if(result==0) {
			JOptionPane.showMessageDialog(this, "Employee  romove Successfully");
			this.dispose();
		}
		else {
			JOptionPane.showMessageDialog(this, "Employee  do not remove ");
		}
			
	}
		
	}
	
	

}
