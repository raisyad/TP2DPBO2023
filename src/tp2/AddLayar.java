/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author raisy
 */
public class AddLayar extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    private Home home;
    private dbConnection db;
    private boolean isUpdate;
    private int id;
    private String name;
    public AddLayar(Home home, boolean isUpdate, int id) {
        initComponents();
        
        db = new dbConnection();
        this.home = home;
        this.isUpdate = isUpdate;
        this.id = id;
        ukuranLayarDrop.setSelectedItem(null);
        jenisLayarDrop.setSelectedItem(null);
        jenisPanelDrop.setSelectedItem(null);
        resolusiLayarDrop.setSelectedItem(null);
        
//      Check first, now update or insert
        if (this.isUpdate == false) {
            System.out.println(this.isUpdate);
        } else {
//          If now is update, set text of button, clear button set to invis and set the color to yellow in the add button
            AddDataButton.setText("Update");
            clearButton1.setVisible(false);
            AddDataButton.setBackground(new Color(204, 204, 0));
        }
    }
    
//  Reset field
    public void resetForm() {
        // Set All Value Form to Empty
        ukuranLayarDrop.setSelectedItem(null);
        jenisLayarDrop.setSelectedItem(null);
        jenisPanelDrop.setSelectedItem(null);
        resolusiLayarDrop.setSelectedItem(null);
    }
    
//  Call the procedure from home, for the reset panel
    public void notifydataupdate() {
        home.ondataupdated();
    }

