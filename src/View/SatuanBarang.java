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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bryan
 */
public class SatuanBarang extends javax.swing.JFrame {
       Connection con; // mendeklarasikan dan membuat variabel koneksi
       Statement stat; // mendeklarasikan dan membuat variabel statement
       ResultSet rs; // mendeklarasikan dan membuat variabel resultset
       String sql; // mendeklarasikan dan membuat variabel String
       DefaultTableModel model; // mendeklarasikan dan membuat variabel tabel
    /**
     * Creates new form SatuanBarang
     */
    public SatuanBarang() {
        initComponents();
        Koneksi DB = new Koneksi(); // membuat objek dari kelas koneksi
        DB.config(); // memanggil kelas konfik dengan objek DB
        con = DB.con; // memasukan koneksi dengan koneksi milik DB
        stat = DB.stm; // memasukan statement dengan statement milik DB
        String [] judul = {"Kode Satuan", "Satuan"}; // mendeklarasikan variabel string dan menginisialisasikan nya
        model = new DefaultTableModel(judul,0); // memasukan variabel model milik tabel dengan model tabel baru yang dibentuk dari string judul
        tabelsatuan.setModel(model); // membuat model jtable dengan variabel model
        showdat(); // memanggil method showdat()
    }
    
    private void showdat(){ // membuat method showdat()
        int row = tabelsatuan.getRowCount(); // mendeklarasikan integer row dan mengisi nya dengan jumlah baris pada jtable
        for(int i=0; i<row;i++){ // membuat loop
            model.removeRow(0); // membersihkan semua baris tabel
        }
        try{
            sql = "SELECT * FROM tbsatuan"; // menginisialisasikan string sql dengan syntax mysql yang mengambil data dari tabel database tbsatuan
            rs = stat.executeQuery(sql); // memasukan resultset dengan statement dari query sql yang dipilih
            while(rs.next()){ // membuat perulangan untuk mengetahui isi baris tabel database
               String data []= {rs.getString(1), rs.getString(2)}; 
                // mendeklarasikan string data dan mengisi nilai nya dengan data yang ada pada baris tabel database
               model.addRow(data); // memasukan data sebagai baris baru pada jtable
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); // menampilkan message box
        }
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
        jLabel3 = new javax.swing.JLabel();
        createbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtbarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelsatuan = new javax.swing.JTable();
        resetbtn = new javax.swing.JButton();

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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 68)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SATUAN BARANG");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 580, 100));

        createbtn.setBackground(new java.awt.Color(59, 172, 182));
        createbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        createbtn.setForeground(new java.awt.Color(255, 255, 255));
        createbtn.setText("create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });
        jPanel3.add(createbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, 50));

        updatebtn.setBackground(new java.awt.Color(59, 172, 182));
        updatebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 110, 50));

        deletebtn.setBackground(new java.awt.Color(59, 172, 182));
        deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel3.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 110, 50));

        back.setBackground(new java.awt.Color(59, 172, 182));
        back.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 110, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satuan");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 130, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kode Satuan");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, 40));
        jPanel3.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 250, 30));
        jPanel3.add(txtbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 250, 30));

        tabelsatuan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode Satuan", "Satuan"
            }
        ));
        tabelsatuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsatuanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelsatuan);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 480, 310));

        resetbtn.setBackground(new java.awt.Color(59, 172, 182));
        resetbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel3.add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 110, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1020, 560));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1060, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        try{
            if(txtbarang.getText().equals("") || txtkode.getText().equals("")){ // menyeleksi apakah teksfield txtbarang dan txtkode kosong
                JOptionPane.showMessageDialog(null,"Ada data yang belum di isi"); // menampilkan message box
                reset(); // memanggil method reset()
            }else{
                con.createStatement().executeUpdate("insert into tbsatuan values"+"('"+txtkode.getText()+"','"+txtbarang.getText()+"')"); 
                // membuat statement update pada sql untuk memasukan data ke table database
                showdat(); // memanggil method showdat()
                reset(); // memanggil method reset()
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ada data yang belum di isi"); // menampilkan message box
        }
    }//GEN-LAST:event_createbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try{
            if(txtbarang.getText().equals("") || txtkode.getText().equals("")){ // menyeleksi apakah teksfield txtbarang dan txtkode kosong
                JOptionPane.showMessageDialog(null,"Ada data yang belum di isi"); // menampilkan message box
                reset(); // memanggil method reset()
            }else{
                con.createStatement().executeUpdate("update tbsatuan set satuan='"+txtbarang.getText()+"' where kodesatuan='"+txtkode.getText()+"'"); // membuat statement update pada sql untuk mengganti data dari table database
                showdat(); // memanggil method showdat()
                reset(); // memanggil method reset()
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ada data yang belum di isi"); // menampilkan message box
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try {
            con.createStatement().executeUpdate("delete from tbsatuan where kodesatuan='"+txtkode.getText()+"'"); 
            // membuat statement update pada sql untuk menghapus data dari table database
            showdat(); // memanggil method showdat()
            reset(); // memanggil method reset()
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // menampilkan message box
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Dashboard().setVisible(true); // memanggil kelas Dashboard untuk ditampilkan
        dispose(); // menutup jframe SatuanBarang
    }//GEN-LAST:event_backActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset(); // memanggil method reset
    }//GEN-LAST:event_resetbtnActionPerformed

    private void tabelsatuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsatuanMouseClicked
        int i = tabelsatuan.getSelectedRow(); // mendeklarasikan variabel integer dan memasukannya dengan indeks baris jtable yang dipilih
        if(i>-1){ // jika i lebih besar dari -1
           txtkode.setText(model.getValueAt(i,0).toString()); // membuat teksfield memiliki isi value dari baris dan kolom indeks jtable yang dipilih
           txtbarang.setText(model.getValueAt(i,1).toString()); // membuat teksfield memiliki isi value dari baris dan kolom indeks jtable yang dipilih
        }
    }//GEN-LAST:event_tabelsatuanMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x, y);
    }//GEN-LAST:event_formWindowActivated

     private void reset(){
        // membuat teks field bernilai kosong
        txtbarang.setText("");
        txtkode.setText("");
    }
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
            java.util.logging.Logger.getLogger(SatuanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SatuanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SatuanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SatuanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SatuanBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTable tabelsatuan;
    private javax.swing.JTextField txtbarang;
    private javax.swing.JTextField txtkode;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
