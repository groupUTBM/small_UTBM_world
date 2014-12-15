package model;

public class Pawn {
	private Room actualRoom;
	private Player owner;
	public Pawn(Room r, Player ownr){
		actualRoom=r;
		owner=ownr;
	}
	public Player getOwner(){
		return owner;
	}
}
