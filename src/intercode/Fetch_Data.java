/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author amank
 */
public class Fetch_Data extends javax.swing.JFrame {

    /**
     * Creates new form Fetch_Data
     */
    public Fetch_Data() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        lname_field = new javax.swing.JTextField();
        rate_field = new javax.swing.JTextField();
        ques_field = new javax.swing.JTextField();
        reg_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Retreive = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 570, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("DATA OF INTERVIEWEE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 23, 410, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 221, 106, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reg. No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 151, 110, 40));

        fname_field.setEditable(false);
        fname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 221, 160, 40));

        lname_field.setEditable(false);
        getContentPane().add(lname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, 40));

        rate_field.setEditable(false);
        getContentPane().add(rate_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 431, 160, 40));

        ques_field.setEditable(false);
        getContentPane().add(ques_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 361, 160, 40));
        getContentPane().add(reg_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 153, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 291, 115, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Score  : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 431, 100, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ques Solved");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 371, 115, 34));

        Retreive.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Retreive.setForeground(new java.awt.Color(255, 0, 0));
        Retreive.setText("Retrieve");
        Retreive.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        Retreive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetreiveActionPerformed(evt);
            }
        });
        getContentPane().add(Retreive, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 100, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText("Enter Reg. No. and then click on Retreive Button below.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 91, 380, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intercode/ak.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_fieldActionPerformed

    private void RetreiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetreiveActionPerformed
        // TODO add your handling code here:
        
        
        PreparedStatement ps ;
        ResultSet rs;
        boolean checker = false;
        
        String query = "SELECT * FROM `score` WHERE `user_reg` =?";
        
         try {
            
             int flag =0;
             ps = MyConnection.getConnection().prepareStatement(query);
             
             String registration = reg_field.getText();
             int reg = Integer.parseInt(registration);
            ps.setInt(1,reg);
            
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               
                fname_field.setText(rs.getString("user_fname"));
                lname_field.setText(rs.getString("user_lname"));
                ques_field.setText(rs.getString("user_solved"));
                rate_field.setText(rs.getString("user_score"));
                
                flag =1;
                
                
            }
            
            if(flag==0)
            {
                JOptionPane.showMessageDialog(null, "Registration nuumber not found.");
                 fname_field.setText("");
                lname_field.setText("");
                ques_field.setText("");
                rate_field.setText("");
                return;
            }
           
             
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_RetreiveActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retreive;
    private javax.swing.JTextField fname_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lname_field;
    private javax.swing.JTextField ques_field;
    private javax.swing.JTextField rate_field;
    private javax.swing.JTextField reg_field;
    // End of variables declaration//GEN-END:variables
}
