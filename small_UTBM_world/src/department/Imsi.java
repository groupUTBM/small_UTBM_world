package department;

import model.RoomType;
import model.Room;

public class Imsi extends Department {

	public Imsi() {
		name="ingénierie et management des systèmes industriels";
		description="Come here,and i will lead you to do your job";
	}

	public String get_description() {
		return "Come here,and i will lead you to do your job";
	}

	public int attack(int numunite, RoomType r) {
		int n;
		if (r == RoomType.MECANICCLASS)
			n = 2 * numunite;
		else
			n = 1 * numunite;
		return n;

	}
}
