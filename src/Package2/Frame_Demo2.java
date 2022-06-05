package Package2;

import javax.swing.*;

public class Frame_Demo2 extends JFrame{
        Frame_Demo2()
        {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(50,100,400,500);
            setTitle("This is title");
        }

    public static void main(String[] args) {
        Frame_Demo2 frame = new Frame_Demo2();
        frame.setVisible(true);

    }
}