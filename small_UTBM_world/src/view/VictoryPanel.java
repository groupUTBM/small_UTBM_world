package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.BackButtonListener;
import model.Player;

public class VictoryPanel extends JPanel {

	
	private static final long serialVersionUID = 314586416726747988L;

	private PlayerPanel pp;
	private JLabel message;
	private JButton restartBtn;
	private BackButtonListener bbl;
	public VictoryPanel(Player p){
		setLayout(new FlowLayout());
		restartBtn=new JButton("Recommencer");
		bbl=new BackButtonListener(GlobalPanel.getInstance());
		message= new JLabel("Le joueur " + p.getName() + " a remporté la victoire");
		pp= new PlayerPanel(p);
		add(message);
		add(pp);
		add(restartBtn);
		restartBtn.addMouseListener(bbl);
		pp.setVisible(true);
		message.setVisible(true);
		restartBtn.setVisible(true);
	}
}
