package pouvoir;

import model.RoomType;
import model.Room;

public class Messy extends Pouvoir {
	private int n=2;
	Messy()                                   //constructeur
{
		this.setname("transformer");
	    this.setdescription("I don't like this room,let's change it");
}
public int bonusattack(RoomType r)              
{
	    
	    int n;
	    if(r==RoomType.CLEARING )
		n=4;
	    else n=2;
	    return n;
}
public   int bonusdefense(RoomType r)          
{
	   
	    int n;
	    if(r==RoomType.CLEARING )
		n=4;
	    else n=2;
	    return n;
}
public   int peoplecarry(RoomType r)           
{
	    int n;
		if(r==RoomType.CLEARING )
		n=4;
		else n=2;
		return n;
}
public int gainbonus(RoomType r)      //si ce pion reste dans ce room,chaque tour il va gagner des bonus 
{
	    if(r==RoomType.CLEARING )
		return 40;
	    else
		return 20;
}
public int getn()
{
	    return n;
}
public void setn(int a)
{
	    this.n=a;
}
public void changeroomtype(Room r)      //il peut changer le type de room,mais seulment 2 fois
{
	    if(this.getn()>0)
{
	    r.setRoomType(RoomType.CLEARING);
	    this.setn(n-1);
}
}
}
