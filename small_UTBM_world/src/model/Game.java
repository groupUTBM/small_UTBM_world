package model;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;

import view.GamePanel;

public class Game {
	private Map map;
	private GamePanel gamePan;
	private ArrayList<Player> players;
	private Player currentPlayer;
	
	private int nbPlayers,nbCurrPlayer,i;
	private int nbTurn=0;
	private ArrayList<Color> colors = new ArrayList<Color>();
	
	public Game(GamePanel gp, ArrayList<Player> playersArray){
		map= new Map(gp.getMapPanel());
		gamePan=gp;
		players = playersArray;
		nbPlayers = playersArray.size();
//		currentPlayer = new Player("playertest");
		currentPlayer = players.get(0);
		nbCurrPlayer = 0;
		
		colors.add(new Color(255,255,0));
		colors.add(new Color(255,255,255));
		colors.add(new Color(255,0,0));
		colors.add(new Color(0,255,0));
		colors.add(new Color(0,0,255));
		colors.add(new Color(0,0,0));
		
		
		
		for(i=0 ; i<nbPlayers ; i++){
			System.out.println(players.get(i).getName());
			players.get(i).setColor(colors.get(i));
		}
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
	public void nextTurn(){
		if(nbCurrPlayer < nbPlayers-1){
			currentPlayer=players.get(nbCurrPlayer+1);
			nbCurrPlayer++;
		}
		else
		{
			currentPlayer=players.get(0);
			nbCurrPlayer=0;
		}
		currentPlayer.setMec(gamePan.getMec());
		nbTurn++;
		System.out.println(currentPlayer.getName());
	}
}
