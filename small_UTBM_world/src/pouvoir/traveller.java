package pouvoir;

import model.Room;

public class Traveller extends Pouvoir {
	public Traveller() {
		name = "traveller";
		description = "we can go anywhere";
	}

	public int bonusattack(Room r) {
		return 2;
	}

	public int bonusdefense(Room r) {
		return 1;
	}

	public int gainbonus(Room r) // si ce pion reste dans ce room,chaque tour il
									// va gagner des bonus
	{
		return 1;
	}
}
