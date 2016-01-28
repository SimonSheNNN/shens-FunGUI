
		  
		 
	/**
	 * a class that inherit shape
	 * @author Simon
	 *
	 */  
	public class Rectangle extends shape{
		  
		double base;
		double height;
		 
		public Rectangle(){
			this.base=Math.random()*5;
			this.height=Math.random()*6;
		}
		  
		public String getArea() {
			Double number=0.5*base*height;
			return number.toString();
		}
		
		public String getSides(){
			Double base1=base;
			Double height1=height;
			String number2= base1.toString()+height1.toString();
			return number2;
		}
		
	}