package controller;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.GamePanel;
import view.MouseEffectComponent;
import view.RoomPanel;



public class GamePanelListener implements MouseMotionListener, MouseListener {
	private MouseEffectComponent mec;
	private GameController gc;
	public GamePanelListener(MouseEffectComponent mec, GameController g) {
		this.mec=mec;
		gc=g;
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//nécessaire pour que le curseur soit affiché à la bonne position même si l'évènement est intercepté
		mec.update(e.getXOnScreen()-mec.getLocationOnScreen().x
				,e.getYOnScreen()-mec.getLocationOnScreen().y);

		mec.repaint();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
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
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
