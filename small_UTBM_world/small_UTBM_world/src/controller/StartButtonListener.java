package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.GlobalPanel;
import model.Game;

public class StartButtonListener implements MouseListener {

	private GlobalPanel globalPan;
	
	public StartButtonListener( GlobalPanel gp){
		globalPan = gp;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		globalPan.showGamePan();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}