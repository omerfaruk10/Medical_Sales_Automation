package medical_sales_automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 * @author Omer Faruk
 */
public class Pharmacy_main_screen extends javax.swing.JFrame {
    private String pharmacy_id;
    private String pharmacy_name;
    private String user_name;
    DefaultTableModel defaultTableModel;
    public Pharmacy_main_screen(String pharmacy_id, String pharmacy_name, String user_name) {
        initComponents();
        this.pharmacy_id = pharmacy_id;
        this.pharmacy_name = pharmacy_name;
        this.user_name = user_name;
        
        defaultTableModel = (DefaultTableModel)tblİlaclar.getModel();
        List list = new List();
        try {
            ArrayList<Medicine> medicines = list.getKurumİlaclar(pharmacy_id);
            for (Medicine medicine : medicines){
                Object[] row ={medicine.getMedicine_id(), medicine.getMedicine_name(), medicine.getDosage(),
                    medicine.getStock(), medicine.getTime(), medicine.getForm()};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException exception) {
            
        }
        lblHosgeldin.setText("Hoş geldiniz " + pharmacy_name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblİlaclar = new javax.swing.JTable();
        btnİlacEkle = new javax.swing.JButton();
        btnSecileniSil = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        lblHosgeldin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kurum Ana Ekranı");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        tblİlaclar.setBackground(new java.awt.Color(204, 255, 255));
        tblİlaclar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblİlaclar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İlaç No", "İlaç adı", "Dozaj", "Stok Miktarı", "Süre", "Formu"
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
        tblİlaclar.setRowHeight(30);
        tblİlaclar.setShowGrid(true);
        jScrollPane1.setViewportView(tblİlaclar);
        if (tblİlaclar.getColumnModel().getColumnCount() > 0) {
            tblİlaclar.getColumnModel().getColumn(2).setMinWidth(100);
        }

        btnİlacEkle.setBackground(new java.awt.Color(0, 153, 0));
        btnİlacEkle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnİlacEkle.setForeground(new java.awt.Color(255, 255, 255));
        btnİlacEkle.setText("İlaç Ekle");
        btnİlacEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnİlacEkleActionPerformed(evt);
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

        lblHosgeldin.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblHosgeldin.setPreferredSize(new java.awt.Dimension(200, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnİlacEkle)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHosgeldin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCikis)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSecileniSil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCikis)
                    .addComponent(lblHosgeldin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnİlacEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSecileniSil)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnİlacEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnİlacEkleActionPerformed
        // TODO add your handling code here:
        Pharmacy_add_medicine_screen pharmacy_add_medicine_screen = new Pharmacy_add_medicine_screen(pharmacy_id, pharmacy_name, user_name);
        pharmacy_add_medicine_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnİlacEkleActionPerformed

    private void btnSecileniSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecileniSilActionPerformed
        // TODO add your handling code here:
        int index = tblİlaclar.getSelectedRow();
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
    if (index != -1) {
        String medicine_id = (String) tblİlaclar.getValueAt(index, 1);
        
        try {
            connection = dbHelper.getConnection();
            String sql = "DELETE FROM medicines WHERE Medicine_ID = ? and Pharmacy_ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, medicine_id);
            preparedStatement.setString(2, pharmacy_id);
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
        java.util.logging.Logger.getLogger(Pharmacy_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Pharmacy_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Pharmacy_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Pharmacy_main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Pharmacy_main_screen(pharmacy_id, pharmacy_name, user_name).setVisible(true);
        }
    });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnSecileniSil;
    private javax.swing.JButton btnİlacEkle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHosgeldin;
    private javax.swing.JTable tblİlaclar;
    // End of variables declaration//GEN-END:variables
}
