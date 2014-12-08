package model;

public class Pawn {
	private Room actualRoom;
	public Pawn(Room r){
		actualRoom=r;
	}
	public void move(Room r){
		r.addPawn(this);
		actualRoom = r;
	}
}
