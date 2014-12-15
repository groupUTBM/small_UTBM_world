package pouvoir;
import model.RoomType;

public class sleepyhead extends pouvoir {
sleepyhead()
{
		this.setname("sleephead");
	    this.setdescription("I just want to sleep");
}
public int bonusattack(RoomType r)
{
	    int n;
	    if(r==RoomType.DORMITORY)
	    n=3;
	    else n=1;
	    return n;
}
public int bonusdefense(RoomType r)
{
	    int n;
		if(r==RoomType.DORMITORY)
	    n=2;
		else n=1;
		return n;
}
public   int peoplecarry(RoomType r)
{
	    int n;
		if(r==RoomType.DORMITORY)
			n=4;
		else n=2;
		return n;
}
public int gainbonus(RoomType r)             //si ce pion reste dans ce room,chaque tour il va gagner des bonus 
{
	    int n=0;
	    if(r==RoomType.DORMITORY)
	    n=30;
		else n=20;
		return n;
}
}
