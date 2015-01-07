package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.GameController;

public class NextTurnButton extends JButton{

	private static final long serialVersionUID = 537747287208160587L;
	private GameController gc;
	public NextTurnButton(GameController g){
		
		this.gc=g;
		
		setText("red?ploiement");
		setMaximumSize(new Dimension(100,200));
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gc.nextTurnBtnClick();
				
			}
		});
	}

	public void showNextTurn(){
		setText("tour suivant");
	}
	public void showRedeployment(){
		setText("red?ploiement");
	}
	
}
