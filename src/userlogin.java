import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class userlogin extends JFrame
{
JLabel l1 , l2, l3 ;
JTextField txtusername;
JPasswordField txtpassword;
JButton b1, b2;
ImageIcon i;
public userlogin()
    {
    setLayout(null);
    l1 = new JLabel("UserID:");
    l2 = new JLabel("Password:");
    txtusername = new JTextField();
    txtpassword = new JPasswordField();
    b1 = new JButton("Login");
    b2 = new JButton("Back");
    i = new ImageIcon("adminlogin.png");
    l3 = new JLabel(i);
    setContentPane(l3);
    b1.addActionListener(new ActionListener()
                        {
                        public void actionPerformed(ActionEvent ae)
                            {
                             try
                             {
                                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                 Connection con = DriverManager.getConnection("jdbc:odbc:atmobilestoredsn");
                                 Statement stmt = con.createStatement();
                                 String query = "select * from tbluser where UserID='"+txtusername.getText() +"' and Password='"+txtpassword.getText()+"'";
                                 ResultSet rs = stmt.executeQuery(query);
                                 if(rs.next())
                                 {
                                   new UserHome().setVisible(true);
                                   dispose();
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                                 }
                             }
                             catch(Exception e)
                             {
                                 JOptionPane.showMessageDialog(null, e);
                             }
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
    txtusername.setBounds(250, 100, 100, 50);
    txtpassword.setBounds(250, 200, 100, 50);
    b1.setBounds(150,300,100,30);
    b2.setBounds(250,300,100,30);
    add(l1);
    add(l2);
    add(txtusername);
    add(txtpassword);
    add(b1);
    add(b2);
    }
public static void main(String args[])
    {
    userlogin a = new userlogin();
    a.setVisible(true);
    a.setSize(500,500);
    a.setBounds(650, 200, 500, 500);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    a.setTitle("Login as User");
}

}