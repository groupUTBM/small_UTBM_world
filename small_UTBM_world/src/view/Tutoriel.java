package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.BackButtonListener;

public class Tutoriel extends JPanel{
	private JLabel title;
	private JLabel contenu;
	private GlobalPanel gp;
	private JButton back;
	private BackButtonListener bbl;
	
	public Tutoriel(GlobalPanel gpan){
		gp = gpan;
		bbl = new BackButtonListener(gp);
		title = new JLabel("Tutoriel");
		title.setForeground(Color.white);
		title.setFont(new java.awt.Font("Dialog", 1, 20));
		title.setBackground(Color.black);
		contenu = new JLabel("<html>ETAPE 1: DECIDER DU NOMBRE DE JOUEURS ET DE LEURS NOMS<br>"+ 
				"ETAPE 2: CHOISIR LA COMBINAISON DU PEUPLE ET DU POUVOIR<br>" +
				"ETAPE 3: COMMENCER LE JEU<br><br><br>" + "Le joueur peut, dans la phase de conquête,"+
						 " prendre les cases du bord de la carte en utilisant le clic droit."+
						 " Quand il essaye de conquérir une case alors qu'il ne peut pas, "+
						 "un nombre aléatoire entre 0 et 6 décide le nombre de renfort que l'on reçoit. "+
						 "Ces renforts sont gardés si la conquête fonctionne uniquement, "+
						 "puis la phase de redéploiement démarre aussitôt. "+
						 "Dans cette phase le joueur peut prendre dans sa main des unités dans les salles "+
						 "qu'il possède grâce au clic gauche, et les déposer grâce au clic droit. "+
						 "Dans ces 2 phases il a également la possibilité d'appuyer sur le bouton du milieu "+
						 "de la souris pour passer en déclin, causant l'abandon de son peuple actuel : "+
						  "ses salles perdent toutes leurs unités sauf une, et il en perds la possession. "+
						  "Il gagne néanmoins encore 1 points de victoire par case en déclin possédée. "+
						  "Au bout de 10 tours, le jeu se termine et le vainqueur est décidé : "+
						  "le joueur possédant le plus de points de victoire gagne.<br><br><br>"+
						  "BONNE CHANCE!</html>");
		contenu.setPreferredSize(new Dimension(750,500));
		contenu.setForeground(Color.WHITE);
		contenu.setHorizontalAlignment(JTextField.CENTER);
		contenu.setBackground(Color.black);
		
		back  = new JButton("RETOUR");
		back.addMouseListener(bbl);
		back.setBackground(Color.black);
		
		setBackground(Color.black);
		add(title);
		add(contenu);
		add(back);
		title.setVisible(true);
		contenu.setVisible(true);
		back.setVisible(true);
		
	}
}
