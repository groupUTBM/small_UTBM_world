package View;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

import controller.StartButtonListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class WelcomePanel extends JPanel{
	
	private GridBagConstraints gbc = new GridBagConstraints();
	private JTextField jtf = new JTextField();
	private JButton button = new JButton("Commencer");
	private StartButtonListener startBtnLst;
	
	public WelcomePanel(GlobalPanel gp){
		setBackground(Color.black);
		setForeground(Color.black);
		setLayout(new GridBagLayout());
		setSize(600, 600);
		
		startBtnLst = new StartButtonListener(gp);
		
		jtf.setText("BIENVENU A SMALL UTBM WORLD!");
		jtf.setBackground(Color.gray);
		button.setPreferredSize(new Dimension(150,40));
		button.addMouseListener(startBtnLst);
		
		
		add(jtf);
		
		gbc.weighty = 1;
		gbc.gridy = 3;
		add(button,gbc);
		setVisible(true);
	}
}
