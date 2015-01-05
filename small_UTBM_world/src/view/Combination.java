package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
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
	private JPanel container = new JPanel();
	private JPanel choosePan = new JPanel();
	private JPanel playerPan = new JPanel();
	private PlayerNameLst playerNameLstPnl;
	private ArrayList<PlayerName> playerNames = new ArrayList<PlayerName>();
	private JRadioButton n1, n2, n3, n4, n5, n6, n7, n8;
	private ButtonGroup groupe = new ButtonGroup();
	
	private ArrayList<Department> peuples = new ArrayList<Department>();
	private ArrayList<Pouvoir> pouvoirs = new ArrayList<Pouvoir>();
	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<CombPanel> combPanels;
	private GameButtonListener gbl;
	private GridBagConstraints gbc;

	
	public Combination(GlobalPanel gp,ArrayList<Player> players){
		
	
		title = new JLabel();
		start = new JButton("Commencer");
		gbl = new GameButtonListener(gp);
		playerNameLstPnl = new PlayerNameLst(players);
	
		
		setLayout(new FlowLayout(FlowLayout.CENTER,600,30));
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
		
		playerPan.add(playerNameLstPnl);
		playerPan.setBackground(Color.BLACK);
		
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setBackground(Color.black);
		jpRadioButtons.setLayout(new GridLayout(4,2));
		
		combPanels = new ArrayList<CombPanel>();
		for(int i=0;i<8;i++){
			Random rand = new Random();
			int numPou = rand.nextInt(5); 
			int numPeu = rand.nextInt(6);
			combPanels.add(new CombPanel(peuples.get(numPeu),pouvoirs.get(numPou)));
			choosePan.setLayout(new GridLayout(4,2));
			choosePan.add(combPanels.get(i));
			
		}
		
		jpRadioButtons.add(n1 = new JRadioButton("CHOIX 1"));
		jpRadioButtons.add(n2 = new JRadioButton("CHOIX 2"));
		jpRadioButtons.add(n3 = new JRadioButton("CHOIX 3"));
		jpRadioButtons.add(n4 = new JRadioButton("CHOIX 4"));
		jpRadioButtons.add(n5 = new JRadioButton("CHOIX 5"));
		jpRadioButtons.add(n6 = new JRadioButton("CHOIX 6"));
		jpRadioButtons.add(n7 = new JRadioButton("CHOIX 7"));
		jpRadioButtons.add(n8 = new JRadioButton("CHOIX 8"));
		
		groupe.add(n1);
		groupe.add(n2);
		groupe.add(n3);
		groupe.add(n4);
		groupe.add(n5);
		groupe.add(n6);
		groupe.add(n7);
		groupe.add(n8);
		
		n1.setBackground(Color.black);
		n2.setBackground(Color.black);
		n3.setBackground(Color.black);
		n4.setBackground(Color.black);
		n5.setBackground(Color.black);
		n6.setBackground(Color.black);
		n7.setBackground(Color.black);
		n8.setBackground(Color.black);
		
		n1.setForeground(Color.white);
		n2.setForeground(Color.white);
		n3.setForeground(Color.white);
		n4.setForeground(Color.white);
		n5.setForeground(Color.white);
		n6.setForeground(Color.white);
		n7.setForeground(Color.white);
		n8.setForeground(Color.white);
		
		n1.setSelected(true);
		
		setBackground(Color.black);
		add(title);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0;
		gbc.gridx=0;
		gbc.gridheight=2;
		container.add(choosePan,gbc);
		gbc.gridheight  = 1;
		gbc.gridx=GridBagConstraints.RELATIVE;
		container.add(jpRadioButtons,gbc);
		gbc.gridx = 1;
		gbc.gridy = GridBagConstraints.RELATIVE;
		container.add(playerPan,gbc);
		
		container.setBackground(Color.black);
		
		
		
//		add(playerPan);
		add(container);
//		add(jpRadioButtons);
		add(start);
		setVisible(true);
		
		start.addMouseListener(gbl);
		start.setVisible(true);
	}
	
	public int getNumCombination(){
		if(n1.isSelected() )
			return 1;
		else if ( n2.isSelected() )
			return 2;
		else if ( n3.isSelected() )
			return 3;
		else if ( n4.isSelected() )
			return 4;
		else if ( n5.isSelected() )
			return 5;
		else if ( n6.isSelected() )
			return 6;
		else if ( n7.isSelected() )
			return 7;
		else if ( n8.isSelected() )
			return 8;
		
		return 1;
	}
	
	

	

	
}

