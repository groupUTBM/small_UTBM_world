package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;





import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.SwingConstants;
import javax.swing.JTextField;

import controller.NextButtonListener;

public class EnterNamePlayer extends JPanel {
	private JLabel title = new JLabel();
	private JTextField enter = new JTextField(20);
	private JButton valid = new JButton("+");
	private JButton start = new JButton("Commencer");
	private JButton back = new JButton("Retourner");

	
	public EnterNamePlayer(GlobalPanel gp){
		
		
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
		
		JPanel jpButton = new JPanel();
		jpButton.setBackground(Color.black);
		jpButton.add(back,BorderLayout.WEST);
		jpButton.add(start,BorderLayout.EAST);
				
		setBackground(Color.black);
		add(title);	
		add(jpTextField);
		add(jpButton);
		
	}
}
