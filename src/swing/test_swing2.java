package swing;

import javax.swing.*;

public class test_swing2 {
    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null,"Ener your first name : ",
                " this is a title",2);
        String l_name = JOptionPane.showInputDialog("Enter your lust name= ");

        String name= f_name + " " +l_name;

        JOptionPane.showMessageDialog(null,"Your name is : "+ name);
    }
}
