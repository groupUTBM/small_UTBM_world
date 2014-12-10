package model;

import java.awt.CardLayout;
import java.util.ArrayList;

import view.GamePanel;

public class Game {
	private Map map;
	private GamePanel gamePan;
	private ArrayList<Player> players;
	private Player currentPlayer;
	
	private int nbPlayers,i;
	private int nbTurn=0;
	
	public Game(GamePanel gp, ArrayList<Player> playersArray){
		map= new Map(gp.getMapPanel());
		gamePan=gp;
		players = playersArray;
		nbPlayers = playersArray.size();
//		currentPlayer = new Player("playertest");
		currentPlayer = players.get(0);
		currentPlayer.setMec(gamePan.getMec());
		for(i=0 ; i<nbPlayers ; i++){
			System.out.println(players.get(i).getName());
		}
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
	public void nextTurn(){
		nbTurn++;
	}
}
