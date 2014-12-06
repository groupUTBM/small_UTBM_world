package department;

public abstract class Department {

		
		protected int numunite;
		protected String name;
		protected String description;
		
		public Department(){
			
			numunite =0;
			name = ""; 
			description="";
		}
			
	 public String get_name(){
			return name;
		}
	 public void setname(String n){
		 this.name=n;
	 }
		public int get_numunite(){
			
			return numunite;
		}
		public abstract String get_description();
	
		
				
		public abstract int attack(int numunite, String type);
		public int calculbonus(){
			int bonus;
			bonus=this.numunite*10;
			return bonus;
		}
		
		
		
	
	}

