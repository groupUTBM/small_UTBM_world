package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.NextButtonListener;


public class ChooseNbPlayer extends JPanel{

	private static final long serialVersionUID = 4889662964603305393L;
	private JLabel title = new JLabel();
	private JButton suivant = new JButton("Suivant");
	private JRadioButton nb2, nb3, nb4, nb5, nb6;
	
	private NextButtonListener nbl;
	
	public ChooseNbPlayer(GlobalPanel gp){
		
		nbl=new NextButtonListener(gp);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,600,70));
		title.setText("CHOISIR LE NOMBRE DE JOUEUR!");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.getText();
		System.out.println(title.getText());
		title.setBackground(Color.black);
		
		//RadioButton
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setBackground(Color.black);
		jpRadioButtons.setLayout(new GridLayout(8,1));
		jpRadioButtons.add(nb2 = new JRadioButton("  2 Joueurs  "));
		jpRadioButtons.add(nb3 = new JRadioButton("  3 Joueurs  "));
		jpRadioButtons.add(nb4 = new JRadioButton("  4 Joueurs  "));
		jpRadioButtons.add(nb5 = new JRadioButton("  5 Joueurs  "));
		jpRadioButtons.add(nb6 = new JRadioButton("  6 Joueurs  "));
		//add(jpRadioButtons, BorderLayout.CENTER);
		
		ButtonGroup groupe = new ButtonGroup();
		groupe.add(nb2);
		groupe.add(nb3);
		groupe.add(nb4);
		groupe.add(nb5);
		groupe.add(nb6);
		
		nb2.setBackground(Color.black);
		nb3.setBackground(Color.black);
		nb4.setBackground(Color.black);
		nb5.setBackground(Color.black);
		nb6.setBackground(Color.black);
		
		nb2.setForeground(Color.white);
		nb3.setForeground(Color.white);
		nb4.setForeground(Color.white);
		nb5.setForeground(Color.white);
		nb6.setForeground(Color.white);
		
		nb2.setSelected(true);
		
		suivant.setPreferredSize(new Dimension(150,40));
		
		setBackground(Color.black);
		add(title);
		add(jpRadioButtons);
		add(suivant);
		setVisible(true);
	
		suivant.addMouseListener(nbl);
		
		   
	}

}

