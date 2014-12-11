package pouvoir;

import model.RoomType;

public class professor extends pouvoir{
	professor(){
		this.setname("professor");
	    this.setdescription("class begin!");
	    }
	    public int bonusattack(RoomType r){
	    int n = 0;
	    	if(RoomType.CLASSROOM != null)
	    		n=3;
	    		
	    	if(RoomType.TPROOM != null)
	    		n=2;
	    	else if(RoomType.TDROOM!=null)
	    		n=2;
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
		{int n = 0;
    	if(RoomType.CLASSROOM != null)
    		n=30;
    		
    	if(RoomType.TPROOM != null)
    		n=20;
    	else if(RoomType.TDROOM!=null)
    		n=20;
		return n;
}
}
