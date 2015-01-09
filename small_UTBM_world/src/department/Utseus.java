package department;

import model.RoomType;
import model.Room;

public class Utseus extends Department {
	public Utseus() {
		name="UTSEUS";
		description="Engineer?No problem.Speak chinese,english,french?No problem.";
		nbPawn=12;
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