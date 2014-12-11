package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

import controller.GamePanelListener;

public class MouseEffectComponent extends JComponent{
	private static final long serialVersionUID = -7199224691108588641L;
	
	private int pX,pY;
	private int nbPawnInHand = 0;
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.drawString(Integer.toString(nbPawnInHand), pX, pY);
	}

	public void update(int positionX, int positionY) {
		this.pX=positionX;
		this.pY=positionY;
	}
	public void updateNb(int n){
		nbPawnInHand=n;
		
	}
	
}
