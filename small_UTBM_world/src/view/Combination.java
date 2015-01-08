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
import javax.swing.JScrollPane;
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
import pouvoir.Traveller;
import model.Player;
import controller.ChooseBouttonListener;
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
	private ArrayList<ChooseBouttonListener> cbls = new ArrayList<ChooseBouttonListener>();
	private JScrollPane scroll = new JScrollPane(choosePan);
	private int nbCurrPlayer = 0;
	
	private ArrayList<Department> peuples = new ArrayList<Department>();
	private ArrayList<Pouvoir> pouvoirs = new ArrayList<Pouvoir>();
	private ArrayList<Player> players;
	private ArrayList<CombPanel> combPanels;
	private GlobalPanel gp;
	private GameButtonListener gbl;
	private GridBagConstraints gbc;

	
	public Combination(GlobalPanel globalPan,ArrayList<Player> p){
		gp = globalPan;
		players = p;
		title = new JLabel();
		start = new JButton("Commencer");
		gbl = new GameButtonListener(gp);
		playerNameLstPnl = new PlayerNameLst(players);
	
		
		setLayout(new FlowLayout(FlowLayout.CENTER,600,30));
		title.setText("CHOISISSEZ VOS PEUPLES ET POUVOIRS!");
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
		Traveller traveller = new Traveller();
		pouvoirs.add(geek);
		pouvoirs.add(messy);
		pouvoirs.add(prof);
		pouvoirs.add(sleepyhead);
		pouvoirs.add(sportsman);
		pouvoirs.add(traveller);
		
		playerPan.add(playerNameLstPnl);
		playerPan.setBackground(Color.BLACK);
		
		
		combPanels = new ArrayList<CombPanel>();
		choosePan.setPreferredSize(new Dimension(400,800));
		scroll.setPreferredSize(new Dimension(400,450));
		Random rand = new Random();
		for(int i=0;i<6;i++){
			
			int numPeu = rand.nextInt(5);
			int numPou = rand.nextInt(5); 
			CombPanel cpl = new CombPanel(peuples.get(numPeu),pouvoirs.get(numPou));
			cbls.add(new ChooseBouttonListener(this,cpl));
			cpl.addMouseListener(cbls.get(i));
			combPanels.add(cpl);
			choosePan.setLayout(new GridLayout(6,1));
			choosePan.add(combPanels.get(i));
			
		}
		
		
		
		
		
		setBackground(Color.black);
		add(title);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0;
		gbc.gridx=0;
		gbc.gridheight=2;
		container.add(scroll,gbc);
		gbc.gridheight  = 1;
		gbc.gridx=GridBagConstraints.RELATIVE;
//		container.add(jpRadioButtons,gbc);
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
	
	
	public void choiceMade(CombPanel cp){
		players.get(nbCurrPlayer).setdepartment(cp.getDep());
		players.get(nbCurrPlayer).setPouvoir(cp.getPou());
		combPanels.remove(cp);
		choosePan.remove(cp);
		playerNameLstPnl.getPlayerName(nbCurrPlayer).update(players.get(nbCurrPlayer));
		System.out.println("ok");
		nbCurrPlayer++;
		if(nbCurrPlayer == players.size()){
			if(players.size()==1)
				gp.showGamePanAgain();
			else
				gp.showGamePan();
			
		}
	}
	
	public ArrayList<Player> getListePlayers(){
		return players;
	}
	

	
}

