package model;

import java.util.ArrayList;

import view.RoomPanel;

public class Room {
	private RoomPanel rp;
	private RoomType rt;
	private int posX, posY;
	private int nbUnits = 0;
	private ArrayList<Pawn> pawns;
	private int i;
	private Player owner;
	private boolean isBorder;
	
	public Room(RoomPanel rp){
		posX = rp.getPosX();
		posY = rp.getPosY();
		if(posX==0 || posX == 9 || posY == 0 || posY == 9)
			isBorder=true;
		this.rp = rp;
		pawns = new ArrayList<Pawn>();
		
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
		if(pawns.isEmpty()){
			owner= p.getOwner();
			System.out.println(owner.getName());
		}
		pawns.add(p);
		nbUnits++;
		rp.update(this);
	}
	public Pawn pullTopPawn(){
		if(nbUnits>0){
			Pawn p = pawns.get(nbUnits-1);
			pawns.remove(nbUnits-1);
			nbUnits--;
			rp.update(this);
			return p;
		}
		else
			return null;
		
	}
	public RoomPanel getRoomPanel(){
		return rp;
	}
	public RoomType getRoomType(){
		return rt;
	}
	public Player getOwner(){
		return owner;
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	public boolean isAdjacent(Room r){
		if(Math.abs(r.getPosX()-this.getPosY()) <= 1
			&& Math.abs(r.getPosY()-this.getPosY()) <= 1){
			return true;
		}
		else
			return false;
	}
	public boolean isBorder(){
		return isBorder;
	}
	public void setRoomType(RoomType r){
		rt = r;
	}
}
