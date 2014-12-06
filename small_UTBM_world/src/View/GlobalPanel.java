package View;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GlobalPanel extends JPanel {
	private GamePanel gamePan = new GamePanel();
	private JPanel testPan = new JPanel();
	private WelcomePanel welcomePan = new WelcomePanel(this);
	
	private CardLayout cl = new CardLayout();
	
	public GlobalPanel(){
		setLayout(cl);
		testPan.setBackground(Color.pink);
		add(gamePan, "gamepanel");
		add(testPan, "testpanel");
		add(welcomePan, "welcomePan");
		cl.show(this, "welcomePan");
		
	}
	
	public GamePanel getGamePanel(){
		return gamePan;
	}
	
	public void showGamePan(){
		cl.show(this, "gamepanel");
	}
}
