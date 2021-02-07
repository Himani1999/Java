/*
Programming Swing Concept



2. How to Display Component in Frame Window(Button)

*/




//Step 1:

import javax.swing.*;
import java.awt.event.*;


//Step 2: 
public class ButtonSwing extends JFrame
{
	
	JButton bt = new JButton("Sign In");
	
     ButtonSwing ()
    {
      setTitle("Swing Frame Window");
      setBounds(10,10,900,700);
	  
	  bt.setBounds(130,100,250,60);
	  add(bt);
	  
      setVisible(true);
	 
	 //Step 3
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   } 
    public static void main(String aa[])
    {
     
      new  ButtonSwing ();
    }
}