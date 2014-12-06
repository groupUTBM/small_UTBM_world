package model;
import java.util.ArrayList;

import department.Department;
import department.Utseus;


public class Player  {
   private String nom;
   private int note=0;
   private int numunite;
   private Department depa;
   private ArrayList<Room> room;
  public void setdepartment(Department d){
	  depa=d;
  }
   public Player(String s){
	   nom=s;
	   depa=new Utseus();
	   
   }

 public void deplacer(Room r1,Room r2 ){
	 
	   }
   public void declin(){
	   
   }
   



}
