package department;

import model.RoomType;
import model.Room;

public class Utseus extends Department {
	public Utseus() {
		name="Universit� de Technologie Sino-Europ�enne de l'Universit� de Shanghai";
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