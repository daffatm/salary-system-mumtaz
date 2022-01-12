/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mumtaz.salary.model;

import com.mumtaz.salary.db.Koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author erdiansyah
 */
public class ModelPinjaman {
    Koneksi koneksi = new Koneksi();
    private String idPegawai;
    private int kasbon;

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public int getKasbon() {
        return kasbon;
    }

    public void setKasbon(int kasbon) {
        this.kasbon = kasbon;
    }
    
    
    public void updatePinjaman(){
        String sql = "UPDATE pegawai SET kasbon = '"+getKasbon()+"' WHERE idPegawai = '"+getIdPegawai()+"'";
        
        try {
          PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
          JOptionPane.showMessageDialog(null,"data berhasil disimpan");
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
    }
}
