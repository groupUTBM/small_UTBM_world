package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 405461811821501769L;
	private MapPanel mapPnl = new MapPanel();
	private PlayerListPanel playerLstPnl = new PlayerListPanel();
	private GridBagConstraints gbc = new GridBagConstraints();
	private GridBagLayout gbl= new GridBagLayout();
	
	public GamePanel(){
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.BLACK);
		setLayout(gbl);
		
//		gbc.fill = GridBagConstraints.VERTICAL;

//		gbc.gridwidth = 2;
		gbc.weightx = 1;
		gbc.gridx=0;
		gbc.ipady = 600;
		gbc.ipadx = 600;
		add(mapPnl,gbc);
		gbc.gridx=1;
		gbc.weightx = 0;
		gbc.ipadx = 200;
		gbc.ipady = 400;
		add(playerLstPnl,gbc);
		
	}
	
	public MapPanel getMapPanel(){
		return mapPnl;
	}
}
