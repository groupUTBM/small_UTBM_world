package department;


	public class EE extends department{
		 
		public EE(){
			super();
			this.setname("ENERGY AND ENVIRONEMENT");

			}
		public String get_discription(){
			return "Hello young man,you should protect our environement...";
		}
		public  int attack(int numunit¨¦, String type)
		{
			if(type=="lawn")
				return numunit¨¦+1;
			
			else return numunit¨¦;
			
		}
}
