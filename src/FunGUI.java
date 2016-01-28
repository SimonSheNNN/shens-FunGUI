import javax.swing.JFrame;

public class FunGUI {
	
	public static void main(String [] args){
		JFrame frame=new JFrame("the shapes!");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//inits the display and populates the frame
		frame.getContentPane().add(new Display());
		
		//places the buttons where we told it to
		frame.pack();
		
		frame.setVisible(true);
	}
	

}
