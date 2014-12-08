package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class ChooseNbPlayer extends JPanel{
	private JFrame fenetre = new JFrame();
	private JLabel title = new JLabel();
	private JButton suivant = new JButton("Suivant");
	private JRadioButton nb2, nb3, nb4, nb5, nb6, nb7, nb8, nb9;
	
	
	public ChooseNbPlayer(){
		fenetre.setVisible(true);
		fenetre.setTitle("Choisir le nombre de joueur");
		fenetre.setSize(600, 600);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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
		jpRadioButtons.add(nb7 = new JRadioButton("  7 Joueurs  "));
		jpRadioButtons.add(nb8 = new JRadioButton("  8 Joueurs  "));
		jpRadioButtons.add(nb9 = new JRadioButton("  9 Joueurs  "));
		//add(jpRadioButtons, BorderLayout.CENTER);
		
		ButtonGroup groupe = new ButtonGroup();
		groupe.add(nb2);
		groupe.add(nb3);
		groupe.add(nb4);
		groupe.add(nb5);
		groupe.add(nb6);
		groupe.add(nb7);
		groupe.add(nb8);
		groupe.add(nb9);
		
		nb2.setForeground(Color.white);
		nb3.setForeground(Color.white);
		nb4.setForeground(Color.white);
		nb5.setForeground(Color.white);
		nb6.setForeground(Color.white);
		nb7.setForeground(Color.white);
		nb8.setForeground(Color.white);
		nb9.setForeground(Color.white);
		
		
		suivant.setPreferredSize(new Dimension(150,40));
		
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER,600,70));
		setBackground(Color.black);
		add(title);
		add(jpRadioButtons);
		add(suivant);
		setVisible(true);
		
		fenetre.setContentPane(pan);
		fenetre.setResizable(true);
		   
	}


	private void add(JPanel jpRadioButtons, String center) {
		// TODO Auto-generated method stub
		
	}
}

