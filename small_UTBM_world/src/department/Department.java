package department;

import model.RoomType;
import model.Room;

public abstract class Department {

	protected int nbPawn;
	protected String name;
	protected String description;

	public String get_name() {
		return name;
	}

	public int get_numunite() {
		return nbPawn;
	}

	public String getDescription() {
		return description;
	}

	abstract public int attack(int numunite, RoomType r);
}
