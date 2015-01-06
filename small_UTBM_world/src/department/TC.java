package department;

import model.RoomType;
import model.Room;

public class TC extends Department {
	public TC() {
		name="Tronc Commun";
		description="I'm new here";
	}

	public int attack(int numunite, RoomType r) {
		return 1;
	}
}
