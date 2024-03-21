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
public class TampilBarang extends javax.swing.JFrame {
       Connection con; // mendeklarasikan dan membuat variabel koneksi
       Statement stat; // mendeklarasikan dan membuat variabel statement
       ResultSet rs; // mendeklarasikan dan membuat variabel resultset
       String sql; // mendeklarasikan dan membuat variabel String
       DefaultTableModel model; // mendeklarasikan dan membuat variabel tabel
    /**
     * Creates new form TampilBarang
     */
    public TampilBarang() {
        initComponents();
        Koneksi DB = new Koneksi(); // membuat objek dari kelas koneksi
        DB.config(); // memanggil kelas konfik dengan objek DB
        con = DB.con; // memasukan koneksi dengan koneksi milik DB
        stat = DB.stm; // memasukan statement dengan statement milik DB
        String [] judul = {"Kode", "Nama Barang", "Kode Satuan", "Satuan", "Harga Beli", "Harga Jual", "Quantity", "Diskon", "Total Harga Jual", "Total Harga Beli"};
        // mendeklarasikan variabel string dan menginisialisasikan nya
        model = new DefaultTableModel(judul,0); // memasukan variabel model milik tabel dengan model tabel baru yang dibentuk dari string judul
        tabelakhir.setModel(model); // membuat model jtable dengan variabel model
        showdat(); // memanggil method showdat()
        showprice(); // memanggil method show_cbx
    }
    
