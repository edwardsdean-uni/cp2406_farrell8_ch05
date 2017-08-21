// DebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class DebugFive4
{
   public static void main (String args[]) 
   {
      int one, two, three, four;
      String str, output;
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      one = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      three = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      four = Integer.parseInt(str);
      int largest = Collections.max(Arrays.asList(one, two, three, four));
      output = "Highest is " + largest;
      JOptionPane.showMessageDialog(null, output);
   }
}


