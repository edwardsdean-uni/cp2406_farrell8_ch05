import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class Even_odd {
    public static void main (String args[])
    {
        int num;
        String str, output;
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        num = Integer.parseInt(str);

        if (num % 2 == 0){
            output = "even";
        }
        else {
            output = "odd";
        }
        JOptionPane.showMessageDialog(null, "Number is " + output);
    }
}
