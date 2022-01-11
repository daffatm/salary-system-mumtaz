/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mumtaz.salary.view;

import com.mumtaz.salary.db.Koneksi;
<<<<<<< HEAD
=======
import java.awt.Font;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
<<<<<<< HEAD
 * @author erdiansyah
 */
public class ViewListDataPegawai extends javax.swing.JFrame {

    /**
     * Creates new form ViewListDataPegawai
     */
    private ViewPinjaman VP;
    private DefaultTableModel model;
    private String sql = "";
    public ViewListDataPegawai(ViewPinjaman VP) {
        initComponents();
        this.VP = VP;
        model = new DefaultTableModel();
        tabelPegawai.setModel(model);
        model.addColumn("ID Pegawai");
        model.addColumn("Nama Pegawai");
        model.addColumn("Jabatan");
        model.addColumn("Pinjaman");
        tampilPegawai("");
    }
    private void tampilPegawai(String data){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        if(data.equals("")){
            sql = "SELECT idPegawai, namaPegawai, jabatan, kasbon FROM pegawai";
        } else sql = "SELECT idPegawai, namaPegawai, jabatan, kasbon FROM pegawai WHERE namaPegawai LIKE '"+data+"%'";
        
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            ResultSet result = stat.executeQuery(sql);
            while(result.next()){
                Object[] hasil;
                hasil = new Object[4];
                hasil[0] = result.getString("idPegawai");
                hasil[1] = result.getString("namaPegawai");
                hasil[2] = result.getString("jabatan");
                hasil[3] = result.getString("kasbon");
=======
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
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a
                
                model.addRow(hasil);
            }
        } catch (SQLException ex) {
<<<<<<< HEAD
            Logger.getLogger(ViewListDataPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
=======
            Logger.getLogger(ViewPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a
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
<<<<<<< HEAD
        tabelPegawai = new javax.swing.JTable();
        namaPegawai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelPegawai.setModel(new javax.swing.table.DefaultTableModel(
=======
        tabelDataPegawai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tabelDataPegawai.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a
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
<<<<<<< HEAD
        tabelPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPegawai);

        namaPegawai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaPegawaiKeyPressed(evt);
            }
        });

        jLabel1.setText("Cari Nama Pegawai");

        jLabel2.setLabelFor(this);
        jLabel2.setText("List Data Pegawai");
        jLabel2.setToolTipText("");
        jLabel2.setPreferredSize(new java.awt.Dimension(94, 34));
=======
        tabelDataPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataPegawai);
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(namaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
=======
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPegawaiMouseClicked
        // TODO add your handling code here:
        int listX = tabelPegawai.getSelectedRow();
        VP.getIdPegawai().setText(tabelPegawai.getValueAt(listX, 0).toString());
        VP.getNamaPegawai().setText(tabelPegawai.getValueAt(listX, 1).toString());
        VP.getJabatan().setText(tabelPegawai.getValueAt(listX, 2).toString());
        VP.getTotalKasbon().setText(tabelPegawai.getValueAt(listX, 3).toString());
        dispose();
    }//GEN-LAST:event_tabelPegawaiMouseClicked

    private void namaPegawaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaPegawaiKeyPressed
        // TODO add your handling code here:
        tampilPegawai(namaPegawai.getText());
    }//GEN-LAST:event_namaPegawaiKeyPressed
=======
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void tabelDataPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataPegawaiMouseClicked
        // TODO add your handling code here:
        int listX = tabelDataPegawai.getSelectedRow();
        vPG.getIdPegawaiView().setText(tabelDataPegawai.getValueAt(listX, 0).toString());
        vPG.getNamaPegawaiView().setText(tabelDataPegawai.getValueAt(listX, 1).toString());
        vPG.getJabatanView().setText(tabelDataPegawai.getValueAt(listX, 6).toString());
        vPG.getKasBonView().setText(tabelDataPegawai.getValueAt(listX, 7).toString());
        
        if(tabelDataPegawai.getValueAt(listX, 6).toString().equals("Kepala Sekolah")){
            vPG.getTunjanganView().setText("2000000");
            vPG.tunjangan = 2000000;
        }else if(tabelDataPegawai.getValueAt(listX, 6).toString().equals("Tata Usaha")){
            vPG.getTunjanganView().setText("50000");
            vPG.tunjangan = 50000;
        }else{
            vPG.getTunjanganView().setText("0");
            vPG.tunjangan = 0;
        }
        //ketika tabel diklik, maka list pelanggan akan diclose
        dispose();
    }//GEN-LAST:event_tabelDataPegawaiMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        vPG.hitungTotalGaji();
    }//GEN-LAST:event_formWindowClosed
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaPegawai;
    private javax.swing.JTable tabelPegawai;
=======
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataPegawai;
>>>>>>> 47abc7e3cc933b4c2c358adc56c2a2ef422b763a
    // End of variables declaration//GEN-END:variables
}
