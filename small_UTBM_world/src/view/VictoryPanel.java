package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Player;

public class VictoryPanel extends JPanel {

	
	private static final long serialVersionUID = 314586416726747988L;

	private PlayerPanel pp;
	private JLabel message;
	public VictoryPanel(Player p){
		message= new JLabel("Le joueur " + p.getName() + " a remporté la victoire");
		pp= new PlayerPanel(p);
		add(message, BorderLayout.PAGE_START);
		add(pp,BorderLayout.PAGE_END);
		
		pp.setVisible(true);
		message.setVisible(true);
	}
}
