package department;

public class Info extends Department{
 
	public Info(){
		super();
		this.setname("Genie Informatique");

		}
	public String get_description(){
		return "yeah,we are geek,we are strong in computer science...if the room is computer classroom,you will be stronger";
	}
	public  int attack(int numunite, String type)
	{
		if(type=="computer classroom")
			return numunite+1;
		
		else return numunite;
		
	}
	
	

}
