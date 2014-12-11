package department;
import model.RoomType;
import model.Room;
public class Utseus extends Department{
	 
	public Utseus(){
		super();
		this.setname("Universit¨¦ de Technologie Sino-Europ¨¦enne de l¡¯Universit¨¦ de Shanghai");

		}
	public String get_description(){
		return "Enegineer?No problem.Speak chinese,english,french?No problem.";
	}
	 public  int attack(int numunite, RoomType r)
	{
		 int n;
	    	if(RoomType.CHINESECLASS!= null)
	    		n=2*numunite;
	    	else n=1*numunite;
	    	return n;
		
	}
}