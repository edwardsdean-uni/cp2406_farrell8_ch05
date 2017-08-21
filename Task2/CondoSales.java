import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class CondoSales {
    public static void main (String args[]) {
        int num;
        double price;
        String str, output;
        str = JOptionPane.showInputDialog(null,"Enter an integer for the view you wnat\n 1 - park view\n 2 - golf course view\n 3 - lake view");
        num = Integer.parseInt(str);

        if (num == 1){
            price = 150000;
        }else if(num == 2){
            price = 170000;
        }else if(num == 3){
            price = 210000;
        }else {
            price = 0;
        }
        System.out.println(price);

    }
}
