package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Container.MyWindowListener;
import model.User;

public class WelcomeFrame extends Frame implements ActionListener{
Label lbWelcome;
Button btAddEmp,btRemoveEmp,btSearchEmp,btEditEmp,btCalsalEmp,btCalSal;
	

	public WelcomeFrame(User u1) {
		// TODO Auto-generated constructor stub
		btAddEmp=new Button("Add Emp");
		btRemoveEmp=new Button("Remove Emp");
		btSearchEmp=new Button("Search Emp");
		btEditEmp=new Button("Edit Emp");
		btCalSal=new Button("Cal sal");
		
		lbWelcome = new Label("\n     Welcome on Home Page.");
		this.add(lbWelcome);
		
		this.add(btAddEmp);
		this.add(btRemoveEmp);
		this.add(btSearchEmp);
		this.add(btEditEmp);
		this.add(btCalSal);
	
		this.setVisible(true);
		this.setBounds(300,250,170,250);
		this.setLayout(new FlowLayout());
		this.setResizable(false);

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw);
		btAddEmp.addActionListener(this);
		btRemoveEmp.addActionListener(this);
		btSearchEmp.addActionListener(this);
		btEditEmp.addActionListener(this);
		btCalSal.addActionListener(this);

}


	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btAddEmp){
		    new view.AddEmpFrame ();
			}
		else if(ae.getSource()==btRemoveEmp) {
			new view.RemoveEmpFrame();
		    }
		else if(ae.getSource()==btSearchEmp) {
		new view.SearchEmpFrame();
		}
		else if(ae.getSource()==btCalSal) {
			new view.CalSalFrame();
			
			
		}
	}
}
		
		
		
