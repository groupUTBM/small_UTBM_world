package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Player;

public class GlobalPanel extends JPanel {
	
	private static final long serialVersionUID = -6726502932861804628L;
	private GamePanel gamePan;
	private JPanel testPan;
	private WelcomePanel welcomePan;
	private ChooseNbPlayer cnbPan;
	private EnterNamePlayer enpPan;
	private Combination combPan;
	private static GlobalPanel gpInstance;
	private VictoryPanel vp;
	
	private CardLayout cl;
	
	public GlobalPanel(){
		//instantiations
		testPan = new JPanel();
		cl = new CardLayout();
		welcomePan=new WelcomePanel(this);
		enpPan = new EnterNamePlayer(this);
		gpInstance=this;
		
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
	public Combination getComb(){
		return combPan;
	}
	//fonctions permettant de changer le panel affich?
	public void showGamePan(){
		gamePan = new GamePanel(combPan.getListePlayers());
		add(gamePan,"gamePan");
		cl.show(this, "gamePan");
	}
	public void showGamePanAgain(){
		cl.show(this, "gamePan");
		gamePan.getGameController().getGame().nextTurn();
	}
	public void showChooseNbPan(){
		cnbPan = new ChooseNbPlayer(this);
		add(cnbPan,"chooseNbPan");
		cl.show(this, "chooseNbPan");
	}
	public void showEnterNamePan(){		
		cl.show(this, "enterNamePan");
		enpPan.init();
	}
	public void showCombinationPan() {
		combPan = new Combination(this,enpPan.getListPlayers());
		add(combPan,"combinationPan");
		cl.show(this,"combinationPan");
	}
	public void showCombPanDecline(Player p){
		ArrayList<Player> player = new ArrayList<Player>();
		player.add(p);
		combPan = new Combination(this, player);
		add(combPan,"combinationPan");
		cl.show(this, "combinationPan");
	}

	public void showWelcomePan() {
		// TODO Auto-generated method stub
		cl.show(this,"welcomePan");
	}
	public void showVictoryPan(Player p){
		vp= new VictoryPanel(p);
		add(vp,"vp");
		cl.show(this, "vp");
	}
	public static GlobalPanel getInstance(){
		return gpInstance;
	}
	
}
