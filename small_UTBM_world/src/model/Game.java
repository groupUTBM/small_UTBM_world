package model;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;

import view.GamePanel;
import view.GlobalPanel;

public class Game {
	private Map map;
	private GamePanel gamePan;
	private ArrayList<Player> players;
	private Player currentPlayer;
	private Player nullPlayer;
	
	private int nbPlayers,nbCurrPlayer,i;
	private int nbTurn;
	private ArrayList<Color> colors;
	private boolean conquest;
	
	public Game(GamePanel gp, ArrayList<Player> playersArray){
		map= new Map(gp.getMapPanel());
		gamePan=gp;
		players = playersArray;
		nbPlayers = playersArray.size();
		currentPlayer = players.get(0);
		nbCurrPlayer = 0;
		nbTurn=0;
		conquest=true;
		
		colors = new ArrayList<Color>();
		colors.add(new Color(255,255,0));
		colors.add(new Color(255,255,255));
		colors.add(new Color(255,0,0));
		colors.add(new Color(0,255,0));
		colors.add(new Color(0,0,255));
		colors.add(new Color(0,255,255));
		
		
		for(i=0 ; i<nbPlayers ; i++){
			System.out.println(players.get(i).getName());
			players.get(i).setColor(colors.get(i));
		}
		currentPlayer.setMec(gamePan.getMec());
		nullPlayer = new Player("neutral");
		nullPlayer.setColor(new Color(0,0,0));
		
	}
	
	
	public void nextTurn(){
		currentPlayer.setVictoryPt(currentPlayer.getVictoryPt()+currentPlayer.computePoints());
		nbTurn++;
		if(nbTurn==4){
			Player winner = players.get(0);
			GlobalPanel.getInstance().showVictoryPan(currentPlayer);
			for(int i=1;i<nbPlayers;i++){
				if(winner.getVictoryPt()< players.get(i).getVictoryPt()){
					winner= players.get(i);
				}
				else if(winner.getVictoryPt()==players.get(i).getVictoryPt()){
					if(winner.getNbRooms()<players.get(i).getNbRooms()){
						winner=players.get(i);
					}
						
					else if(winner.getNbRooms()==players.get(i).getNbRooms()){
						if(winner.getNbDeclinedRooms()<=players.get(i).getNbDeclinedRooms()){
							winner=players.get(i);
						}
					}
				}
			}
			GlobalPanel.getInstance().showVictoryPan(winner);
		}
		else
		{
			if (nbCurrPlayer < nbPlayers - 1) {
				currentPlayer = players.get(nbCurrPlayer + 1);
				nbCurrPlayer++;
			} else {
				currentPlayer = players.get(0);
				nbCurrPlayer = 0;
			}
			conquest=true;
			currentPlayer.setMec(gamePan.getMec());
			gamePan.getNextTurnButton().showRedeployment();
			gamePan.getPlayerListPanel().update(players);
			System.out.println("new turn : "+currentPlayer.getName());
		}
		
		
		
	}
	public void startRedeployment (){
		conquest=false;
		gamePan.getNextTurnButton().showNextTurn();
	}
	public boolean conquestPhase(){
		return conquest;
	}
	public Player getCurrentPlayer(){
		return currentPlayer;
	}
	public Player getNullPlayer(){
		return nullPlayer;
	}
	public Map getMap(){
		return map;
	}
	public GamePanel getGamePanel(){
		return gamePan;
	}
	
}
