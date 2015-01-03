package pouvoir;
import model.Room;
import model.RoomType;

public class Traveller extends Pouvoir {
public Traveller()
{
		this.setname("traveller");
	    this.setdescription("we can go anywhere");
}
public boolean canattack(Room from, Room to)
{
		return true;
}
public int bonusattack(RoomType r)
{
    	return 1;
}
public   int bonusdefense(RoomType r)
{
	    return 1;
}
public   int peoplecarry(RoomType r)
{
	    return 2;
}
public int gainbonus(RoomType r)           //si ce pion reste dans ce room,chaque tour il va gagner des bonus
{
	    return 20;
}
}
