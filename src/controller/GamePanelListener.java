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
	public GamePanelListener(MouseEffectComponent mec) {
		this.mec=mec;
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getSource().toString() == "RoomPanel"){
			mec.update(e.getXOnScreen()-mec.getLocationOnScreen().x
					,e.getYOnScreen()-mec.getLocationOnScreen().y);
		}
		else{
			mec.update(e.getX(), e.getY());
		}
		
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
