package pouvoir;

import model.RoomType;

public class Professor extends Pouvoir{
Professor()
{
        this.setname("professor");
	    this.setdescription("class begin!");
}
public int bonusattack(RoomType r)
{
	    int n = 0;
	    if(r==RoomType.CLASSROOM)
	    n=3;
	    if(r==RoomType.TPROOM)
	    n=2;
	    else if(r==RoomType.TDROOM)
	    n=2;
		return n;
			
}
public   int bonusdefense(RoomType r)
{		
		int n;
		if(r==RoomType.COMPUTERROOM)
		n=2;
		else n=1;
		return n;
}
public   int peoplecarry(RoomType r)
{
	    int n;
		if(r==RoomType.COMPUTERROOM)
	    n=4;
		else n=2;
		return n;
}
public int gainbonus(RoomType r)             //si ce pion reste dans ce room,chaque tour il va gagner des bonus 
{
	    int n = 0;
    	if(r==RoomType.CLASSROOM)
    	n=30;
    		
    	if(r==RoomType.TPROOM)
    	n=20;
    	else if(r==RoomType.TDROOM)
    	n=20;
		return n;
}
}
