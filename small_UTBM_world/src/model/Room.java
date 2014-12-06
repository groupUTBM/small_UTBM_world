package model;

import View.RoomPanel;

public class Room {
	private RoomPanel rp;
	private int nbUnits = 2;
	
	public Room(RoomPanel rp){
		this.rp = rp;
		rp.update(this);
	}
	public int getNbUnits() {
		return nbUnits;
	}
	public void setNbUnits(int nbUnits) {
		this.nbUnits = nbUnits;
	}
}
