/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class v_Paint_Painting_Supplies extends javax.swing.JFrame {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    /**
     * Creates new form v_Chain_Cable_Rope
     */
    public v_Paint_Painting_Supplies() {
        initComponents();
        
         //kodi connect DB
        con = DBconnect.connect();
        
        //for load the result table
        tableload();
    }
    
      public void tableload()
    {
        try {
        String sql = "SELECT p.ProductID,p.ProductName,p.ProductType,p.Date,p.MRP,p.Manufacture,p.Description,p.Quantity,p.ProfitMargin,p.CostPerUnit,a.PaintColor,a.Liters"
                + " FROM products p,paintsandtools a WHERE p.ProductID=a.ProductID";
        pst = con.prepareStatement(sql);
        rs =pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch (SQLException e) {
        }
        
        
    }
     
     public void clearfields(){
          
          
        pidbox.setText("");
        pnamebox.setText("");
        ptypebox.setSelectedIndex(0);
        quantitybox.setText("");
        
        datebox.setDate(null);
        
        manufacturebox.setText("");
        profitbox.setText("");
        spsibox.setText("");
        litersbox.setText("");
        costperunitbox.setText("");
        descriptionbox1.setText("");
        colorbox.setSelectedIndex(0);
        litersbox.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        datebox = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        costperunitbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pidbox = new javax.swing.JTextField();
        pnamebox = new javax.swing.JTextField();
        quantitybox = new javax.swing.JTextField();
        manufacturebox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ptypebox = new javax.swing.JComboBox<>();
        profitbox = new javax.swing.JTextField();
        spsibox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        litersbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        searchbox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        colorbox = new javax.swing.JComboBox<>();
        descriptionbox1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 661, 120, 46));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Product ID ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 55, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("CALCULATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 148, 130, 36));

        datebox.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(datebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 243, 227, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Product Name ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 101, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Update Item");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1214, 96, 130, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 198, -1, -1));
        getContentPane().add(costperunitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 151, 227, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Type ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 142, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Delete Item");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1214, 139, 130, 36));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Cost/unit");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 158, -1, -1));
        getContentPane().add(pidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 47, 227, 33));
        getContentPane().add(pnamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 93, 227, 33));
        getContentPane().add(quantitybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 191, 227, 33));
        getContentPane().add(manufacturebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 276, 227, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Paint Color");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 377, -1, -1));

        ptypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Product Type", "Paint", "Primers", "Wood Stains, Sealers & Clear Topcoats", "Concrete & Masonry Products", "Aerosols", "Faux Finishing", "Paint & Coatings Calculator", "Deck Stains & Supplies", "Siding Stains", "Aerosols", "Concrete & Masonry Products", "Paint & Coatings Calculator", "Brushes", "Roller Covers, Frames & Accessories", "Tape & Masking", "Sandpaper & Abrasives", "Drop Cloths & Plastic Sheeting", "Caulks, Sealants & Caulking Tools", "Patching & Repair", "Painter's Tools", "Cleaning Supplies", "Safety Equipment", "Solvents & Removers", "Wallpaper Tools & Paste", "Drywall Compounds & Tools", "Painter's Wear", "Ladders, Scaffolds & Climbing Equipment", "Spray Equipment" }));
        ptypebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptypeboxActionPerformed(evt);
            }
        });
        getContentPane().add(ptypebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 135, 227, 33));
        getContentPane().add(profitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 87, 227, 33));
        getContentPane().add(spsibox, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 47, 227, 33));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1214, 53, 130, 36));
        getContentPane().add(litersbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 203, 227, 33));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 447, 1330, 207));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Manufacture");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 276, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Clear Fields");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1214, 182, 130, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Profit Margin (%)/unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 94, -1, -1));
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 406, 227, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("MRP/unit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 54, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1212, 404, 130, 36));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Description");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 322, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 404, 119, 36));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 243, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Search Products Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 413, -1, -1));

        colorbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Choose a Color", "Reds", "Oranges", "Yellows", "Greens", "Blues", "Purples", "Neutrals", "Whites & Pastels", "Historic Colors", "Timeless Colors" }));
        colorbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorboxActionPerformed(evt);
            }
        });
        getContentPane().add(colorbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 373, 227, 33));
        getContentPane().add(descriptionbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 322, 227, 33));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Liters");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Paint & Painting Supplies");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 0, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgrnd1.png"))); // NOI18N
        jLabel15.setName(""); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        v_AddProducts a1 =new v_AddProducts();
        a1.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        float mpr = new Float(spsibox.getText());
        float profit1 = new Float(profitbox.getText());

        float calprofit=mpr*(profit1/100);
        float costperunit=(mpr-calprofit);

        costperunitbox.setText(String.valueOf(costperunit));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // FOR UPDATE ITEMS KODI
        int x=JOptionPane.showConfirmDialog(null,"Do you really want to UPDATE this Record?");

        if(x==0)
        {
            String productid = pidbox.getText();
            String productname = pnamebox.getText();
            String producttype = ptypebox.getSelectedItem().toString();
            String quantity = quantitybox.getText();

            String date;
            date = ((JTextField)datebox.getDateEditor().getUiComponent()).getText();
            String manufacture = manufacturebox.getText();

            String profit = profitbox.getText();
            String spsi = spsibox.getText();

            String description = descriptionbox1.getText();
            String costperunit = costperunitbox.getText();
            
            String color = colorbox.getSelectedItem().toString();
            String liters = litersbox.getText();

            try{

                String sql="UPDATE products SET ProductName ='"+ productname +"',ProductType ='"+ producttype +"',"
                + "Date ='"+ date +"',MRP ='"+ spsi +"',Manufacture ='"+ manufacture +"',Description ='"+ description +"',"
                + "Quantity ='"+ quantity +"',ProfitMargin ='"+ profit +"',CostPerUnit ='"+ costperunit +"'"
                + " WHERE ProductID = '"+ productid +"'";
        
                String sql1="UPDATE paintsandtools SET PaintColor ='"+ color +"',Liters ='"+ liters +"'WHERE ProductID = '"+ productid +"'";
        
        
                pst = con.prepareStatement(sql);
                pst.execute();

                pst = con.prepareStatement(sql1);
                pst.execute();
                clearfields();

                //load table
                tableload();

            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // FOE DELETE ITEM KODI
        int x=JOptionPane.showConfirmDialog(null,"Do you really want to DELETE this Record?");

        if(x==0)
        {
            String productid = pidbox.getText();

            try{

                String sql="DELETE from products WHERE ProductID ='"+ productid +"'";
                String sql1="DELETE from paintsandtools WHERE ProductID ='"+ productid +"'";

                pst = con.prepareStatement(sql);
                pst.execute();
                pst = con.prepareStatement(sql1);
                pst.execute();
                clearfields();

                //load table
                tableload();

            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ptypeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptypeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptypeboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //ADD ITEMS KODI

        String productid = pidbox.getText();
        String productname = pnamebox.getText();
        String producttype = ptypebox.getSelectedItem().toString();
        String quantity = quantitybox.getText();

        // String date = datebox.getDate().toString()
        String date;
        date = ((JTextField)datebox.getDateEditor().getUiComponent()).getText();
        String manufacture = manufacturebox.getText();

        String profit = profitbox.getText();
        String spsi = spsibox.getText();

        String description = litersbox.getText();
        String costperunit = costperunitbox.getText();
        String color = colorbox.getSelectedItem().toString();
        String liters = litersbox.getText();

        
        //To calculate the cost per unit

        float mpr = new Float(spsibox.getText());
        float profit1 = new Float(profitbox.getText());

        float calprofit=mpr*(profit1/100);
        float costperunit1=(mpr-calprofit);

        try {
            String q= "INSERT INTO products(ProductID,ProductName,ProductType,Date,MRP,Manufacture,Description,Quantity,ProfitMargin,CostPerUnit) values"
                    + " ('"+ productid +"','"+ productname +"','"+ producttype +"','"+ date +"','"+ spsi +"','"+ manufacture +"','"+ description +"','"+ quantity +"','"+ profit +"','"+ costperunit +"')";

            String q1= "INSERT INTO paintsandtools (ProductID,PaintColor,Liters) values"
                   + " ('"+ productid +"','"+ color +"','"+ liters +"')";
           
            pst = con.prepareStatement(q);
            pst.execute();
            pst = con.prepareStatement(q1);
            pst.execute();
            clearfields();

            //to load the table
            tableload();

        } catch (Exception e){

            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //kodi_to get the seleted value
        try{

            int row=jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

            String productid = jTable1.getValueAt(row, 0).toString();
            String productname = jTable1.getValueAt(row, 1).toString();
            String producttype = jTable1.getValueAt(row, 2).toString();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 3).toString());
            String spsi = jTable1.getValueAt(row, 4).toString();
            String manufacture = jTable1.getValueAt(row, 5).toString();
            String description = jTable1.getValueAt(row, 6).toString();
            String quantity = jTable1.getValueAt(row, 7).toString();
            String profit = jTable1.getValueAt(row, 8).toString();
            String total = jTable1.getValueAt(row, 9).toString();
            String color = jTable1.getValueAt(row, 10).toString();
            String liters = jTable1.getValueAt(row, 11).toString();

            pidbox.setText(productid);
            pnamebox.setText(productname);
            ptypebox.setSelectedItem(producttype);
            quantitybox.setText(quantity);

            datebox.setDate(date);

            manufacturebox.setText(manufacture);
            profitbox.setText(profit);
            spsibox.setText(spsi);
            
            descriptionbox1.setText(description);
            costperunitbox.setText(total);
            colorbox.setSelectedItem(color);
            litersbox.setText(liters);

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // To clear all fields
        clearfields();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // To clear search
        searchbox.setText("");
        tableload();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // TO SEARCH PRODUCTS KODI

        String search = searchbox.getText();

        String sql="SELECT p.ProductID,p.ProductName,p.ProductType,p.Date,p.MRP,p.Manufacture,p.Description,p.Quantity,p.ProfitMargin,p.CostPerUnit,b.PaintColor,b.Liters from products p,paintsandtools b WHERE p.ProductName LIKE '%"+search+"%' AND p.ProductID=b.ProductID";

        try{

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void colorboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorboxActionPerformed

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
            java.util.logging.Logger.getLogger(v_Paint_Painting_Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_Paint_Painting_Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_Paint_Painting_Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_Paint_Painting_Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_Paint_Painting_Supplies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> colorbox;
    private javax.swing.JTextField costperunitbox;
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JTextField descriptionbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField litersbox;
    private javax.swing.JTextField manufacturebox;
    private javax.swing.JTextField pidbox;
    private javax.swing.JTextField pnamebox;
    private javax.swing.JTextField profitbox;
    private javax.swing.JComboBox<String> ptypebox;
    private javax.swing.JTextField quantitybox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField spsibox;
    // End of variables declaration//GEN-END:variables
}
