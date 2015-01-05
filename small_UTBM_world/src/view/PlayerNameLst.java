package view;



import model.Player;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PlayerNameLst extends JPanel {

	private static final long serialVersionUID = -8696350219613029425L;
	private ArrayList<PlayerName> playerNames;
	
	public PlayerNameLst(ArrayList<Player> players){
		
		playerNames = new ArrayList<PlayerName>();
		
		//cr?ation d'un PlayerPanel pour chaque player
		for(int i=0;i<players.size();i++){
			playerNames.add(new PlayerName(players.get(i)));
			add(playerNames.get(i));
		}
		//GUI
		this.setMinimumSize(new Dimension(200,500));
		this.setBackground(Color.BLACK);
		this.setLayout(new GridLayout(6, 1, 1, 1));
	}
	public void update(ArrayList<Player> players){
		for(int i=0;i<players.size();i++){
			playerNames.get(i).update(players.get(i));
		}
	}
	
	public PlayerName getPlayerName(int i){
		return playerNames.get(i);
	}

}