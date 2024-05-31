package medical_sales_automation;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * @author Omer Faruk
 */
public class Log_in_screen extends javax.swing.JFrame {
    public Log_in_screen() {
        FlatMacLightLaf.setup();
        initComponents();
    }
    public ArrayList<Pharmacy_detail> Insert(String user_name) throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Pharmacy_detail> pharmacies_details = new ArrayList<>();

        try {
            connection = dbHelper.getConnection();
            String sql = "SELECT Business_no, Business_name FROM Pharmacies WHERE User_name = ?";
            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user_name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                pharmacies_details.add(new Pharmacy_detail(
                        resultSet.getString("Business_no"),
                        resultSet.getString("Business_name")
                ));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
        return pharmacies_details;
    }
    public JTextField getTxtKurumAdi() {
        return txtKurumAdi;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbdGiris = new javax.swing.JTabbedPane();
        tbdKurumGiris = new javax.swing.JPanel();
        lblKurumAdi = new javax.swing.JLabel();
        lblKurumSifre = new javax.swing.JLabel();
        txtKurumSifre = new javax.swing.JPasswordField();
        btnKurumGirisYap = new javax.swing.JButton();
        txtKurumAdi = new javax.swing.JTextField();
        tbdKullaniciGiris = new javax.swing.JPanel();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblKullaniciSifre = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtKullaniciSifre = new javax.swing.JPasswordField();
        btnKullaniciGirisYap = new javax.swing.JButton();
        lblUyeMisin = new javax.swing.JLabel();
        btnUyeOl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Yap");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        tbdGiris.setBackground(new java.awt.Color(204, 255, 255));
        tbdGiris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tbdKurumGiris.setBackground(new java.awt.Color(204, 255, 255));

        lblKurumAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumAdi.setText("Kullanıcı Adı:");

        lblKurumSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKurumSifre.setText("Şifre:");
        lblKurumSifre.setMaximumSize(new java.awt.Dimension(74, 20));
        lblKurumSifre.setMinimumSize(new java.awt.Dimension(74, 20));

        txtKurumSifre.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKurumSifre.setPreferredSize(new java.awt.Dimension(74, 20));

        btnKurumGirisYap.setBackground(new java.awt.Color(0, 153, 0));
        btnKurumGirisYap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKurumGirisYap.setForeground(new java.awt.Color(255, 255, 255));
        btnKurumGirisYap.setText("Giriş Yap");
        btnKurumGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurumGirisYapActionPerformed(evt);
            }
        });

        txtKurumAdi.setBackground(new java.awt.Color(204, 255, 255));
        txtKurumAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKurumAdi.setPreferredSize(new java.awt.Dimension(74, 20));

        javax.swing.GroupLayout tbdKurumGirisLayout = new javax.swing.GroupLayout(tbdKurumGiris);
        tbdKurumGiris.setLayout(tbdKurumGirisLayout);
        tbdKurumGirisLayout.setHorizontalGroup(
            tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbdKurumGirisLayout.createSequentialGroup()
                .addGroup(tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbdKurumGirisLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tbdKurumGirisLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnKurumGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        tbdKurumGirisLayout.setVerticalGroup(
            tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbdKurumGirisLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tbdKurumGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKurumSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnKurumGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        tbdGiris.addTab("Kurum Girişi", tbdKurumGiris);

        tbdKullaniciGiris.setBackground(new java.awt.Color(204, 255, 255));

        lblKullaniciAdi.setBackground(new java.awt.Color(204, 255, 255));
        lblKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı:");

        lblKullaniciSifre.setBackground(new java.awt.Color(204, 255, 255));
        lblKullaniciSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKullaniciSifre.setText("Şifre:");
        lblKullaniciSifre.setMaximumSize(new java.awt.Dimension(74, 20));
        lblKullaniciSifre.setMinimumSize(new java.awt.Dimension(74, 20));

        txtKullaniciAdi.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKullaniciAdi.setPreferredSize(new java.awt.Dimension(74, 20));

        txtKullaniciSifre.setBackground(new java.awt.Color(204, 255, 255));
        txtKullaniciSifre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKullaniciSifre.setPreferredSize(new java.awt.Dimension(74, 20));

        btnKullaniciGirisYap.setBackground(new java.awt.Color(0, 153, 0));
        btnKullaniciGirisYap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKullaniciGirisYap.setForeground(new java.awt.Color(255, 255, 255));
        btnKullaniciGirisYap.setText("Giriş Yap");
        btnKullaniciGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciGirisYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbdKullaniciGirisLayout = new javax.swing.GroupLayout(tbdKullaniciGiris);
        tbdKullaniciGiris.setLayout(tbdKullaniciGirisLayout);
        tbdKullaniciGirisLayout.setHorizontalGroup(
            tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbdKullaniciGirisLayout.createSequentialGroup()
                .addGroup(tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbdKullaniciGirisLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnKullaniciGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tbdKullaniciGirisLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtKullaniciSifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(163, 163, 163))
        );
        tbdKullaniciGirisLayout.setVerticalGroup(
            tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbdKullaniciGirisLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tbdKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnKullaniciGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        tbdGiris.addTab("Kullanıcı Girişi", tbdKullaniciGiris);

        lblUyeMisin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUyeMisin.setText("Üye değil misiniz?");

        btnUyeOl.setBackground(new java.awt.Color(0, 153, 0));
        btnUyeOl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUyeOl.setForeground(new java.awt.Color(255, 255, 255));
        btnUyeOl.setText("Üye ol");
        btnUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeOlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbdGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblUyeMisin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUyeOl)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tbdGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUyeOl)
                    .addComponent(lblUyeMisin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeOlActionPerformed
        // TODO add your handling code here:
        Sign_in_screen sign_in_screen = new Sign_in_screen();
        sign_in_screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUyeOlActionPerformed

    private void btnKullaniciGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciGirisYapActionPerformed
        // TODO add your handling code here:
        List list = new List();
        try {
            ArrayList<User> users = list.getKullanicilar();
            boolean flag= false;
            for (User user : users){
                if (user.getUser_name().equals(txtKullaniciAdi.getText()) && user.getPassword().equals(txtKullaniciSifre.getText())) {
                    flag = true;
                    break;
                }
            }
            if (flag){
                String user_name = txtKullaniciAdi.getText();
                
                User_main_screen user_main_screen = new User_main_screen(user_name);
                user_main_screen.setVisible(true);
                dispose();
            }
            else{
                txtKullaniciAdi.setText("");
                txtKullaniciSifre.setText("");
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı veya şifre hatalı");
            }
        } catch (SQLException exception) {
            
        }
    }//GEN-LAST:event_btnKullaniciGirisYapActionPerformed

    private void btnKurumGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurumGirisYapActionPerformed
          // TODO add your handling code here:
          String user_name = txtKurumAdi.getText();
    try {
        ArrayList<Pharmacy_detail> pharmacies_details = Insert(user_name);

        if (!pharmacies_details.isEmpty()) {
            Pharmacy_detail detail = pharmacies_details.get(0);
            String pharmacy_id = detail.getPharmacy_id();
            String pharmacy_name = detail.getPharmacy_name();
            
            Pharmacy_main_screen pharmacies_main_screen = new Pharmacy_main_screen(pharmacy_id, pharmacy_name, user_name);
            pharmacies_main_screen.setVisible(true);
            dispose();
        } else {
            txtKurumAdi.setText("");
            txtKurumSifre.setText("");
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı veya şifre hatalı");
        }

    } catch (SQLException ex) {
        Logger.getLogger(Log_in_screen.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnKurumGirisYapActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKullaniciGirisYap;
    private javax.swing.JButton btnKurumGirisYap;
    private javax.swing.JButton btnUyeOl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblKullaniciSifre;
    private javax.swing.JLabel lblKurumAdi;
    private javax.swing.JLabel lblKurumSifre;
    private javax.swing.JLabel lblUyeMisin;
    private javax.swing.JTabbedPane tbdGiris;
    private javax.swing.JPanel tbdKullaniciGiris;
    private javax.swing.JPanel tbdKurumGiris;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtKullaniciSifre;
    private javax.swing.JTextField txtKurumAdi;
    private javax.swing.JPasswordField txtKurumSifre;
    // End of variables declaration//GEN-END:variables
}
