/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccrud;

import java.sql.*; 
import javax.swing.*; 
/**
 *
 * @author 2ndyrGroupA
 */
public class Create extends javax.swing.JFrame {

    /**
     * Creates new form Create
     */
    public Create() {
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

        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        crtCancel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname);
        firstname.setBounds(109, 57, 227, 33);
        getContentPane().add(lastname);
        lastname.setBounds(109, 97, 227, 33);
        getContentPane().add(age);
        age.setBounds(109, 136, 227, 33);
        getContentPane().add(address);
        address.setBounds(109, 180, 227, 33);
        getContentPane().add(gender);
        gender.setBounds(110, 240, 227, 33);

        jLabel1.setText("Lastname");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 100, 71, 25);

        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 190, 71, 27);

        jLabel3.setText("Firstname");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 62, 27);

        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 139, 34, 27);

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 240, 58, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Add information");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(91, 4, 326, 35);

        crtCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crtCancel.setText("Cancel");
        crtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtCancelActionPerformed(evt);
            }
        });
        getContentPane().add(crtCancel);
        crtCancel.setBounds(201, 327, 103, 38);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(315, 328, 103, 38);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 440, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void crtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtCancelActionPerformed
      landingPage home=new landingPage();
       home.show();
       dispose();
    }//GEN-LAST:event_crtCancelActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String Firstname=firstname.getText(),Lastname=lastname.getText(),Address=address.getText(),Gender=gender.getText();
        int Age= Integer.parseInt(age.getText());
        
        
        
        try {
           Class.forName("com.mysql.jdbc.Driver"); //load the driver
           Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.20:3306/employeecrud", "Guian", "2ndyrGroupA"); //establishes the connection
           Statement stmt = (Statement) con.createStatement(); //get the connection stream(connection port)
           String query = "INSERT INTO `employee` (`id`, `firstname`, `lastname`, `age`, `address`, `gender`) VALUES (NULL, '"+Firstname+"', '"+Lastname+"', '"+Age+"', '"+Address+"', '"+Gender+"');";
           stmt.executeUpdate(query);
       
           con.close();
       } catch (Exception e) {
           System.out.println(e);
       }
        
    JOptionPane.showMessageDialog(new JFrame(),"Employee Added Successfully!");
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton crtCancel;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastname;
    // End of variables declaration//GEN-END:variables
}
