/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mumtaz.salary.controller;

/**
 *
 * @author erdiansyah
 */


import com.formdev.flatlaf.ui.FlatPopupMenuSeparatorUI;
import com.mumtaz.salary.model.ModelPinjaman;
import com.mumtaz.salary.view.ViewPinjaman;

public class ControllerPinjaman {
    private ModelPinjaman MP;
    private ViewPinjaman VP;
    
    public ControllerPinjaman(ViewPinjaman VK) {
        this.VP = VK;
    }
    public void updatePinjaman(){
        MP = new ModelPinjaman();
        
        MP.setIdPegawai(VP.getIdPegawai().getText());
        MP.setKasbon(Integer.parseInt(VP.getTotalKasbon().getText()));
        MP.updatePinjaman();
    }
}