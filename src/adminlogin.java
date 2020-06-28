import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adminlogin extends JFrame
{
JLabel l1 , l2, l3 ;
JPasswordField p1 , p2;
JButton b1, b2;
ImageIcon i;
public adminlogin()
    {
    setLayout(null);
    l1 = new JLabel("Username:");
    l2 = new JLabel("Password:");
    p1 = new JPasswordField();
    p2 = new JPasswordField();
    b1 = new JButton("Login");
    b2 = new JButton("Back");
    i = new ImageIcon("adminlogin.png");
    l3 = new JLabel(i);
    setContentPane(l3);
    b1.addActionListener(new ActionListener()
                        {
                        public void actionPerformed(ActionEvent ae)
                            {
                            String u,p;
                            u=p1.getText();
                            p=p2.getText();
                            if((u.equals("username"))&&(p.equals("password")))
                            {
                                new AdminHome().setVisible(true);
                                dispose();
                            }
                            else

                                JOptionPane.showMessageDialog(null, "Invalid Username or Password");

                            }
                        });
    b2.addActionListener(new ActionListener()
                        {
                         public void actionPerformed(ActionEvent ae)
                            {
                             dispose();
                             LoginSelection l = new LoginSelection();
                             l.setBounds(650,200,500,500);
                             l.setVisible(true);
                             l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                             l.setTitle("Login Selection");
                         }
                        });
    l1.setFont(new Font("Arial Black",Font.BOLD,20));
    l2.setFont(new Font("Arial Black",Font.BOLD,20));
    l1.setBounds(100, 100, 150, 50);
    l2.setBounds(100, 200, 150, 50);
    p1.setBounds(250, 100, 100, 50);
    p2.setBounds(250, 200, 100, 50);
    b1.setBounds(150,300,100,30);
    b2.setBounds(250,300,100,30);
    add(l1);
    add(l2);
    add(p1);
    add(p2);
    add(b1);
    add(b2);
    }
public static void main(String args[])
    {
    adminlogin a = new adminlogin();
    a.setVisible(true);
    a.setSize(500,500);
    a.setBounds(650, 200, 500, 500);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    a.setTitle("Login as Admin");
}

}
