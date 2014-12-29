package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import controller.GameController;
import controller.RoomPanelListener;

public class MapPanel extends JPanel {

	private static final long serialVersionUID = -6295434850309030057L;
	private ArrayList<RoomPanel> roomsPans;
	private GridLayout gl = new GridLayout(10,10);
	private int i;
	public MapPanel(){
		//instantiation
		roomsPans = new ArrayList<RoomPanel>();
		gl = new GridLayout(10,10);
		//GUI
		this.setMinimumSize(new Dimension(600,600));
		this.setBackground(Color.red);
		this.setLayout(gl);
		gl.setHgap(2);
		gl.setVgap(2);
		for(i=0; i< 100 ; i++){
			roomsPans.add(new RoomPanel(i%10, i/10));
			add(roomsPans.get(i));
		}
	
	}
	public RoomPanel getRoomPan(int x, int y){
		
		return roomsPans.get(y*10 + x);
	}
	public void addRoomListeners(GameController gc){
		//permet l'ajout externe des listeners de chaque salle
		for(i=0; i< 100 ; i++){
			roomsPans.get(i).addRoomPanelListener(new RoomPanelListener(gc.getGame().getMap().getRoom(i%10, i/10)
					, getRoomPan(i%10,i/10), gc));
			add(roomsPans.get(i));
		}
	}
}
