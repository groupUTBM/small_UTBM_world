package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Player;
import controller.BackButtonListener;
import controller.CombinationButtonListener;
/*Panel permettant ? l'utilisateur d'ajouter des joueurs tout en 
indiquant leur nom.*/
public class EnterNamePlayer extends JPanel {

	private static final long serialVersionUID = 7033862737017458070L;
	private JLabel title;
	private JLabel condition;
	private JLabel affiche;
	private ArrayList<Player> players;
	private int nbPlayerMax;
	private int nbPlayer,j;
	private String listPlayersName;
	
	private JTextField enter;
	private JButton valid;
	private JButton start;
	private JButton back;
	private CombinationButtonListener cbl;
	private BackButtonListener bbl;

	//constructeur
	public EnterNamePlayer(GlobalPanel gp){
		instantiations(gp);
		configurationGUI();
	}
	// fonction permettant de r?initialiser quand on clique sur "Retour"
	public void init(){
		listPlayersName = "<html>";
		affiche.setText("");
		enter.setText("");
		players = new ArrayList<Player>();
		nbPlayer=0;
	}
	
	/*public int getNbPlayer(){
		return 2;
	}*/
	public void showErrMess(){
		affiche.setText(listPlayersName+"<br>Vous devez entrer au moins 2 joueur.</html> ");
		System.out.println("error");
	}
	//getters
	public ArrayList<Player> getListPlayers(){
		return players;
	}
	public int getCurrNbPlayer(){
		return nbPlayer;
	}
	//Fonctions ? usage interne
	private void instantiations(GlobalPanel gp){
		title = new JLabel();
		condition = new JLabel();
		affiche = new JLabel();
		players = new ArrayList<Player>();
		enter  = new JTextField(20);
		valid = new JButton("+");
		start = new JButton("Suivant");
		back = new JButton("Retour");
		cbl = new CombinationButtonListener(gp);
		bbl = new BackButtonListener(gp);
		nbPlayerMax = 6;
	}
	private void configurationGUI(){
		setLayout(new FlowLayout(FlowLayout.CENTER,600,60));
		
		title.setText("ADD YOUR PLAYERS");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.getText();
		System.out.println(title.getText());
		title.setBackground(Color.black);
		
		condition.setText("The number of player should between 2 and 6");
		condition.setForeground(Color.white);
		condition.setFont(new java.awt.Font("Dialog", 1, 15));

		
		JPanel jpTextField = new JPanel();
		jpTextField.setBackground(Color.black);
		jpTextField.setLayout(new BorderLayout(5,0));
		jpTextField.add(enter,BorderLayout.CENTER);
		jpTextField.add(valid,BorderLayout.EAST);
		enter.setHorizontalAlignment(JTextField.RIGHT);
		
		
		
		affiche.setPreferredSize(new Dimension(150,150));
		affiche.setForeground(Color.WHITE);
		nbPlayer=0; //nb de joueur
		listPlayersName = "<html>";
		
		valid.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(nbPlayer < nbPlayerMax){
					if(enter.getText().isEmpty()){
						
					}
					else if(players.isEmpty()){
						players.add(new Player(enter.getText()));
						listPlayersName+="Joueur"+(nbPlayer+1)+":"+enter.getText()+"<br>";
						affiche.setText(listPlayersName+"</html>");
						enter.setText("");
						nbPlayer++;
					}
					else{
						
						j = 0;
						while(j<nbPlayer && !enter.getText().equals(players.get(j).getName()) ){
								j++;
						}
						System.out.println(j+" "+nbPlayer);
						if (j==nbPlayer){
							players.add(new Player(enter.getText()));
							listPlayersName+="Joueur"+(nbPlayer+1)+":"+enter.getText()+"<br>";
							affiche.setText(listPlayersName+"</html>");
							enter.setText("");
							nbPlayer++;
						}
						else {
							enter.setText("");
							affiche.setText(listPlayersName+"<br>Le nom existe, veuillez changer un autre</html> ");
						}
					}
					
				}
				
				else 
					affiche.setText(listPlayersName+"<br>Nombre maximum de joueur atteint</html> ");
				
				//g++;
			}
			
		});
		
		
		JPanel jpButton = new JPanel();
		jpButton.setBackground(Color.black);
		jpButton.add(back,BorderLayout.WEST);
		jpButton.add(start,BorderLayout.EAST);
				
		setBackground(Color.black);
		add(title);	
		add(condition);
		add(jpTextField);
		add(affiche);
		add(jpButton);
		
		start.addMouseListener(cbl);
		back.addMouseListener(bbl);
	}
}
