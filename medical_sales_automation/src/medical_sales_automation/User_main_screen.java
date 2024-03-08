package medical_sales_automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 * @author Omer Faruk
 */
public class User_main_screen extends javax.swing.JFrame {
    String user_name;
    DefaultTableModel defaultTableModel;
    public User_main_screen(String user_name) {
        initComponents();
        this.user_name = user_name;
        defaultTableModel = (DefaultTableModel)tblKullanici_ilaclari.getModel();
        List list = new List();
        try {
            ArrayList<Medicine> medicines = list.getKullaniciİlaclar(user_name);
            for (Medicine medicine : medicines){
                Object[] row ={medicine.getMedicine_id(), medicine.getMedicine_name(), medicine.getDosage(),
                    medicine.getStock(), medicine.getTime(), medicine.getForm()};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException exception) {
            
        }
        lblHosgeldin.setText("Hoş geldiniz " + user_name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKullanici_ilaclari = new javax.swing.JTable();
        btnTalepEt = new javax.swing.JButton();
        btnSecileniSil = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        lblHosgeldin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Ana Ekranı");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        tblKullanici_ilaclari.setBackground(new java.awt.Color(204, 255, 255));
        tblKullanici_ilaclari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblKullanici_ilaclari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İlaç No", "İlaç adı", "Kurum Adı", "Dozaj", "Süre", "Form"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKullanici_ilaclari.setRowHeight(30);
        jScrollPane1.setViewportView(tblKullanici_ilaclari);
        if (tblKullanici_ilaclari.getColumnModel().getColumnCount() > 0) {
            tblKullanici_ilaclari.getColumnModel().getColumn(2).setPreferredWidth(130);
            tblKullanici_ilaclari.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        btnTalepEt.setBackground(new java.awt.Color(0, 153, 0));
        btnTalepEt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTalepEt.setForeground(new java.awt.Color(255, 255, 255));
        btnTalepEt.setText("İlaç Talep Et");
        btnTalepEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTalepEtActionPerformed(evt);
            }
        });

        btnSecileniSil.setBackground(new java.awt.Color(255, 51, 51));
        btnSecileniSil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSecileniSil.setForeground(new java.awt.Color(255, 255, 255));
        btnSecileniSil.setText("Seçilen İlacı Sil");
        btnSecileniSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecileniSilActionPerformed(evt);
            }
        });

        btnCikis.setBackground(new java.awt.Color(255, 51, 51));
        btnCikis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCikis.setForeground(new java.awt.Color(255, 255, 255));
        btnCikis.setText("Çıkış");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        lblHosgeldin.setBackground(new java.awt.Color(204, 255, 255));
        lblHosgeldin.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblHosgeldin.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTalepEt)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSecileniSil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHosgeldin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCikis)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCikis)
                    .addComponent(lblHosgeldin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTalepEt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSecileniSil)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        // TODO add your handling code here:
        Log_in_screen log_in_screen = new Log_in_screen();
        log_in_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnTalepEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTalepEtActionPerformed
        // TODO add your handling code here:
        User_add_medicine_screen user_add_medicine_screen = new User_add_medicine_screen(user_name);
        user_add_medicine_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTalepEtActionPerformed

    private void btnSecileniSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecileniSilActionPerformed
        // TODO add your handling code here:
        int index = tblKullanici_ilaclari.getSelectedRow();
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
    if (index != -1) {
        String medicine_id = (String) tblKullanici_ilaclari.getValueAt(index, 1);
        
        try {
            connection = dbHelper.getConnection();
            String sql = "DELETE FROM medicines WHERE Medicine_ID = ? and User_ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, medicine_id);
            preparedStatement.setString(2, user_name);
            preparedStatement.executeUpdate();

            defaultTableModel.removeRow(index);

            preparedStatement.close();
            connection.close();
        } catch (SQLException exception) {
        }
    }
    }//GEN-LAST:event_btnSecileniSilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String user_name = "kullanici adi";
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
            java.util.logging.Logger.getLogger(User_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_main_screen(user_name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnSecileniSil;
    private javax.swing.JButton btnTalepEt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHosgeldin;
    private javax.swing.JTable tblKullanici_ilaclari;
    // End of variables declaration//GEN-END:variables
}
