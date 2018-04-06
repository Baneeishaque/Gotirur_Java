/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technodroid;

import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Use
 */
public class billitems extends javax.swing.JFrame {

    private int ini_flag = 0;
    Vector service1, product1, quantity1, tax1, price1;
    int ser1;

    /**
     * Creates new form billitems
     */
    public billitems() {
        initComponents();
    }

    public billitems(Vector service, Vector product, Vector quantity, Vector tax, Vector price, int ser) {
        initComponents();
        service1 = service;
        product1 = product;
        quantity1 = quantity;
        tax1 = tax;
        price1 = price;
        ser1 = ser;
    }

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
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        productname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        showitem = new javax.swing.JComboBox<>();
        qty = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Technodroid");
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Bill Itemes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tax/Gst");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 50));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 290, 50));

        productname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productnameFocusGained(evt);
            }
        });
        productname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productnameKeyTyped(evt);
            }
        });
        getContentPane().add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 290, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 50));
        getContentPane().add(tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 290, 50));

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 190, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, 50));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, 30));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 100, 30));

        showitem.setEditable(true);
        showitem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showitemItemStateChanged(evt);
            }
        });
        showitem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                showitemKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                showitemKeyTyped(evt);
            }
        });
        getContentPane().add(showitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 290, 0));

        qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qty.setText("stock");
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 80, 50));

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 480, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/technodroid/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 500, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bill b = new bill(productname.getText(), tax.getText(), price.getText(), quantity.getText(), service1, product1, quantity1, tax1, price1, ser1);
        b.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void productnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productnameKeyTyped
//        System.out.println(productname.getText());
//        showitem.showPopup();
    }//GEN-LAST:event_productnameKeyTyped

    private void productnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productnameKeyPressed


    }//GEN-LAST:event_productnameKeyPressed

    private void productnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productnameKeyReleased
//        System.out.println(productname.getText());
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            showitem.hidePopup();
//            companyname.requestFocus();
//        }
        if (!productname.getText().isEmpty()) {
            if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
                try {
                    showitem.removeAll();

                    String name = productname.getText();
                    String name_query = name + '%';
                    System.out.println("select * from `insert` where productname like '" + name_query + "'");

                    com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
                    java.sql.Statement S = C.createStatement();
                    ResultSet r = S.executeQuery("select * from `insert` where productname like '" + productname.getText() + "%'");
                    while (r.next()) {
                        showitem.addItem(r.getString("productname"));
                    }
                    showitem.showPopup();
                    showitem.requestFocus();

                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
//            else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//                productname.setText(showitem.getSelectedItem().toString());
//                try {
//                    com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
//                    java.sql.Statement S = C.createStatement();
//                    ResultSet r = S.executeQuery("select * from `insert` where productname='" + productname.getText() + "'");
//                    while (r.next()) {
//                        tax.setText(r.getString("gstvalue"));
//                        price.setText(r.getString("price"));
//
//                    }
//
//                } catch (SQLException ex) {
//                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                showitem.removeAll();
//                showitem.hidePopup();
//                companyname.requestFocus();
//            }
        }
    }//GEN-LAST:event_productnameKeyReleased

    private void productnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productnameFocusGained
//        productname.setText("");
//        showitem.removeAll();
        if (ini_flag == 1) {
            billitems b = new billitems();
            b.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_productnameFocusGained

    private void showitemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showitemItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_showitemItemStateChanged

    private void showitemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showitemKeyTyped
        // TODO add your handling code here:
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            productname.setText(showitem.getSelectedItem().toString());
//            try {
//                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
//                java.sql.Statement S = C.createStatement();
//                ResultSet r = S.executeQuery("select * from `insert` where productname='" + productname.getText() + "'");
//                while (r.next()) {
//                    tax.setText(r.getString("gstvalue"));
//                    price.setText(r.getString("price"));
//
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_showitemKeyTyped

    private void showitemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showitemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            productname.setText(showitem.getSelectedItem().toString());
            try {
                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
                java.sql.Statement S = C.createStatement();
                ResultSet r = S.executeQuery("select * from `insert` where productname='" + productname.getText() + "'");
                while (r.next()) {
                    tax.setText(r.getString("gstvalue"));
                    price.setText(r.getString("price"));
                    qty.setText(r.getString("stock"));
                }
                quantity.requestFocus();
                ini_flag = 1;
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_showitemKeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyPressed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityKeyTyped

    private void quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityKeyPressed

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        if (!quantity.getText().isEmpty()) {
            if (Integer.parseInt(quantity.getText()) > Integer.parseInt(qty.getText())) {
                quantity.setText(qty.getText());
                JOptionPane.showMessageDialog(rootPane, " Out Of Stock ");
                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_quantityKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
service s=new service();
s.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(billitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billitems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productname;
    private javax.swing.JLabel qty;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox<String> showitem;
    private javax.swing.JTextField tax;
    // End of variables declaration//GEN-END:variables
}
