package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.ControlClass;

public class Frame extends JFrame{

	private ActionsPanel jpActions;
	private InfoPanel jpInfo;

	private ControlClass controller;

	public Frame(ControlClass pController) {

		controller = pController;
		setLayout(new BorderLayout());
		jpActions = new ActionsPanel(this);
		jpInfo = new InfoPanel();
		add(jpActions, BorderLayout.CENTER);
		add(jpInfo, BorderLayout.SOUTH);

		setTitle("Luke's Agenda");
		setSize(new Dimension(320, 200));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void requestAdd() {

		String name = JOptionPane.showInputDialog(this, "Please input the name:");
		String phoneNumber = JOptionPane.showInputDialog(this, "Please input the phone number:");

		controller.reqAddFriend(name, phoneNumber);

	}

	public void requestRemoval() {

		String name = JOptionPane.showInputDialog(this, "Please input the name:");
		controller.reqRemoveFriend(name);
	}

	public void requestSearch() {

		String name = JOptionPane.showInputDialog(this, "Please input the name:");
		controller.reqSearchFriend(name);
	}

	public void requestUpdate() {

		String name = JOptionPane.showInputDialog(this, "Please input the name:");
		String phoneNumber = JOptionPane.showInputDialog(this, "Please input the phone number:");
		controller.reqUpdateFriend(name, phoneNumber);
	}

	public void displayMessageToUser(String pMessage) {

		JOptionPane.showMessageDialog(this, pMessage);
	}
	
	public void displayErrorToUser(String pMessage) {

		JOptionPane.showMessageDialog(this, pMessage, "Warning!", JOptionPane.ERROR_MESSAGE);
	}
	
	public void refreshInfoPanel(int pNumberOfFriends) {
		
		jpInfo.updateNumber(pNumberOfFriends);
	}

}
