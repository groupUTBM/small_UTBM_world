package department;

public class Utseus extends Department{
	 
	public Utseus(){
		super();
		this.setname("Universit¨¦ de Technologie Sino-Europ¨¦enne de l¡¯Universit¨¦ de Shanghai");

		}
	public String get_description(){
		return "Enegineer?No problem.Speak chinese,english,french?No problem.";
	}
	public  int attack(int numunite, String type)
	{
		if(type=="chinese class")
			return numunite+2;
		
		else return numunite;
		
	}
}