/*
Programming Awt Concept

1. How to Display Frame Window in Awt
2. How to Display Frame Window in Awt (With Close Operation)
3. How to Display Component in Frame Window(Label,Textfield,Button)

*/




//Step 1:

import javax.swing.*;
import java.awt.event.*;




//Step 2: 
public class Template extends JFrame
{
    Template()
    {
      setTitle("Swing Frame Window");
      setBounds(10,10,900,700);
      setVisible(true);
	  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   } 
	  
	  
	  
 //Step 3
    public static void main(String aa[])
    {
     
      new Template();
    }
}