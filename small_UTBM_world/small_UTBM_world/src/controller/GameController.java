package controller;

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
		if(game.getCurrentPlayer().isOwner(r)){
			if(r.getNbUnits()>=1){
				game.getCurrentPlayer().takePawn(r);
				if(r.getNbUnits() == 0){
					game.getCurrentPlayer().abandonRoom(r);
				}
			}
		}
	}
	public void rightClickOnRoom(Room r){
		if(game.getCurrentPlayer().isOwner(r)){
			game.getCurrentPlayer().putPawn(r);
		}
	}
	public Game getGame(){
		return game;
	}
}
