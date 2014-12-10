package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Game;
import model.Player;

public class GlobalPanel extends JPanel {
	private GamePanel gamePan;
	private JPanel testPan = new JPanel();
	private WelcomePanel welcomePan;
	private ChooseNbPlayer cnbPan;
	private EnterNamePlayer enpPan;
	
	private CardLayout cl = new CardLayout();
	
	public GlobalPanel(){
		welcomePan=new WelcomePanel(this);
		enpPan = new EnterNamePlayer(this);
		
		setLayout(cl);
		testPan.setBackground(Color.pink);
		add(testPan, "testpanel");
		add(welcomePan, "welcomePan");
		add(enpPan,"enterNamePan");
		
		
		cl.show(this, "welcomePan");
		
	}
	
	public GamePanel getGamePanel(){
		return gamePan;
	}
	public ChooseNbPlayer getCnbPan(){
		return cnbPan;
	}
	public EnterNamePlayer getEnp(){
		return enpPan;
	}
	public void showGamePan(){
		gamePan = new GamePanel(enpPan.getListPlayers());
		add(gamePan,"gamePan");
		cl.show(this, "gamePan");
	}
	public void showChooseNbPan(){
		cnbPan = new ChooseNbPlayer(this);
		add(cnbPan,"chooseNbPan");
		cl.show(this, "chooseNbPan");
	}
	public void showEnterNamePan(int nbPlayers){
		enpPan.init(nbPlayers);
		cl.show(this, "enterNamePan");
	}
}
