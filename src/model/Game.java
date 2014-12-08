package model;

import java.awt.CardLayout;
import java.util.ArrayList;

import view.GamePanel;

public class Game {
	private Map map;
	private GamePanel gamePan;
	private ArrayList<Player> players;
	private Player currentPlayer;
	
	public Game(GamePanel gp, ArrayList<Player> players){
		map= new Map(gp.getMapPanel());
		gamePan=gp;
		currentPlayer = new Player("player1");
		currentPlayer.setMec(gamePan.getMec());
		this.players = players;
	}
	
	public Player getCurrentPlayer(){
		return currentPlayer;
	}
	public Map getMap(){
		return map;
	}
	public GamePanel getGamePanel(){
		return gamePan;
	}
}
