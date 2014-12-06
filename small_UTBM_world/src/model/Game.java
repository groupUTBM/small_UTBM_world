package model;

import View.GamePanel;

public class Game {
	private Map map;
	private GamePanel gamePan;
	
	public Game(GamePanel gp){
		map= new Map(gp.getMapPanel());
		gamePan=gp;
	}
}
