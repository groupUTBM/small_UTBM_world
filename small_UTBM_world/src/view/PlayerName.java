package view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Player;

public class PlayerName extends JPanel{

	private static final long serialVersionUID = 4521409508747610751L;
	private JLabel panNom;
	private JLabel panPeuple;
	private JLabel ecranNom;
	private JLabel ecranPeuple;

	
	//private vue(Player P)
	public PlayerName(Player p)
	{
		
		Font police = new Font("Arial", Font.BOLD, 12);
		ecranNom = new JLabel(p.getName());
	    ecranPeuple = new JLabel();
	    panNom = new JLabel("NOM :");
		panPeuple = new JLabel("Peuple + Pouvoir");
	    
	    ecranNom.setFont(police);
	    ecranPeuple.setFont(police);
	    ecranNom.setBorder(BorderFactory.createLineBorder(Color.white));
	    ecranPeuple.setBorder(BorderFactory.createLineBorder(Color.white));
	    ecranNom.setOpaque(true);
	    ecranPeuple.setOpaque(true);
	    ecranNom.setBackground(Color.black); 
	    ecranPeuple.setBackground(Color.black);
	    ecranNom.setForeground(Color.WHITE);
	    ecranPeuple.setForeground(Color.WHITE);
	    ecranNom.setHorizontalAlignment(JTextField.CENTER);
	    ecranPeuple.setHorizontalAlignment(JTextField.CENTER);
	    
		
	    panNom.setHorizontalAlignment(JLabel.CENTER);
	    panPeuple.setHorizontalAlignment(JLabel.CENTER);
	    panNom.setOpaque(true);
	    panPeuple.setOpaque(true);
	    panNom.setBackground(Color.black); 
	    panPeuple.setBackground(Color.black);
	    panNom.setForeground(Color.WHITE);
	    panPeuple.setForeground(Color.WHITE);
	    panNom.setBorder(BorderFactory.createLineBorder(Color.white));
	    panPeuple.setBorder(BorderFactory.createLineBorder(Color.white));
	    
	    // cr?ation du conteneur
	    this.setLayout(new GridLayout(2, 2, 0, 0));
	    this.add(panNom);
	    this.add(ecranNom);
	    this.add(panPeuple);
	    this.add(ecranPeuple);
	    this.setMinimumSize(new Dimension(300,40));
	    this.setMaximumSize(new Dimension(300,50));
	}
	
	public void update(Player p){
		ecranPeuple.setText(p.getDepartment().get_name());
	}
}