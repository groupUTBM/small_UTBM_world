package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
//Panel utilisé pour afficher le nombre d'unité disponible à côté du curseur
public class MouseEffectComponent extends JComponent{
	private static final long serialVersionUID = -7199224691108588641L;
	
	private int pX,pY;
	private int nbPawnInHand;
	private Color color;
	
	public MouseEffectComponent() {
		pX=0;
		pY=0;
		nbPawnInHand=0;
		color =  new Color(0,0,0);
	}
	@Override
	public void paintComponent(Graphics g){
		g.setColor(color);
		g.setFont(new Font("Dialog",0,20));
		g.drawString(Integer.toString(nbPawnInHand), pX, pY);
		g.fillOval(pX-10, pY-10, 20,20);
	}

	public void update(int positionX, int positionY) {
		this.pX=positionX;
		this.pY=positionY;
	}
	public void updateNb(int n){
		nbPawnInHand=n;
		
	}
	public void setColor(Color c){
		color=c;
	}
	
}
