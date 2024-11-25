import java.awt.Color;

import javax.swing.JFrame;

public class Driver02Frame
{
   public static void main (String[] args)
   {
   
      JFrame frame = new JFrame("Lab 02 Framing Pic");
      frame.setSize(800,800);
      frame.setLocation(100,50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      
      frame.setContentPane(new Panel02Frame());
      frame.setVisible(true);
   
   }
}  
