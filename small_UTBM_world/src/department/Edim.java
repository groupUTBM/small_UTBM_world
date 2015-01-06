package department;

import model.RoomType;

public class Edim extends Department {

	public Edim() {
		name="EDIM";
		description="Ergonomie, Design et Ingénierie Mécanique ";
		nbPawn=10;
	}

	public int attack(int numunite, RoomType r) {
		int n;
		if (r == RoomType.BAR)
			n = 2 * numunite;
		else
			n = 1 * numunite;
		return n;
	}
}