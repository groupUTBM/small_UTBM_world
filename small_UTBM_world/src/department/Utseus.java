package department;

import model.RoomType;
import model.Room;

public class Utseus extends Department {
	public Utseus() {
		name="Université de Technologie Sino-Européenne de l'Université de Shanghai";
	}

	public int attack(int numunite, RoomType r) {
		int n;
		if (r == RoomType.CHINESECLASS)
			n = 2 * numunite;
		else
			n = 1 * numunite;
		return n;
	}
}