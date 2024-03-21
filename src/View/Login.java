/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Koneksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Bryan
 */
public class Login extends javax.swing.JFrame {
    Connection con; // mendeklarasikan dan membuat variabel koneksi
    Statement stat; // mendeklarasikan dan membuat variabel statement
    ResultSet rs; // mendeklarasikan dan membuat variabel resultset
    String sql; // mendeklarasikan dan membuat variabel String
    String user, pass; // mendeklarasikan dan membuat variabel String
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Koneksi DB = new Koneksi(); // membuat objek dari kelas koneksi
        DB.config(); // memanggil kelas konfik dengan objek DB
        con = DB.con; // memasukan koneksi dengan koneksi milik DB
        stat = DB.stm; // memasukan statement dengan statement milik DB
    }
    
    public void bersih(){ // membuat method bersih
    txtuser.setText(""); // membuat teks field txtuser bernilai kosong
    fieldpass.setText(""); // membuat teks field fieldpass bernilai kosong
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        signup = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        fieldpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        loginbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 143, 157));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(59, 172, 182));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(130, 219, 216));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(47, 143, 157));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup.setBackground(new java.awt.Color(59, 172, 182));
        signup.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel4.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 50));

        exitbtn.setBackground(new java.awt.Color(59, 172, 182));
        exitbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel4.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 110, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 68)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 220, 100));

        username.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));

        password.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("password");
        jPanel4.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 40));
        jPanel4.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, 30));

        fieldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpassActionPerformed(evt);
            }
        });
        jPanel4.add(fieldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tugas (2).png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, 140));

        loginbtn1.setBackground(new java.awt.Color(59, 172, 182));
        loginbtn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        loginbtn1.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn1.setText("login");
        loginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn1ActionPerformed(evt);
            }
        });
        jPanel4.add(loginbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 630, 390));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 850, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        new Signup().setVisible(true); // memanggil kelas signup untuk ditampilkan 
        dispose(); // menutup jframe login
    }//GEN-LAST:event_signupActionPerformed

    private void fieldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpassActionPerformed

    }//GEN-LAST:event_fieldpassActionPerformed

    private void loginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn1ActionPerformed
        try{
            user = txtuser.getText(); // memasukan variabel string user dengan isi teks field txtuser
            pass = fieldpass.getText(); // memasukan variabel string pass dengan isi teks field fieldpass

            sql = "SELECT * FROM tbsignup WHERE username='"+user+"' AND password='"+pass+"'"; 
            // menginisialisasikan string sql dengan syntax mysql yang mengambil data dari tabel database tbsignup
            rs = stat.executeQuery(sql); // memasukan resultset dengan statement dari query sql yang dipilih
            if(rs.next()){ // jika rs.next bernilai true
                if(user.equals(rs.getString("username")) && pass.equals(rs.getString("password"))){ 
                // menyeleksi apakah username dan password pada teks field sama dengan username dan password pada database
                    JOptionPane.showMessageDialog(null, "Login Successful!"); // Menampilkan message box
                    new Dashboard().setVisible(true); // memanggil kelas Dashboard untuk ditampilkan 
                    dispose(); // menutup jframe login
                } else if(!user.equals(rs.getString("username")) && !pass.equals(rs.getString("password"))){ 
                  //jika kondisi pertama tidak terpenuhi maka akan menyeleksi apakah username dan password yang dimasukan tidak sama dengan username dan password pada database
                    JOptionPane.showMessageDialog(null, "Login Gagal!");  // Menampilkan message box
                    bersih(); // memanggil method bersih() untuk membersihkan teks field
                } else if(user == "" && pass == ""){ // jika kondisi kedua tidak terpenuhi maka menyeleksi apakah username dan password yang dimasukan kosong
                    JOptionPane.showMessageDialog(null, "Username atau Password masih kosong!"); // Menampilkan message box
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_loginbtn1ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
       dispose();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x, y);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JPasswordField fieldpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginbtn1;
    private javax.swing.JLabel password;
    private javax.swing.JButton signup;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}