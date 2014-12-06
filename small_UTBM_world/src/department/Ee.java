package department;


	public class Ee extends Department{
		 
		public Ee(){
			super();
			this.setname("ENERGY AND ENVIRONEMENT");

			}
		public String get_discription(){
			return "Hello young man,you should protect our environement...";
		}
		public  int attack(int numunite, String type)
		{
			if(type=="lawn")
				return numunite+1;
			
			else return numunite;
			
		}
}