    private void showdat(){ // membuat method showdat()
        int row = tabelakhir.getRowCount(); // mendeklarasikan integer row dan mengisi nya dengan jumlah baris pada jtable
        for(int i=0; i<row;i++){ // membuat loop
            model.removeRow(0); // membersihkan semua baris tabel
        }
        try{
            sql = "SELECT * FROM tbdatabrg"; // menginisialisasikan string sql dengan syntax mysql yang mengambil data dari tabel database tbdatabrg
            rs = stat.executeQuery(sql); // memasukan resultset dengan statement dari query sql yang dipilih
            while(rs.next()){ // membuat perulangan untuk mengetahui isi baris tabel database
               double hitungjual = (Double.parseDouble(rs.getString(5)) * 0.2) + Double.parseDouble(rs.getString(5)); //menghitung hargajual
               String hargajual = String.valueOf(hitungjual); // mengubah tipe data harga jual
               double diskon = Double.parseDouble(rs.getString(5)) * 0.1; // menghitung diskon
               String txtdiskon = String.valueOf(diskon); // mengubah tipe data diskon
               double totaljual = Double.parseDouble(rs.getString(6)) * hitungjual; // menghitung total jual
               String txttotaljual = String.valueOf(totaljual); // mengubah tipe data total jual
               double totalbeli = Double.parseDouble(rs.getString(6)) * Double.parseDouble(rs.getString(5)) - diskon; // menghitung total beli
               String txttotalbeli = String.valueOf(totalbeli); // mengubah tipe data total beli
               String data []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), hargajual, rs.getString(6), txtdiskon, txttotaljual, txttotalbeli};
               // mendeklarasikan string data dan mengisi nilai nya dengan data yang ada pada baris tabel database
               model.addRow(data); // memasukan data sebagai baris baru pada jtable
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); // menampilkan message box
        }
    }
    
    private void showprice(){
        int row = tabelakhir.getRowCount(); // mendeklarasikan integer row dan memasukan nya dengan jumlah baris pada jtable
        double totalhargabeli = 0; // mendeklarasikan double totalhargabeli dan menginisialisasikan nya dengan nilai nol
        double totalhargajual = 0; // mendeklarasikan double totalhargajual dan menginisialisasikan nya dengan nilai nol
        
        for(int i=0; i<row;i++){ // melakukan loop
            totalhargajual = totalhargajual + Double.parseDouble((String) model.getValueAt(i, 8));
            // melakukan perhitungan totalhargajual
        }
        
        for(int i=0; i<row;i++){
            totalhargabeli = totalhargabeli + Double.parseDouble((String) model.getValueAt(i, 9));
            // melakukan perhitungan totalhargabeli
        }
        
        grandjual.setText(String.valueOf(totalhargajual)); // membuat teksfield grandjual memiliki nilai dari totalhargajual
        grandbeli.setText(String.valueOf(totalhargabeli)); // membuat teksfield grandbeli memiliki nilai dari totalhargabeli
    }
    
    private void reset(){ // membuat method reset()
        // membuat teks field bernilai kosong
        inputkode.setText("");
        sampekode.setText("");
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
        searchbtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelakhir = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        sampekode = new javax.swing.JTextField();
        grandbeli = new javax.swing.JTextField();
        inputkode = new javax.swing.JTextField();
        grandjual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel3.setText("DATA BARANG");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 490, 100));

        searchbtn.setBackground(new java.awt.Color(59, 172, 182));
        searchbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 110, 50));

        back.setBackground(new java.awt.Color(59, 172, 182));
        back.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, 50));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 60, 30));

        tabelakhir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Barang", "Kode Satuan", "Satuan", "Harga Beli", "Harga Jual", "Quantity", "Diskon", "Total Harga Jual", "Total Harga Beli"
            }
        ));
        jScrollPane1.setViewportView(tabelakhir);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1140, 210));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sampai Data Kode");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 30));
        jPanel3.add(sampekode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 180, 30));
        jPanel3.add(grandbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 130, 30));
        jPanel3.add(inputkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 180, 30));
        jPanel3.add(grandjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 130, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tampilkan Data Dari Kode");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 230, 40));

        resetbtn.setBackground(new java.awt.Color(59, 172, 182));
        resetbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel3.add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 110, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1200, 590));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String cari = inputkode.getText();  // Mendeklarasikan variabel string dan mengisi nya dengan nilai pada teksfield
        String sampe = sampekode.getText();  // Mendeklarasikan variabel string dan mengisi nya dengan nilai pada teksfield
        int row = tabelakhir.getRowCount(); // mendeklarasikan integer row dan mengisi nya dengan jumlah baris pada jtable
        for(int i=0; i<row;i++){ // membuat loop
            model.removeRow(0); // membersihkan semua baris tabel
        }
        try{
            sql = "SELECT * FROM tbdatabrg" ; // menginisialisasikan string sql dengan syntax mysql yang mengambil data dari tabel database tbdatabrg
            rs = stat.executeQuery(sql); // memasukan resultset dengan statement dari query sql yang dipilih
            if(inputkode.getText().equals("") || sampekode.getText().equals("")){
            // menyelekasi apakah teksfield masih kosong
                JOptionPane.showMessageDialog(null, "Data Masih Kosong"); // menampilkan message box
                showdat(); // memanggil method showdat()
            }else if(inputkode.getText().equals(sampekode.getText())){
            // jika kondisi pertama tidak terpenuhi maka menyeleksi apakah kodecari sama dengan kodesampe
               while(rs.next()){ // membuat perulangan untuk mengetahui isi baris tabel database
               double hitungjual = (Double.parseDouble(rs.getString(5)) * 0.2) + Double.parseDouble(rs.getString(5)); //menghitung hargajual
               String hargajual = String.valueOf(hitungjual); // mengubah tipe data harga jual
               double diskon = Double.parseDouble(rs.getString(5)) * 0.1; // menghitung diskon
               String txtdiskon = String.valueOf(diskon); // mengubah tipe data diskon
               double totaljual = Double.parseDouble(rs.getString(6)) * hitungjual; // menghitung total jual
               String txttotaljual = String.valueOf(totaljual); // mengubah tipe data total jual
               double totalbeli = Double.parseDouble(rs.getString(6)) * Double.parseDouble(rs.getString(5)) - diskon; // menghitung total beli
               String txttotalbeli = String.valueOf(totalbeli); // mengubah tipe data total beli
               if(rs.getString(1).equals(cari)){ // jika baris dan kolom pertama tabel database sama dengan cari
                    String data []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), hargajual, rs.getString(6), txtdiskon, txttotaljual, txttotalbeli};
                    // mendeklarasikan string data dan mengisi nilai nya dengan data yang ada pada baris tabel database
                    model.addRow(data); // memasukan data sebagai baris baru pada jtable
               }
              }
            }else{ //jika kondisi pertama dan kedua tidak terpenuhi
              while(rs.next()){ // membuat perulangan untuk mengetahui isi baris tabel database
               double hitungjual = (Double.parseDouble(rs.getString(5)) * 0.2) + Double.parseDouble(rs.getString(5)); //menghitung hargajual
               String hargajual = String.valueOf(hitungjual); // mengubah tipe data harga jual
               double diskon = Double.parseDouble(rs.getString(5)) * 0.1; // menghitung diskon
               String txtdiskon = String.valueOf(diskon); // mengubah tipe data diskon
               double totaljual = Double.parseDouble(rs.getString(6)) * hitungjual; // menghitung total jual
               String txttotaljual = String.valueOf(totaljual); // mengubah tipe data total jual
               double totalbeli = Double.parseDouble(rs.getString(6)) * Double.parseDouble(rs.getString(5)) - diskon; // menghitung total beli
               String txttotalbeli = String.valueOf(totalbeli); // mengubah tipe data total beli
                if(rs.getString(1).equals(cari)){ // jika baris dan kolom pertama tabel database sama dengan cari
                    String data []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), hargajual, rs.getString(6), txtdiskon, txttotaljual, txttotalbeli};
                    // mendeklarasikan string data dan mengisi nilai nya dengan data yang ada pada baris tabel database
                    model.addRow(data); // memasukan data sebagai baris baru pada jtable
                    while(rs.next()){ // membuat perulangan untuk mengetahui isi baris tabel database
                       double hitungjual2 = (Double.parseDouble(rs.getString(5)) * 0.2) + Double.parseDouble(rs.getString(5)); //menghitung hargajual
                       String hargajual2 = String.valueOf(hitungjual2); // mengubah tipe data harga jual
                       double diskon2 = Double.parseDouble(rs.getString(5)) * 0.1; // menghitung diskon
                       String txtdiskon2 = String.valueOf(diskon2); // mengubah tipe data diskon
                       double totaljual2 = Double.parseDouble(rs.getString(6)) * hitungjual2; // menghitung total jual
                       String txttotaljual2 = String.valueOf(totaljual2); // mengubah tipe data total jual
                       double totalbeli2 = Double.parseDouble(rs.getString(6)) * Double.parseDouble(rs.getString(5)) - diskon2; // menghitung total beli
                       String txttotalbeli2 = String.valueOf(totalbeli2); // mengubah tipe data total beli
                       String data2 []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), hargajual2, rs.getString(6), txtdiskon2, txttotaljual2, txttotalbeli2};
                       // mendeklarasikan string data dan mengisi nilai nya dengan data yang ada pada baris tabel database
                       model.addRow(data2); // memasukan data sebagai baris baru pada jtable
                       if(rs.getString(1).equals(sampe)){ // jika baris nilai kolom pertama tabel database sama dengan sampe
                           break; // melakukan operasi break loop
                       }
                    }
                }
             }
          } 
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); // menampilkan message box
        }
        showprice(); // memanggil method showprice
    }//GEN-LAST:event_searchbtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Dashboard().setVisible(true); // memanggil kelas Dashboard untuk ditampilkan
        dispose(); // menutup jframe SatuanBarang
    }//GEN-LAST:event_backActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x, y);
    }//GEN-LAST:event_formWindowActivated

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset(); // memanggil method reset()
        showdat(); // memanggil method showdat()
        showprice(); // memanggil method showprice()
    }//GEN-LAST:event_resetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(TampilBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField grandbeli;
    private javax.swing.JTextField grandjual;
    private javax.swing.JTextField inputkode;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField sampekode;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable tabelakhir;
    // End of variables declaration//GEN-END:variables
}
