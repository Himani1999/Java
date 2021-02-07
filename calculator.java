
import javax.swing.*;
import java.awt.*;

public class Calculator {
    JFrame frame;//Creating object of JFrame class
    Calculator()//Creating constructor of the class
    {
        prepareGUI();
    }
    public void prepareGUI()
    {
        frame=new JFrame();
        frame.setTitle("Calculator");//Setting title of the JFrame
        frame.setSize(300,490);//Setting size
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.getContentPane().setBackground(Color.black);//Setting Background Color
        frame.setResizable(false);//Preventing window from resizing
        frame.setLocationRelativeTo(null);//Setting location to the center of the screen
        frame.setVisible(true);//Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
    }
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
 
public class Calculator {
    JFrame frame;//Creating object of JFrame class
    Calculator()//Creating constructor of the class
    {
        prepareGUI();
    }
    public void prepareGUI()
    {
        frame=new JFrame();
        frame.setTitle("Calculator");//Setting title of the JFrame
        frame.setSize(300,490);//Setting size
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.getContentPane().setBackground(Color.black);//Setting Background Color
        frame.setResizable(false);//Preventing window from resizing
        frame.setLocationRelativeTo(null);//Setting location to the center of the screen
        frame.setVisible(true);//Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
    }
}