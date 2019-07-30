package model;

public class Friend {

	private String name;

	private String phoneNumber;

	public Friend(String pName, String pPhoneNumber) {

		name = pName;
		phoneNumber = pPhoneNumber;
	}

	public String getName() {

		return name;
	}

	public String getPhoneNumber() {

		return phoneNumber;
	}

	public void setPhoneNumber(String pPhoneNumber) {

		//this.phoneNumber = phoneNumber;  *this* keyword means that as an object of type Friend, it will update phoneNumber
		// this.phoneNumber to what is received as a parameter (phoneNumber)
		
		phoneNumber = pPhoneNumber;
	}

}
