package department;
import model.RoomType;
import model.Room;
public class Info extends Department{
 
	public Info(){
		super();
		this.setname("Genie Informatique");

		}
	public String get_description(){
		return "yeah,we are geek,we are strong in computer science...if the room is computer classroom,you will be stronger";
	}
	 public  int attack(int numunite, RoomType r)
	{
		 int n;
	    	if(RoomType.COMPUTERROOM!= null)
	    		n=2*numunite;
	    	else n=1*numunite;
	    	return n;
		
	}
	
	

}
