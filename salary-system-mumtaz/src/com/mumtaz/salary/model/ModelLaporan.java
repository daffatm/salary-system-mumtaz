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
    private String fromDate;
    private String toDate;

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
    
    
    public void Filter (){
        
        Koneksi connect = new Koneksi();
        
        
        
            String sql = "SELECT * FROM penggajian WHERE tglGajian >= "+getToDate()+" && tglGajian <= "+getFromDate()+"";
        try {
          PreparedStatement eksekusi = connect.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
          JOptionPane.showMessageDialog(null,"data berhasil disimpan");
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
    }
    
    
}
