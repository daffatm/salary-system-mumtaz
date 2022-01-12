package com.mumtaz.salary.model;



import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import com.mumtaz.salary.db.Koneksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dzaki
 */
public class ModelPegawai {
    private String idPegawai;
    private String namaPegawai;
    private String jenisKelamin;
    private String alamat;
    private String noTelepon;
    private String tglMasuk;
    private String jabatan;
    
    private int kasbon;
    
    Koneksi konek = new Koneksi();

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getKasbon() {
        return kasbon;
    }

    public void setKasbon(int kasbon) {
        this.kasbon = kasbon;
    }
    
    public void simpanDataPegawai(){
        String sql = ("INSERT INTO pegawai (idPegawai,namaPegawai,jenisKelamin,alamat,noTelpon,TglMasuk,jabatan,kasbon)"
            +"VALUES ('"+getIdPegawai()+"','"+getNamaPegawai()+"','"+getJenisKelamin()+"','"+getAlamat()+"','"+getNoTelepon()+"','"+getTglMasuk()+"','"+getJabatan()+"','"+getKasbon()+"')");
        
        try{
            PreparedStatement eksekusi =konek.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
             
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }catch( SQLException ex){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }          
    }
    
    public void ubahDataPegawai(){
        String sql = ("UPDATE pegawai SET namaPegawai='"+ getNamaPegawai() +"',"
                + " jenisKelamin='"+ getJenisKelamin() +"', alamat='"+ getAlamat() +"', noTelpon='" +getNoTelepon()+ "',"
                + "TglMasuk='"+ getTglMasuk() +"', jabatan='"+ getJabatan() +"', kasbon='"+ getKasbon() +"' WHERE "
                + "idPegawai='"+ getIdPegawai() +"'");

        try {
            PreparedStatement eksekusi =konek.getKoneksi().prepareStatement(sql);
            eksekusi.execute();

            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diperbarui");
        }
    }

    public void hapusDataPegawai(){
        String sql = ("DELETE FROM pegawai WHERE idPegawai='"+ getIdPegawai() +"'");

        try {
            PreparedStatement eksekusi =konek.getKoneksi().prepareStatement(sql);
            eksekusi.execute();

            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
}
