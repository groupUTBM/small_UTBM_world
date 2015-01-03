package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
//import javax.swing.SwingConstants;
import javax.swing.JTextField;

import pouvoir.Drunkard;
import pouvoir.Geek;
import pouvoir.Messy;
import pouvoir.Pouvoir;
import pouvoir.Professor;
import pouvoir.Sleepyhead;
import pouvoir.Sportsman;
import pouvoir.Transformer;
import pouvoir.Traveller;
import model.Player;
import controller.CombinationButtonListener;
import controller.GameButtonListener;
import controller.StartButtonListener;
import department.Department;
import department.Edim;
import department.Ee;
import department.Imsi;
import department.Info;
import department.TC;
import department.Utseus;


public class Combination extends JPanel{
	
	private static final long serialVersionUID = -8696350219613029425L;
	private JLabel title = new JLabel();
	private JLabel c1;
	private JButton start = new JButton();
	private PlayerListPanel playerLstPnl;
	private JRadioButton n1, n2, n3, n4, n5, n6;
	private ButtonGroup groupe = new ButtonGroup();
	private JPanel playerPan = new JPanel();
	private ArrayList<Department> peuples = new ArrayList<Department>();
	private ArrayList<Pouvoir> pouvoirs = new ArrayList<Pouvoir>();
	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<CombPanel> combPanels;
	private GameButtonListener gbl;
	
	public Combination(GlobalPanel gp){
		
	
		title = new JLabel();
		start = new JButton("Commencer");
		gbl = new GameButtonListener(gp);
		
	
		
		setLayout(new FlowLayout(FlowLayout.CENTER,600,70));
		title.setText("CHOISIR VOTRES PEUPLES ET POUVOIRS!");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.getText();
		System.out.println(title.getText());
		title.setBackground(Color.black);
		
		Edim edim = new Edim();
		Ee ee =new Ee();
		Imsi imsi = new Imsi();
		Info info = new Info();
		TC tc = new TC();
		Utseus utseus = new Utseus();
		peuples.add(edim);
		peuples.add(ee);
		peuples.add(imsi);
		peuples.add(info);
		peuples.add(tc);
		peuples.add(utseus);
		
		Drunkard drunkard = new Drunkard();
		Geek geek = new Geek();
		Messy messy = new Messy();
		Professor prof = new Professor();
		Sleepyhead sleepyhead = new Sleepyhead();
		Sportsman sportsman = new Sportsman();
		Transformer transformer = new Transformer();
		Traveller traveller = new Traveller();
		pouvoirs.add(geek);
		pouvoirs.add(messy);
		pouvoirs.add(prof);
		pouvoirs.add(sleepyhead);
		pouvoirs.add(sportsman);
		pouvoirs.add(transformer);
		pouvoirs.add(traveller);
		
		
		
//		for(int i=0;i<6;i++){
//			Random rand = new Random();
//			int numPou = rand.nextInt(6); 
//			int numPeu = rand.nextInt(7);
//		
//			System.out.println(peuples.get(numPeu).get_description());
//			System.out.println(pouvoirs.get(numPou).getdescription());
//		}
		combPanels = new ArrayList<CombPanel>();
		for(int i=0;i<8;i++){
			Random rand = new Random();
			int numPou = rand.nextInt(6); 
			int numPeu = rand.nextInt(7);
			combPanels.add(new CombPanel(peuples.get(numPeu),pouvoirs.get(numPou)));
			add(combPanels.get(i));
		}
		
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setBackground(Color.black);
		jpRadioButtons.setLayout(new GridLayout(3,2));
		jpRadioButtons.add(n1 = new JRadioButton("  combination 1  "));
		jpRadioButtons.add(n2 = new JRadioButton("  combination 2  "));
		jpRadioButtons.add(n3 = new JRadioButton("  combination 3  "));
		jpRadioButtons.add(n4 = new JRadioButton("  combination 4  "));
		jpRadioButtons.add(n5 = new JRadioButton("  combination 5  "));
		jpRadioButtons.add(n6 = new JRadioButton("  combination 6  "));
		
		groupe.add(n1);
		groupe.add(n2);
		groupe.add(n3);
		groupe.add(n4);
		groupe.add(n5);
		groupe.add(n6);
		
		n1.setBackground(Color.black);
		n2.setBackground(Color.black);
		n3.setBackground(Color.black);
		n4.setBackground(Color.black);
		n5.setBackground(Color.black);
		n6.setBackground(Color.black);
		
		n1.setForeground(Color.white);
		n2.setForeground(Color.white);
		n3.setForeground(Color.white);
		n4.setForeground(Color.white);
		n5.setForeground(Color.white);
		n6.setForeground(Color.white);
		
		n1.setSelected(true);
		
		
		
		

		

		setBackground(Color.black);
		add(title);
		add(jpRadioButtons);
		add(start);
		
	   
		setVisible(true);

		
		start.addMouseListener(gbl);
		start.setVisible(true);
	}
	

	
}

