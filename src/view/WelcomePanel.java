package view;
//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.SwingConstants;


import controller.StartButtonListener;

public class WelcomePanel extends JPanel {
	//private GridBagConstraints gbc1 = new GridBagConstraints();
	//private GridBagConstraints gbc2 = new GridBagConstraints();
	private JLabel title = new JLabel();
	private JButton commencer = new JButton("Commencer");
	private JButton tutoriel = new JButton("Tutoriel");
	
	private StartButtonListener sbl;
	
	public WelcomePanel(GlobalPanel gp){
		sbl= new StartButtonListener(gp);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,600,70));
		title.setText("BIENVENUE A SMALL UTBM WORLD!");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.getText();
		System.out.println(title.getText());
		title.setBackground(Color.black);
	   
	   
	   commencer.setPreferredSize(new Dimension(150,40));
	   tutoriel.setPreferredSize(new Dimension(150,40));
	   
	   setBackground(Color.black);
	   add(title);	   
	   add(tutoriel);
	   add(commencer);
	   
	   commencer.addMouseListener(sbl);
	   
	   setVisible(true);
	   
	   tutoriel.setVisible(true);
	   commencer.setVisible(true);
	   
	}
	
}

