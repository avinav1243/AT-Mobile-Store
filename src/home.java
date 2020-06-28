import java.awt.*;
import javax.swing.*;

public class home extends JFrame
{
    JLabel l1 , l2, l3, l4;
    ImageIcon i;
    public home()
    {
        setLayout(null);
        i = new ImageIcon("back1.jpeg");
        l1 = new JLabel("AT");
        l2 = new JLabel("Mobile Store");
        //l3 = new JLabel("Store");
        l4 = new JLabel(i);
        setContentPane(l4);
        l1.setFont(new Font("Arial Black",Font.BOLD|Font.ITALIC,100));
        l2.setFont(new Font("Arial Black",Font.BOLD|Font.ITALIC,100));
        //l3.setFont(new Font("Arial Black",Font.BOLD,100));
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        //l3.setForeground(Color.white);
        //l4.setBounds(0, 0, 940, 540);
        l1.setBounds(350,0,200,200);
        l2.setBounds(50,350,1000,100);
        //add(l4);
        add(l1);
        add(l2);
        //add(l3);
    }

    public void nextscreen()
    {
        LoginSelection l = new LoginSelection();
        l.setBounds(650,200,500,500);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setTitle("Login Selection");
    }
    public static void main(String args[])
    {
        home h = new home();
        h.setBounds(650,200,940,540);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //h.getContentPane().setBackground(Color.BLACK);
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        h.dispose();
        h.nextscreen();
         

    }

}
