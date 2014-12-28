package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Game;
import model.Player;
import controller.GameController;
import controller.GamePanelListener;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 405461811821501769L;
	private MapPanel mapPnl;
	private PlayerListPanel playerLstPnl;
	private JPanel containerPan;
	private MouseEffectComponent mec;
	private NextTurnButton nextTurnBtn;
	
	private GridBagConstraints gbc;
	private GridBagLayout gbl;
	private CardLayout cl;
	
	private GameController gc;
	
	private GamePanelListener gpl;
	private Toolkit tk;
	
	public GamePanel( ArrayList<Player> players){
		instantiations(players);
		configurationGUI();
		
	}
	
	public void paintComponent(Graphics g){//important pour toujours voir le mec
		super.paintComponent(g);
		mec.repaint();
	}
	//getters
	public MapPanel getMapPanel(){
		return mapPnl;
	}
	public MouseEffectComponent getMec(){
		return mec;
	}
	public NextTurnButton getNextTurnButton(){
		return nextTurnBtn;
	}
	//Fonctions à usage interne
	private void instantiations(ArrayList<Player> players){
		mec = new MouseEffectComponent();
		gpl = new GamePanelListener(mec);
		mapPnl = new MapPanel(gc);
		
		
		gbc = new GridBagConstraints();
		gbl = new GridBagLayout();
		cl = new CardLayout();
		gc = new GameController(new Game(this,players));
		tk = getToolkit();
		
		mapPnl.addRoomListeners(gc);
		playerLstPnl = new PlayerListPanel(players);
		nextTurnBtn = new NextTurnButton(gc);
		containerPan = new JPanel();
	}
	private void configurationGUI(){
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.BLACK);
		containerPan.setLayout(gbl);
		setLayout(cl);
		playerLstPnl.setMinimumSize(new Dimension(200, 500));
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0;
		gbc.gridx=0;
		gbc.gridheight=2;
		containerPan.add(mapPnl,gbc);
		gbc.gridheight  = 1;
		gbc.gridx=GridBagConstraints.RELATIVE;
		gbc.weighty=1.0;
		gbc.weightx=1.0;
		containerPan.add(playerLstPnl,gbc);
		gbc.gridx = 1;
		gbc.gridy = GridBagConstraints.RELATIVE;
		containerPan.add(nextTurnBtn,gbc);
		
		add(containerPan,"contPan");
		
		addMouseMotionListener(gpl);
		add(mec, 0);
		this.setCursor(tk.createCustomCursor(tk.getImage(""), new Point(), "no_cursor"));
		
		mec.setVisible(true);
		containerPan.setVisible(true);
	}
	
	

}
