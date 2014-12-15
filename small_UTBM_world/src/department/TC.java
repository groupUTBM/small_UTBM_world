package department;
import model.RoomType;
import model.Room;
public class TC extends Department{
public TC()
{
		super();
		this.setname("Tout Branche");
}
public String get_description()
{
		return "I'm new here";
}
public  int attack(int numunite, RoomType r)
{
		return numunite*1;
}
}
