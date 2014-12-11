package department;
import model.RoomType;
import model.Room;
public abstract class Department {

		
		protected int nbPawn;
		protected String name;
		protected String description;
		
		public Department(){
			
			nbPawn =0;
			name = ""; 
			description="";
		}
			
	 public String get_name(){
			return name;
		}
	 public void setname(String n){
		 this.name=n;
	 }
		public int get_numunite(){
			
			return nbPawn;
		}
		public abstract String get_description();
	
		
				
		abstract public  int attack(int numunite, RoomType r);
		public int calculbonus(){
			int bonus;
			bonus=this.nbPawn*10;
			return bonus;
		}
		
		
		
	
	}

