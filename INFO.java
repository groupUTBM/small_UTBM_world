package department;

public class INFO extends department{
 
	public INFO(){
		super();
		this.setname("Genie Informatique");

		}
	public String get_discription(){
		return "yeah,we are geek,we are strong in computer science...if the room is computer classroom,you will be stronger";
	}
	public  int attack(int numunit¨¦, String type)
	{
		if(type=="computer classroom")
			return numunit¨¦+1;
		
		else return numunit¨¦;
		
	}
	
	

}
