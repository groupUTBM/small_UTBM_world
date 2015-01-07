package pouvoir;

import model.Room;

public abstract class Pouvoir {
	protected String name;
	protected String description;

	abstract public int bonusattack(Room r);

	abstract public int bonusdefense(Room r);

	abstract public int gainbonus(Room r);

	public String getname() {
		return this.name;
	}

	public String getdescription() {
		return this.description;
	}

}


