package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.GlobalPanel;
import model.Game;

//Pour enter l'ecran de choisir le nombre de joueur
public class StartButtonListener implements MouseListener {

	private GlobalPanel gp;
	
	public StartButtonListener( GlobalPanel gp){
		this.gp = gp;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		gp.showEnterNamePan();
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
