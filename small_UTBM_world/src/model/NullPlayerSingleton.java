package model;

public class NullPlayerSingleton {
	private static NullPlayerSingleton instance = new NullPlayerSingleton();
	private Player nullPlayer = new Player("null");

	private NullPlayerSingleton() {

	}

	public static NullPlayerSingleton getInstance() {
		return instance;
	}

	public Player getNullPlayer() {
		return nullPlayer;
	}
}
