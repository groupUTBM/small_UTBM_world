package view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GlobalPanel extends JPanel {
	
	private static final long serialVersionUID = -6726502932861804628L;
	private GamePanel gamePan;
	private JPanel testPan;
	private WelcomePanel welcomePan;
	private ChooseNbPlayer cnbPan;
	private EnterNamePlayer enpPan;
	
	private CardLayout cl;
	
	public GlobalPanel(){
		//instantiations
		testPan = new JPanel();
		cl = new CardLayout();
		welcomePan=new WelcomePanel(this);
		enpPan = new EnterNamePlayer(this);
		//GUI
		setLayout(cl);
		testPan.setBackground(Color.pink);
		add(testPan, "testpanel");
		add(welcomePan, "welcomePan");
		add(enpPan,"enterNamePan");
		
		
		cl.show(this, "welcomePan");
		
	}
	//getters
	public GamePanel getGamePanel(){
		return gamePan;
	}
	public ChooseNbPlayer getCnbPan(){
		return cnbPan;
	}
	public EnterNamePlayer getEnp(){
		return enpPan;
	}
	//fonctions permettant de changer le panel affiché
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
	public void showEnterNamePan(){		
		cl.show(this, "enterNamePan");
	}
}
