package model;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import pouvoir.Pouvoir;
import pouvoir.Drunkard;
import view.MouseEffectComponent;
import department.Department;
import department.TC;
import department.Utseus;
import divers.ConquestFailed;


public class Player  {
   private String name;
   private Department dep;
   private Pouvoir pouv;
   private ArrayList<Room> rooms;
   private ArrayList<Room> declinedRooms;
   private int nbRooms;
   private int nbDeclinedRooms;
   private ArrayList<Pawn> pawnsInHand;
   private int nbPawnsInHand;
   private int victoryPt;
   private MouseEffectComponent mec;
   private Color color;
   
   
   public Player(String s){
	   nbPawnsInHand=50;
	   victoryPt=0;
	   name=s;
	   dep=new Utseus();
	   rooms= new ArrayList<Room>();
	   nbRooms=0;
	   declinedRooms=new ArrayList<Room>();
	   nbDeclinedRooms=0;
	   pawnsInHand = new ArrayList<Pawn>();
	   for(int i=0;i<nbPawnsInHand;i++){
		   pawnsInHand.add(new Pawn(null,this));
	   }
	   color =  new Color(0,0,0);
	   
	   dep = new TC();
	   pouv = new Drunkard();
	   
   }
   
   public void declin(){
	   //au cas où l'utilisateur ait déjà un peuple en déclin, on vide ces salles
	   
	   for(int i = 0;i<nbDeclinedRooms;i++){
		   for(int j=0;j<declinedRooms.get(i).getNbUnits();j++){
			   declinedRooms.get(i).pullTopPawn();
		   }
	   }
	   int temp = nbRooms-1;
	   for(int i=0;i<=temp;i++){
		   declinedRooms.add(rooms.remove(temp-i));
		   declinedRooms.get(i).setOwner(NullPlayerSingleton.getInstance().getNullPlayer());
		   for(int j = 0;j<declinedRooms.get(i).getNbUnits()-1;j++){
			   declinedRooms.get(i).pullTopPawn();
		   }
	   }
	   nbRooms=rooms.size();
	   nbDeclinedRooms=declinedRooms.size();
   }
   public void becomeOwner(Room r){
	   r.setOwner(this);
	   rooms.add(r);
	   nbRooms=rooms.size();
   }
   public void abandonRoom(Room r){
	   
	   if(rooms.remove(r)){
		   NullPlayerSingleton.getInstance().getNullPlayer().becomeOwner(r);
		   nbRooms--;
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
   public void conquerRoom(Room r) throws ConquestFailed{
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
						   +r.getTopPawn().getPouvoir().bonusdefense(r)
						   -pouv.bonusattack(r)
						   -dep.attack(nbPawnsInHand, r.getRoomType());//rajouter le calcul du bonus ici
				   if(nbNeeded < 1){
					   nbNeeded=1;
				   }
				   if(nbPawnsInHand >= nbNeeded){
					   r.returnPawns();
					   for(int i=0 ; i<nbNeeded;i++){
						   r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
						   pawnsInHand.remove(pawnsInHand.size()-1);
					   }
					   nbPawnsInHand-=nbNeeded;
				   }
				   else if(nbPawnsInHand >= 1){//lancer de dé nécessaire
					   int randomInt;
					   Random rand = new Random();
					   randomInt = rand.nextInt(5);
					   if(nbPawnsInHand + randomInt >= nbNeeded){
						   r.returnPawns();
						   for(int i=0;i<nbPawnsInHand;i++){
							   r.addPawn(pawnsInHand.get(pawnsInHand.size()-1));
							   pawnsInHand.remove(pawnsInHand.size()-1);
						   }
						   nbPawnsInHand=0;
					   }
					   else{
						   throw new ConquestFailed(this, r);
					   }
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
	   if(dep!=null){
		   dep=d;
		   nbPawnsInHand=dep.get_numunite();
		   for(int i=0;i<nbPawnsInHand;i++){
			   pawnsInHand.add(new Pawn(null,this));
		   }
	   }

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
	   nbDeclinedRooms=declinedRooms.size();
	   for(int i=0;i<nbDeclinedRooms;i++){
		   points++;
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
	   int i=0;
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
