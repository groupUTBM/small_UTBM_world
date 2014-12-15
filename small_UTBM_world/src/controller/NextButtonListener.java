package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.GlobalPanel;


//Pour enter l'ecran de saisir les noms de joueurs
public class NextButtonListener implements MouseListener {
	
	private GlobalPanel gp;
	
	public NextButtonListener(GlobalPanel gp) {
		this.gp=gp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		gp.showEnterNamePan();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
