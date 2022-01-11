/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mumtaz.salary.controller;

import com.mumtaz.salary.model.ModelPegawai;
import com.mumtaz.salary.view.FormPegawai;
import java.text.SimpleDateFormat;

/**
 *
 * @author dzaki
 */
public class ControllerPegawai {
    private ModelPegawai MP;
    private FormPegawai FP;
    String TampilanDate = "yyyy-MM-dd";
    
    public ControllerPegawai(FormPegawai FP) {
        this.FP = FP;
    }
    
    public void Simpan(){
        MP = new ModelPegawai();
        
        SimpleDateFormat fm = new SimpleDateFormat(TampilanDate);
        String tglMasuk = String.valueOf(fm.format(FP.getTglMasuk().getDate()));
        
        MP.setIdPegawai(FP.idPegawai());
        MP.setNamaPegawaiModel(FP.getNamaPegawai().getText());
        if (FP.getJkPria().isSelected()){
            MP.setJenisKelaminModel(FP.getJkPria().getText());
        } else if (FP.getJkWanita().isSelected()) {
            MP.setJenisKelaminModel(FP.getJkWanita().getText());
        }
        MP.setNoTelepon(FP.getNoTelpon().getText());
        MP.setJabatan(FP.getJabatan().getSelectedItem().toString());
        MP.setTglMasuk(tglMasuk);
        MP.setKasbon(Integer.parseInt(FP.getKasbon().getText()));
        MP.setAlamat(FP.getAlamat().getText());
        
        MP.simpanDataPegawai();
    }
    public void Filter(){}
}
