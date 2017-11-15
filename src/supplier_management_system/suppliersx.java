/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplier_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DUL
 */
public class suppliersx extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rss=null;

    public suppliersx() {
        initComponents();

        //connect to db
        con = DBconnect.connect();
        
        //load table
        tableload();
        tableload1();
        
    }

    public void  tableload()
    {
        try {
             String sql= "SELECT supplier_Id, supplier_Name, supplier_email, contact_perspn, contact_tel_number, CompanyName, SupNIC FROM supplier";
            pst=con.prepareStatement(sql);
            rss = pst.executeQuery();
            table_view_suppliers.setModel(DbUtils.resultSetToTableModel(rss));
            
            
           
            
        } catch (Exception e) {
        }
    }
    
    
    public void tableload1()
    {
        try {
            String sql= "SELECT supplier_Id, supplier_Name, supplier_email, contact_perspn, contact_tel_number, CompanyName, SupNIC FROM supplier";
            pst=con.prepareStatement(sql);
            rss = pst.executeQuery();
            
            table_edit_suppliers.setModel(DbUtils.resultSetToTableModel(rss));
        } 
        
        catch (Exception e) {
        }
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        supplierid_update1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        update_supcontact = new javax.swing.JTextField();
        supplieremail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        companycontact_int = new javax.swing.JTextField();
        suppliercontact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        companyname = new javax.swing.JTextField();
        suppliernic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        re_order_table = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_view_suppliers = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        add_supplier = new javax.swing.JButton();
        bsck_to_home = new javax.swing.JButton();
        orders = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_edit_suppliers = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        update_sNIC1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        suppliername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        update_email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        update_companycontact_int = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        update_companyname = new javax.swing.JTextField();
        update_sname1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        re_order_table1 = new javax.swing.JButton();
        bsck_to_home1 = new javax.swing.JButton();
        supplierid_update = new javax.swing.JTextField();
        update_sname = new javax.swing.JTextField();
        update_sNIC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 751));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD SUPPLIERS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 220, -1));

        supplierid_update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_images/Flag_of_county_Kildare_-_bordered.svg.png"))); // NOI18N
        supplierid_update1.setText("aa");
        getContentPane().add(supplierid_update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("SUPPLIER NAME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        update_supcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_supcontactActionPerformed(evt);
            }
        });
        getContentPane().add(update_supcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 300, -1));
        getContentPane().add(supplieremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SUPPLIER EMAIL:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("COMPANY CONTACT NUMBER:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        companycontact_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companycontact_intActionPerformed(evt);
            }
        });
        getContentPane().add(companycontact_int, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, -1));

        suppliercontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliercontactActionPerformed(evt);
            }
        });
        getContentPane().add(suppliercontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("SUPPLIER CONTACT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("COMPANY NAME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 500, -1, -1));

        companyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companynameActionPerformed(evt);
            }
        });
        getContentPane().add(companyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 220, -1));

        suppliernic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliernicActionPerformed(evt);
            }
        });
        getContentPane().add(suppliernic, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 220, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("SUPPLIER NIC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, -1, -1));

        re_order_table.setText("REPORTS");
        re_order_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_order_tableActionPerformed(evt);
            }
        });
        getContentPane().add(re_order_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("SUPPLIER ID:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 100, 20));

        table_view_suppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_view_suppliers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 740, 230));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-----------------------------------------------");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, -1, 20));

        add_supplier.setText("ADD THIS SUPPLIER");
        add_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(add_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 210, 30));

        bsck_to_home.setText("BACK TO MENU");
        bsck_to_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsck_to_homeActionPerformed(evt);
            }
        });
        getContentPane().add(bsck_to_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 200, 30));

        orders.setText("ORDERS");
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });
        getContentPane().add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, 30));

        table_edit_suppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_edit_suppliers);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 1240, 140));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SUPPLIERS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 180, 20));

        update_sNIC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_images/Flag_of_county_Kildare_-_bordered.svg.png"))); // NOI18N
        update_sNIC1.setText("aa");
        getContentPane().add(update_sNIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 140, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("SUPPLIER NAME:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));
        getContentPane().add(suppliername, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 220, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("SUPPLIER EMAIL:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("COMPANY CONTACT NUMBER:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        getContentPane().add(update_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 170, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("SUPPLIER CONTACT:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));
        getContentPane().add(update_companycontact_int, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 160, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("COMPANY NAME:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("SUPPLIER NIC:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));
        getContentPane().add(update_companyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 520, 220, -1));

        update_sname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_images/Flag_of_county_Kildare_-_bordered.svg.png"))); // NOI18N
        update_sname1.setText("aaa");
        getContentPane().add(update_sname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 290, 20));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 420, 150, 30));

        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UPDATE SUPPLIERS:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 200, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 40));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("-----------------------------------------------");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, 20));

        re_order_table1.setText("RE ORDER TABLE");
        re_order_table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_order_table1ActionPerformed(evt);
            }
        });
        getContentPane().add(re_order_table1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 200, 30));

        bsck_to_home1.setText("BACK TO HOME");
        bsck_to_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsck_to_home1ActionPerformed(evt);
            }
        });
        getContentPane().add(bsck_to_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 210, 30));

        supplierid_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierid_updateActionPerformed(evt);
            }
        });
        getContentPane().add(supplierid_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 70, -1));
        getContentPane().add(update_sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 270, -1));
        getContentPane().add(update_sNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_management_system/subbg.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companycontact_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companycontact_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companycontact_intActionPerformed

    private void suppliercontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliercontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliercontactActionPerformed

    private void companynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companynameActionPerformed

    private void suppliernicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliernicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliernicActionPerformed

    private void re_order_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_order_tableActionPerformed


    }//GEN-LAST:event_re_order_tableActionPerformed

    private void add_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_supplierActionPerformed
        String sname = suppliername.getText();
        String semail = supplieremail.getText();
        String scontact = suppliercontact.getText();
        String ccontact = companycontact_int.getText();
        String cname = companyname.getText();
        String snic = suppliernic.getText();

        try {
            String q1 = "INSERT INTO supplier (supplier_Name, supplier_email, contact_perspn, contact_tel_number, CompanyName, SupNIC) values('" + sname + "', '" + semail + "', '" + scontact + "', '" + ccontact + "', '" + cname + "', '" + snic + "')";
            pst = con.prepareStatement(q1);
            pst.execute();
            
            //load table
            tableload();
            tableload1();
            
            JOptionPane.showMessageDialog(this, "Added Successfull");
            System.out.println("record added");
            
        } catch (Exception e) {
            System.out.println("error adding " + e);
        }
    }//GEN-LAST:event_add_supplierActionPerformed

    private void bsck_to_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsck_to_homeActionPerformed
        order_reports b2 = new order_reports();
        b2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsck_to_homeActionPerformed

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
        order_items b1 = new order_items();
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ordersActionPerformed

    private void update_supcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_supcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_supcontactActionPerformed

    private void re_order_table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_order_table1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_re_order_table1ActionPerformed

    private void bsck_to_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsck_to_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsck_to_home1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int supplieID=Integer.parseInt(supplierid_update.getText());
        String supplierName=update_sname.getText();
        String nic=update_sNIC.getText();
        int company_contact=Integer.parseInt(update_companycontact_int.getText());
        String supplier_contact=update_supcontact.getText();
        String company_name=update_companyname.getText();
        String supplier_email=update_email.getText();

        conform_suppliers_update b3 = new conform_suppliers_update(supplieID, supplierName, nic, company_contact, supplier_contact, company_name, supplier_email);
        b3.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void supplierid_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierid_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierid_updateActionPerformed

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
            java.util.logging.Logger.getLogger(suppliersx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suppliersx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suppliersx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suppliersx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suppliersx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_supplier;
    private javax.swing.JButton bsck_to_home;
    private javax.swing.JButton bsck_to_home1;
    private javax.swing.JTextField companycontact_int;
    private javax.swing.JTextField companyname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton orders;
    private javax.swing.JButton re_order_table;
    private javax.swing.JButton re_order_table1;
    private javax.swing.JTextField suppliercontact;
    private javax.swing.JTextField supplieremail;
    private javax.swing.JTextField supplierid_update;
    private javax.swing.JLabel supplierid_update1;
    private javax.swing.JTextField suppliername;
    private javax.swing.JTextField suppliernic;
    private javax.swing.JTable table_edit_suppliers;
    private javax.swing.JTable table_view_suppliers;
    private javax.swing.JTextField update_companycontact_int;
    private javax.swing.JTextField update_companyname;
    private javax.swing.JTextField update_email;
    private javax.swing.JTextField update_sNIC;
    private javax.swing.JLabel update_sNIC1;
    private javax.swing.JTextField update_sname;
    private javax.swing.JLabel update_sname1;
    private javax.swing.JTextField update_supcontact;
    // End of variables declaration//GEN-END:variables
}
