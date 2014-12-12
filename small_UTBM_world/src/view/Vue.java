package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Player;

public class Vue extends JPanel
{
	JLabel panNom;
	JLabel panPeuple;
	JLabel panPoint;
	JLabel ecranNom = new JLabel();
	JLabel ecranPeuple = new JLabel();
	JLabel ecranPoint = new JLabel("0");
	
	//private vue(Player P)
	public Vue(Player p)
	{
		// création des textes
		Font police = new Font("Arial", Font.BOLD, 12);
	    /*ecranNom = new JLabel(P.getNom());
	    ecranPeuple = new JLabel(P.getDepartment().get_name());*/
		ecranNom = new JLabel(p.getName());
	    ecranPeuple = new JLabel("placeholder");
	    ecranPoint = new JLabel("0");
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
	    

		panNom = new JLabel("NOM :");
		panPeuple = new JLabel("Peuple + Pouvoir");
		panPoint = new JLabel("POINT :");
	    panNom.setHorizontalAlignment(JLabel.CENTER);
	    panPeuple.setHorizontalAlignment(JLabel.CENTER);
	    panPoint.setHorizontalAlignment(JLabel.CENTER);
	    panNom.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    panPeuple.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    panPoint.setBorder(BorderFactory.createLineBorder(p.getColor()));
	    
	    // création du conteneur
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
}
