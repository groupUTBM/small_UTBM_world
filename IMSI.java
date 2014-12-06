package department;


	public class IMSI extends department{
		 
		public IMSI(){
			super();
			this.setname("ing¨¦nierie et management des syst¨¨mes industriels");

			}
		public String get_discription(){
			return "Come here,and i will lead you to do your job";
		}
		public  int attack(int numunit¨¦, String type)
		{
			if(type=="machine")
				return numunit¨¦+1;
			
			else return numunit¨¦;
			
		}
}
