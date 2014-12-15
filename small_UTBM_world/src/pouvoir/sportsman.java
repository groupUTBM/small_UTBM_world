package pouvoir;

import model.RoomType;

public class sportsman extends pouvoir {
sportsman()
{
	    this.setname("sportsman");
        this.setdescription("Faster,Higher,Stronger!");
}
public int bonusattack(RoomType r)
{
    	int n;
    	if(r==RoomType.GYM)
        n=3;
    	else n=1;
    	return n;
}
public int bonusdefense(RoomType r)
{
	    int n;
	    if(r==RoomType.GYM)
		n=2;
	    else n=1;
	    return n;
}
public   int peoplecarry(RoomType r)
{
	    int n;
	    if(r==RoomType.GYM)
		n=3;
	    else n=2;
	    return n;
}
public int gainbonus(RoomType r)           //si ce pion reste dans ce room,chaque tour il va gagner des bonus
{
	    int n=0;
		if(r==RoomType.GYM)
	    n=30;
		else n=20;
		return n;
}
}
