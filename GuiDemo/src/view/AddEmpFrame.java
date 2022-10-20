package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Container.MyWindowListener;

public class AddEmpFrame extends Frame implements ActionListener {
	Button btSalesManager,btAdmin,btHr;

	public AddEmpFrame() {
		btSalesManager = new Button("SalesManager");
		btAdmin=new Button("Admin");
		btHr=new Button("HR");
		this.add(btSalesManager);
		this.add(btAdmin);
		this.add(btHr);
		this.setVisible(true);
		
		this.setBounds(150, 150, 100, 250);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		MyWindowListener ml= new MyWindowListener(this);
		this.addWindowListener(ml);
		btSalesManager.addActionListener(this);
		btAdmin.addActionListener(this);
		btHr.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btSalesManager) {
		new view.AddsalesManagerFrame();
			this.dispose();
			
		}
		else if(ae.getSource()==btAdmin){
			new view.AddAdminFrame();
			this.dispose();
		}
		else if(ae.getSource()==btHr) {
			new view.AddHrFrame();
			this.dispose();
		}
			
		
	}
	

}
