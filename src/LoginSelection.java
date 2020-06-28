import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class LoginSelection extends JFrame
{
    JButton adm, user;
    JLabel l1;
    ImageIcon i;
    public LoginSelection()
    {
        i = new ImageIcon("loginselection.jpg");
        l1 = new JLabel(i);
        setContentPane(l1);
        setLayout(null);
        adm = new JButton("Login As ADMIN");
        user = new JButton("Login As USER");
        adm.addActionListener(new ActionListener()
                             {
                              public void actionPerformed(ActionEvent ae)
                                 {
                                  dispose();
                                  adminlogin a = new adminlogin();
                                  a.setVisible(true);
                                  a.setSize(500,500);
                                  a.setBounds(650, 200, 500, 500);
                                  a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                  a.setTitle("Login as Admin");
                              }
                             });
        user.addActionListener(new ActionListener()
                              {
                               public void actionPerformed(ActionEvent ae)
                                  {
                                   userlogin a = new userlogin();
                                   a.setVisible(true);
                                   a.setSize(500,500);
                                   a.setBounds(650, 200, 500, 500);
                                   a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                   a.setTitle("Login as User");
                                  }
                              });

        adm.setBounds(150, 100, 150, 50);
        user.setBounds(150, 200, 150, 50);
        add(adm);
        add(user);
    }
    public static void main(String args[])
    {
        LoginSelection l = new LoginSelection();
        l.setBounds(650,200,500,500);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setTitle("Login Selection");

    }

}