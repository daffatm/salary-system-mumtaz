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
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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

    public ViewLaporan() {
        initComponents();

        model = new DefaultTableModel();
        tableLaporan.setModel(model);
        tableLaporan.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        tableLaporan.getTableHeader().setPreferredSize(new Dimension(5, 38));
        tableLaporan.setFont(new Font("Tahoma", Font.PLAIN, 14));

        model.addColumn("ID Penggajian");
        model.addColumn("ID Pegawai");
        model.addColumn("Jam Kerja");
        model.addColumn("Hari Kerja");
        model.addColumn("Gaji Pokok");
        model.addColumn("Transport");
        model.addColumn("Tunjangan");
        model.addColumn("Gaji Pokok");
        model.addColumn("Transport");
        model.addColumn("Insentif");
        model.addColumn("Potongan");
        model.addColumn("Gaji Bersih");
        model.addColumn("Tanggal");

        tampilDataLaporan();
    }

    public JDateChooser getFromDate() {
        return fromDate;
    }

    public JDateChooser getToDate() {
        return toDate;
    }

    private String getCellValue(int x, int y) {
        return model.getValueAt(x, y).toString();
    }

    private void writeToExcel() {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        XSSFWorkbook wb = null;
        
        try {
            JFileChooser fileChooser = new JFileChooser("C:\\Users\\daffa\\Documents");
            fileChooser.setDialogTitle("Save as");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            fileChooser.setFileFilter(fnef);
            int option = fileChooser.showSaveDialog(null);
            
            if (option == JFileChooser.APPROVE_OPTION) {
                wb = new XSSFWorkbook();
                XSSFSheet ws = wb.createSheet("Gaji Pegawai");
                
                TreeMap<String, Object[]> data = new TreeMap<>();
                data.put(" -1", new Object[]{model.getColumnName(0), model.getColumnName(1), model.getColumnName(2), model.getColumnName(3), model.getColumnName(4), model.getColumnName(5), model.getColumnName(6), model.getColumnName(7), model.getColumnName(8), model.getColumnName(9), model.getColumnName(10), model.getColumnName(11), model.getColumnName(12)});

                for (int i = 0; i < model.getRowCount(); i++) {
                    data.put(Integer.toString(i), new Object[]{getCellValue(i, 0), getCellValue(i, 1), getCellValue(i, 2), getCellValue(i, 3), getCellValue(i, 4), getCellValue(i, 5), getCellValue(i, 6), getCellValue(i, 7), getCellValue(i, 8), getCellValue(i, 9), getCellValue(i, 10), getCellValue(i, 11), getCellValue(i, 12)});
                }

                Set<String> ids = data.keySet();
                XSSFRow row;
                int rowID = 0;

                for (String key : ids) {
                    row = ws.createRow(rowID++);

                    Object[] values = data.get(key);

                    int cellID = 0;
                    for (Object o : values) {
                        Cell cell = row.createCell(cellID++);
                        cell.setCellValue(o.toString());
                    }
                }
                
                fos = new FileOutputStream(fileChooser.getSelectedFile()+".xlsx");
                bos = new BufferedOutputStream(fos);
                wb.write(bos);
//                wb.write(fos);
//                fos.close();
                JOptionPane.showMessageDialog(null, "Berhasil Eksport ke Excel");
            }
        } catch (IOException ex) {
            Logger.getLogger(ViewLaporan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(bos != null){
                    bos.close();
                }
                if(fos != null){
                    fos.close();
                }
                if(wb != null){
                    wb.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void tampilDataLaporan() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        String sql = "SELECT * FROM penggajian";

        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
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

    public void filterDataLaporan() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = String.valueOf(fm.format(getFromDate().getDate()));
        String date2 = String.valueOf(fm.format(getToDate().getDate()));

        String sql = "SELECT * FROM penggajian WHERE tglGajian BETWEEN '" + date1 + "' AND '" + date2 + "'";

        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
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

            JOptionPane.showMessageDialog(null, "From Date: " + date1 + " To Date: " + date2);
        } catch (SQLException ex) {
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
        BTfilter = new javax.swing.JButton();
        BTexport = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLaporan = new javax.swing.JTable();

        setFrameIcon(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("From Date : ");

        BTfilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTfilter.setText("Filter");
        BTfilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTfilterMouseClicked(evt);
            }
        });

        BTexport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTexport.setText("Export");
        BTexport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTexportMouseClicked(evt);
            }
        });
        BTexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTexportActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("To Date : ");

        fromDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        toDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel4.setToolTipText("");
        jPanel4.setName(""); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/report (1).png"))); // NOI18N
        jLabel2.setText("Laporan Penggajian");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(121, 255, 77));
        jPanel5.setPreferredSize(new java.awt.Dimension(264, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

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
        jScrollPane2.setViewportView(tableLaporan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(650, Short.MAX_VALUE)
                        .addComponent(BTexport, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTfilter)
                        .addComponent(BTexport))
                    .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTexportActionPerformed
//        writetoexcel();
    }//GEN-LAST:event_BTexportActionPerformed

    private void BTfilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTfilterMouseClicked
        filterDataLaporan();
    }//GEN-LAST:event_BTfilterMouseClicked

    private void BTexportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTexportMouseClicked
        writeToExcel();
    }//GEN-LAST:event_BTexportMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTexport;
    private javax.swing.JButton BTfilter;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableLaporan;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