//  Create the procedure for the set of text/item, for the update
    public void setUpdate(String ukuranLayar, String jenisLayar, String jenisPanel, String resolusiLayar) {
        ukuranLayarDrop.setSelectedItem(ukuranLayar);
        jenisLayarDrop.setSelectedItem(jenisLayar);
        jenisPanelDrop.setSelectedItem(jenisPanel);
        resolusiLayarDrop.setSelectedItem(resolusiLayar);
        AddLabel.setText("Update Layar");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AddLabel = new javax.swing.JLabel();
        UkuranLayarLabel = new javax.swing.JLabel();
        jenisLayarLabel = new javax.swing.JLabel();
        AddDataButton = new javax.swing.JButton();
        jenisPanelLabel = new javax.swing.JLabel();
        clearButton1 = new javax.swing.JButton();
        resolusiLayarLabel = new javax.swing.JLabel();
        resolusiLayarDrop = new javax.swing.JComboBox<>();
        ukuranLayarDrop = new javax.swing.JComboBox<>();
        jenisLayarDrop = new javax.swing.JComboBox<>();
        jenisPanelDrop = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBg/laptop_logo.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Laptop Media");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 14, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBg/back_icon.png"))); // NOI18N
        jButton1.setText(" Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        AddLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddLabel.setText("Form Add Layar");
        getContentPane().add(AddLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        UkuranLayarLabel.setForeground(new java.awt.Color(255, 255, 255));
        UkuranLayarLabel.setText("Ukuran Layar       :");
        getContentPane().add(UkuranLayarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jenisLayarLabel.setForeground(new java.awt.Color(255, 255, 255));
        jenisLayarLabel.setText("Jenis Layar           :");
        getContentPane().add(jenisLayarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        AddDataButton.setBackground(new java.awt.Color(51, 153, 0));
        AddDataButton.setForeground(new java.awt.Color(0, 0, 0));
        AddDataButton.setText("Add Data");
        AddDataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDataButtonMouseClicked(evt);
            }
        });
        AddDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jenisPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        jenisPanelLabel.setText("Jenis Panel           :");
        getContentPane().add(jenisPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        clearButton1.setBackground(new java.awt.Color(0, 153, 153));
        clearButton1.setForeground(new java.awt.Color(0, 0, 0));
        clearButton1.setText("Clear");
        clearButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton1MouseClicked(evt);
            }
        });
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        resolusiLayarLabel.setForeground(new java.awt.Color(255, 255, 255));
        resolusiLayarLabel.setText("Resolusi Layar      :");
        getContentPane().add(resolusiLayarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        resolusiLayarDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1280 x 800 piksel", "1366 x 768 piksel (HD)", "1440 x 900 piksel", "1600 x 900 piksel (HD+)", "1920 x 1080 piksel (Full HD)", "2560 x 1440 piksel (Quad HD)", "2880 x 1800 piksel", "3200 x 1800 piksel (QHD+)", "3840 x 2160 piksel (Ultra HD / 4K)" }));
        getContentPane().add(resolusiLayarDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 220, -1));

        ukuranLayarDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 inci", "11 inci", "11.6 inci", "12 inci", "12.5 inci", "13 inci", "13.3 inci", "14 inci", "15 inci", "15.6 inci", "16 inci", "17.3 inci", "18 inci" }));
        getContentPane().add(ukuranLayarDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 220, -1));

        jenisLayarDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Layar LCD", "Layar OLED", "Layar touchscreen", "Layar Glossy", "Layar Matte", "Layar anti-glare" }));
        getContentPane().add(jenisLayarDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, -1));

        jenisPanelDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Panel TN", "Panel IPS", "Panel VA", "Panel OLED", "Panel MicroLED" }));
        getContentPane().add(jenisPanelDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 220, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBg/bg_adddata.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 360, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddDataButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void clearButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton1MouseClicked
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_clearButton1MouseClicked

//  Button/Update statements
    private void AddDataButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDataButtonMouseClicked
        // TODO add your handling code here:
        if (this.isUpdate == false) { // If now is insert
            String selectedUkuranLayar = "", selectedJenisLayar = "", selectedJenisPanel = "", selectedResolusiLayar = "";
            if (ukuranLayarDrop.getSelectedItem() != null) {
                selectedUkuranLayar = ukuranLayarDrop.getSelectedItem().toString();
            }
            if (jenisLayarDrop.getSelectedItem() != null) {
                selectedJenisLayar = jenisLayarDrop.getSelectedItem().toString();
            }
            if (jenisPanelDrop.getSelectedItem() != null) {
                selectedJenisPanel = jenisPanelDrop.getSelectedItem().toString();
            }
            if (resolusiLayarDrop.getSelectedItem() != null) {
                selectedResolusiLayar = resolusiLayarDrop.getSelectedItem().toString();
            }
            
            int stats = 0;
            int yes = JOptionPane.showConfirmDialog(null, "Anda yakin menginput data terkait ?", "Confirmation", JOptionPane.YES_NO_OPTION);

            String sql = "insert into layar (id_layar, ukuran_layar, jenis_layar, jenis_panel, resolusi_layar, stats_used) values (NULL, '"+selectedUkuranLayar+"', '"+selectedJenisLayar+"', '"+selectedJenisPanel+"', '"+selectedResolusiLayar+"', '"+stats+"')";
            if (JOptionPane.YES_OPTION == yes) {
                if (selectedUkuranLayar.isEmpty() || selectedJenisLayar.isEmpty() || selectedJenisPanel.isEmpty() || selectedResolusiLayar.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the data completely!");
                } else {
                    db.updateQuery(sql);
                    JOptionPane.showMessageDialog(null, "Data has been successfully entered!");
                    dispose();
                    notifydataupdate();
                    home.selectedFilterLayar();
                }
            }
        
//      If now is update
        } else if (this.isUpdate == true) {
            String selectedUkuranLayar = ukuranLayarDrop.getSelectedItem().toString();
            String selectedJenisLayar = jenisLayarDrop.getSelectedItem().toString();
            String selectedJenisPanel = jenisPanelDrop.getSelectedItem().toString();
            String selectedResolusiLayar = resolusiLayarDrop.getSelectedItem().toString();
            String sql = "UPDATE layar SET ukuran_layar='" + selectedUkuranLayar + "', jenis_layar='" + selectedJenisLayar + "', jenis_panel='" + selectedJenisPanel + "', resolusi_layar= '" +selectedResolusiLayar+ "' WHERE id_layar=" + this.id;
            
            int yes = JOptionPane.showConfirmDialog(null, "Anda yakin mengedit data terkait ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == yes) {
                int affectedRow = db.updateQuery(sql);
                if (affectedRow > 0) {
                    System.out.println("Update Success");
                    JOptionPane.showMessageDialog(null, "Data Successfully Updated");
                    dispose();
                    notifydataupdate();
                    home.selectedFilterLayar();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Unsuccessfully Updated");
                    dispose();
                }
            }
                
        }
            
        
    }//GEN-LAST:event_AddDataButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AddLayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddLayar().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDataButton;
    private javax.swing.JLabel AddLabel;
    private javax.swing.JLabel UkuranLayarLabel;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenisLayarDrop;
    private javax.swing.JLabel jenisLayarLabel;
    private javax.swing.JComboBox<String> jenisPanelDrop;
    private javax.swing.JLabel jenisPanelLabel;
    private javax.swing.JComboBox<String> resolusiLayarDrop;
    private javax.swing.JLabel resolusiLayarLabel;
    private javax.swing.JComboBox<String> ukuranLayarDrop;
    // End of variables declaration//GEN-END:variables
}
