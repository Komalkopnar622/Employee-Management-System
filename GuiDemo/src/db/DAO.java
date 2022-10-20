package db;

import model.User;

public class DAO {
	static User arrUser[];
	static int count;
static 
		{
	arrUser =new User[3];
	count=0;
		}
public boolean inset(User u1) {
	// TODO Auto-generated method stub
	try {
		arrUser[count]=u1;
		count++;
		return true;
		
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Registration Full");
		return false;
		
	}catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	
}
public User validateUser(User u1) {
	// TODO Auto-generated method stub

	int flag = 0;

	for (int i = 0; i < arrUser.length; i++) {

		if (arrUser[i].getUsername().equals(u1.getUsername())
				&& arrUser[i].getPassword().equals(u1.getPassword())) {
			String city = arrUser[i].getCity();
			u1.setCity(city);
			flag = 1;
			break;
		}

	}
	if (flag == 0) {
		
		return null;
	} else {
		return u1;
	}
	

}

}




