package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pouvoir.Pouvoir;
import department.Department;


public class CombPanel extends JPanel{
	
	private JLabel panDep;
	private JLabel panDepDes;
	private JLabel panPou;
	private JLabel panPouDes;
	private JLabel ecranDep;
	private JLabel ecranDepDes;
	private JLabel ecranPou;
	private JLabel ecranPouDes;
	
	public CombPanel(Department dep,Pouvoir pou){
		panDep = new JLabel("DEPARTMENT :");
		panDepDes = new JLabel("DESCRIPTION:");
		panPou = new JLabel("POUVOIR");
		panPouDes = new JLabel("DESCRIPTION:");
		ecranDep = new JLabel(dep.get_name());
		ecranDepDes = new JLabel(dep.get_description());
		ecranPou = new JLabel(pou.getname());
		ecranPouDes = new JLabel(pou.getdescription());
		
		panDep.setSize(new Dimension(100,20));
		panDepDes.setSize(new Dimension(100,20));
		panPou.setSize(new Dimension(100,20));
		panPouDes.setSize(new Dimension(100,20));
		
		panDep.setFont(new java.awt.Font("Dialog", 1, 10));
		panDepDes.setFont(new java.awt.Font("Dialog", 1, 10));
		panPou.setFont(new java.awt.Font("Dialog", 1, 10));
		panPouDes.setFont(new java.awt.Font("Dialog", 1, 10));
		panDep.setBackground(Color.black);
		panDepDes.setBackground(Color.black);
		panPou.setBackground(Color.black);
		panPouDes.setBackground(Color.black);
		panDep.setForeground(Color.white);
		panDepDes.setForeground(Color.white);
		panPou.setForeground(Color.white);
		panPouDes.setForeground(Color.white);
		
		ecranDep.setFont(new java.awt.Font("Dialog", 1, 10));
		ecranDepDes.setFont(new java.awt.Font("Dialog", 1, 10));
		ecranPou.setFont(new java.awt.Font("Dialog", 1, 10));
		ecranPouDes.setFont(new java.awt.Font("Dialog", 1, 10));
		ecranDep.setBackground(Color.black);
		ecranDepDes.setBackground(Color.black);
		ecranPou.setBackground(Color.black);
		ecranPouDes.setBackground(Color.black);
		ecranDep.setForeground(Color.white);
		ecranDepDes.setForeground(Color.white);
		ecranPou.setForeground(Color.white);
		ecranPouDes.setForeground(Color.white);
		
		
		this.setLayout(new GridLayout(4, 2));
	    this.add(panDep);
	    this.add(ecranDep);
	    this.add(panDepDes);
	    this.add(ecranDepDes);
	    this.add(panPou);
	    this.add(ecranPou);
	    this.add(panPouDes);
	    this.add(ecranPouDes);
		
		
	}

}
