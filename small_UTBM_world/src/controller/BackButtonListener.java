package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.GlobalPanel;


//Pour enter l'ecran de saisir les noms de joueurs
public class BackButtonListener implements MouseListener {
	
	private GlobalPanel gp;
	
	public BackButtonListener(GlobalPanel gp) {
		this.gp=gp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		gp.showWelcomePan();
		
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
