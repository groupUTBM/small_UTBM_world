package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.SwingConstants;




import controller.StartButtonListener;

public class WelcomePanel extends JPanel {

	private static final long serialVersionUID = 3590034839932985629L;
	private JLabel title;
	private JButton commencer;
	private JButton tutoriel;
	private GlobalPanel gp;
	private StartButtonListener sbl;
	
	public WelcomePanel(GlobalPanel gPan){
		
		instantiations(gPan);
		configurationGUI();
	   
	}
	
	//Fonctions ? usage interne
	private void instantiations(GlobalPanel gPan){
		gp=gPan;
		title = new JLabel();
		commencer = new JButton("Commencer");
		tutoriel = new JButton("Tutoriel");
		sbl= new StartButtonListener(gp);
		
	}
	private void configurationGUI(){
		setLayout(new FlowLayout(FlowLayout.CENTER,600,70));
		title.setText("BIENVENUE DANS SMALL UTBM WORLD!");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.getText();
		System.out.println(title.getText());
		title.setBackground(Color.black);
	   
	   
		commencer.setPreferredSize(new Dimension(150,40));
		tutoriel.setPreferredSize(new Dimension(150,40));
	   
		setBackground(Color.black);
		add(title);	   
		add(tutoriel);
		add(commencer);
	   
		commencer.addMouseListener(sbl);
		tutoriel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				gp.showTutorielPan();
				
			}
			
		});

	   
		setVisible(true);
	   
		tutoriel.setVisible(true);
		commencer.setVisible(true);
	}
	
}

