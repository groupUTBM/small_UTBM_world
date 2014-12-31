package pouvoir;
import model.RoomType;
public class Geek extends Pouvoir {
Geek(){
	    this.setname("geek");
        this.setdescription("we are crzay in computer");
}
public int bonusattack(RoomType r)                //si le roomtype est COMPUTERROOM,il a un avantage
{
    	int n;
    	if(r==RoomType.COMPUTERROOM )
    		n=3;
    	else n=1;
    	return n;
}
public int bonusdefense(RoomType r)              //si le roomtype est COMPUTERROOM,il a un avantage
{
	    int n;
	    if(r==RoomType.COMPUTERROOM)
		n=2;
	    else n=1;
	    return n;
}
public   int peoplecarry(RoomType r)            //les peuple maximale dans ce room
{
	    int n;
	    if(r==RoomType.COMPUTERROOM)
		n=4;
	    else n=2;
	    return n;
}
public int gainbonus(RoomType r)               //si ce pion reste dans ce room,chaque tour il va gagner des bonus 
{
	    int n=0;
		if(r==RoomType.COMPUTERROOM)
		n=30;
		else n=20;
		return n;
}
}
