package model;
import java.awt.Color;
import java.util.ArrayList;

import view.MouseEffectComponent;
import department.Department;
import department.Utseus;


public class Player  {
   private String name;
   private int note=0;
   private Department depa;
   private ArrayList<Room> rooms;
   private int nbRooms;
   private ArrayList<Pawn> pawnsInHand;
   private int nbPawnsInHand=0;
   private int i;
   private MouseEffectComponent mec;
   private Color color=new Color(0,0,0);
   
   public void setdepartment(Department d){
	  depa=d;
   }
   public Player(String s){
	   name=s;
	   depa=new Utseus();
	   rooms= new ArrayList<Room>();
	   pawnsInHand = new ArrayList<Pawn>();
   }
   
   public void declin(){
	   
   }
   public boolean isOwner(Room r){
	   i=0;
	   rooms.add(r);//temporary,
	   nbRooms=rooms.size();//temporary
	   while(i < nbRooms && r != rooms.get(i)){
		   i++;
	   }
	   if(i == nbRooms)
		   return false;
	   else
		   return true;
   }
   public void takePawn(Room r){
	   pawnsInHand.add(r.pullTopPawn());
	   nbPawnsInHand++;
	   if(mec != null)
		   mec.updateNb(nbPawnsInHand);
   }
   public void putPawn(Room r){
	   if(nbPawnsInHand >= 1){
		   r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
		   pawnsInHand.remove(pawnsInHand.size()-1);
		   nbPawnsInHand--;
	   }
	   if(mec != null)
		   mec.updateNb(nbPawnsInHand);
   }
   public void abandonRoom(Room r){
	   rooms.remove(r);
	   r.getRoomPanel().setBackground(Color.yellow);
   }
   public void putBackPawns(){
//	   todo
   }
   public void setMec(MouseEffectComponent mouseEffectComponent){
	   mec=mouseEffectComponent;
	   mec.updateNb(nbPawnsInHand);
	   mec.setColor(color);
   }
   
   public String getName(){
	   return name;
   }
   public void setColor(Color c){
	   color=c;
   }
   public Color getColor(){
	   return color;
   }
   
}
