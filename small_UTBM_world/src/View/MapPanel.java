package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import controller.GameController;
import controller.RoomPanelListener;

public class MapPanel extends JPanel {

	private static final long serialVersionUID = -6295434850309030057L;
	private ArrayList<RoomPanel> roomsPans = new ArrayList<RoomPanel>();
	
	private GridLayout gl = new GridLayout(10,10);
	private int i;
	private GameController gc;
	
	public MapPanel(GameController g){
		this.gc=g;
		this.setMinimumSize(new Dimension(600,600));
		this.setBackground(Color.red);
		this.setLayout(gl);
		gl.setHgap(2);
		gl.setVgap(2);
		for(i=0; i< 100 ; i++){
			roomsPans.add(new RoomPanel(i%10, i/10,gc));
			add(roomsPans.get(i));
//			gl.addLayoutComponent("g",rooms.get(i));
		}
		
	}
	public RoomPanel getRoomPan(int x, int y){
		
		return roomsPans.get(y*10 + x);
	}
	public void addRoomListeners(GameController gamec){
		for(i=0; i< 100 ; i++){
			roomsPans.get(i).addRoomPanelListener(new RoomPanelListener(gamec.getGame().getMap().getRoom(i%10, i/10)
					, getRoomPan(i%10,i/10), gamec));
			add(roomsPans.get(i));
		}
	}
}
