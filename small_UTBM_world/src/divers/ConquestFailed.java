package divers;

import model.Player;
import model.Room;

public class ConquestFailed extends Exception {

	private static final long serialVersionUID = 7774840785057222796L;
	private Player player;
	private Room r;
	public ConquestFailed(){
		super();
	}
	public ConquestFailed(Player p,Room r){
		super();
		player=p;
		this.r=r;
	}
	public Player getPlayer(){
		return player;
	}
	public Room getRoom(){
		return r;
	}
}
