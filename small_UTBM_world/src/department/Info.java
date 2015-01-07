package department;

import model.RoomType;
import model.Room;

public class Info extends Department {
	public Info() {
		name="Genie Informatique";
		description="We are geek,we are strong in computer science!if the room is computer classroom,you will be stronger";
		nbPawn = 13;
	}

	public int attack(int numunite, RoomType r) {
		int n;
		if (r == RoomType.COMPUTERROOM)
			n = 2 * numunite;
		else
			n = 1 * numunite;
		return n;
	}
}
