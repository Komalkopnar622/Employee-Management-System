package db;

import model.Admin;
import model.Employee;
import model.Hr;
import model.SalesManager;

public class EmpDAO {
	
	static Employee[] earr;
	static int count;
	static {
		earr=new Employee[3];
		count=0;
	}

	public boolean insert(Employee e1) {
		// TODO Auto-generated method stub
		try {
			earr[count]=e1;
			count++;
			return true;
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Registration Full");
			return false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
}
public int remove(int id) {
		int flag = 0;

		for (int i = 0; i < earr.length; i++) {

			if (earr[i].getId()==id) {
				earr[i]=null;
				count--;
				break;
				}
			
			else {
				flag=1;
			}
			
	    }
		return flag;
}
public int search(int id) {
	int flag = 0;

	for (int i = 0; i < earr.length; i++) {

		if (earr[i].getId()==id) {
			flag=1;
			break;
			}
		
		else {
			flag=0;
		}
		
    }
	return flag;
}
public double Calsal() {
	int i;
	double sal=0;
	int flag=0;
	for(i=0;i< count;i++) {
		if(earr[i] instanceof SalesManager) {
			flag=1;
			SalesManager s1=(SalesManager)earr[i];
			sal=s1.calsal();
		}
		else if(earr[i] instanceof Admin) {
			flag=1;
			Admin s1=(Admin)earr[i];
			sal=s1.calsal();
		}
		else if(earr[i]instanceof Hr) {
			flag=1;
			Hr s1=(Hr) earr[i];
			sal=s1.calsal();
		}
	}
		if(flag==1) {
			return sal;
		}
		else
			return 0;
}

public Employee ShowDetails(int id) {
	int flag=0;
	int i=0;
	for(i=0;i<earr.length;i++) {
		if(earr[i].getId()==id) {
			flag=1;
			break;
		}
		
	}
	if(flag==0)
	{
		return null;
	}
	else {
	return earr[i];
}
}
}

