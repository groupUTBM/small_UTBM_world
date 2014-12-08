package model;

import java.util.ArrayList;

import view.MapPanel;

public class Map {
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private MapPanel mp;
	private int i;
	public Map(MapPanel mapPanel){
		mp = mapPanel;
		for(i=0; i< 100 ; i++){
			rooms.add(new Room(mp.getRoomPan(i%10, i/10)));
		}
	}
	
	public Room getRoom(int x, int y){
		return rooms.get(y*10+x);
	}
}
