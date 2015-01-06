package model;
import java.awt.Color;
import java.util.ArrayList;

import pouvoir.Pouvoir;
import pouvoir.Drunkard;
import view.MouseEffectComponent;
import department.Department;
import department.TC;
import department.Utseus;


public class Player  {
   private String name;
   private Department dep;
   private Pouvoir pouv;
   private ArrayList<Room> rooms;
   private int nbRooms;
   private ArrayList<Pawn> pawnsInHand;
   private int nbPawnsInHand;
   private int i;
   private int victoryPt;
   private MouseEffectComponent mec;
   private Color color;
   
   
   public Player(String s){
	   nbPawnsInHand=50;
	   victoryPt=0;
	   name=s;
	   dep=new Utseus();
	   rooms= new ArrayList<Room>();
	   pawnsInHand = new ArrayList<Pawn>();
	   for(i=0;i<nbPawnsInHand;i++){
		   pawnsInHand.add(new Pawn(null,this));
	   }
	   color =  new Color(0,0,0);
	   
	   dep = new TC();
	   pouv = new Drunkard();
	   
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
				   int nbNeeded = 2+r.getNbUnits()
						   +r.getOwner().getPouvoir().bonusdefense(r)
						   -pouv.bonusattack(r)
						   -dep.attack(nbPawnsInHand, r.getRoomType());//rajouter le calcul du bonus ici
				   if(nbNeeded < 1){
					   nbNeeded=1;
				   }
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
   public void setdepartment(Department d){
	   if(dep!=null)
		  dep=d;
   }
   public Department getDepartment(){
	   return dep;
   }
   public void setPouvoir(Pouvoir p){
	   if(p!=null)
		   pouv=p;
   }
   public Pouvoir getPouvoir(){
	   return pouv;
   }
   public String getName(){
	   return name;
   }
   public int getVictoryPt(){
	   return victoryPt;
   }
   public void setVictoryPt(int points){
	   victoryPt=points;
   }
   public int computePoints(){
	   int points=0;
	   for(int i=0;i<nbRooms;i++){
		   points+=1+pouv.gainbonus(rooms.get(i));
	   }
	   return points;
   }
   public void setColor(Color c){
	   color=c;
   }
   public Color getColor(){
	   return color;
   }
   //Fonctions  d'usage interne
   private boolean canConquer(Room r){
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
