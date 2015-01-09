package department;

import model.RoomType;
import model.Room;

public class TC extends Department {
	public TC() {
		name="TC";
		description="I'm new here";
		nbPawn=15;
	}

	public int attack(int numunite, RoomType r) {
		return 1;
	}
}
