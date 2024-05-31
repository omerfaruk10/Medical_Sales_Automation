package medical_sales_automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Omer Faruk
 */
public class Pharmacy_add_medicine_screen extends javax.swing.JFrame {
    private String pharmacy_id;
    private String pharmacy_name;
    private String user_name;
    public Pharmacy_add_medicine_screen(String pharmacy_id, String pharmacy_name, String user_name) {
        initComponents();
        this.pharmacy_id = pharmacy_id;
        this.pharmacy_name = pharmacy_name;
        this.user_name = user_name;
    }
    public void medicineInsert() throws SQLException{
        Connection connection = null;
        medical_sales_automation.DbHelper dbHelper = new medical_sales_automation.DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "insert into users.medicines (Pharmacy_ID, User_ID, Medicine_ID, Name, Pharmacy_name, Dosage, Stock, "
                    + "Time, Form)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            statement = connection.prepareStatement(sql);
            statement.setString(1, pharmacy_id);
            statement.setString(2, "");
            statement.setString(3, txtMedicineID.getText());
            statement.setString(4, txtilac_adi.getText());
            statement.setString(5, pharmacy_name);
            statement.setString(6, txtDozaj.getText());
            statement.setString(7, txtStok.getText());
            statement.setString(8, txtSure.getText());
            statement.setString(9, txtSekil.getText());
            
            statement.executeUpdate();
        } catch (SQLException sqlException) {
            dbHelper.showErrorMessage(sqlException);
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDozaj = new javax.swing.JLabel();
        txtDozaj = new javax.swing.JTextField();
        txtSekil = new javax.swing.JTextField();
        txtSure = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        lblMedicineID = new javax.swing.JLabel();
        lblilac_adi = new javax.swing.JLabel();
        txtMedicineID = new javax.swing.JTextField();
        txtilac_adi = new javax.swing.JTextField();
        lblStok = new javax.swing.JLabel();
        lblSekil = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        lblSure = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("İlaç Ekle");
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        lblDozaj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDozaj.setText("Dozajı:");

        txtDozaj.setBackground(new java.awt.Color(204, 255, 255));
        txtDozaj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtSekil.setBackground(new java.awt.Color(204, 255, 255));
        txtSekil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtSure.setBackground(new java.awt.Color(204, 255, 255));
        txtSure.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnEkle.setBackground(new java.awt.Color(0, 153, 0));
        btnEkle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEkle.setForeground(new java.awt.Color(255, 255, 255));
        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnGeri.setBackground(new java.awt.Color(255, 51, 51));
        btnGeri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGeri.setForeground(new java.awt.Color(255, 255, 255));
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        lblMedicineID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMedicineID.setText("İlaç ID:");

        lblilac_adi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblilac_adi.setText("İlaç adı:");

        txtMedicineID.setBackground(new java.awt.Color(204, 255, 255));
        txtMedicineID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtilac_adi.setBackground(new java.awt.Color(204, 255, 255));
        txtilac_adi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblStok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStok.setText("Stok Adedi:");

        lblSekil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSekil.setText("Formu:");

        txtStok.setBackground(new java.awt.Color(204, 255, 255));
        txtStok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblSure.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSure.setText("Kullanım Süresi:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDozaj, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDozaj))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblilac_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtilac_adi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMedicineID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMedicineID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStok, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSure)
                                    .addComponent(lblSekil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSure, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSekil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnGeri)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicineID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicineID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStok)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblilac_adi)
                    .addComponent(txtilac_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSure)
                    .addComponent(txtSure, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDozaj)
                    .addComponent(txtDozaj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSekil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSekil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnGeri)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        // TODO add your handling code here:
        try {
            medicineInsert();
            JOptionPane.showMessageDialog(rootPane, "İlaç eklendi");
            txtMedicineID.setText("");
            txtilac_adi.setText("");
            txtDozaj.setText("");
            txtStok.setText("");
            txtSure.setText("");
            txtSekil.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Pharmacy_add_medicine_screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        Pharmacy_main_screen pharmacies_main_screen = new Pharmacy_main_screen(pharmacy_id, pharmacy_name, user_name);
        pharmacies_main_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String pharmacy_id = "1";
        String pharmacy_name = "kurum adı";
        String user_name = "kullanıcı adı";
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
            java.util.logging.Logger.getLogger(Pharmacy_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacy_add_medicine_screen(pharmacy_id, pharmacy_name, user_name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGeri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDozaj;
    private javax.swing.JLabel lblMedicineID;
    private javax.swing.JLabel lblSekil;
    private javax.swing.JLabel lblStok;
    private javax.swing.JLabel lblSure;
    private javax.swing.JLabel lblilac_adi;
    private javax.swing.JTextField txtDozaj;
    private javax.swing.JTextField txtMedicineID;
    private javax.swing.JTextField txtSekil;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtSure;
    private javax.swing.JTextField txtilac_adi;
    // End of variables declaration//GEN-END:variables
}
