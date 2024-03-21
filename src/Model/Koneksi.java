/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Bryan
 */
public class Koneksi {
    public static Connection con; // membuat deklarasi variabel dari koneksi
    public static Statement stm; // membuat deklarasi variabel dari statement
    
    public void config() { // membuat method config
       try{
           String url ="jdbc:mysql://localhost/uas32210021"; // mendeklarasikan variabel string untuk url dan menginisialisasikan nya dengan alamat database
           String user="root"; // mendeklarasikan variabel string untuk user dan menginisialisasikan nya dengan root
           String pass=""; // mendeklarasikan variabel string untuk pass dan menginisialisasikan nya dengan nilai kosong
           Class.forName("com.mysql.jdbc.Driver"); // memanggil kelas jdbc driver
           con = DriverManager.getConnection(url, user, pass); // memasukan variabel koneksi dengan koneksi driver yang telah diisi
           stm = con.createStatement(); // memasukan variabel statement dengan statement yang telah memiliki koneksi
           System.out.println("koneksi berhasil;"); // output berhasil
       }catch (Exception e){
           System.err.println("koneksi gagal" +e.getMessage()); // output jika terjadi kesalahan
       }
    }
}
