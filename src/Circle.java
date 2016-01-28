/**
	 * a class that inherit shape
	 * @author Simon
	 *
	 */
public class Circle extends shape{
		  
		double radius; 
		 
		public Circle(String name){
			
			this.radius=Math.random()*5;
		}
		  
		public String getArea() {
			Double example;
			example = 3.14*radius*radius;//area of circle

			return example.toString();
		}
		
		public String getSides(){
			Double example2;
			example2=radius;
			return example2.toString();
		}
	}