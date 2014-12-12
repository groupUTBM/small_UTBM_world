package view;
import model.Player;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerListPanel extends JPanel {

	private static final long serialVersionUID = -8696350219613029425L;
	private ArrayList<Vue> vues = new ArrayList<Vue>();
	
	public PlayerListPanel(ArrayList<Player> players){
		this.setMinimumSize(new Dimension(200,500));
		this.setBackground(Color.white);
		
		/*Player P1 = new Player("remi");
		Player P2 = new Player("cedric");*/
		
		for(int i=0;i<players.size();i++){
			vues.add(new Vue(players.get(i)));
			add(vues.get(i));
		}
		this.setLayout(new GridLayout(6, 1, 5, 5));
	}

}

