package department;

public abstract class department {

		
		protected int numunit¨¦;
		protected String name;
		protected String discription;
		
		public department(){
			
			numunit¨¦ =0;
			name = ""; 
			discription="";
		}
			
	 public String get_name(){
			return name;
		}
	 public void setname(String n){
		 this.name=n;
	 }
		public int get_numunit¨¦(){
			
			return numunit¨¦;
		}
		public abstract String get_discription();
	
		
				
		public abstract int attack(int numunit¨¦, String type);
		public int calculbonus(){
			int bonus;
			bonus=this.numunit¨¦*10;
			return bonus;
		}
		
		
		
	
	}

