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
public class ModelPenggajian {
    Koneksi koneksi = new Koneksi();
    private String idPenggajian;
    private String idPegawai;
    private int jamKerja;
    private int hariKerja;
    private int gajiPokok;
    private int transport;
    private int tunjangan;
    private int ttlGajiPokok;
    private int ttltransport;
    private int ttlInsentif;
    private int potongan;
    private int gajiBersih;

    public String getIdPenggajian() {
        return idPenggajian;
    }

    public void setIdPenggajian(String idPenggajian) {
        this.idPenggajian = idPenggajian;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTtlGajiPokok() {
        return ttlGajiPokok;
    }

    public void setTtlGajiPokok(int ttlGajiPokok) {
        this.ttlGajiPokok = ttlGajiPokok;
    }

    public int getTtltransport() {
        return ttltransport;
    }

    public void setTtltransport(int ttltransport) {
        this.ttltransport = ttltransport;
    }

    public int getTtlInsentif() {
        return ttlInsentif;
    }

    public void setTtlInsentif(int ttlInsentif) {
        this.ttlInsentif = ttlInsentif;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    public int getGajiBersih() {
        return gajiBersih;
    }

    public void setGajiBersih(int gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
    
    public void simpanGaji(){
        String sql = "INSERT INTO penggajian (idPenggajian, idPegawai, jamKerja, hariKerja, gajiPokok, transport, tunjangan, ttlGajiPokok, ttlTransport, ttlInsentif, potongan, gajiBersih)"
                + "VALUES ('"+getIdPenggajian()+"','"+getIdPegawai()+"','"+getJamKerja()+"','"+getHariKerja()+"','"+getGajiPokok()+"','"+getTransport()+"','"+getTunjangan()+"'"
                + ",'"+getTtlGajiPokok()+"','"+getTtltransport()+"','"+getTtlInsentif()+"','"+getPotongan()+"','"+getGajiBersih()+"')";
        try {
          PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
          JOptionPane.showMessageDialog(null,"data berhasil disimpan");
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
        
    }
    public void Filter (){
            String sql = "SELECT * FROM pegawai WHERE '2021-12-30' ";
        try {
          PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
          JOptionPane.showMessageDialog(null,"data berhasil disimpan");
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
    }
    
    
}
