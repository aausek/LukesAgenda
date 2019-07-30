package controller;

import model.Agenda;
import model.Friend;
import view.Frame;

//Model <--> Controller <--> View


public class ControlClass {

	private Agenda agenda;
	private Frame frame;

	public ControlClass() {

		agenda = new Agenda();
		frame = new Frame(this);
		frame.setVisible(true);
	}

	public void reqAddFriend(String pName, String pPhoneNumber) {

		try {

			agenda.addFriend(pName, pPhoneNumber);
			String message = "Your friend has been successfully added.";
			int n = agenda.getNumberOfFriends();
			frame.refreshInfoPanel(n);
			frame.displayMessageToUser(message);
		}
		catch(Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}

	public void reqRemoveFriend(String pName) {

		try {

			agenda.removeFriend(pName);
			String message = "Your friend has been successfully removed.";
			int n = agenda.getNumberOfFriends();
			frame.refreshInfoPanel(n);
			frame.displayMessageToUser(message);

		} catch (Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}

	public void reqSearchFriend(String pName) {

		try {

			Friend f = agenda.searchFriend(pName);
			String message = "Friend found: " + pName + " | " + f.getPhoneNumber() ;
			frame.displayMessageToUser(message);

		} catch (Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}

	public void reqUpdateFriend(String pName, String pPhoneNumber) {

		try {

			agenda.updatePhoneNumber(pName, pPhoneNumber);
			String message = "Your friend has been updated.";
			frame.displayMessageToUser(message);

		} catch (Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		ControlClass c = new ControlClass();
	}

}





















