// Custom Layout
import java.awt.*;
import java.awt.event.*;
public class LoginF extends Frame 
{
   Button b1 = new Button("Sign In");
   Button b2 = new Button("Exit");
   TextField t1 = new TextField();
   TextField t2 = new TextField();
   Label a1 = new Label("User Id");
   Label a2 = new Label("Password");

   LoginF()
   {
     setBackground(new Color(240,220,186));
     setLayout(null); //remove the default layout also - for set the custom layout 
     setFont(new Font("verdana",0,15));
     a1.setBounds(100,100,90,24);
     a2.setBounds(100,150,90,24);
     t1.setBounds(190,100,170,24);
     t2.setBounds(190,150,170,24);
     b1.setBounds(150,200,80,27);
     b2.setBounds(240,200,80,27);
     t2.setEchoChar('$'); // echo char = display char - for password field. 
     add(a1);
     add(a2);
     add(t1);
     add(t2);
     add(b1);
     add(b2);
     
     setResizable(false);
     setBounds(150,150,500,300);
     setVisible(true);
     addWindowListener(new Win()); 
   }
   class Win extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         dispose();
      }
   }
   
   public static void main(String aa[])
   {
      new LoginF();
   }
}

/* Agar class implements with Listener hai - 
      b1.addActionListener(this); 
   Agar class implements with Listener nahi ho raha hai to 
      addWindowListener(new Win());
 */

