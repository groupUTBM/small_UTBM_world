package pouvoir;

import model.Room;
import model.RoomType;

public class Professor extends Pouvoir {
	public Professor() {
		name = "professor";
		description = "class begin!";
	}

	public int bonusattack(Room r) {
		int n = 0;
		if (r.getRoomType() == RoomType.CLASSROOM)
			n = 3;
		if (r.getRoomType() == RoomType.TPROOM)
			n = 2;
		else if (r.getRoomType() == RoomType.TDROOM)
			n = 2;
		return n;

	}

	public int bonusdefense(Room r) {
		int n;
		if (r.getRoomType() == RoomType.COMPUTERROOM)
			n = 2;
		else
			n = 1;
		return n;
	}

	public int peoplecarry(Room r) {
		int n;
		if (r.getRoomType() == RoomType.COMPUTERROOM)
			n = 4;
		else
			n = 2;
		return n;
	}

	public int gainbonus(Room r) // si ce pion reste dans ce room,chaque tour il
									// va gagner des bonus
	{
		int n = 0;
		if (r.getRoomType() == RoomType.CLASSROOM)
			n = 3;

		if (r.getRoomType() == RoomType.TPROOM)
			n = 2;
		else if (r.getRoomType() == RoomType.TDROOM)
			n = 2;
		return n;
	}
}
