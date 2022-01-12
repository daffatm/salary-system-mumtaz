/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mumtaz.salary.view;

import com.mumtaz.salary.controller.ControllerLaporan;
import java.text.SimpleDateFormat;
import com.mumtaz.salary.db.Koneksi;
import com.mumtaz.salary.view.FormPegawai;
import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author dzaki
 */
public class ViewLaporan extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewLapora
     */
    private DefaultTableModel model;
    
    private ControllerLaporan CL;
    public ViewLaporan() {
        initComponents();
        CL = new ControllerLaporan(this);
        
        model = new DefaultTableModel();
        tableLaporan.setModel(model);
        tableLaporan.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        tableLaporan.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        model.addColumn("idPenggajian");
        model.addColumn("idPegawai");
        model.addColumn("jamKerja");
        model.addColumn("hariKerja");
        model.addColumn("gajiPokok");
        model.addColumn("transport");
        model.addColumn("tunjangan");
        model.addColumn("ttlGajiPokok");
        model.addColumn("ttlTransport");
        model.addColumn("ttlInsentif");
        model.addColumn("potongan");
        model.addColumn("gajiBersih");
        model.addColumn("tglGajian");
        
        
        tampilDataLaporan();
        
    }
    public void FilterDataLaporan(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = String.valueOf(fm.format(this.toDate.getDate()));
        String date2 = String.valueOf(fm.format(this.fromDate.getDate()));
       
        String sql = "SELECT * FROM penggajian WHERE tglGajian BETWEEN '"+toDate+"' AND '"+fromDate+"'";
        
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            
            while(res.next()){
                Object[] hasil;
                hasil = new Object[13];
                
                hasil[0] = res.getString("idPenggajian");
                hasil[1] = res.getString("idPegawai");
                hasil[2] = res.getString("jamKerja");
                hasil[3] = res.getString("hariKerja");
                hasil[4] = res.getString("gajiPokok");
                hasil[5] = res.getString("transport");
                hasil[6] = res.getString("tunjangan");
                hasil[7] = res.getString("ttlGajiPokok");
                hasil[8] = res.getString("ttlTransport");
                hasil[9] = res.getString("ttlInsentif");
                hasil[10] = res.getString("potongan");
                hasil[11] = res.getString("gajiBersih");
                hasil[12] = res.getString("tglGajian");
                
                model.addRow(hasil);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void tampilDataLaporan(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
       
        String sql = "SELECT * FROM penggajian ";
        
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            
            while(res.next()){
                Object[] hasil;
                hasil = new Object[13];
                
                hasil[0] = res.getString("idPenggajian");
                hasil[1] = res.getString("idPegawai");
                hasil[2] = res.getString("jamKerja");
                hasil[3] = res.getString("hariKerja");
                hasil[4] = res.getString("gajiPokok");
                hasil[5] = res.getString("transport");
                hasil[6] = res.getString("tunjangan");
                hasil[7] = res.getString("ttlGajiPokok");
                hasil[8] = res.getString("ttlTransport");
                hasil[9] = res.getString("ttlInsentif");
                hasil[10] = res.getString("potongan");
                hasil[11] = res.getString("gajiBersih");
                hasil[12] = res.getString("tglGajian");
                
                model.addRow(hasil);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JDateChooser getFromDate() {
        return fromDate;
    }

    public JDateChooser getToDate() {
        return toDate;
    }
    
    private DefaultTableModel getdata(){
         
        
        
        
      
        
        return null;
    }
    private String getCellValue(int x,int y){
        return model.getValueAt(x, y).toString();
    }
    private void writetoexcel(){
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        
        //loaddata
        TreeMap<String,Object[]> data=new TreeMap<>();
        data.put(" -1",new Object[]{model.getColumnName(0),model.getColumnName(1),model.getColumnName(2)});
        
        for (int i=0;i<model.getRowCount();i++)
        {
            data.put(Integer.toString(i),new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2)});
        }
        
        Set<String> ids=data.keySet();
        XSSFRow row;
        int rowID=0;
        
        for(String key :ids){
            row =ws.createRow(rowID++);
            
            Object[] values=data.get(key);
            
            int cellID=0;
            for(Object o :values )
            {
                Cell cell= row.createCell(cellID++);
                cell.setCellValue(o.toString());
            }
        }
        try
        {
            FileOutputStream fos =new FileOutputStream(new File("D:/excel/laporan.xlsx"));
            wb.write(fos);
            fos.close();
        }catch (IOException ex) {
            Logger.getLogger(ViewLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTfilter = new javax.swing.JButton();
        BTexport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLaporan = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();

        jLabel4.setText("From Date : ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Laporan Penggajian");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTfilter.setText("Filter");
        BTfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTfilterActionPerformed(evt);
            }
        });

        BTexport.setText("Export");
        BTexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTexportActionPerformed(evt);
            }
        });

        tableLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableLaporan);

        jLabel5.setText("To Date : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTexport, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTfilter)
                        .addComponent(BTexport))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTfilterActionPerformed
        // TODO add your handling code here:
        FilterDataLaporan();
        
         //FormPegawai FP = new FormPegawai(this);
         //FP.setVisible(true);
    }//GEN-LAST:event_BTfilterActionPerformed

    private void BTexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTexportActionPerformed
        // TODO add your handling code here:
        writetoexcel();
    }//GEN-LAST:event_BTexportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTexport;
    private javax.swing.JButton BTfilter;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLaporan;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
