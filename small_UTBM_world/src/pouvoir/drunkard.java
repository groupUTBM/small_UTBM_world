package pouvoir;

import model.RoomType;

public class drunkard extends pouvoir {
	drunkard()                                   //constructeur
{
		this.setname("drunkard");
	    this.setdescription("beer,one more beer!");
}
public int bonusattack(RoomType r)               //si le roomtype est BAR,il a un avantage
{
	    int n;
	    if(r==RoomType.BAR)
	    n=3;
	    else n=1;
	    return n;
}
public   int bonusdefense(RoomType r)           //si le roomtype est BAR,il a un avantage
{
	    int n;
		if(r==RoomType.BAR)
			n=2;
		else n=1;
		return n;
}
public   int peoplecarry(RoomType r)            //les peuple maximale dans ce room
{
	    int n;
		if(r==RoomType.BAR )
			n=3;
		else n=2;
		return n;
}
public int gainbonus(RoomType r)                //si ce pion reste dans ce room,chaque tour il va gagner des bonus 
{
		int n=0;
		if(r==RoomType.BAR)
		n=30;
		else n=20;
		return n;
}
}
