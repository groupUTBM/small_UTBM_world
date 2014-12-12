package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Game;
import model.Player;
import controller.GameController;
import controller.GamePanelListener;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 405461811821501769L;
	private MapPanel mapPnl;
	private PlayerListPanel playerLstPnl;
	private JPanel containerPan = new JPanel();
	private MouseEffectComponent mec;
	private JButton nextTurnBtn = new JButton("next Turn");
	
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
		playerLstPnl = new PlayerListPanel(players);
		
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.BLACK);
		containerPan.setLayout(gbl);
		setLayout(cl);
		nextTurnBtn.setMaximumSize(new Dimension(100,200));
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
		
		nextTurnBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gc.getGame().nextTurn();
				
			}
		});
		
		add(containerPan,"contPan");
		
		addMouseMotionListener(gpl);
		add(mec, 0);
		mec.setVisible(true);
		containerPan.setVisible(true);
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
