package model;

/**
 * Class that models a social contact.
 * @author Pedro Guillermo Feij�o && Ana Ausek
 */

public class Friend {

	// Initializing name variable
	private String name;

	// Initializing phoneNumber variable
	private String phoneNumber;

	// Initializing Friend constructor
	public Friend(String pName, String pPhoneNumber) {

		name = pName;
		phoneNumber = pPhoneNumber;
	}

	//---------------------------------
		// Methods
		// --------------------------------

		/**
		 * <b>Description: </b> Method that returns contact name.<br>
		 **/
	
	public String getName() {

		return name; 
	}

	//Get contacts phoneNumber
	public String getPhoneNumber() {

		return phoneNumber;
	}

	/**
	 * <b>Description: </b> Method that returns contact phone number.<br>
	 * <b>Post: </b> Returns phone number.<br>
	 * @param pPhoneNumber string to be stored as phone number. pPhoneNumber >=0.
	 */
	public void setPhoneNumber(String pPhoneNumber) {

		//this.phoneNumber = phoneNumber;  *this* keyword means that as an object of type Friend, it will update phoneNumber
		// this.phoneNumber to what is received as a parameter (phoneNumber)
		
		phoneNumber = pPhoneNumber;
	}

}
