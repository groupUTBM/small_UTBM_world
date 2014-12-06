package department;

public class UTSEUS extends department{
	 
	public UTSEUS(){
		super();
		this.setname("Universit¨¦ de Technologie Sino-Europ¨¦enne de l¡¯Universit¨¦ de Shanghai");

		}
	public String get_discription(){
		return "Enegineer?No problem.Speak chinese,english,french?No problem.";
	}
	public  int attack(int numunit¨¦, String type)
	{
		if(type=="chinese class")
			return numunit¨¦+2;
		
		else return numunit¨¦;
		
	}
}