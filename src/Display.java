import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Display extends JPanel implements ActionListener{

	//inits
	private JButton print1;
	private JButton print2;
	private JButton print3;
	private JLabel label;
	
	
	/**
	 * Display constructor, 
	 */
	public Display(){
		print1=new JButton("circle");
		print2=new JButton("rectangle");
		print3=new JButton("triangle");
		label=new JLabel("press the button to choose shape and see its area!");
		
		//set window size
		setPreferredSize(new Dimension(245,136));
		
		setLayout(null);
		
		add(print1);
		add(print2);
		add(print3);
		add(label);
			
		print1.setBounds(70,10,100,25);
		print2.setBounds(110,30,100,25);
		print3.setBounds(30,30,100,25);
		label.setBounds(20,45,210,35);
	
		print1.addActionListener(this);
		print2.addActionListener(this);
		print3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==print1){
			Circle one= new Circle("x");
			this.label.setText( one.getArea() +"   "+ one.getSides());
		}
		if(e.getSource()==print2){
			Triangle two= new Triangle();
			this.label.setText( two.getArea() +"   "+ two.getSides());
		}
		if(e.getSource()==print3){
			Rectangle three= new Rectangle();
			this.label.setText( three.getArea() +"     "+ three.getSides());
		}
		
	}
	
	
	
	
	
	
		  
		 
	
	
	
	
	

	
}
