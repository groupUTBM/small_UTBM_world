package pouvoir;

import model.Room;
import model.RoomType;

public class Sportsman extends Pouvoir {
	public Sportsman() {
		name = "sportsman";
		description = "Faster,Higher,Stronger!";
	}

	public int bonusattack(Room r) {
		int n;
		if (r.getRoomType() == RoomType.GYM)
			n = 3;
		else
			n = 1;
		return n;
	}

	public int bonusdefense(Room r) {
		int n;
		if (r.getRoomType() == RoomType.GYM)
			n = 2;
		else
			n = 1;
		return n;
	}

	public int gainbonus(Room r) // si ce pion reste dans ce room,chaque
									// tour il va gagner des bonus
	{
		int n = 0;
		if (r.getRoomType() == RoomType.GYM)
			n = 3;
		else
			n = 2;
		return n;
	}
}
