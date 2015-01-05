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
	private Department dep;
	private Pouvoir pou;
	private JPanel c1 = new JPanel();
	private JPanel c2 = new JPanel();
	
	public CombPanel(Department dep,Pouvoir pou){
		this.dep = dep;
		this.pou = pou;
		panDep = new JLabel("DEPARTMENT:  ");
		panDepDes = new JLabel("DESCRIPTION:  ");
		panPou = new JLabel("POUVOIR:  ");
		panPouDes = new JLabel("DESCRIPTION:  ");
		ecranDep = new JLabel("<html>"+dep.get_name()+"</html>");
		ecranDepDes = new JLabel("<html>"+dep.get_description()+"</html>");
		ecranPou = new JLabel("<html>"+pou.getname()+"</html>");
		ecranPouDes = new JLabel("<html>"+pou.getdescription()+"</html>");
		
//		panDep.setSize(new Dimension(100,20));
//		panDepDes.setSize(new Dimension(100,20));
//		panPou.setSize(new Dimension(100,20));
//		panPouDes.setSize(new Dimension(100,20));
		
		panDep.setFont(new java.awt.Font("Dialog", 0, 9));
		panDepDes.setFont(new java.awt.Font("Dialog", 0, 9));
		panPou.setFont(new java.awt.Font("Dialog", 0, 9));
		panPouDes.setFont(new java.awt.Font("Dialog", 0, 9));
		panDep.setPreferredSize(new Dimension(80,35));
		panDepDes.setPreferredSize(new Dimension(80,35));
		panPou.setPreferredSize(new Dimension(80,35));
		panPouDes.setPreferredSize(new Dimension(80,35));
		panDep.setOpaque(true);
		panDepDes.setOpaque(true);
		panPou.setOpaque(true);
		panPouDes.setOpaque(true);
		panDep.setBackground(Color.black);
		panDepDes.setBackground(Color.black);
		panPou.setBackground(Color.black);
		panPouDes.setBackground(Color.black);
		panDep.setForeground(Color.white);
		panDepDes.setForeground(Color.white);
		panPou.setForeground(Color.white);
		panPouDes.setForeground(Color.white);
		panDep.setHorizontalAlignment(JTextField.CENTER);
		panDepDes.setHorizontalAlignment(JTextField.RIGHT);
		panPou.setHorizontalAlignment(JTextField.RIGHT);
		panPouDes.setHorizontalAlignment(JTextField.RIGHT);
		
		ecranDep.setFont(new java.awt.Font("Dialog", 0, 9));
		ecranDepDes.setFont(new java.awt.Font("Dialog", 0, 9));
		ecranPou.setFont(new java.awt.Font("Dialog", 0, 9));
		ecranPouDes.setFont(new java.awt.Font("Dialog", 0, 9));
		ecranDep.setPreferredSize(new Dimension(200,35));
		ecranDepDes.setPreferredSize(new Dimension(200,35));
		ecranPou.setPreferredSize(new Dimension(200,35));
		ecranPouDes.setPreferredSize(new Dimension(200,35));
		ecranDep.setOpaque(true);
		ecranDepDes.setOpaque(true);
		ecranPou.setOpaque(true);
		ecranPouDes.setOpaque(true);
		ecranDep.setBackground(Color.black);
		ecranDepDes.setBackground(Color.black);
		ecranPou.setBackground(Color.black);
		ecranPouDes.setBackground(Color.black);
		ecranDep.setForeground(Color.white);
		ecranDepDes.setForeground(Color.white);
		ecranPou.setForeground(Color.white);
		ecranPouDes.setForeground(Color.white);
		
		c1.setLayout(new GridLayout(4,1));
		c1.add(panDep);
		c1.add(panDepDes);
		c1.add(panPou);
		c1.add(panPouDes);
		c1.setOpaque(true);
		c1.setBackground(Color.BLACK);
		c1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c2.setLayout(new GridLayout(4,1));
		c2.add(ecranDep);
		c2.add(ecranDepDes);
		c2.add(ecranPou);
		c2.add(ecranPouDes);
		c2.setOpaque(true);
		c2.setBackground(Color.BLACK);
		c2.setBorder(BorderFactory.createLineBorder(Color.black));

		
		
		
		
//		this.setLayout(new GridLayout(1, 2));
		this.setBorder(BorderFactory.createLineBorder(Color.white));
		this.add(c1);
		this.add(c2);
//	    this.add(panDep);
//	    this.add(ecranDep);
//	    this.add(panDepDes);
//	    this.add(ecranDepDes);  
//	    this.add(panPou);
//	    this.add(ecranPou);
//	    this.add(panPouDes);
//	    this.add(ecranPouDes);
		
		
	}
	
	public Department getDep() {
		return dep;
	}

	public Pouvoir getPou() {
		return pou;
	}
}
