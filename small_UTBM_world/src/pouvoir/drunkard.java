package pouvoir;

import model.RoomType;

public class drunkard extends pouvoir {
	drunkard(){
		this.setname("drunkard");
	    this.setdescription("beer,on more beer!");
	    }
	    public int bonusattack(RoomType r){
	    	int n;
	    	if(RoomType.BAR!= null)
	    		n=3;
	    	else n=1;
	    	return n;
	    	}
		public   int bonusdefense(RoomType r)
		{int n;
		if(RoomType.BAR!= null)
			n=2;
		else n=1;
		return n;
		}
		public   int peoplecarry(RoomType r)
		{int n;
		if(RoomType.BAR != null)
			n=3;
		else n=2;
		return n;
	}
		public int gainbonus(RoomType r)    //chaque tour
		{int n=0;
			if(RoomType.BAR!= null)
				n=30;
			else n=20;
			return n;
		}
}
