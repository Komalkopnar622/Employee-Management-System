package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Container.MyWindowListener;

	public class RegistrationFrame extends Frame implements ActionListener 
	{
		Button btSubmit, btClear;
		Label lbUsername, lbPassword, lbCity;
		TextField txtUsername, txtPassword, txtCity;

		public RegistrationFrame() {
			// TODO Auto-generated constructor stub
			btSubmit = new Button("Submit");
			btClear = new Button("Reset values");
			lbCity = new Label("Enter the City");
			lbUsername = new Label("Enter the username");
			lbPassword = new Label("Enter the password");
			txtCity = new TextField(20);
			txtPassword = new TextField(20);
			txtUsername = new TextField(20);
			this.add(lbUsername);
			this.add(txtUsername);

			this.add(lbPassword);
			this.add(txtPassword);

			this.add(lbCity);
			this.add(txtCity);
			

			this.add(btSubmit);
			this.add(btClear);

			this.setVisible(true);
			this.setBounds(150, 150, 320, 450);
			this.setLayout(new FlowLayout());
			this.setResizable(false);
			
			MyWindowListener m1= new MyWindowListener(this);
			//conveyed listenr about the view line no44
			this.addWindowListener(m1);
			//conveyed view about the listenr line no46
			//Tight coupling 
			//view.addWindowListener(listener);
		    //frame.addWindowListener(windowListenr);
		btSubmit.addActionListener(this);
		btClear.addActionListener(this);			
	}

		@Override
		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub
			if(ae.getSource()==btSubmit) {
			
				//System.out.println("Sumbit");
				
				//System.out.println(txtUsername.getText());
				//System.out.println(txtPassword.getText());
				//System.out.println(txtCity.getText());
				model.User u1=new model.User();
				u1.setUsername(txtUsername.getText());
				u1.setPassword(txtPassword.getText());
				u1.setCity(txtCity.getText());
				db.DAO d1=new db.DAO();
				if(d1.inset(u1)==true)
				{
					JOptionPane.showMessageDialog(this, "Registration Successfully");
					this.dispose();
					new LoginFrame();
				}else {
					JOptionPane.showMessageDialog(this,"Registration Fail");	
				}	
				
			}
		}

}

	 
