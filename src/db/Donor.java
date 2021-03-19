/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author shere
 */
public class Donor extends javax.swing.JFrame {

    

     final void fill_list(){
        try{

                //step1 load the driver class  
                  Class.forName("oracle.jdbc.OracleDriver");  
                  //step2 create  the connection object  
                  Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE","system","fcit");  
                 //step3 create the statement object  
                   Statement stm=con.createStatement(); 
                   String query ="Select First_Name from sys.DONOR";
                  ResultSet rs = stm.executeQuery(query);
                   DefaultListModel dlm = new DefaultListModel();
                     while(rs.next()){
                      dlm.addElement(rs.getString(1));
                                  }
                    donorList.setModel(dlm);
                        } 
                     catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.toString());

                     }
        catch(Exception e){ System.out.println(e);} 
       
  
}  
    /**
     * Creates new form Donor
     */
    public Donor() {
        initComponents();
        setLocationRelativeTo(null);
        fill_list();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameM = new javax.swing.JTextField();
        nameL = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        nameF = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        healthStatus = new javax.swing.JTextField();
        bloodType = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        donorlist = new javax.swing.JScrollPane();
        donorList = new javax.swing.JList<>();
        Essn = new javax.swing.JLabel();
        essn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        empn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Middle name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Health status ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Blood type ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("      Donor Details");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Weight");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("First name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Middle name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Last name");

        nameM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameMActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        nameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFActionPerformed(evt);
            }
        });

        healthStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthStatusActionPerformed(evt);
            }
        });

        bloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeActionPerformed(evt);
            }
        });

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Email");

        ADD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
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

        donorList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                donorListValueChanged(evt);
            }
        });
        donorlist.setViewportView(donorList);

        Essn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Essn.setText("Employee in charge ID");

        essn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                essnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Employee name ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameM, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(update)
                                .addGap(43, 43, 43)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Essn)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(essn)
                                            .addComponent(empn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(healthStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(donorlist, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(152, 152, 152)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(healthStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(bloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(donorlist, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Essn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(essn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameMActionPerformed

    private void healthStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthStatusActionPerformed

    private void bloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTypeActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed

        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
            //step3 create the statement object
            Statement stm = con.createStatement();
            int phonee = Integer.valueOf(phone.getText());
            int idd = Integer.valueOf(id.getText());
            int weightt= Integer.valueOf(weight.getText());
            int agee= Integer.valueOf(age.getText());
            String query = "insert into sys.DONOR values ("+idd+",'"+nameF.getText()+"','"+nameM.getText()+"','"+nameL.getText()+"','"+gender.getText()+"','"+agee+"','"+phonee+"','"+email.getText()+"','"+weightt+"','"+bloodType.getText()+"','"+healthStatus.getText()+"',"+essn.getText()+")";
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "The Donor Is Added Succesfully");
            id.setText(null);
            nameF.setText(null);
            nameM.setText(null);
            nameL.setText(null);
            gender.setText(null);
            age.setText(null);
            phone.setText(null);
            email.setText(null);
            weight.setText(null);
            bloodType.setText(null);
            healthStatus.setText(null);
            essn.setText(null);
            fill_list();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
            //step3 create the statement object
            Statement stm = con.createStatement();
           int phonee = Integer.valueOf(phone.getText());
            int idd = Integer.valueOf(id.getText());
            int weightt= Integer.valueOf(weight.getText());
            int agee= Integer.valueOf(age.getText());
            String query = "delete from sys.DONOR where First_Name= '"+donorList.getSelectedValue()+"'";
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "The Donor Is Deleted Succesfully");
            id.setText(null);
            nameF.setText(null);
            nameM.setText(null);
            nameL.setText(null);
            gender.setText(null);
            age.setText(null);
            phone.setText(null);
            email.setText(null);
            weight.setText(null);
            bloodType.setText(null);
            healthStatus.setText(null);
            essn.setText(null);
            fill_list();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
            //step3 create the statement object
            Statement stm = con.createStatement();
            int phonee = Integer.valueOf(phone.getText());
            double idd = Double.valueOf(id.getText());
            int weightt= Integer.valueOf(weight.getText());
            int agee= Integer.valueOf(age.getText());
            int ess = Integer.valueOf(essn.getText());
           char gen= gender.getText().charAt(0);
            String query = "update sys.DONOR set First_Name= '"+nameF.getText()+"', Middle_Name= '"+nameM.getText()+"', Last_Name= '"+nameL.getText()+"', Gender= '"+gender.getText()+"', Age= "+agee+", Phone= "+phonee+", Email= '"+email.getText()+"', Weight= "+weightt+", Blood_Type= '"+bloodType.getText()+"', Health_Status= '"+healthStatus.getText()+"', EMPLOYEE= "+ess +", Donor_ID= "+idd+" where First_Name= '"+donorList.getSelectedValue()+"' ";
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "The Donor Is updated Succesfully");
            fill_list();
            id.setText(null);
            nameF.setText(null);
            nameM.setText(null);
            nameL.setText(null);
            gender.setText(null);
            age.setText(null);
            phone.setText(null);
            email.setText(null);
            weight.setText(null);
            bloodType.setText(null);
            healthStatus.setText(null);
            essn.setText(null);
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        nameF.setText(null);
        nameM.setText(null);
        nameL.setText(null);
        id.setText(null);
        age.setText(null);
        gender.setText(null);
        bloodType.setText(null);
        weight.setText(null);
        phone.setText(null);
        healthStatus.setText(null);
        email.setText(null);
        essn.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void nameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void essnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_essnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_essnActionPerformed

    private void donorListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_donorListValueChanged
        // TODO add your handling code here:
        try {
//step1 load the driver class  
            Class.forName("oracle.jdbc.OracleDriver");
//step2 create  the connection object  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "fcit");
//step3 create the statement object  
            Statement stm = con.createStatement();
            String query = "Select DONOR_ID,FIRST_NAME,MIDDLE_NAME, LAST_NAME, GENDER, AGE, PHONE,EMAIL, WEIGHT,BLOOD_TYPE,HEALTH_STATUS, EMPLOYEE from sys.DONOR  where FIRST_NAME='" + donorList.getSelectedValue() + "'";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                id.setText(rs.getString(1));
                nameF.setText(rs.getString(2));
                nameM.setText(rs.getString(3));
                nameL.setText(rs.getString(4));
                gender.setText(rs.getString(5));
                age.setText(rs.getString(6));
                phone.setText(rs.getString(7));
                email.setText(rs.getString(8));
                weight.setText(rs.getString(9));
                bloodType.setText(rs.getString(10));
                healthStatus.setText(rs.getString(11));
                essn.setText(rs.getString(12));
            }
            int ssn = Integer.valueOf(essn.getText());
              String query1 = "SELECT sys.DONOR.FIRST_NAME FROM sys.EMPLOYEE  , sys.DONOR   WHERE EMPLOYEE.SSN = DONOR.EMPLOYEE AND DONOR.EMPLOYEE= "+ssn+"  ";
            ResultSet rs1 = stm.executeQuery(query1);
           //here يكتب نفس اسم الدونر مو العامل
            
            while (rs1.next()) {
                 if(id.getText()!=null){
                empn.setText(rs1.getString(1));
                 }}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_donorListValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel Essn;
    private javax.swing.JTextField age;
    private javax.swing.JTextField bloodType;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JList<String> donorList;
    private javax.swing.JScrollPane donorlist;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empn;
    private javax.swing.JTextField essn;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField healthStatus;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameF;
    private javax.swing.JTextField nameL;
    private javax.swing.JTextField nameM;
    private javax.swing.JTextField phone;
    private javax.swing.JButton update;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}