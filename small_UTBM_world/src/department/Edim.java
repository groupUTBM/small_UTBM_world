package department;
import model.RoomType;
import model.Room;
public class Edim extends Department{
	 
public Edim()
{
	    super();
		this.setname("EDIM");
		
}
public String get_description()
{
		return "Ergonomie, Design et Ing¨¦nierie M¨¦canique ";
}
public  int attack(int numunite, RoomType r)
{
		int n;
    	if(r == RoomType.BAR)
        n=2*numunite;
    	else n=1*numunite;
    	return n;
}
}