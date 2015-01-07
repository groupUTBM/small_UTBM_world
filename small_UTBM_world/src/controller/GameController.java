package controller;

import java.awt.Graphics;

import divers.ConquestFailed;
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
			if(game.getCurrentPlayer() == r.getOwner()){
				if(r.getNbUnits()>=1){
					game.getCurrentPlayer().takePawn(r);
				}
			}
		}
		
	}
	public void rightClickOnRoom(Room r){
		if(game.conquestPhase()){
			try{
				game.getCurrentPlayer().conquerRoom(r);
			} catch(ConquestFailed e){
				game.startRedeployment();
				System.out.println("le joueur "+e.getPlayer().getName()
						+ " a raté son lancer de dés");
			}
			
		}
		else
		{
			if(game.getCurrentPlayer() == r.getOwner()){
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
	public void middleButtonClick(){
		game.getCurrentPlayer().declin();
		game.nextTurn();
	}
	public Game getGame(){
		return game;
	}
}
