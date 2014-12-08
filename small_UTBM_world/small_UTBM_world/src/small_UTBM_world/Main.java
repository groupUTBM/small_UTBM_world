package small_UTBM_world;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.GlobalPanel;
import model.Game;

public class Main { 
	public static void main(String args[]){
		JFrame frame = new JFrame();
//		JPanel globalPnl = new JPanel();
//		GamePanel gamePnl = new GamePanel();
		GlobalPanel globalPnl = new GlobalPanel();
		
//		Game game = new Game(globalPnl.getGamePanel());
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		
		frame.setLocationRelativeTo(null);
		frame.setContentPane(globalPnl);
		frame.setResizable(false);
		
//		globalPnl.add(gamePnl);
		
	}
}
