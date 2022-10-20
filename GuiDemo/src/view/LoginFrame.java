package view;
import Container.MyWindowListener;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginFrame extends Frame implements ActionListener {
	Label lbUsername,lbPassword;
	TextField txtUsername,txtPassword;
	Button btSubmit,btReset,btRegistration;
	public LoginFrame() {
		lbUsername=new Label("Enter user name");
		lbPassword=new Label("Enter Password");
		txtUsername=new TextField(20);
		txtPassword=new TextField(20);
		btSubmit=new Button("Login");
		btReset=new Button("Reset");
		btRegistration=new Button("Registration");
		
		this.add(lbUsername);
		this.add(txtUsername);
		this.add(lbPassword);
		this.add(txtPassword);
		this.add(btSubmit);
		this.add(btReset);
		this.add(btRegistration);
		
		this.setVisible(true);
		this.setBounds(150, 150, 320, 450);
		
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
		MyWindowListener m1=new MyWindowListener(this);
		this.addWindowListener(m1);
		btRegistration.addActionListener(this);
		btSubmit.addActionListener(this);
		btReset.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btRegistration) {
			new RegistrationFrame();
			this.dispose();
			}
		if(ae.getSource()==btSubmit) {
			model.User u1=new model.User();
			u1.setUsername(txtUsername.getText());
			u1.setPassword(txtPassword.getText());
			db.DAO d1=new db.DAO();
			u1=d1.validateUser(u1);
			
			
			if(u1!=null)
			{
				JOptionPane.showMessageDialog(this, "Successful Login" + u1.getCity());
				new view.WelcomeFrame(u1);
				this.dispose();
				
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid UserName or password");
			}

			
		}
		else {
			System.out.println("reset");
			
		}
		
	}
	
	
	

}
