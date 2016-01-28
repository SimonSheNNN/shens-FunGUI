
	/**
	 * set up abstract class shape

	 *
	 */
	public abstract class shape{
		  
		public String name;
		 
		public void Shape(String name) {
		this.name=name;
		}
		  
		public String getName(){
		return name;
		}
		 
		public abstract String getArea();  //pass down to the inherited class to implement
		public abstract String getSides(); //same
	}