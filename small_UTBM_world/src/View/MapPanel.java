package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MapPanel extends JPanel {

	private static final long serialVersionUID = -6295434850309030057L;
	private ArrayList<RoomPanel> rooms = new ArrayList<RoomPanel>();
	
	private GridLayout gl = new GridLayout(10,10);
	private int i;
	public MapPanel(){
//		this.setPreferredSize(new Dimension(500,400));
		this.setBackground(Color.red);
		this.setLayout(gl);
		gl.setHgap(2);
		gl.setVgap(2);
		for(i=0; i< 100 ; i++){
			rooms.add(new RoomPanel(i%10, i/10));
			this.add(rooms.get(i));
//			gl.addLayoutComponent("g",rooms.get(i));
		}
		
	}
	public RoomPanel getRoom(int x, int y){
		
		return rooms.get(y*10 + x);
	}
}
