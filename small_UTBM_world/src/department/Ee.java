package department;
import model.RoomType;
import model.Room;

public class Ee extends Department{
		 
public Ee()
{
		super();
		this.setname("ENERGY AND ENVIRONEMENT");
}
public String get_description()
{
		return "Hello young man,you should protect our environement...";
}
public  int attack(int numunite, RoomType r)        //si le room est GRASS,il a un avantage
{
	    int n;
		if(r==RoomType.GRASS)
		n=2*numunite;
		else n=1*numunite;
		return n;
}
}
