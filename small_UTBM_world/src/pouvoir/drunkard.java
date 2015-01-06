package pouvoir;

import model.Room;
import model.RoomType;

public class Drunkard extends Pouvoir {
	public Drunkard() // constructeur
	{
		name = "drunkard";
		description = "beer,one more beer!";
	}

	public int bonusattack(Room r) // si le roomtype est BAR,il a un avantage
	{
		int n;
		if (r.getRoomType() == RoomType.BAR)
			n = 3;
		else
			n = 1;
		return n;
	}

	public int bonusdefense(Room r) // si le roomtype est BAR,il a un avantage
	{
		int n;
		if (r.getRoomType() == RoomType.BAR)
			n = 2;
		else
			n = 1;
		return n;
	}

	public int gainbonus(Room r) // si ce pion reste dans ce room,chaque tour il
									// va gagner des bonus
	{
		int n = 0;
		if (r.getRoomType() == RoomType.BAR)
			n = 3;
		else
			n = 2;
		return n;
	}
}
