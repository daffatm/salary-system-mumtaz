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
    private String namaPegawaiModel;
    private String jenisKelaminModel;
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

    public String getNamaPegawaiModel() {
        return namaPegawaiModel;
    }

    public void setNamaPegawaiModel(String namaPegawaiModel) {
        this.namaPegawaiModel = namaPegawaiModel;
    }

    public String getJenisKelaminModel() {
        return jenisKelaminModel;
    }

    public void setJenisKelaminModel(String jenisKelaminModel) {
        this.jenisKelaminModel = jenisKelaminModel;
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
    public void simpanDataPelanggan(){
           String sql = ("INSERT INTO pegawai (namaPelanggan,noHp,jenisKelamin,umur,alamat)"
            +"VALUES ('"+getIdPegawai()+"','"+getNamaPegawaiModel()+"','"+getJenisKelaminModel()+"','"+getAlamat()+"','"+getNoTelepon()+"','"+getTglMasuk()+"','"+getJabatan()+"','"+getKasbon()+"')");
         try{
             PreparedStatement eksekusi =konek.getKoneksi().prepareStatement(sql);
             eksekusi.execute();
             
             JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
         }catch( SQLException ex){
             JOptionPane.showMessageDialog(null,"Data Gagal Disimpan");
         }          
    }
}
