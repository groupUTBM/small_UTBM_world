package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Game;
import model.Player;
import controller.GameController;
import controller.GamePanelListener;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 405461811821501769L;
	private MapPanel mapPnl;
	private PlayerListPanel playerLstPnl = new PlayerListPanel();
	private JPanel containerPan = new JPanel();
	private MouseEffectComponent mec;
	
	private GridBagConstraints gbc = new GridBagConstraints();
	private GridBagLayout gbl= new GridBagLayout();
	private CardLayout cl = new CardLayout();
	
	private GameController gc;
	private Game game;
	
	private GamePanelListener gpl;
	
	public GamePanel( ArrayList<Player> players){
		mec = new MouseEffectComponent();
		gpl = new GamePanelListener(mec);
		mapPnl = new MapPanel(gc);
		gc = new GameController(new Game(this,players));
		
		mapPnl.addRoomListeners(gc);
		
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.BLACK);
		containerPan.setLayout(gbl);
		setLayout(cl);
		
		gbc.weightx = 1;
		gbc.gridx=0;
		gbc.ipady = 600;
		gbc.ipadx = 600;
		containerPan.add(mapPnl,gbc);
		gbc.gridx=1;
		gbc.weightx = 0;
		gbc.ipadx = 200;
		gbc.ipady = 400;
		containerPan.add(playerLstPnl,gbc);
		
		add(containerPan,"contPan");
		
		addMouseMotionListener(gpl);
		add(mec, 0);
		mec.setVisible(true);
		containerPan.setVisible(true);
//		cl.show(this, "mec");
	}
	
	public MapPanel getMapPanel(){
		return mapPnl;
	}
	public MouseEffectComponent getMec(){
		return mec;
	}
	public void paintComponent(Graphics g){//important in order to always see mec
		super.paintComponent(g);
		mec.repaint();
	}
}
