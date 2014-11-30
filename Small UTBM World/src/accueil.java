import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class accueil extends JFrame{
	//private GridBagConstraints gbc = new GridBagConstraints();
	
	public static void main(String[] args){ 
		GridBagConstraints gbc = new GridBagConstraints();
		   JFrame fenetre = new JFrame();
		   JTextField jtf = new JTextField();
		   JButton button = new JButton("Commencer");
		   
		   
		  
		   jtf.setText("BIENVENU A SMALL UTBM WORLD!");
		   jtf.setBackground(Color.gray);
		   
		   button.setPreferredSize(new Dimension(150,40));
		   

		   //fenetre.add(jtf);
		   //fenetre.setBackground(Color.ORANGE);
		   fenetre.setVisible(true);
		   fenetre.setTitle("Small UTBM World");
		   fenetre.setSize(600, 600);
		   fenetre.setLocationRelativeTo(null);
		   fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		   //fenetre.getContentPane().add(button, BorderLayout.CENTER);
		   
		   JPanel pan = new JPanel(new GridBagLayout());
		   pan.setBackground(Color.black);
		   pan.setForeground(Color.black);
		   pan.add(jtf);
		   
		   gbc.weighty = 3;
		   gbc.gridy = 3;
		   pan.add(button,gbc);
		   pan.setVisible(true);
		   jtf.setVisible(true);
		   
		   
		   fenetre.setContentPane(pan);
		   fenetre.setResizable(true);
		   //fenetre.getContentPane().add(button,BorderLayout.SOUTH);
		   
	}

}
