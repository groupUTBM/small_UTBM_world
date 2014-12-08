package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;






import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.SwingConstants;
import javax.swing.JTextField;

import model.Player;
import controller.GameButtonListener;
import controller.StartButtonListener;

public class EnterNamePlayer extends JPanel {
	private JLabel title = new JLabel();
	private JLabel affiche = new JLabel();
	private ArrayList<Player> players;
	private JTextField enter = new JTextField(20);
	private JButton valid = new JButton("+");
	private JButton start = new JButton("Commencer");
	private JButton back = new JButton("Retourner");
	private GameButtonListener gbl;
	private StartButtonListener sbl;

	
	public EnterNamePlayer(GlobalPanel gp){
		gbl = new GameButtonListener(gp);
		sbl = new StartButtonListener(gp);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,600,70));
		
		title.setText("SAISIR VOTRES NOMS");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.getText();
		System.out.println(title.getText());
		title.setBackground(Color.black);
		
		JPanel jpTextField = new JPanel();
		jpTextField.setBackground(Color.black);
		jpTextField.setLayout(new BorderLayout(5,0));
		jpTextField.add(enter,BorderLayout.CENTER);
		jpTextField.add(valid,BorderLayout.EAST);
		enter.setHorizontalAlignment(JTextField.RIGHT);
		
		affiche.setPreferredSize(new Dimension(150,180));
		affiche.setForeground(Color.WHITE);
		
		valid.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				affiche.setText(enter.getText());
			}
		});
		
		
		JPanel jpButton = new JPanel();
		jpButton.setBackground(Color.black);
		jpButton.add(back,BorderLayout.WEST);
		jpButton.add(start,BorderLayout.EAST);
				
		setBackground(Color.black);
		add(title);	
		add(jpTextField);
		add(affiche);
		add(jpButton);
		
		
		
		start.addMouseListener(gbl);
		back.addMouseListener(sbl);
	}
}
