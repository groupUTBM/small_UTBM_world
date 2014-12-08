package model;

import java.awt.CardLayout;

import view.GamePanel;

public class Game {
	private Map map;
	private GamePanel gamePan;
	private Player currentPlayer;
	
	public Game(GamePanel gp){
		map= new Map(gp.getMapPanel());
		gamePan=gp;
		currentPlayer = new Player("player1");
		currentPlayer.setMec(gamePan.getMec());
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
