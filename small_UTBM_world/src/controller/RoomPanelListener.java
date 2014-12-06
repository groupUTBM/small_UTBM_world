package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import View.RoomPanel;

public class RoomPanelListener implements MouseListener {
	private RoomPanel roomPnl;
	
	public RoomPanelListener(RoomPanel room){
		this.roomPnl=room;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		roomPnl.mouseOnTop();
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		roomPnl.mouseExited();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getButton());
		if(e.getButton()==1)
			roomPnl.mouseClicked();
		else if(e.getButton()==3)
			roomPnl.mouseRightClicked();
		System.out.println(roomPnl.getPosX()+" "+roomPnl.getPosY());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
