package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseEffectComponent;



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
		//n�cessaire pour que le curseur soit affich� � la bonne position m�me si l'�v�nement est intercept�
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
