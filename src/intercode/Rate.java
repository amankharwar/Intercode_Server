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
public class Rate extends javax.swing.JFrame {

    /**
     * Creates new form Rate
     */
    public Rate() {
        initComponents();
    }

    static String fname ="";
    static String lname = "";
    static String ques = "";
    static String rate = "";
    static String registration = "";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        lname_field = new javax.swing.JTextField();
        rate_field = new javax.swing.JTextField();
        ques_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        reg_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 150, 542, 551));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 106, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reg. No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 40));

        fname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 160, 40));
        getContentPane().add(lname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 160, 40));
        getContentPane().add(rate_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 160, 40));
        getContentPane().add(ques_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 115, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Score  : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 100, 40));

        submit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 51, 0));
        submit.setText("Submit");
        submit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 120, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("DATA OF INTERVIEWEE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 410, 50));
        getContentPane().add(reg_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 160, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ques Solved");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 115, 34));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intercode/ak.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_fieldActionPerformed

    
     boolean check(int reg)
    {
        PreparedStatement ps ;
        ResultSet rs;
        boolean checker = false;
        
        String query = "SELECT * FROM `score` WHERE `user_reg` =?";
        
         try {
            
             ps = MyConnection.getConnection().prepareStatement(query);
             
            ps.setInt(1,reg);
            
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checker = true;
                
            }
           
             
        } catch (Exception e) {
        }
         
        return checker;
        
    }
    
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        int count=0;
        fname = fname_field.getText();
        lname = lname_field.getText();
        ques = ques_field.getText();
        
        int score ;
        int ques_solved;
        rate = rate_field.getText();
       
        registration = reg_field.getText();
        int reg;
        
        
        if(fname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the first name.");
            return;
        }
        
        
        
        else  {
            count++;
        }
        
        
        
        
        if(lname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the last name.");
            return;
        }
           else  {
            count++;
        }
        
      // registration = reg_field.getText();
        
        if(registration.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the registration number.");
            return;
        }
           else  {
            
            reg = Integer.parseInt(registration);
            count++;
        }
        
        if(check(reg))
        {
            JOptionPane.showMessageDialog(null, "This registration numbers already exist");
            return;
        }
            
        
        if(ques.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the number of questions solved.");
            return;
        }
           else  {
            ques_solved = Integer.parseInt(ques);
            count++;
        }
        
        if(rate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the score.");
            return;
        }
        
           else  {
             score = Integer.parseInt(rate);
            count++;
        }
        
        
        if(count ==5)
        {
            System.out.println("above preparedstatement");
                PreparedStatement ps ;
         String query = "INSERT INTO `score`(`user_fname`, `user_lname`, `user_reg`, `user_solved`, `user_score`) VALUES (?,?,?,?,?)";
        
        
         
         try {
            
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setInt(3, reg);
            ps.setInt(4, ques_solved);
            ps.setInt(5, score);
           
            
          /* fnamefield.setText("");
           lnamefield.setText("");
           usernamefield.setText("");
           passfield.setText("");
           repassfield.setText("");
           mailfield.setText("");
            */
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "Data is added");
            }
            
            
            
        } catch (Exception e) {
        }
        
         
        }
         
         
        
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lname_field;
    private javax.swing.JTextField ques_field;
    private javax.swing.JTextField rate_field;
    private javax.swing.JTextField reg_field;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
