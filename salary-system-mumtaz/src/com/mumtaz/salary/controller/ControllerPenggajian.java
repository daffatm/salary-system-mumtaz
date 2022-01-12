/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mumtaz.salary.controller;

import com.mumtaz.salary.model.ModelPenggajian;
import com.mumtaz.salary.view.ViewPenggajian;

/**
 *
 * @author erdiansyah
 */
public class ControllerPenggajian {
    private ModelPenggajian MP;
    private ViewPenggajian VP;
    public ControllerPenggajian(ViewPenggajian VP){
        this.VP = VP;
    }
    public void simpanGaji(){
        MP = new ModelPenggajian();
        MP.setIdPenggajian(VP.idPenggajian());
        MP.setIdPegawai(VP.getIdPegawaiView().getText());
        MP.setJamKerja(Integer.parseInt(VP.getJamPelajaranView().getText()));
        MP.setHariKerja(Integer.parseInt(VP.getHariKerjaView().getText()));
        MP.setGajiPokok(VP.gajiPokok);
        MP.setTransport(VP.uangTransport);
        MP.setTunjangan(Integer.parseInt(VP.getTunjanganView().getText()));
        MP.setTtlGajiPokok(Integer.parseInt(VP.getTotalJamPelajaranView().getText()));
        MP.setTtltransport(Integer.parseInt(VP.getTotalHariKerjaView().getText()));
        MP.setTtlInsentif(VP.insentif);
        MP.setPotongan(Integer.parseInt(VP.getPotonganView().getText()));
        MP.setGajiBersih(VP.totalGaji);
        MP.setKasbon(Integer.parseInt(VP.getSisaKasbonView().getText()));
        
        MP.simpanGaji();
        
    }
    public void updateKasbon(){
        MP = new ModelPenggajian();
        MP.setKasbon(Integer.parseInt(VP.getSisaKasbonView().getText()));
        MP.setIdPegawai(VP.getIdPegawaiView().getText());
        MP.updateKasbon();
    }
}
