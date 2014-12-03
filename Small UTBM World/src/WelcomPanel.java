import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomPanel extends JPanel {
	private GridBagConstraints gbc = new GridBagConstraints();
	private JFrame fenetre = new JFrame();
	private JTextField jtf = new JTextField();
	private JButton button = new JButton("Commencer");
	
	public WelcomPanel(){
		jtf.setText("BIENVENUE A SMALL UTBM WORLD!");
		   jtf.setBackground(Color.gray);
		   jtf.getText();
		   System.out.println(jtf.getText());
		   
		   button.setPreferredSize(new Dimension(150,40));
		   
		   setBackground(Color.gray);
		   setForeground(Color.gray);
		   add(jtf);
		   
		   gbc.weighty = 3;
		   gbc.gridy = 3;
		   add(button,gbc);
		   
		  
		   setVisible(true);
		   jtf.setVisible(true);
		   
	}
	
}
