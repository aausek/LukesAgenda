package model;

import java.util.ArrayList; // Add comments

public class Agenda {

	private int numberOfFriends;

	private ArrayList<Friend> friends;

	public Agenda() {

		numberOfFriends = 0;
		friends = new ArrayList<Friend>();
	}

	public int getNumberOfFriends() {

		return numberOfFriends;
	}

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

			if(response == null) {

				throw new Exception("You don't have a friend with that name."); 
			}
		}

		return response;
	}

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

	public void updatePhoneNumber(String pName, String pPhoneNumber) throws Exception {


		if(friends.isEmpty()) {

			throw new Exception("You still have no friends in the agenda.");
		}
		
		Friend existingFriend = searchFriend(pName);
		
		existingFriend.setPhoneNumber(pPhoneNumber);
		
	}

























}
