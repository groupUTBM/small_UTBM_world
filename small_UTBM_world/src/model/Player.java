package model;
import java.awt.Color;
import java.util.ArrayList;

import view.MouseEffectComponent;
import department.Department;
import department.Utseus;


public class Player  {
   private String name;
   private Department depa;
   private ArrayList<Room> rooms;
   private int nbRooms;
   private ArrayList<Pawn> pawnsInHand;
   private int nbPawnsInHand=100;
   private int i;
   private MouseEffectComponent mec;
   private Color color;
   
   public void setdepartment(Department d){
	  depa=d;
   }
   public Player(String s){
	   name=s;
	   depa=new Utseus();
	   rooms= new ArrayList<Room>();
	   pawnsInHand = new ArrayList<Pawn>();
	   for(i=0;i<nbPawnsInHand;i++){
		   pawnsInHand.add(new Pawn(null,this));
	   }
	   color =  new Color(0,0,0);
   }
   
   public void declin(){
	   
   }
   public void becomeOwner(Room r){
	   r.setOwner(this);
	   rooms.add(r);
	   nbRooms=rooms.size();
   }
   public void abandonRoom(Room r){
	   
	   if(rooms.remove(r)){
		   NullPlayerSingleton.getInstance().getNullPlayer().becomeOwner(r);
		   nbRooms=rooms.size();
	   }
   }
   public void takePawn(Room r){
	   if (r.getNbUnits()> 0 && r.getOwner() == this){
		   pawnsInHand.add(r.pullTopPawn());
		   nbPawnsInHand++;
		   if(mec != null)
		   mec.updateNb(nbPawnsInHand);
	   }
	   nbRooms=rooms.size();
   }
   public void putPawn(Room r){
	   if(r.getOwner()==this){
		   if(nbPawnsInHand >= 1){
		   r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
		   pawnsInHand.remove(pawnsInHand.size()-1);
		   nbPawnsInHand--;
		   }
		   if(mec != null)
			   mec.updateNb(nbPawnsInHand);
	   }
//	   else if(r.getNbUnits() == 0){
//		   if(nbPawnsInHand >= 1){
//			   r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
//			   pawnsInHand.remove(pawnsInHand.size()-1);
//			   nbPawnsInHand--;
//			   }
//			   if(mec != null)
//				   mec.updateNb(nbPawnsInHand);
//	   }
	   
   }
   public void conquerRoom(Room r){
	   if(canConquer(r)){
		   if(r.getNbUnits() == 0){
			   if(nbPawnsInHand >= 2){
				    r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
				    r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
				    pawnsInHand.remove(pawnsInHand.size()-1);
				    pawnsInHand.remove(pawnsInHand.size()-1);
				    nbPawnsInHand-=2;
				   }
			   }
			   else if(r.getOwner() != this){
				   int nbNeeded = 2+r.getNbUnits();//rajouter le calcul du bonus ici
				   
				   if(nbPawnsInHand >= nbNeeded){
					   r.returnPawns();
					   for(i=0 ; i<nbNeeded;i++){
						   r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
						   pawnsInHand.remove(pawnsInHand.size()-1);
					   }
					   nbPawnsInHand-=nbNeeded;
				   }
			   }
		   nbRooms=rooms.size();
	   }
	   if(mec != null)
		   mec.updateNb(nbPawnsInHand);
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
   //Fonctions à usage interne
   private boolean canConquer(Room r){
	   System.out.println("can has?");
	   boolean conquerable = false;
	   nbRooms = rooms.size();
	   i=0;
	   while(i < nbRooms && rooms.get(i) != r){
		  System.out.println(rooms.get(i).getPosX()+" "+rooms.get(i).getPosY());
		   if(r.isAdjacent(rooms.get(i))){
			   System.out.println("adjacent");
			   conquerable = true;
		   }
		   i++;
	   }
	   if(i == nbRooms && conquerable == true){
		   System.out.println("ok");
		   return conquerable;
	   }
	   else if (r.isBorder() && r.getOwner() != this){
		   return true;
	   }
	   else
		   return false;
   }
   
}
