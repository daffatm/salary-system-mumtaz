/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mumtaz.salary.model;

import com.mumtaz.salary.db.Koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private int kasbon;
    private int insentif;
    private String keteranganIns;

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

    public int getKasbon() {
        return kasbon;
    }

    public void setKasbon(int kasbon) {
        this.kasbon = kasbon;
    }

    public int getInsentif() {
        return insentif;
    }

    public void setInsentif(int insentif) {
        this.insentif = insentif;
    }

    public String getKeteranganIns() {
        return keteranganIns;
    }

    public void setKeteranganIns(String keteranganIns) {
        this.keteranganIns = keteranganIns;
    }
    
    public void simpanGaji(){
        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(fm.format(new Date()));
        
        String sql = "INSERT INTO penggajian (idPenggajian, idPegawai, jamKerja, hariKerja, gajiPokok, transport, tunjangan, ttlGajiPokok, ttlTransport, ttlInsentif, potongan, gajiBersih, tglGajian)"
                + "VALUES ('"+getIdPenggajian()+"','"+getIdPegawai()+"','"+getJamKerja()+"','"+getHariKerja()+"','"+getGajiPokok()+"','"+getTransport()+"','"+getTunjangan()+"'"
                + ",'"+getTtlGajiPokok()+"','"+getTtltransport()+"','"+getTtlInsentif()+"','"+getPotongan()+"','"+getGajiBersih()+"', '"+date+"')";
        try {
          PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
        
    }
    
    public void updateKasbon(){
        String sql = "UPDATE pegawai SET kasbon = '"+getKasbon()+"' WHERE idPegawai = '"+getIdPegawai()+"'";
        
        try {
          PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
          eksekusi.execute();
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
        }
    }
//    public void tambahInsentif(){
//        String sql = "INSERT INTO insentif (idPenggajian, insentif, keterangan)"
//                     + "VALUES ('"+getIdPenggajian()+"','"+getInsentif()+"','"+getKeteranganIns()+"')";
//        try {
//          PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
//          eksekusi.execute();
//          JOptionPane.showMessageDialog(null,"data berhasil disimpan");
//        }catch (SQLException ex) {
//          JOptionPane.showMessageDialog(null,"Data gagal disimpan \n"+ex);
//        }
//    }
    
    
}
