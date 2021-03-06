package controller;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.GamePanel;
import view.RoomPanel;
import model.Room;

public class RoomPanelListener implements MouseListener, MouseMotionListener {

	private Room room;
	private RoomPanel roomPan;
	private GameController gc;
	private GamePanel gp;

	public RoomPanelListener(Room room, RoomPanel roomPan, GameController gc) {
		this.room = new Room(roomPan);
		this.roomPan = roomPan;
		this.gc = gc;
		gp = gc.getGame().getGamePanel();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		roomPan.mouseClicked();

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		roomPan.mouseOnTop();
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		roomPan.mouseExited();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			gc.clickOnRoom(room);
		} else if (e.getButton() == MouseEvent.BUTTON2) {
			gc.middleButtonClick();
		} else if (e.getButton() == 3) {
			gc.rightClickOnRoom(room);
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		gp.dispatchEvent(e);
		// System.out.println("ok");
	}

	public GameController getGC() {
		return gc;
	}
}
