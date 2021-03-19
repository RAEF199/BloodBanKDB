/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author shere
 */
public class Blood_bag extends javax.swing.JFrame {

    final void fill_list() {
        try {
//step1 load the driver class  
            Class.forName("oracle.jdbc.OracleDriver");
//step2 create  the connection object  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
//step3 create the statement object  
            Statement stm = con.createStatement();
            String query = "Select BLOOD_ID from sys.BLOOD_BAG";
            ResultSet rs = stm.executeQuery(query);
            DefaultListModel dlm = new DefaultListModel();
            while (rs.next()) {
                dlm.addElement(rs.getString(1));
            }
            BIDList.setModel(dlm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Creates new form Blood_bag
     */
    public Blood_bag() {
        initComponents();
        setLocationRelativeTo(null);
        fill_list();
    }

    /**
     * This method is called from within the constructor to the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated
     * by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BQx = new javax.swing.JLabel();
        BPx = new javax.swing.JLabel();
        IDx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDxx = new javax.swing.JTextField();
        BQxx = new javax.swing.JTextField();
        BPxx = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BIDList = new javax.swing.JList<>();
        add = new javax.swing.JButton();
        delet = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BQx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BQx.setText("Blood quantity (ml)");

        BPx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BPx.setText("Blood product");

        IDx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IDx.setText("Blood ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Blood Bag");

        BQxx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQxxActionPerformed(evt);
            }
        });

        BIDList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                BIDListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(BIDList);

        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delet.setText("DELETE");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDx, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQx)
                    .addComponent(BPx, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDxx, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(BQxx)
                            .addComponent(BPxx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDxx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BQx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BQxx, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BPx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BPxx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BQxxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQxxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BQxxActionPerformed

    private void BIDListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_BIDListValueChanged
        // TODO add your handling code here:
        try {
//step1 load the driver class  
            Class.forName("oracle.jdbc.OracleDriver");
//step2 create  the connection object  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
//step3 create the statement object  
            Statement stm = con.createStatement();
            String query = "Select BLOOD_ID,BLOOD_QUANTITY_ML,BLOOD_PRODUCT from sys.BLOOD_BAG where BLOOD_ID='" + BIDList.getSelectedValue() + "'";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                IDxx.setText(rs.getString(1));
                BQxx.setText(rs.getString(2));
                BPxx.setText(rs.getString(3));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_BIDListValueChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
            //step3 create the statement object
            Statement stm = con.createStatement();
            int ID = Integer.valueOf(IDxx.getText());
            int quan = Integer.valueOf(BQxx.getText());
            String query = "insert into sys.BLOOD_BAG values (" + ID + "," + quan + ",'" + BPxx.getText() + "')";
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "The BLOOD_BAG Is Added Succesfully");
            fill_list();
            IDxx.setText(null);
            BQxx.setText(null);
            BPxx.setText(null);

            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_addActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // TODO add your handling code here:
        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
            //step3 create the statement object
            Statement stm = con.createStatement();
            String query = "delete from sys.BLOOD_BAG where BLOOD_ID= '" + BIDList.getSelectedValue() + "'";
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "The BLOOD_BAG Is Deleted Succesfully");
            fill_list();
            IDxx.setText(null);
            BQxx.setText(null);
            BPxx.setText(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deletActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
            //step3 create the statement object
            Statement stm = con.createStatement();
            int ID = Integer.valueOf(IDxx.getText());
            int quan = Integer.valueOf(BQxx.getText());
            String query = "update sys.BLOOD_BAG set BLOOD_ID=" + ID + ", BLOOD_QUANTITY_ML=" + quan + ",BLOOD_PRODUCT='" + BPxx.getText() + "' where BLOOD_ID='" + BIDList.getSelectedValue() + "'";
            stm.execute(query);
            
            JOptionPane.showMessageDialog(null, "The BLOOD_BAG Is Updated Succesfully");
            fill_list();
            IDxx.setText(null);
            BQxx.setText(null);
            BPxx.setText(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        IDxx.setText(null);
        BQxx.setText(null);
        BPxx.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Blood_bag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blood_bag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blood_bag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blood_bag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blood_bag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> BIDList;
    private javax.swing.JLabel BPx;
    private javax.swing.JTextField BPxx;
    private javax.swing.JLabel BQx;
    private javax.swing.JTextField BQxx;
    private javax.swing.JLabel IDx;
    private javax.swing.JTextField IDxx;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton delet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
