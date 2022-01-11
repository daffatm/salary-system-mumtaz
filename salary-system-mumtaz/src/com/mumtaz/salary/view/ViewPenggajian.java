package com.mumtaz.salary.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ViewPenggajian extends javax.swing.JInternalFrame {
    
    private DefaultTableModel model;
    int gajiPokok;
    int uangTransport;
    int tunjangan;
    int sisaKasBon;
    int insentif;
    
    public ViewPenggajian() {
        initComponents();
        
        model = new DefaultTableModel();
        tabelInsentif.setModel(model);
        model.addColumn("Insentif");
        model.addColumn("Keterangan");

    }

    public JTextField getIdPegawaiView() {
        return idPegawaiView;
    }
    public JTextField getNamaPegawaiView() {
        return namaPegawaiView;
    }
    public JTextField getJabatanView() {
        return jabatanView;
    }
    public JLabel getTotalGajiView() {
        return totalGajiView;
    }
    public JTextField getJamPelajaranView() {
        return jamPelajaranView;
    }
    public JTextField getTotalJamPelajaranView() {
        return totalJamPelajaranView;
    }
    public JTextField getHariKerjaView() {
        return hariKerjaView;
    }
    public JTextField getTotalHariKerjaView() {
        return totalHariKerjaView;
    }
    public JTextField getTunjanganView() {
        return tunjanganView;
    }
    public JTextField getKasBonView() {
        return kasBonView;
    }
    public JTextField getPotonganView() {
        return potonganView;
    }
    public JTextField getSisaKasbonView() {
        return sisaKasBonView;
    }
    public JTextField getInsentifView() {
        return insentifView;
    }
    public JTextField getKeteranganView() {
        return keteranganView;
    }
    
    private void hitungGajiPokok(int jamPelajaran){
        int gajiPokok = jamPelajaran*22000;
        totalJamPelajaranView.setText(""+gajiPokok);
        this.gajiPokok = gajiPokok;
    }
    private void hitungUangTransport(int hariKerja){
        int uangTransport = hariKerja*18000;
        totalHariKerjaView.setText(""+uangTransport);
        this.uangTransport = uangTransport;
    }
    private void hitungSisaKasBon(int kasbon){
        if(!(potonganView.getText().equals(""))){
            int potongan = Integer.parseInt(potonganView.getText());
            int sisaKasBon = kasbon-potongan;
            sisaKasBonView.setText(""+sisaKasBon);
            this.sisaKasBon = sisaKasBon;
        }
    }
    private void hitungTotalGaji(){
        int totalGaji = gajiPokok+uangTransport+tunjangan-sisaKasBon+insentif;
        totalGajiView.setText("Rp "+totalGaji+",00");
    }
    private void bersihkanInsentif(){
        insentifView.setText("");
        keteranganView.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idPegawaiView = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        totalGajiView = new javax.swing.JLabel();
        namaPegawaiView = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jabatanView = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tombolCariPegawai = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tunjangan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jamPelajaranView = new javax.swing.JTextField();
        hariKerjaView = new javax.swing.JTextField();
        tunjanganView = new javax.swing.JTextField();
        kasBonView = new javax.swing.JTextField();
        potonganView = new javax.swing.JTextField();
        sisaKasBonView = new javax.swing.JTextField();
        totalJamPelajaranView = new javax.swing.JTextField();
        totalHariKerjaView = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        insentifView = new javax.swing.JTextField();
        keteranganView = new javax.swing.JTextField();
        tombolTambahInsentif = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        tabelInsentif = new javax.swing.JTable();
        tombolProses = new javax.swing.JButton();
=======
        tabelInsentifView = new javax.swing.JTable();
        tombolProsesView = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
>>>>>>> 95bfa68a2e58ad03935ab41ee0dbd9b0b8603a6a

        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(121, 255, 77));
        jPanel1.setPreferredSize(new java.awt.Dimension(264, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Pegawai"));
        jPanel4.setPreferredSize(new java.awt.Dimension(630, 133));

        jLabel2.setText("ID Pegawai");

        idPegawaiView.setEditable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Gaji"));

        totalGajiView.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalGajiView.setText("Rp. 00, 00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalGajiView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalGajiView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        namaPegawaiView.setEditable(false);

        jLabel3.setText("Nama Pegawai");

        jabatanView.setEditable(false);

        jLabel4.setText("Jabatan");

        tombolCariPegawai.setText("Cari");
        tombolCariPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolCariPegawaiMouseClicked(evt);
            }
        });
        tombolCariPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCariPegawaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jabatanView, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(namaPegawaiView)
                    .addComponent(idPegawaiView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolCariPegawai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tombolCariPegawai)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(idPegawaiView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namaPegawaiView)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jabatanView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(447, 447, 447))))
        );

        jLabel5.setText("Jam Pelajaran");

        jLabel6.setText("Hari Kerja");

        Tunjangan.setText("Tunjangan");

        jLabel8.setText("Kas Bon");

        jLabel7.setText("Potongan");

        jLabel9.setText("Sisa Kas Bon");

        jamPelajaranView.setText("0");
        jamPelajaranView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jamPelajaranViewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jamPelajaranViewKeyTyped(evt);
            }
        });

        hariKerjaView.setText("0");
        hariKerjaView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hariKerjaViewKeyReleased(evt);
            }
        });

        tunjanganView.setText("0");
        tunjanganView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tunjanganViewKeyReleased(evt);
            }
        });

        kasBonView.setEditable(false);
        kasBonView.setText("Kas Bon");

        potonganView.setText("0");
        potonganView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                potonganViewKeyReleased(evt);
            }
        });

        sisaKasBonView.setEditable(false);
        sisaKasBonView.setText("Sisa Kas Bon");

        totalJamPelajaranView.setEditable(false);
        totalJamPelajaranView.setText("Gaji Pokok");

        totalHariKerjaView.setEditable(false);
        totalHariKerjaView.setText("Uang Transport");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Insentif"));

        jLabel10.setText("Insentif");

        jLabel11.setText("Keterangan");

        insentifView.setText("0");

        tombolTambahInsentif.setText("Tambah");
        tombolTambahInsentif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolTambahInsentifMouseClicked(evt);
            }
        });

        tabelInsentif.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelInsentif);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keteranganView)
                            .addComponent(insentifView)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tombolTambahInsentif)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(insentifView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(keteranganView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolTambahInsentif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

<<<<<<< HEAD
        tombolProses.setText("PROSES");
        tombolProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolProsesActionPerformed(evt);
            }
        });
