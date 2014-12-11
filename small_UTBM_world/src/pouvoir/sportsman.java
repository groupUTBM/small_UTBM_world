package pouvoir;

import model.RoomType;

public class sportsman extends pouvoir {
sportsman(){
	this.setname("sportsman");
    this.setdescription("Faster,Higher,Stronger!");
    }
    public int bonusattack(RoomType r){
    	int n;
    	if(RoomType.GYM != null)
    		n=3;
    	else n=1;
    	return n;
    	}
	public   int bonusdefense(RoomType r)
	{int n;
	if(RoomType.GYM != null)
		n=2;
	else n=1;
	return n;
	}
	public   int peoplecarry(RoomType r)
	{int n;
	if(RoomType.GYM != null)
		n=3;
	else n=2;
	return n;
}
	public int gainbonus(RoomType r)    //chaque tour
	{int n=0;
		if(RoomType.GYM!= null)
			n=30;
		else n=20;
		return n;
	}
}
