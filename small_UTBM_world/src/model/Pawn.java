package model;

import pouvoir.Pouvoir;
import department.Department;

public class Pawn {
	private Room actualRoom;
	private Player owner;
	private Department dep;
	private Pouvoir pouv;
	public Pawn(Room r, Player ownr){
		actualRoom=r;
		owner=ownr;
		dep=owner.getDepartment();
		pouv=owner.getPouvoir();
	}
	public Player getOwner(){
		return owner;
	}
	public Department getDepartement(){
		return dep;
	}
	public Pouvoir getPouvoir(){
		return pouv;
	}
}
