package department;


	public class Imsi extends Department{
		 
		public Imsi(){
			super();
			this.setname("ing¨¦nierie et management des syst¨¨mes industriels");

			}
		public String get_discription(){
			return "Come here,and i will lead you to do your job";
		}
		public  int attack(int numunite, String type)
		{
			if(type=="machine")
				return numunite+1;
			
			else return numunite;
			
		}
}
