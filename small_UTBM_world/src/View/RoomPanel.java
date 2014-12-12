package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import controller.GameController;
import controller.RoomPanelListener;
import model.Game;
import model.Room;

public class RoomPanel extends JPanel {
	private int posX,posY;
	private int nbUnits = 0;
	private boolean selected;
	
	private RoomPanelListener rpl;
	private GameController gc;
	private Color color = new Color(0,0,0);
	private String type;
	
	public RoomPanel(int pX, int pY, GameController g){
		this.gc=g;
		
		setPreferredSize(new Dimension(60,60));
		setBackground(color);
		posX = pX;
		posY = pY;
		setVisible(true);
	}
	public void addRoomPanelListener(RoomPanelListener rplst){
		this.rpl=rplst;
		addMouseListener(rpl);
		addMouseMotionListener(rpl);
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	public void mouseOnTop(){
		if(!selected)
		setBackground(Color.GRAY);
	}
	public void mouseExited(){
		if(!selected)
		setBackground(color);
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
		g.setColor(new Color(255-(int)(color.getRed()*0.8), 255-(int)(color.getGreen()*0.8), 255-(int)(color.getBlue()*0.8)));
		g.drawString(Integer.toString(nbUnits), 0, 10);
		g.setFont(new Font("Dialog",0,9));
		g.drawString(type, 0, 50);
	}
	public void update(Room r){
		nbUnits = r.getNbUnits();
		switch(r.getRoomType()){
		case BAR :
			color = new Color(139,0,0);
			break;
		case CHINESECLASS :
			color = new Color(238,64,0);
			break;
		case CLASSROOM : 
			color = new Color(255,231,186);
			break;
		case COMPUTERROOM :
			color = new Color(230,230,250);
			break;
		case DORMITORY : 
			color = new Color(105,105,105);
			break;
		case GRASS : 
			color = new Color(202,255,112);
			break;
		case GYM : 
			color = new Color(255,218,185);
			break;
		case MECANICCLASS :
			color = new Color(198,226,255);
			break;
		case TDROOM :
			color = new Color(255,228,196);
			break;
		case TPROOM :
			color = new Color(221,160,221);
			break;
		}
		type = r.getRoomType().getLabel();
		setBackground(color);
		repaint();
	}
	public String toString(){
		return "RoomPanel";
	}
}
