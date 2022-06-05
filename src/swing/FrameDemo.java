package swing;

import Package2.Frame_Demo2;

import javax.swing.*;
import java.awt.*;

public class FrameDemo extends JFrame{
    private ImageIcon icon1;
    private Container c;
    FrameDemo()
    {
        initcomponents();
    }
    public void initcomponents()
    {
        c = this.getContentPane();
        c.setBackground(Color.magenta);

        icon1 = new ImageIcon(getClass().getResource("FrameIcon.png"));
        this.setIconImage(icon1.getImage());
    }

    public static void main(String[] args) {
        FrameDemo frame =new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // frame.setSize(400,300);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200,50);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Frame_Demo");
        frame.setResizable(false);
    }
}
