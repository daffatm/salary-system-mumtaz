/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mumtaz.salary.model;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import com.mumtaz.salary.db.Koneksi;

/**
 *
 * @author dzaki
 */
public class ModelLaporan {
    
    
    
    public void Filter (){
        
        Koneksi connect = new Koneksi();
            String sql = "SELECT * FROM pegawai WHERE '2021-12-30' ";
        try {
          PreparedStatement eksekusi = connect.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
          JOptionPane.showMessageDialog(null,"data berhasil disimpan");
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
    }
    
    
}
