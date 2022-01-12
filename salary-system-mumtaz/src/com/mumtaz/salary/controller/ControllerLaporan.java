/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mumtaz.salary.controller;

import com.mumtaz.salary.model.ModelLaporan;
import com.mumtaz.salary.view.ViewLaporan;
import java.text.SimpleDateFormat;
/**
 *
 * @author dzaki
 */
public class ControllerLaporan {
    private ModelLaporan ML ;
    private ViewLaporan VL;
    String TampilanDate = "yyyy-MM-dd";
    
    public ControllerLaporan(ViewLaporan VL) {
        this.VL= VL;
    }
    
    public void Filter(){
        ML = new ModelLaporan();
        
        SimpleDateFormat fm = new SimpleDateFormat(TampilanDate);
        String toDate = String.valueOf(fm.format(VL.getToDate().getDate()));
        String fromDate = String.valueOf(fm.format(VL.getFromDate().getDate()));
        ML.setToDate(toDate);
        ML.setFromDate(fromDate);
        ML.Filter();
    }
    
}
