package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import view.GamePanel;

public class NextTurnBtnListener implements MouseMotionListener {

	GamePanel gp;
	
	public NextTurnBtnListener(GamePanel gp) {
		this.gp=gp;
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		gp.dispatchEvent(e);
		
	}

}
