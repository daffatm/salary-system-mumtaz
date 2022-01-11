/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mumtaz.salary.view;

import com.mumtaz.salary.db.Koneksi;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class ViewListDataPegawai extends javax.swing.JFrame {
    private ViewPenggajian vPG;
    private DefaultTableModel model;
    /**
     * Creates new form ViewListDataPegawai1
     */
    public ViewListDataPegawai(ViewPenggajian vPG) {
        initComponents();
        
        this.vPG = vPG;
        
        //inisialisasi kolom tabel
        model = new DefaultTableModel();
        tabelDataPegawai.setModel(model);
        tabelDataPegawai.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        tabelDataPegawai.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Alamat");
        model.addColumn("No Telpon");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Jabatan");
        model.addColumn("Kasbon");
        
        tampilDataPegawai();
    }
    
    public void tampilDataPegawai(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        String sql = "SELECT * FROM pegawai";
        
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                Object[] hasil;
                hasil = new Object[8];
                
                hasil[0] = res.getString("idPegawai");
                hasil[1] = res.getString("namaPegawai");
                hasil[2] = res.getString("jenisKelamin");
                hasil[3] = res.getString("alamat");
                hasil[4] = res.getString("noTelpon");
                hasil[5] = res.getString("tglMasuk");
                hasil[6] = res.getString("jabatan");
                hasil[7] = res.getString("kasbon");
                
                model.addRow(hasil);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewPegawai.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataPegawai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Pegawai");
        setMinimumSize(new java.awt.Dimension(800, 300));

        tabelDataPegawai.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelDataPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataPegawai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelDataPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataPegawaiMouseClicked
        // TODO add your handling code here:
        int listX = tabelDataPegawai.getSelectedRow();
        vPG.getIdPegawaiView().setText(tabelDataPegawai.getValueAt(listX, 0).toString());
        vPG.getNamaPegawaiView().setText(tabelDataPegawai.getValueAt(listX, 1).toString());
        vPG.getJabatanView().setText(tabelDataPegawai.getValueAt(listX, 6).toString());
        vPG.getKasBonView().setText(tabelDataPegawai.getValueAt(listX, 7).toString());
        
        //ketika tabel diklik, maka list pelanggan akan diclose
        dispose();
    }//GEN-LAST:event_tabelDataPegawaiMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataPegawai;
    // End of variables declaration//GEN-END:variables
}
