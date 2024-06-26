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
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    String user, pass, repass; // mendeklarasikan dan membuat variabel String
    int panjangUser=50; // mendeklarasi integer dan menginisialisasikan nya dengan 50
    
    Connection con; // mendeklarasikan dan membuat variabel koneksi
    Statement stm; // mendeklarasikan dan membuat variabel statement
    ResultSet rs; // mendeklarasikan dan membuat variabel resultset
    public Signup() {
        initComponents();
        Koneksi DB = new Koneksi(); // membuat objek dari kelas koneksi
        DB.config(); // memanggil kelas konfik dengan objek DB
        con = DB.con; // memasukan koneksi dengan koneksi milik DB
        stm = (Statement) DB.stm; // memasukan statement dengan statement milik DB
    }
    
    public void bersih(){ // membuat method bersih
    txtuser.setText("");  // membuat teks field txtuser bernilai kosong
    fieldpass.setText(""); // membuat teks field fieldpass bernilai kosong
    fieldrepass.setText(""); // membuat teks field repass bernilai kosong
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
        exitbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        fieldpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        repassword = new javax.swing.JLabel();
        fieldrepass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        exitbtn.setBackground(new java.awt.Color(59, 172, 182));
        exitbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel4.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 110, 50));

        savebtn.setBackground(new java.awt.Color(59, 172, 182));
        savebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        jPanel4.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 110, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 68)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SIGNUP");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 250, 100));

        username.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 40));

        password.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("password");
        jPanel4.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 40));
        jPanel4.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, 30));

        fieldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpassActionPerformed(evt);
            }
        });
        jPanel4.add(fieldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tugas (2).png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 150, 140));

        repassword.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        repassword.setForeground(new java.awt.Color(255, 255, 255));
        repassword.setText("re-password");
        jPanel4.add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        jPanel4.add(fieldrepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 230, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 630, 420));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 850, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        new Menu().setVisible(true); // memanggil kelas Menu untuk ditampilkan 
        dispose(); // menutup jframe login
    }//GEN-LAST:event_exitbtnActionPerformed

    private void fieldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpassActionPerformed

    }//GEN-LAST:event_fieldpassActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        pass = fieldpass.getText(); // memasukan variabel string pass dengan isi teks field fieldpass
        repass = fieldrepass.getText(); // memasukan variabel string pass dengan isi teks field passworrd
        panjangUser = txtuser.getText().length(); // memasukan variabel string user dengan isi teks field txtuser
        
        try{
            if(repass.equals(pass) && panjangUser >= 3){ // menyeleksi apakah password sama dengan repassword dan panjang username lebih dari sama dengan 3
                stm.executeUpdate("insert into tbsignup values (" // membuat statement update pada sql untuk memasukan data ke table database
                        + "'" + txtuser.getText() + "',"
                        + "'" + String.valueOf(fieldpass.getPassword()) + "',"
                        + "'" + String.valueOf(fieldrepass.getPassword()) + "')"
                );
                {
                    JOptionPane.showMessageDialog(null, "Save Succsesfull"); // menampilkan message box
                }
                bersih(); // memanggil method bersih() untuk membersihkan teksfield
            }else{
                JOptionPane.showMessageDialog(null, "Masukan Username Lebih Panjang"); // menampilkan message box
                bersih();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "ERROR"); // menampilkan message box
        }
        new Menu().setVisible(true); // memanggil kelas Menu untuk ditampilkan
        dispose(); // memanggil method dispose() untuk menutup tampilan signup
    }//GEN-LAST:event_savebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JPasswordField fieldpass;
    private javax.swing.JPasswordField fieldrepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel password;
    private javax.swing.JLabel repassword;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
