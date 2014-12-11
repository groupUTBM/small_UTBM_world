package pouvoir;
import pion.pion;
import model.RoomType;
import model.Map;
public abstract class pouvoir {
	protected int peoplecarry;
	protected String name;
	protected pion p;
	protected String description;
	abstract public  int bonusattack(RoomType r);
	abstract public   int bonusdefense(RoomType r);
	abstract public   int peoplecarry(RoomType r);
	abstract public int gainbonus(RoomType r);
	pouvoir(){
		name="";
		description="";
		peoplecarry=0;
		p=null;
	}
	public void setname(String s){
		this.name=s;
		
	}
	public void setdescription(String s){
		this.description=s;
	}
	public void setpeoplecarry(int a){
		this.peoplecarry=a;
	}
	public String getname(){
		return this.name;
	}
	public String getdescription(){
		return this.description;
	}
	public int getpeoplecarry(){
		return this.peoplecarry;
	}
	
	}

