package medical_sales_automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 * @author Omer Faruk
 */
public class User_add_medicine_screen extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    private String user_name;
    public User_add_medicine_screen(String user_name) {
        initComponents();
        defaultTableModel = (DefaultTableModel)tblTumİlaclar.getModel();
        this.user_name = user_name ;
        List list = new List();
        try {
            ArrayList<Medicine> medicines = list.getTumIlaclar();
            for (Medicine medicine : medicines){
                Object[] satir ={medicine.getPharmacy_id(), medicine.getMedicine_id(), medicine.getMedicine_name(), 
                    medicine.getPharmacy_name(), medicine.getDosage(), medicine.getStock(), medicine.getTime(), medicine.getForm()};
                defaultTableModel.addRow(satir);
            }
        } catch (SQLException exception) {
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTumİlaclar = new javax.swing.JTable();
        btnGeri = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("İlaç Talep Et");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        tblTumİlaclar.setBackground(new java.awt.Color(204, 255, 255));
        tblTumİlaclar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTumİlaclar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kurum No", "İlaç No", "İlaç Adı", "Kurum Adı", "Dozaj", "Stok Adedi", "Süre", "Form"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTumİlaclar.setRowHeight(30);
        jScrollPane1.setViewportView(tblTumİlaclar);
        if (tblTumİlaclar.getColumnModel().getColumnCount() > 0) {
            tblTumİlaclar.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblTumİlaclar.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblTumİlaclar.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblTumİlaclar.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        btnGeri.setBackground(new java.awt.Color(255, 0, 0));
        btnGeri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGeri.setForeground(new java.awt.Color(255, 255, 255));
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        btnEkle.setBackground(new java.awt.Color(0, 153, 0));
        btnEkle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEkle.setForeground(new java.awt.Color(255, 255, 255));
        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(372, 522, Short.MAX_VALUE)
                        .addComponent(btnGeri))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGeri)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        User_main_screen user_main_screen = new User_main_screen(user_name);
        user_main_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        // TODO add your handling code here:
        int index = tblTumİlaclar.getSelectedRow();
    if (index != -1) {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "INSERT INTO medicines (Pharmacy_id, User_ID, Medicine_ID, Name, Pharmacy_name, Dosage, Stock, Time, Form)" +
                    "values (?,?,?,?,?,?,?,?,?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, (String) tblTumİlaclar.getValueAt(index, 0));
            preparedStatement.setString(2, user_name);
            preparedStatement.setString(3, (String) tblTumİlaclar.getValueAt(index, 1));
            preparedStatement.setString(4, (String) tblTumİlaclar.getValueAt(index, 2));
            preparedStatement.setString(5, (String) tblTumİlaclar.getValueAt(index, 3));
            preparedStatement.setString(6, (String) tblTumİlaclar.getValueAt(index, 4));
            preparedStatement.setString(7, (String) tblTumİlaclar.getValueAt(index, 5));
            preparedStatement.setString(8, (String) tblTumİlaclar.getValueAt(index, 6));
            preparedStatement.setString(9, (String) tblTumİlaclar.getValueAt(index, 7));
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "İlaç başarıyla eklendi.");

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(rootPane, "İlaç eklenirken bir hata oluştu.");
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException exception) {
                
            }
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "Lütfen bir ilaç seçin.");
    }
    }//GEN-LAST:event_btnEkleActionPerformed

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
            java.util.logging.Logger.getLogger(User_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_add_medicine_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_add_medicine_screen(user_name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGeri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTumİlaclar;
    // End of variables declaration//GEN-END:variables
}
