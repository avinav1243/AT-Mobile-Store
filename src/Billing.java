import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Billing.java
 *
 * Created on 4 Jul, 2018, 12:34:28 AM
 */

/**
 *
 * @author Abhinav
 */
public class Billing extends javax.swing.JFrame {
String productid, brand, model;
double price, netamt, disc;
double tamt, fees;
    /** Creates new form Billing */
    public Billing(String pid, String br, String mo, int pr) {
        initComponents();
        productid = pid;
        brand = br;
        model = mo;
        price = pr;
        txtid.setText(productid);
        txtbrand.setText(br);
        txtmodel.setText(mo);
        txttamt.setText(""+pr);
        txtdiscp.setEnabled(false);

        getonum();
        getdate();
    }
        private void getdate()
    {
        Date d = new Date();
        txtdate.setText(""+d);
        /*Calendar cal = Calendar.getInstance();
        int d = cal.get(Calendar.DATE);
        int m = cal.get(Calendar.MONTH);
        int y = cal.get(Calendar.YEAR);
        txtdate.setText(""+d+"-"+m+"-"+y);*/
    }
        private void getonum()
    {
        try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con = DriverManager.getConnection("jdbc:odbc:atmobilestoredsn");
  Statement stmt= con.createStatement();
  String query = "select * from tblbill";
  ResultSet rs = stmt.executeQuery(query);
  int id = 1001;
  while(rs.next())
  {
      id++;
  }
  txtonum.setText("ATO"+id);
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtonum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbrand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtmid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttamt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdiscp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdisc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnetamt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblmemid = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setText("Billing");

        jLabel2.setText("Order Number");

        txtonum.setEditable(false);

        jLabel3.setText("Brand");

        txtbrand.setEditable(false);

        jLabel4.setText("Model");

        txtmodel.setEditable(false);

        jLabel5.setText("Biller Name");

        jLabel6.setText("Mobile Number");

        txtdate.setEditable(false);
        txtdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdate.setEnabled(false);
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Extended Warranty");
        jCheckBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox1FocusLost(evt);
            }
        });

        jCheckBox2.setText("Membership");
        jCheckBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox2FocusLost(evt);
            }
        });

        txtmid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmidMouseClicked(evt);
            }
        });
        txtmid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmidFocusLost(evt);
            }
        });

        jLabel7.setText("Total Amount");

        txttamt.setEditable(false);
        txttamt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Discount(%)");

        jLabel9.setText("Discount");

        txtdisc.setEditable(false);
        txtdisc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdisc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdiscMouseClicked(evt);
            }
        });
        txtdisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiscActionPerformed(evt);
            }
        });

        jLabel10.setText("Net Amount");

        txtnetamt.setEditable(false);
        txtnetamt.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtnetamt.setForeground(new java.awt.Color(255, 0, 0));
        txtnetamt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtnetamt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnetamtMouseClicked(evt);
            }
        });
        txtnetamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnetamtActionPerformed(evt);
            }
        });

        jLabel11.setText("Product ID");

        txtid.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buy Membership");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtmobile, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtmodel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtbrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtonum, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtdiscp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblmemid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtmid, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txttamt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtdisc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(txtnetamt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtonum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmemid, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtdiscp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txttamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtdisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtnetamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 new Membership().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtdiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiscActionPerformed

    private void txtdiscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiscMouseClicked
txtdisc.setText(""+((Integer.parseInt(txtdiscp.getText()))*price/100));        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiscMouseClicked

    private void txtnetamtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnetamtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnetamtMouseClicked

    private void jCheckBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox1FocusLost
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1FocusLost

    private void jCheckBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox2FocusLost
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2FocusLost

    private void txtmidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmidMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_txtmidMouseClicked

    private void txtnetamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnetamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnetamtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
tamt = Integer.parseInt(txttamt.getText());
if((jLabel12.getText()).equals("Approved"))
    disc = 0.05*price;
if(jCheckBox1.isSelected())
    fees = 0.1*price;

        txtnetamt.setText(""+(tamt-disc+fees));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtmidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmidFocusLost
        try
{
            Calendar cal = Calendar.getInstance();
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con = DriverManager.getConnection("jdbc:odbc:atmobilestoredsn");
  Statement stmt= con.createStatement();
  String query = "select * from tblmembership where MembershipID = '" + txtmid.getText() + "' && EndYear<"+cal.get(Calendar.YEAR);
  ResultSet rs = stmt.executeQuery(query);
  if(rs.next())
  {
      jLabel12.setText("Approved");
      txtdiscp.setText(""+10);
  }
  con.close();
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
}        // TODO add your handling code here:
    }//GEN-LAST:event_txtmidFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String extend = "";
String MID = "";
String mid = "";
Calendar cal = Calendar.getInstance();
int y = cal.get(Calendar.YEAR);

if(jCheckBox1.isSelected())
{
    extend = "Yes";
    y++;
        }
else
     extend = "No";
if((jLabel12.getText()).equals("Approved"))
{
    MID = txtmid.getText();
    mid = "Yes";
}
 else
     mid = "No";

try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con = DriverManager.getConnection("jdbc:odbc:atmobilestoredsn");
  Statement stmt= con.createStatement();
  String query = "insert into tblbill values('"+txtonum.getText()+"','"+txtid.getText()+"','"+txtmodel.getText()+"','"+txtbrand.getText()+"','"+
          txtname.getText()+"','"+txtmobile.getText()+"','"+txtdate.getText()+"',"+extend+","+mid+",'"+MID+"','"+txttamt.getText()+"','"+txtdisc.getText()+"','"+txtnetamt.getText()+"','"+y+"')";
  int x = stmt.executeUpdate(query);
  String query1 = "update tblstockdetails set quantity = quantity-1 where ProductID = '" + txtid.getText() + "'";
  int x1 = stmt.executeUpdate(query1);
  con.close();
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Billing b = new Billing("Null","Null","Null",0);
                b.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblmemid;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdisc;
    private javax.swing.JTextField txtdiscp;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnetamt;
    private javax.swing.JTextField txtonum;
    private javax.swing.JTextField txttamt;
    // End of variables declaration//GEN-END:variables

}
