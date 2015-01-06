package pouvoir;

import model.Room;
import model.RoomType;

public class Geek extends Pouvoir {
	public Geek() {
		name="geek";
		description="we are crzay in computer";
	}

	public int bonusattack(Room r) // si le roomtype est COMPUTERROOM,il a un
									// avantage
	{
		int n;
		if (r.getRoomType() == RoomType.COMPUTERROOM)
			n = 2;
		else
			n = 1;
		return n;
	}

	public int bonusdefense(Room r) // si le roomtype est COMPUTERROOM,il a un
									// avantage
	{
		int n;
		if (r.getRoomType() == RoomType.COMPUTERROOM)
			n = 2;
		else
			n = 1;
		return n;
	}

	public int gainbonus(Room r) // si ce pion reste dans ce room,chaque tour il
									// va gagner des bonus
	{
		int n = 0;
		if (r.getRoomType() == RoomType.COMPUTERROOM)
			n = 3;
		else
			n = 2;
		return n;
	}
}
