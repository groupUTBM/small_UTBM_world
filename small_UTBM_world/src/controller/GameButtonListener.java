package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.GlobalPanel;


//Pour enter l'ecran de joue
public class GameButtonListener implements MouseListener{
	
private GlobalPanel gp;
	
	public GameButtonListener(GlobalPanel gp) {
		this.gp=gp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(gp.getEnp().getCurrNbPlayer());
		if(gp.getEnp().getCurrNbPlayer() >= 2 && gp.getEnp().getCurrNbPlayer() <=6){
			gp.showGamePan();
		}
		else{	
			System.out.println("errormess");
			gp.getEnp().showErrMess();
		}
	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
