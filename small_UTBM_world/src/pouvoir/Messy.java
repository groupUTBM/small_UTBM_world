package pouvoir;

import model.RoomType;
import model.Room;

public class Messy extends Pouvoir {
	private int n = 0;

	public Messy() // constructeur
	{
		name = "messy";
		description = "Turn every room they conquer from another player into a mess";
	}

	public int bonusattack(Room r) {
		if (r.getRoomType() != RoomType.MESS && n < 2) {
			r.setRoomType(RoomType.MESS);
			n++;
		}
		return 2;
	}

	public int bonusdefense(Room r) {

		int n;
		if (r.getRoomType() == RoomType.MESS)
			n = 3;
		else
			n = 2;
		return n;
	}

	public int gainbonus(Room r) // si ce pion reste dans ce room,chaque tour il
									// va gagner des bonus
	{
		if (r.getRoomType() == RoomType.MESS)
			return 4;
		else
			return 2;
	}

}
