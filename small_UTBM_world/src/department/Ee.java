package department;
import model.RoomType;
import model.Room;

	public class Ee extends Department{
		 
		public Ee(){
			super();
			this.setname("ENERGY AND ENVIRONEMENT");

			}
		public String get_description(){
			return "Hello young man,you should protect our environement...";
		}
		 public  int attack(int numunite, RoomType r)		{
			 int n;
		    	if(RoomType.PAWN!= null)
		    		n=2*numunite;
		    	else n=1*numunite;
		    	return n;
			
		}
}
