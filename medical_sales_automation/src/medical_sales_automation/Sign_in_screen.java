package medical_sales_automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Omer Faruk
 */
public class Sign_in_screen extends javax.swing.JFrame {
    public Sign_in_screen() {
        initComponents();
    }
    public void userInsert() throws SQLException{
        Connection connection = null;
        medical_sales_automation.DbHelper dbHelper = new medical_sales_automation.DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "insert into users.infos (Name, Surname, Email, User_name, Password)"
                    + "values (?, ?, ?, ?, ?);";
            statement = connection.prepareStatement(sql);
            statement.setString(1, txtKullaniciAd.getText());
            statement.setString(2, txtKullaniciSoyad.getText());
            statement.setString(3, txtKullaniciEmail.getText());
            statement.setString(4, txtKullaniciKullaniciAdi.getText());
            statement.setString(5, txtKullaniciSifre.getText());
            
            List list = new List();
            ArrayList<User> users = list.getKullanicilar();
            boolean flag = false;
            for (User user : users){
                if (user.getUser_name().equals(txtKullaniciKullaniciAdi.getText())){
                    flag = true;
                    break;
                }
            }
            if (flag){
                JOptionPane.showMessageDialog(rootPane,"Kullanıcı adı mevcut."); 
                txtKullaniciAd.setText("");
                txtKullaniciSoyad.setText("");
                txtKullaniciEmail.setText("");
                txtKullaniciKullaniciAdi.setText("");
                txtKullaniciSifre.setText("");
            }
            else{
                statement.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"Kayıt olundu.");
                Log_in_screen log_in_screen = new Log_in_screen();
                log_in_screen.setVisible(true);
                dispose();
            }
        } catch (SQLException sqlException) {
            dbHelper.showErrorMessage(sqlException);
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    public void pharmacyInsert () throws SQLException{
        Connection connection = null;
        medical_sales_automation.DbHelper dbHelper = new medical_sales_automation.DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "insert into users.pharmacies (Business_no, Business_name, Email, User_name, Password)"
                    + "values (?, ?, ?, ?, ?);";
            statement = connection.prepareStatement(sql);
            statement.setString(1, txtKurumNo.getText());
            statement.setString(2, txtKurumAdi.getText());
            statement.setString(3, txtKurumEmail.getText());
            statement.setString(4, txtKurumKullaniciAdi.getText());
            statement.setString(5, txtKurumSifre.getText());
            
            List list = new List();
            ArrayList<Pharmacy> pharmacies = list.getKurumlar();
            boolean flag = false;
            for (Pharmacy pharmacy : pharmacies){
                if (pharmacy.getPharmacy_name().equals(txtKurumKullaniciAdi.getText())){
                    flag = true;
                    break;
                }
            }
            if (flag){
                JOptionPane.showMessageDialog(rootPane,"Kullanıcı adı mevcut."); 
                txtKurumNo.setText("");
                txtKurumAdi.setText("");
                txtKurumEmail.setText("");
                txtKurumKullaniciAdi.setText("");
                txtKurumSifre.setText("");
            }
            else{
                statement.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"Kayıt olundu.");
                Log_in_screen log_in_screen = new Log_in_screen();
                log_in_screen.setVisible(true);
                dispose();
            }
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
        btnGeri = new javax.swing.JButton();
        tbdUyelik = new javax.swing.JTabbedPane();
        pnlKurumUyeligi = new javax.swing.JPanel();
        lblKurumNo = new javax.swing.JLabel();
        lblKurumEmail = new javax.swing.JLabel();
        lblKurumKullaniciAdi = new javax.swing.JLabel();
        lblKurumSifre = new javax.swing.JLabel();
        lblKurumAdi = new javax.swing.JLabel();
        txtKurumAdi = new javax.swing.JTextField();
        txtKurumNo = new javax.swing.JTextField();
        txtKurumKullaniciAdi = new javax.swing.JTextField();
        txtKurumEmail = new javax.swing.JTextField();
        txtKurumSifre = new javax.swing.JPasswordField();
        btnKurumUyeOl = new javax.swing.JButton();
        pnlKullaniciUyeligi = new javax.swing.JPanel();
        lblKullaniciAd = new javax.swing.JLabel();
        lblKullaniciSoyad = new javax.swing.JLabel();
        lblKullaniciEmail = new javax.swing.JLabel();
        lblKullaniciKullaniciAdi = new javax.swing.JLabel();
        lblKullaniciSifre = new javax.swing.JLabel();
        txtKullaniciAd = new javax.swing.JTextField();
        txtKullaniciSoyad = new javax.swing.JTextField();
        txtKullaniciEmail = new javax.swing.JTextField();
        txtKullaniciKullaniciAdi = new javax.swing.JTextField();
        txtKullaniciSifre = new javax.swing.JPasswordField();
        btnKullaniciUyeOl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Üye Ol");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        btnGeri.setBackground(new java.awt.Color(255, 51, 51));
        btnGeri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGeri.setForeground(new java.awt.Color(255, 255, 255));
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        tbdUyelik.setBackground(new java.awt.Color(204, 255, 255));

        pnlKurumUyeligi.setBackground(new java.awt.Color(204, 255, 255));

        lblKurumNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumNo.setText("Kurum No:");

        lblKurumEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumEmail.setText("E-mail:");

        lblKurumKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumKullaniciAdi.setText("Kullanıcı Adı:");

        lblKurumSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumSifre.setText("Şifre:");

        lblKurumAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumAdi.setText("Kurum Adı:");

        txtKurumAdi.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKurumNo.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKurumKullaniciAdi.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKurumEmail.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKurumSifre.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnKurumUyeOl.setBackground(new java.awt.Color(0, 153, 0));
        btnKurumUyeOl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKurumUyeOl.setForeground(new java.awt.Color(255, 255, 255));
        btnKurumUyeOl.setText("Üye Ol");
        btnKurumUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurumUyeOlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKurumUyeligiLayout = new javax.swing.GroupLayout(pnlKurumUyeligi);
        pnlKurumUyeligi.setLayout(pnlKurumUyeligiLayout);
        pnlKurumUyeligiLayout.setHorizontalGroup(
            pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKurumUyeligiLayout.createSequentialGroup()
                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKurumUyeligiLayout.createSequentialGroup()
                        .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKurumUyeligiLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKurumNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKurumEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKurumUyeligiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKurumKullaniciAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKurumSifre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKurumNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKurumEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKurumKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlKurumUyeligiLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnKurumUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlKurumUyeligiLayout.setVerticalGroup(
            pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKurumUyeligiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKurumUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnKurumUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbdUyelik.addTab("Kurum Üyeliği", pnlKurumUyeligi);

        pnlKullaniciUyeligi.setBackground(new java.awt.Color(204, 255, 255));

        lblKullaniciAd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciAd.setText("Ad:");

        lblKullaniciSoyad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciSoyad.setText("Soyad:");

        lblKullaniciEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciEmail.setText("E-mail:");

        lblKullaniciKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciKullaniciAdi.setText("Kullanıcı Adı:");

        lblKullaniciSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciSifre.setText("Şifre:");

        txtKullaniciAd.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciAd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKullaniciSoyad.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciSoyad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKullaniciEmail.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKullaniciKullaniciAdi.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKullaniciSifre.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnKullaniciUyeOl.setBackground(new java.awt.Color(0, 153, 0));
        btnKullaniciUyeOl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKullaniciUyeOl.setForeground(new java.awt.Color(255, 255, 255));
        btnKullaniciUyeOl.setText("Üye Ol");
        btnKullaniciUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciUyeOlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKullaniciUyeligiLayout = new javax.swing.GroupLayout(pnlKullaniciUyeligi);
        pnlKullaniciUyeligi.setLayout(pnlKullaniciUyeligiLayout);
        pnlKullaniciUyeligiLayout.setHorizontalGroup(
            pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciUyeligiLayout.createSequentialGroup()
                .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciUyeligiLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnKullaniciUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKullaniciUyeligiLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKullaniciSifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKullaniciAd, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lblKullaniciSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKullaniciEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKullaniciKullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKullaniciAd, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtKullaniciSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtKullaniciEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtKullaniciKullaniciAdi)
                            .addComponent(txtKullaniciSifre))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlKullaniciUyeligiLayout.setVerticalGroup(
            pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciUyeligiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKullaniciAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKullaniciSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKullaniciEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKullaniciKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciUyeligiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnKullaniciUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        tbdUyelik.addTab("Kullanıcı Üyeliği", pnlKullaniciUyeligi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdUyelik)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnGeri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tbdUyelik, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeri)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKullaniciUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciUyeOlActionPerformed
        try {
            // TODO add your handling code here:
            userInsert();
        } catch (SQLException exception) {
            Logger.getLogger(Sign_in_screen.class.getName()).log(Level.SEVERE, null, exception);
        }
    }//GEN-LAST:event_btnKullaniciUyeOlActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        Log_in_screen log_in_screen = new Log_in_screen();
        log_in_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnKurumUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurumUyeOlActionPerformed
        try {
            // TODO add your handling code here:
            pharmacyInsert();
        } catch (SQLException ex) {
            Logger.getLogger(Sign_in_screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKurumUyeOlActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_in_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnKullaniciUyeOl;
    private javax.swing.JButton btnKurumUyeOl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKullaniciAd;
    private javax.swing.JLabel lblKullaniciEmail;
    private javax.swing.JLabel lblKullaniciKullaniciAdi;
    private javax.swing.JLabel lblKullaniciSifre;
    private javax.swing.JLabel lblKullaniciSoyad;
    private javax.swing.JLabel lblKurumAdi;
    private javax.swing.JLabel lblKurumEmail;
    private javax.swing.JLabel lblKurumKullaniciAdi;
    private javax.swing.JLabel lblKurumNo;
    private javax.swing.JLabel lblKurumSifre;
    private javax.swing.JPanel pnlKullaniciUyeligi;
    private javax.swing.JPanel pnlKurumUyeligi;
    private javax.swing.JTabbedPane tbdUyelik;
    private javax.swing.JTextField txtKullaniciAd;
    private javax.swing.JTextField txtKullaniciEmail;
    private javax.swing.JTextField txtKullaniciKullaniciAdi;
    private javax.swing.JPasswordField txtKullaniciSifre;
    private javax.swing.JTextField txtKullaniciSoyad;
    private javax.swing.JTextField txtKurumAdi;
    private javax.swing.JTextField txtKurumEmail;
    private javax.swing.JTextField txtKurumKullaniciAdi;
    private javax.swing.JTextField txtKurumNo;
    private javax.swing.JPasswordField txtKurumSifre;
    // End of variables declaration//GEN-END:variables
}
