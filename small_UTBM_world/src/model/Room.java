package model;

import java.util.ArrayList;

import view.RoomPanel;

public class Room {
	private RoomPanel rp;
	private RoomType rt;
	private int nbUnits = 2;
	private ArrayList<Pawn> pawns;
	private int i;
	
	public Room(RoomPanel rp){
		this.rp = rp;
		pawns = new ArrayList<Pawn>();
		for(i=0;i<nbUnits;i++){
			pawns.add(new Pawn(this));
		}
		
		i=(int)(Math.random()*10);
		switch(i){
		case 0:
			rt = RoomType.TPROOM;
			break;
		case 1:
			rt = RoomType.TDROOM;
			break;
		case 2:
			rt = RoomType.BAR;
			break;
		case 3:
			rt = RoomType.CHINESECLASS;
			break;
		case 4:
			rt = RoomType.CLASSROOM;
			break;
		case 5:
			rt = RoomType.COMPUTERROOM;
			break;
		case 6:
			rt = RoomType.DORMITORY;
			break;
		case 7:
			rt = RoomType.GYM;
			break;
		case 8:
			rt = RoomType.MECANICCLASS;
			break;
		case 9: 
			rt = RoomType.GRASS;
			break;
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
	public RoomType getRoomType(){
		return rt;
	}
}
