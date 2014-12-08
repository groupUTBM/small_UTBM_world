package model;

import java.util.ArrayList;

import view.RoomPanel;

public class Room {
	private RoomPanel rp;
	private int nbUnits = 2;
	private ArrayList<Pawn> pawns;
	private int i;
	
	public Room(RoomPanel rp){
		this.rp = rp;
		pawns = new ArrayList<Pawn>();
		for(i=0;i<nbUnits;i++){
			pawns.add(new Pawn(this));
		}
		rp.update(this);
	}
	public int getNbUnits() {
		return nbUnits;
	}
	public void setNbUnits(int nbUnits) {
		this.nbUnits = nbUnits;
		rp.update(this);
	}
	
	public Pawn getTopPawn(){
		return pawns.get(nbUnits-1);
	}
	public void addPawn(Pawn p){
		pawns.add(p);
		nbUnits++;
		rp.update(this);
	}
	public Pawn pullTopPawn(){
		Pawn p = pawns.get(nbUnits-1);
		pawns.remove(nbUnits-1);
		nbUnits--;
		rp.update(this);
		return p;
	}
	public RoomPanel getRoomPanel(){
		return rp;
	}
}
