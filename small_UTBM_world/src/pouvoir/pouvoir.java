package pouvoir;

import model.RoomType;
import model.Room;
public abstract class pouvoir {
	protected int peoplecarry;
	protected String name;
	protected String description;
abstract public  int bonusattack(RoomType r);
abstract public   int bonusdefense(RoomType r);
abstract public   int peoplecarry(RoomType r);
abstract public int gainbonus(RoomType r);
pouvoir()
{
		name="";
		description="";
		peoplecarry=0;
}
public void setname(String s)
{
		this.name=s;	
}
public void setdescription(String s)
{
		this.description=s;
}
public void setpeoplecarry(int a)
{
		this.peoplecarry=a;
}
public String getname()
{
		return this.name;
}
public String getdescription()
{
		return this.description;
}
public int getpeoplecarry()
{
		return this.peoplecarry;
}
public boolean canattack(Room from, Room to)    //ce fonction est pour juger le pion peut deplacer de un room ид un autre
{
	   if((Math.pow(Math.abs(from.getRoomPanel().getPosX()-to.getRoomPanel().getPosX()),2.0)+Math.pow(Math.abs(from.getRoomPanel().getPosY()-to.getRoomPanel().getPosY()),2.0)<=25))
       return true;
	   else 
	   return false;
}
}


