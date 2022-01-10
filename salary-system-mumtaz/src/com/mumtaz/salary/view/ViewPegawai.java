package com.mumtaz.salary.view;

import com.mumtaz.salary.controller.ControllerPegawai;
import com.mumtaz.salary.db.Koneksi;
import com.mumtaz.salary.main.Dashboard;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewPegawai extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    
    public ViewPegawai() {
        initComponents(); 
        
        model = new DefaultTableModel();
        tablePegawai.setModel(model);
        tablePegawai.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        tablePegawai.getTableHeader().setPreferredSize(new Dimension(5, 38));
        tablePegawai.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
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

    public JButton getTombolAdd() {
        return TombolAdd;
    }

    public JTable getTablePegawai() {
        return tablePegawai;
    }
    
    // function
    private void tampilForm() {
        FormPegawai form = new FormPegawai(this);
        form.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePegawai = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        TombolAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 217, 217));
        setFrameIcon(null);

        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/division (1).png"))); // NOI18N
        jLabel1.setText("Master Data Pegawai");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tablePegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablePegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePegawai);

        jPanel2.setBackground(new java.awt.Color(121, 255, 77));
        jPanel2.setPreferredSize(new java.awt.Dimension(264, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        TombolAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TombolAdd.setText("Add");
        TombolAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(TombolAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TombolAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TombolAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolAddMouseClicked
        tampilForm();
//        this.TombolAdd.setEnabled(false);
//        this.tablePegawai.setEnabled(false);
    }//GEN-LAST:event_TombolAddMouseClicked

    private void tablePegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePegawaiMouseClicked
        int index = tablePegawai.getSelectedRow();
        
        String idView = String.valueOf(tablePegawai.getValueAt(index, 0));
        String namaView = String.valueOf(tablePegawai.getValueAt(index, 1));
        String jkView = String.valueOf(tablePegawai.getValueAt(index, 2));
        String alamatView = String.valueOf(tablePegawai.getValueAt(index, 3));
        String noTelpView = String.valueOf(tablePegawai.getValueAt(index, 4));
        String tglMasukView = String.valueOf(tablePegawai.getValueAt(index, 5));
        String jabatanView = String.valueOf(tablePegawai.getValueAt(index, 6));
        String kasbonView = String.valueOf(tablePegawai.getValueAt(index, 7));
        
//        this.TombolAdd.setEnabled(false);
//        this.tablePegawai.setEnabled(false);
        try {
            new FormPegawai(this, idView, namaView, jkView, alamatView, noTelpView, tglMasukView, jabatanView, kasbonView).setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(ViewPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablePegawaiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TombolAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePegawai;
    // End of variables declaration//GEN-END:variables
}
