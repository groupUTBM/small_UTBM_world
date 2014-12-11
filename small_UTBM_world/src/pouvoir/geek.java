package pouvoir;
import pion.pion;
import model.Map;
import model.RoomType;
import model.Room;
public class geek extends pouvoir {
geek(){
	this.setname("geek");
    this.setdescription("we are crzay in computer");
    }
    public int bonusattack(RoomType r){
    	int n;
    	if(RoomType.COMPUTERROOM != null)
    		n=3;
    	else n=1;
    	return n;
    	}
	public   int bonusdefense(RoomType r)
	{int n;
	if(RoomType.COMPUTERROOM != null)
		n=2;
	else n=1;
	return n;
	}
	public   int peoplecarry(RoomType r)
	{int n;
	if(RoomType.COMPUTERROOM != null)
		n=4;
	else n=2;
	return n;
}
	public int gainbonus(RoomType r)    //chaque tour
	{int n=0;
		if(RoomType.COMPUTERROOM != null)
			n=30;
		else n=20;
		return n;
	}
}
