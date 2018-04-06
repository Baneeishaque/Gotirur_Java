/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technodroid;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.imgscalr.Scalr;

/**
 *
 * @author Admin
 */
public class insert extends javax.swing.JFrame {
 
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    File SourceFile, myfile = null;
    String id2;

    /**
     * Creates new form insert
     */
    public insert() {
        initComponents();
        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();
            ResultSet r = S.executeQuery("select * from gst");
            while (r.next()) {
                gstcategory.addItem(r.getString("category"));
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }   // TODO add your handling code here:

        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();
            ResultSet r = S.executeQuery("select * from `insert`");
            DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString(1));

                v.add(r.getString(2));
                v.add(r.getString(4));
                v.add(r.getString(5));
                v.add(r.getString(8));
                v.add(r.getString(7));
                v.add(r.getString(10));
                v.add(r.getString(6));
                v.add(r.getString(11));
               
                t.addRow(v);

            }

        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public insert(String id, String jDateChooser1, String productname1, String description1, String image1, String stock1, String g, String price1 ,String category1) {
        initComponents();
        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();
            ResultSet r = S.executeQuery("select * from gst");
            while (r.next()) {
                gstcategory.addItem(r.getString("category"));
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }   // TODO add your handling code here:

        id2 = id;
//jDateChooser1.
pic.setIcon(new ImageIcon("C:\\wamp\\www\\gotirur\\products\\" + productname1 + ".jpg"));
        productname.setText(productname1);
        
        description.setText(description1);
        if (g.contains("gstcategory")) {
            gstcategory.setSelectedItem(true);
            gstvalue.setText(g);
        }
        stock.setText(stock1);

        gstvalue.setText(g);
        gstcategory.getSelectedItem().toString();
        price.setText(price1);

        jButton4.setText("update");
    }

   

//    insert(String toString, String toString0, String toString1, String toString2, String toString3, String toString4, String toString5, String toString6) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        gstcategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        gstvalue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Technodroid");
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, 52));
        getContentPane().add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 30));

        productname.setText("enter your prodect details....");
        productname.setToolTipText("enter");
        productname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productnameFocusGained(evt);
            }
        });
        getContentPane().add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 440, 30));

        gstcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        gstcategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gstcategoryItemStateChanged(evt);
            }
        });
        gstcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstcategoryActionPerformed(evt);
            }
        });
        getContentPane().add(gstcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 30));

        gstvalue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gstvalue.setForeground(new java.awt.Color(255, 255, 255));
        gstvalue.setText("GST  Value");
        getContentPane().add(gstvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 100, 30));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Upload Product Image");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 190, 30));

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 440, -1));

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 213, 130, 30));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 130, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI No", "date", "Product Name", "description", "Image", "Stock", "Tax", "Price", "Category"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 940, 170));

        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stock");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 180, 30));

        jInternalFrame1.setVisible(true);

        pic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jInternalFrame1.getContentPane().add(pic, java.awt.BorderLayout.CENTER);

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 350, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/technodroid/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 680));

        jMenu1.setText("File");

        jMenuItem1.setText("bill");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        jMenuItem2.setText("Calculator");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Notepad");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getText().equals("update")) {
            try {
                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
                java.sql.Statement S = C.createStatement();
                S.executeUpdate("UPDATE `insert` SET `id`='" + sdf.format(jDateChooser1.getDate()) + "','" + productname.getText() + "','" + description.getText() + "'," + price.getText() + "," + stock.getText() + ",'" + productname.getText() + ".jpg','" + gstcategory.getSelectedItem() + "','" + gstvalue.getText() + "','" + gstcategory.getSelectedItem() + "'");
                JOptionPane.showMessageDialog(rootPane, " update sucssessfully");
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                if (!SourceFile.exists()) {
                    System.out.println("Sourcefile doesn't Exist");
                }
                if (!myfile.exists()) {
                    myfile.createNewFile();
                }
                FileChannel source;
                FileChannel destination;
                source = new FileInputStream(SourceFile).getChannel();
                destination = new FileOutputStream(myfile).getChannel();
                if (destination != null && source != null) {
                    destination.transferFrom(source, 0, source.size());
                }
                if (source != null) {
                    source.close();
                }
                if (destination != null) {
                    destination.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
                java.sql.Statement S = C.createStatement();

                S.executeUpdate("INSERT INTO `insert`( `date`, `productname`, `description`, `price`, `stock`, `image`,`gstcategory`,`gstvalue`,`category`) VALUES ('" + sdf.format(jDateChooser1.getDate()) + "','" + productname.getText() + "','" + description.getText() + "'," + price.getText() + "," + stock.getText() + ",'" + productname.getText() + ".jpg','" + gstcategory.getSelectedItem() + "','" + gstvalue.getText() + "','" + gstcategory.getSelectedItem() + "')");
                JOptionPane.showMessageDialog(rootPane, " insert sucssessfully");
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void gstcategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gstcategoryItemStateChanged
        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();
            ResultSet r = S.executeQuery("select * from gst where category='" + gstcategory.getSelectedItem().toString() + "'");
            while (r.next()) {
                gstvalue.setText(r.getString("percentage") + "%");
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:
    }//GEN-LAST:event_gstcategoryItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        filechooser.setDialogTitle("Choose Your Product Image");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "PNG", "JPG"));
        //filechooser.setAcceptAllFileFilterUsed(true);
        filechooser.setCurrentDirectory(new File("C:\\Users\\Public\\Pictures"));

        //below codes for select  the file
        int returnval = filechooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File source = filechooser.getSelectedFile();

            try {
                BufferedImage bi = ImageIO.read(source);

                System.out.println("Height : " + bi.getHeight());
                System.out.println("Width : " + bi.getWidth());
                //---Resizing buffered image; return : bufferedimage -----
                bi = Scalr.resize(bi, 350, 180);
                pic.setIcon(new ImageIcon(bi));

                System.out.println(source);

            } catch (IOException e) {
            }
            this.pack();
        }        // TODO add your handling code here:

        SourceFile = filechooser.getSelectedFile();
        try {
            if (!Files.exists(Paths.get("C:\\wamp\\www\\gotirur\\products\\"))) {

                new File("C:\\wamp\\www\\gotirur\\products\\").mkdir();
            }

            myfile = new File("C:\\wamp\\www\\gotirur\\products\\" + productname.getText() + ".jpg");
            System.out.println(myfile.getPath());
        } catch (NullPointerException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insert i = new insert();
        i.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void gstcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gstcategoryActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
ProcessBuilder b = new ProcessBuilder("calc.exe");
        try {
            Process p = b.start();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
ProcessBuilder b = new ProcessBuilder("notepad.exe");
        try {
            Process p = b.start();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void productnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameFocusGained

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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JComboBox<String> gstcategory;
    private javax.swing.JLabel gstvalue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
