package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import model.Player;
import view.GlobalPanel;


//Pour enter l'ecran de choisir la combinaison du peuple et du pouvoir
public class CombinationButtonListener implements MouseListener{
	
private GlobalPanel gp;
	
	public CombinationButtonListener(GlobalPanel gp) {
		this.gp=gp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(gp.getEnp().getCurrNbPlayer());
		if(gp.getEnp().getCurrNbPlayer() >= 2 && gp.getEnp().getCurrNbPlayer() <=6){
			gp.showCombinationPan();
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
