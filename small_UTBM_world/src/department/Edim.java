package department;

public class Edim extends Department{
	 
	public Edim(){
		super();
		this.setname("EDIM");

		}
	public String get_discription(){
		return " ";
	}
	public  int attack(int numunite, String type)
	{
		if(type==" ")
			return numunite+1;
		
		else return numunite;
		
	}
}