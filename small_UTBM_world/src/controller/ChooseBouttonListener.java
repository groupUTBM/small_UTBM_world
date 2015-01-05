package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.CombPanel;
import view.Combination;
import model.Player;

public class ChooseBouttonListener implements MouseListener{
	private Combination c;
	private CombPanel cp;
	
	public ChooseBouttonListener(Combination c, CombPanel cp){
		this.c = c;
		this.cp = cp;
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		c.choiceMade(cp);
		System.out.println("oskdoasd");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		c.choiceMade(cp);
//		System.out.println("oskdoasd");
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
