package model;

import java.util.ArrayList; 

/**
 * Class that models a social agenda.
 * @author Pedro Guillermo Feij�o && Ana Ausek
 */

//Initializing the Agenda constructor
public class Agenda {

	/**
	 * Variable storing number of friends
	 */
	private int numberOfFriends;

	/**
	 * Arraylist of friends instances
	 */
	private ArrayList<Friend> friends;

	public Agenda() {

		numberOfFriends = 0;
		friends = new ArrayList<Friend>();
	}

	//Method get total number of friends added to the agenda
	public int getNumberOfFriends() {

		return numberOfFriends;
	}

	//Method to add friend instance 
	public boolean addFriend(String pName, String pPhoneNumber)throws Exception {

		boolean response = false;

		if(pName == null || pName.isEmpty()) {

			throw new Exception("You have to input a name.");
		}
		if(pName == null || pPhoneNumber.isEmpty()) {

			throw new Exception("You have to input a phone number.");
		}

		boolean existingNumber = phoneNumberExists(pPhoneNumber);

		if(existingNumber == true) {

			throw new Exception("Your friend already exists!");
		}

		Friend a = new Friend(pName, pPhoneNumber);

		friends.add(a);
		numberOfFriends++;
		response = true;

		return response;
	}

	//Method to check if phone number exists using phone number input
	private boolean phoneNumberExists(String pPhoneNumber) {

		boolean exists = false;

		for(int i = 0; i < friends.size() && exists == false; i++) {

			Friend a = friends.get(i);

			if(a.getPhoneNumber().equals(pPhoneNumber)) {

				exists = true;
			}
		}

		return exists;
	}

	//Method to search for an instance of friend using name input 
	public Friend searchFriend(String pName) throws Exception {

		Friend response = null;

		if(friends.isEmpty()) {

			throw new Exception("You still have no friends in the agenda."); 
		}

		for (int i = 0; i < friends.size() && response == null; i++) {

			Friend a = friends.get(i);

			if(a.getName().equals(pName)) {

				response = a;
			}

		}
		
		if(response == null) {

			throw new Exception("You don't have a friend with that name."); 
		}

		return response;
	}

	//Method to remove friend instance using input name
	public boolean removeFriend(String pName) throws Exception {

		boolean response = false;

		if(friends.isEmpty()) {

			throw new Exception("You still have no friends in the agenda.");
		}

		Friend existingFriend = searchFriend(pName);

		friends.remove(existingFriend);
		numberOfFriends--;
		response = true;

		return response;
	}

	//Method to update existing phone number to new number using input name and phone number
	public void updatePhoneNumber(String pName, String pPhoneNumber) throws Exception {


		if(friends.isEmpty()) {

			throw new Exception("You still have no friends in the agenda.");
		}
		
		Friend existingFriend = searchFriend(pName);
		
		existingFriend.setPhoneNumber(pPhoneNumber);
		
	}

























}
