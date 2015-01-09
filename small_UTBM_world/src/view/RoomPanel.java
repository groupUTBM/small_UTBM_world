package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import controller.RoomPanelListener;
import model.Room;

public class RoomPanel extends JPanel {

	private static final long serialVersionUID = 4054159238431524947L;
	private int posX,posY;
	private int nbUnits;
	private boolean selected;
	
	private RoomPanelListener rpl;
	private Color color;
	private Color pawnColor;
	private String type;
	
	public RoomPanel(int pX, int pY){
		//instanciation :
		nbUnits=0;
		color = Color.BLACK;
		pawnColor =  Color.BLACK;
		posX = pX;
		posY = pY;
		//GUI :
		setPreferredSize(new Dimension(60,60));
		setBackground(color);
		
		setVisible(true);
	}
	public void addRoomPanelListener(RoomPanelListener rplst){
		//permet l'ajout externe des listeners
		this.rpl=rplst;
		addMouseListener(rpl);
		addMouseMotionListener(rpl);
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	public void mouseOnTop(){
		selected=true;
			
	}
	public void mouseExited(){
		selected=false;
	}
	public void mouseClicked(){
		
	}
	public void mouseRightClicked(){
		
	}
	public void paintComponent(Graphics g){
		//comme on veut garder l'affichage des fonds
		super.paintComponent(g);
		//affichage du nombre d'unité
		g.setColor(new Color(255-(int)(color.getRed()*0.8), 255-(int)(color.getGreen()*0.8), 255-(int)(color.getBlue()*0.8)));
		g.drawString(Integer.toString(nbUnits), 0, 10);
		//affichage du type de salle
		g.setFont(new Font("Dialog",0,9));
		g.drawString(type, 0, 50);
		
		//affichage d'un ovale indiquant le nombre de pions et leur appartenance
		g.setColor(pawnColor);
		int size = 2+(int)(10*Math.log((double)nbUnits));
		g.fillOval(getWidth()/2-size/2, getHeight()/2-size/2, size,size);
		//affichage d'un rectangle de la couleur du joueur actuel si le curseur est sur la salle
		if(selected){
			
			g.setColor(rpl.getGC().getGame().getCurrentPlayer().getColor());
			for(int i=0;i<5;i++)
				g.drawRect(i, i, 57-2*i, 54-2*i);
			
		}
	}
	public void update(Room r){
		//met ? jour l'affichage du nombre d'unit?, la couleur des pions et du type de salle
		posX = r.getPosX();
		posY = r.getPosY();
		nbUnits = r.getNbUnits();
		pawnColor= r.getOwner().getColor();

		
		type = r.getRoomType().getLabel();
		System.out.println("on change la couleur stp");
		//associe ? chaque type de salle une couleur
		switch(r.getRoomType()){
		case BAR :
			color = Colors.getBarColor();
			break;
		case CHINESECLASS :
			color = Colors.getChineseClassColor();
			break;
		case CLASSROOM : 
			color = Colors.getClassColor();
			break;
		case COMPUTERROOM :
			color = Colors.getComputerColor();
			break;
		case DORMITORY : 
			color = Colors.getDormColor();
			break;
		case GRASS : 
			color = Colors.getGrassColor();
			break;
		case MESS :
			color = Colors.getMessColor();
			break;
		case GYM : 
			color = Colors.getGymColor();
			break;
		case MECANICCLASS :
			color = Colors.getMecaColor();
			break;
		case TDROOM :
			color = Colors.getTdRoomColor();
			break;
		case TPROOM :
			color = Colors.getTpRoomColor();
			break;
		}
		
		setBackground(color);
		repaint();
	}
}
