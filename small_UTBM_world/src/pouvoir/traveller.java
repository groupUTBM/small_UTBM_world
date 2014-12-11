package pouvoir;

import model.Room;
import model.RoomType;

public class traveller extends pouvoir {
	traveller(){
		this.setname("traveller");
	    this.setdescription("we can go anywhere");
	    }
	public boolean canattack(Room from, Room to){
		return true;
	}
	public int bonusattack(RoomType r){
    	return 1;
    	}
	public   int bonusdefense(RoomType r)
	{
	return 1;
	}
	public   int peoplecarry(RoomType r)
	{
	return 2;
	}
		public int gainbonus(RoomType r)    //chaque tour
		{return 20;
		}
}
