/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsmanagementsystem.internalJFrames;

/**
 *
 * @author Rashan
 */
public class policyReports extends javax.swing.JInternalFrame {

    /**
     * Creates new form policy
     */
    public policyReports() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(853, 635));
        setMinimumSize(new java.awt.Dimension(853, 635));
        setPreferredSize(new java.awt.Dimension(853, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Show");
        jButton1.setMaximumSize(new java.awt.Dimension(150, 46));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 46));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 46));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 379, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Select Policy Type");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 161, 147, 54));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(216, 54));
        jComboBox1.setMinimumSize(new java.awt.Dimension(216, 54));
        jComboBox1.setPreferredSize(new java.awt.Dimension(216, 54));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 161, 180, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Print");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 379, 140, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrnd1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