=======
        tombolProsesView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tombolProsesView.setText("PROSES");
>>>>>>> 95bfa68a2e58ad03935ab41ee0dbd9b0b8603a6a

        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/debt (1).png"))); // NOI18N
        jLabel12.setText("Master Penggajian");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolProses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
=======
>>>>>>> 95bfa68a2e58ad03935ab41ee0dbd9b0b8603a6a
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Tunjangan)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kasBonView)
                            .addComponent(sisaKasBonView)
=======
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                            .addComponent(tombolProsesView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> 95bfa68a2e58ad03935ab41ee0dbd9b0b8603a6a
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(Tunjangan)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kasbonView)
                                    .addComponent(sisaKasbonView, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(hariKerjaView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(jamPelajaranView, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(totalHariKerjaView, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(totalJamPelajaranView)))
                                    .addComponent(tunjanganView)
                                    .addComponent(potonganView))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jamPelajaranView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalJamPelajaranView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hariKerjaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(totalHariKerjaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tunjangan)
                            .addComponent(tunjanganView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(kasBonView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(potonganView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sisaKasBonView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                .addComponent(tombolProses)
                .addContainerGap(25, Short.MAX_VALUE))
=======
                .addComponent(tombolProsesView, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
>>>>>>> 95bfa68a2e58ad03935ab41ee0dbd9b0b8603a6a
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolCariPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariPegawaiActionPerformed
        
    }//GEN-LAST:event_tombolCariPegawaiActionPerformed

    private void tombolCariPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCariPegawaiMouseClicked
        ViewListDataPegawai tabel = new ViewListDataPegawai(this);
        tabel.setVisible(true);
    }//GEN-LAST:event_tombolCariPegawaiMouseClicked

    private void tombolProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolProsesActionPerformed
        Object[] pilihan = {"Tidak", "Ya"};
        int respons = JOptionPane.showOptionDialog(null, "Penggajian Sukses, apakah Anda ingin mencetak Slip Gaji?", "Penggajian", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, pilihan, pilihan[1]);
        if(respons == JOptionPane.YES_OPTION){
           //Taro perintah Disini
           System.out.println("Anda Memilih Tidak");
        }else if(respons == JOptionPane.NO_OPTION){
           //Jika no perintah
           System.out.println("Anda Memilih Ya");
       }
    }//GEN-LAST:event_tombolProsesActionPerformed

    
    private void jamPelajaranViewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamPelajaranViewKeyTyped

        
    }//GEN-LAST:event_jamPelajaranViewKeyTyped

    private void jamPelajaranViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamPelajaranViewKeyReleased
        if(!(jamPelajaranView.getText().equals(""))){
            hitungGajiPokok(Integer.parseInt(jamPelajaranView.getText()));
            hitungTotalGaji();
        }
    }//GEN-LAST:event_jamPelajaranViewKeyReleased

    private void hariKerjaViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hariKerjaViewKeyReleased
        if(!(hariKerjaView.getText().equals(""))){
            hitungUangTransport(Integer.parseInt(hariKerjaView.getText()));
            hitungTotalGaji();
        }
    }//GEN-LAST:event_hariKerjaViewKeyReleased

    private void potonganViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potonganViewKeyReleased
        if(!(kasBonView.getText().equals(""))){
            hitungSisaKasBon(Integer.parseInt(kasBonView.getText()));
            hitungTotalGaji();
        }
    }//GEN-LAST:event_potonganViewKeyReleased

    private void tunjanganViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tunjanganViewKeyReleased
        if(!(tunjanganView.getText().equals(""))){
            int tunjangan = Integer.parseInt(tunjanganView.getText());
            this.tunjangan = tunjangan;
            hitungTotalGaji();
        }
    }//GEN-LAST:event_tunjanganViewKeyReleased

    private void tombolTambahInsentifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolTambahInsentifMouseClicked
        Object[]hasil;
        hasil = new Object[2];
        hasil[0] = insentifView.getText();
        hasil[1] = keteranganView.getText();
        
        model.addRow(hasil);
        
        if(!(insentifView.getText().equals(""))){
            int insentif = Integer.parseInt(insentifView.getText());
            this.insentif = insentif;
        }
        hitungTotalGaji();
        bersihkanInsentif();
    }//GEN-LAST:event_tombolTambahInsentifMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tunjangan;
    private javax.swing.JTextField hariKerjaView;
    private javax.swing.JTextField idPegawaiView;
<<<<<<< HEAD
    private javax.swing.JTextField insentifView;
    private javax.swing.JLabel jLabel1;
=======
>>>>>>> 95bfa68a2e58ad03935ab41ee0dbd9b0b8603a6a
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jabatanView;
    private javax.swing.JTextField jamPelajaranView;
    private javax.swing.JTextField kasBonView;
    private javax.swing.JTextField keteranganView;
    private javax.swing.JTextField namaPegawaiView;
    private javax.swing.JTextField potonganView;
    private javax.swing.JTextField sisaKasBonView;
    private javax.swing.JTable tabelInsentif;
    private javax.swing.JButton tombolCariPegawai;
    private javax.swing.JButton tombolProses;
    private javax.swing.JButton tombolTambahInsentif;
    private javax.swing.JLabel totalGajiView;
    private javax.swing.JTextField totalHariKerjaView;
    private javax.swing.JTextField totalJamPelajaranView;
    private javax.swing.JTextField tunjanganView;
    // End of variables declaration//GEN-END:variables
}
