package controller;

import java.awt.Graphics;

import view.GamePanel;
import model.Game;
import model.Map;
import model.Room;

public class GameController {
	private Game game;
	public GameController(Game game){
		this.game=game;
	}
	
	public void clickOnRoom(Room r){
		if(!game.conquestPhase())//si le joueur est dans la phase de redéploiement
		{
			if(game.getCurrentPlayer().isOwner(r)){
				if(r.getNbUnits()>=1){
					game.getCurrentPlayer().takePawn(r);
					if(r.getNbUnits() == 0){
						game.getCurrentPlayer().abandonRoom(r);
					}
				}
			}
		}
		
	}
	public void rightClickOnRoom(Room r){
		if(game.conquestPhase()){
			game.getCurrentPlayer().conquerRoom(r);
		}
		else
		{
			if(game.getCurrentPlayer().isOwner(r)){
			game.getCurrentPlayer().putPawn(r);
			}
		}
		
	}
	public void nextTurnBtnClick(){
		if(game.conquestPhase()){
			game.startRedeployment();
		}
		else{
			game.nextTurn();
		}
	}
	public Game getGame(){
		return game;
	}
}
