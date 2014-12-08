package view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import model.Game;

public class GlobalPanel extends JPanel {
	private GamePanel gamePan;
	private JPanel testPan = new JPanel();
	private WelcomePanel welcomePan;
	private ChooseNbPlayer cnbPan = new ChooseNbPlayer(this);
	private EnterNamePlayer enpPan;
	
	private CardLayout cl = new CardLayout();
	
	public GlobalPanel(){
		welcomePan=new WelcomePanel(this);
		enpPan = new EnterNamePlayer(this);
		
		setLayout(cl);
		testPan.setBackground(Color.pink);
		add(testPan, "testpanel");
		add(welcomePan, "welcomePan");
		add(cnbPan,"chooseNbPan");
		add(enpPan,"enterNamePan");
		
		
		cl.show(this, "welcomePan");
		
	}
	
	public GamePanel getGamePanel(){
		return gamePan;
	}
	
	public void showGamePan(){
		gamePan = new GamePanel();
		add(gamePan,"gamePan");
		cl.show(this, "gamePan");
	}
	public void showChooseNbPan(){
		cl.show(this, "chooseNbPan");
	}
	public void showEnterNamePan(){
		cl.show(this, "enterNamePan");
	}
}
