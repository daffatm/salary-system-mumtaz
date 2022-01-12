/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mumtaz.salary.controller;

import com.formdev.flatlaf.ui.FlatPopupMenuSeparatorUI;
import com.mumtaz.salary.model.ModelPegawai;
import com.mumtaz.salary.view.FormPegawai;
import com.mumtaz.salary.view.ViewPegawai;
import java.text.SimpleDateFormat;

/**
 *
 * @author dzaki
 */
public class ControllerPegawai {
    private ModelPegawai MP;
    private FormPegawai FP;
    private ViewPegawai VP;
    String TampilanDate = "yyyy-MM-dd";
    
    public ControllerPegawai(FormPegawai FP) {
        this.FP = FP;
    }
    
    public void add(){
        FP.getBtnDelete().setVisible(false);
        FP.getBtnSave().setText("Save");
    }
    
    public void change(){
        FP.getBtnDelete().setVisible(true);
        FP.getBtnSave().setText("Update");
    }
    
    public void Simpan(){
        MP = new ModelPegawai();
        
        SimpleDateFormat fm = new SimpleDateFormat(TampilanDate);
        String tglMasuk = String.valueOf(fm.format(FP.getTglMasuk().getDate()));
        
        MP.setIdPegawai(FP.idPegawai());
        MP.setNamaPegawai(FP.getNamaPegawai().getText());
        if (FP.getJkPria().isSelected()){
            MP.setJenisKelamin(FP.getJkPria().getText());
        } else if (FP.getJkWanita().isSelected()) {
            MP.setJenisKelamin(FP.getJkWanita().getText());
        }
        MP.setNoTelepon(FP.getNoTelpon().getText());
        MP.setJabatan(FP.getJabatan().getSelectedItem().toString());
        MP.setTglMasuk(tglMasuk);
        MP.setKasbon(Integer.parseInt(FP.getKasbon().getText()));
        MP.setAlamat(FP.getAlamat().getText());
        
        MP.simpanDataPegawai();
    }
    public void Filter(){}
    
    public void Ubah(){
        MP = new ModelPegawai();
        
        SimpleDateFormat fm = new SimpleDateFormat(TampilanDate);
        String tglMasuk = String.valueOf(fm.format(FP.getTglMasuk().getDate()));
        
        MP.setIdPegawai(FP.idPegawai);
        MP.setNamaPegawai(FP.getNamaPegawai().getText());
        if (FP.getJkPria().isSelected()){
            MP.setJenisKelamin(FP.getJkPria().getText());
        } else if (FP.getJkWanita().isSelected()) {
            MP.setJenisKelamin(FP.getJkWanita().getText());
        }
        MP.setNoTelepon(FP.getNoTelpon().getText());
        MP.setJabatan(FP.getJabatan().getSelectedItem().toString());
        MP.setTglMasuk(tglMasuk);
        MP.setKasbon(Integer.parseInt(FP.getKasbon().getText()));
        MP.setAlamat(FP.getAlamat().getText());
        
        MP.ubahDataPegawai();
    }
    
    public void Hapus(){
        MP = new ModelPegawai();
        
        MP.setIdPegawai(FP.idPegawai);
        
        MP.hapusDataPegawai();
    }
}
