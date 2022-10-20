package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Container.MyWindowListener;
import model.Employee;

public class SearchEmpFrame extends Frame implements ActionListener{
	
	Label lbId;
	TextField txtId;
	Button btSearch,btshowEmpDetails;
	public SearchEmpFrame() {
		this.lbId=new Label("Enter The Id");
		this.txtId=new TextField(25);
		
		this.btSearch=new Button("Search");
		this.btshowEmpDetails=new Button("ShowEmpDetails");
		this.add(lbId);
		this.add(txtId);
		this.add(btSearch);
		this.setVisible(true);
		this.add(btshowEmpDetails);
		this.setBounds(150, 150, 320, 450);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		MyWindowListener ml= new MyWindowListener(this);
	    this.addWindowListener(ml);
	    btSearch.addActionListener(this);
	    btshowEmpDetails.addActionListener(this);
	    }


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== btSearch) {
			db.EmpDAO d1=new db.EmpDAO();
			int id=Integer.parseInt(txtId.getText());
			int result=d1.search(id);
			if(result==1) {
				JOptionPane.showMessageDialog(this, "Employee  is Present");
				this.dispose();
			}
	
			else {
				JOptionPane.showMessageDialog(this, "Employee  do not Present ");
			}
			}
		if(ae.getSource()==btshowEmpDetails) {
			db.EmpDAO d1=new db.EmpDAO();
			int id=Integer.parseInt(txtId.getText());
			Employee e1=d1.ShowDetails(id);
			if(e1!=null) {
				new view.ShowDetailsFrame(e1);
				this.dispose();
			}
			
			else {
				JOptionPane.showMessageDialog(this,"Invalid Id");
			}
			
		}
		
	}
	}