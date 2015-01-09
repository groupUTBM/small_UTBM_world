package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Player;

public class PlayerPanel extends JPanel
{

	private static final long serialVersionUID = 4521409508747610751L;
	private JLabel panNom;
	private JLabel panPeuple;
	private JLabel panPoint;
	private JLabel ecranNom;
	private JLabel ecranPeuple;
	private JLabel ecranPoint;
	
	//private vue(Player P)
	public PlayerPanel(Player p)
	{
		
		Font police = new Font("Arial", Font.BOLD, 12);
		ecranNom = new JLabel(p.getName());
	    ecranPeuple = new JLabel(p.getDepartment().get_name() + " + " + p.getPouvoir().getname());
	    ecranPoint = new JLabel(Integer.toString(p.getVictoryPt()));
	    panNom = new JLabel("NOM :");
		panPeuple = new JLabel("Peuple + Pouvoir");
		panPoint = new JLabel("POINT :");
	    
	    ecranNom.setFont(police);
	    ecranPeuple.setFont(police);
	    ecranPoint.setFont(police);
	    ecranNom.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    ecranPeuple.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    ecranPoint.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    ecranNom.setBackground(Color.white); 
	    ecranPeuple.setBackground(Color.white);
	    ecranPoint.setBackground(Color.white);
	    ecranNom.setHorizontalAlignment(JTextField.CENTER);
	    ecranPeuple.setHorizontalAlignment(JTextField.CENTER);
	    ecranPoint.setHorizontalAlignment(JTextField.CENTER);
	    

		
	    panNom.setHorizontalAlignment(JLabel.CENTER);
	    panPeuple.setHorizontalAlignment(JLabel.CENTER);
	    panPoint.setHorizontalAlignment(JLabel.CENTER);
	    panNom.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    panPeuple.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    panPoint.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    
	    // cr?ation du conteneur
	    this.setLayout(new GridLayout(3, 2, 0, 0));
	    this.add(panNom);
	    this.add(ecranNom);
	    this.add(panPeuple);
	    this.add(ecranPeuple);
	    this.add(panPoint);
	    this.add(ecranPoint);
	}
	public void setPoint(int pt)
	{
		ecranPoint.setText(Double.toString(pt));
	}
	public void update(Player p){
		ecranPoint.setText(Integer.toString(p.getVictoryPt()));
		ecranPeuple.setText(p.getDepartment().get_name() + " + " + p.getPouvoir().getname());
	}
}
