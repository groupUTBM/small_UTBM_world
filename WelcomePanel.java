package View;
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
	private JFrame fenetre = new JFrame();
	private JLabel title = new JLabel();
	private JButton commencer = new JButton("Commencer");
	private JButton tutoriel = new JButton("Tutoriel");

	
	public WelcomePanel(){
	  
	   title.setText("BIENVENUE A SMALL UTBM WORLD!");
	   title.setForeground(Color.white);
	   title.setFont(new java.awt.Font("Dialog", 1, 20));
	   title.getText();
	   System.out.println(title.getText());
	   title.setBackground(Color.black);
	   
	   
	   commencer.setPreferredSize(new Dimension(150,40));
	   tutoriel.setPreferredSize(new Dimension(150,40));
	   

	   fenetre.setVisible(true);
	   fenetre.setTitle("Small UTBM World");
	   fenetre.setSize(600, 600);
	   fenetre.setLocationRelativeTo(null);
	   fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   
	   
	   JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER,600,70));
	   pan.setBackground(Color.black);
	   pan.add(title);	   
	   pan.add(tutoriel);
	   pan.add(commencer);
	   pan.setVisible(true);
	   
	   tutoriel.setVisible(true);
	   commencer.setVisible(true);
	   
	   
	   fenetre.setContentPane(pan);
	   fenetre.setResizable(true);
		   
	}

	public void showChooseNbPan() {
		// TODO Auto-generated method stub
		
	}


	
}

