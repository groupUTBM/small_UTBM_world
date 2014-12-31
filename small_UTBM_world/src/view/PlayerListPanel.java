package view;
import model.Player;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PlayerListPanel extends JPanel {

	private static final long serialVersionUID = -8696350219613029425L;
	private ArrayList<PlayerPanel> playerPnls;
	
	public PlayerListPanel(ArrayList<Player> players){
		
		playerPnls = new ArrayList<PlayerPanel>();
		
		//création d'un PlayerPanel pour chaque player
		for(int i=0;i<players.size();i++){
			playerPnls.add(new PlayerPanel(players.get(i)));
			add(playerPnls.get(i));
		}
		//GUI
		this.setMinimumSize(new Dimension(200,500));
		this.setBackground(Color.white);
		this.setLayout(new GridLayout(6, 1, 5, 5));
	}
	public void update(ArrayList<Player> players){
		for(int i=0;i<players.size();i++){
			playerPnls.get(i).update(players.get(i));
		}
	}

}

