package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import controller.RoomPanelListener;
import model.Room;

public class RoomPanel extends JPanel {
	private int posX,posY;
	private RoomPanelListener rpl = new RoomPanelListener(this);
	private boolean selected;
	private int nbUnits = 0;
	
	public RoomPanel(int pX, int pY){
		setPreferredSize(new Dimension(60,60));
		setBackground(Color.blue);
		posX = pX;
		posY = pY;
		setVisible(true);
		addMouseListener(rpl);
		
		BorderLayout bl = new BorderLayout();
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	public void mouseOnTop(){
		if(!selected)
		setBackground(Color.white);
	}
	public void mouseExited(){
		if(!selected)
		setBackground(Color.blue);
	}
	public void mouseClicked(){
		if(!selected){
			selected=true;
			this.setBackground(Color.red);
		}
	}
	public void mouseRightClicked(){
		if(selected){
			selected=false;
			setBackground(Color.blue);
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.green);
		g.drawString(Integer.toString(nbUnits), 0, 10);
	}
	public void update(Room r){
		nbUnits = r.getNbUnits();
		System.out.println(nbUnits);
		
		repaint();
	}
}
