package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class InfoPanel extends JPanel{
	
private JLabel lblNumberOfFriends;
	
	public InfoPanel() {
	
		// Graphical layouts
		setLayout(new BorderLayout()); // North, Center, West, East, South
		lblNumberOfFriends = new JLabel("Friends: "); // Graphical elements
		
		add(lblNumberOfFriends, BorderLayout.CENTER); 
		
		TitledBorder title = new TitledBorder("Information");
		setBorder(title);
		
		setSize(new Dimension(50, 10));
	}
	
	public void updateNumber(int pNumber) {
		
		lblNumberOfFriends.setText("Friends: " + pNumber);
		validate();
	}

}
