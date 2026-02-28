import javax.swing.*;
import java.awt.*;

public class RadiobuttonDemo extends JFrame {
    private Container c;
    private JRadioButton m,f;
    RadiobuttonDemo(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        m=new JRadioButton("Male");
        m.setBounds(20,50,100,50);
        c.add(m);

        f=new JRadioButton("Female");
        f.setBounds(150,50,100,50);
        c.add(f);

    }
    public static void main(String[] args) {
        RadiobuttonDemo frame=new RadiobuttonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,20,500,400);
        frame.setTitle("Radio Button Demo");
    }
}
