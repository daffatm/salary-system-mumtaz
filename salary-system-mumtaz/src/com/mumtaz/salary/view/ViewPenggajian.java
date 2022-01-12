package com.mumtaz.salary.view;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ViewPenggajian extends javax.swing.JInternalFrame {
    
    private DefaultTableModel model;
    int gajiPokok;
    int uangTransport;
    public int tunjangan;
    int sisaKasBon;
    int insentif;
    
    public ViewPenggajian() {
        initComponents();
        
        model = new DefaultTableModel();
        tabelInsentif.setModel(model);
        tabelInsentif.setModel(model);
        tabelInsentif.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        tabelInsentif.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
    
    private void hitungSisaKasBon(int potongan){
        int kasbon = Integer.parseInt(kasBonView.getText());
        int sisaKasBon = kasbon-potongan;
        sisaKasBonView.setText(""+sisaKasBon);
        this.sisaKasBon = sisaKasBon;
    }
    
    public void hitungTotalGaji(){
        if(!(potonganView.getText().equals(""))){
            int totalGaji = gajiPokok+uangTransport+tunjangan+insentif-Integer.parseInt(potonganView.getText());
            totalGajiView.setText("Rp "+totalGaji+",00");
        }else if(potonganView.getText().equals("")){
            int totalGaji = gajiPokok+uangTransport+tunjangan+insentif-0;
            totalGajiView.setText("Rp "+totalGaji+",00");
        }
    }
    
    private void bersihkanInsentif(){
        insentifView.setText("");
        keteranganView.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        tabelInsentif = new javax.swing.JTable();
        tombolProses = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/debt (1).png"))); // NOI18N
        jLabel1.setText("Master Penggajian Pegawai");

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Pegawai", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(630, 133));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID Pegawai");

        idPegawaiView.setEditable(false);
        idPegawaiView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Gaji", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        totalGajiView.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        totalGajiView.setText("Rp. 00, 00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(totalGajiView, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalGajiView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        namaPegawaiView.setEditable(false);
        namaPegawaiView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Pegawai");

        jabatanView.setEditable(false);
        jabatanView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jabatan");

        tombolCariPegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tombolCariPegawai.setText("Cari");
        tombolCariPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolCariPegawaiMouseClicked(evt);
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
                    .addComponent(idPegawaiView, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(namaPegawaiView)
                    .addComponent(jabatanView))
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jam Pelajaran");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Hari Kerja");

        Tunjangan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tunjangan.setText("Tunjangan");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kas Bon");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Potongan");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Sisa Kas Bon");

        jamPelajaranView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jamPelajaranView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jamPelajaranView.setText("0");
        jamPelajaranView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jamPelajaranViewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jamPelajaranViewKeyTyped(evt);
            }
        });

        hariKerjaView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hariKerjaView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hariKerjaView.setText("0");
        hariKerjaView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hariKerjaViewKeyReleased(evt);
            }
        });

        tunjanganView.setEditable(false);
        tunjanganView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tunjanganView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tunjanganView.setText("0");

        kasBonView.setEditable(false);
        kasBonView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kasBonView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        kasBonView.setText("0");

        potonganView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        potonganView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        potonganView.setText("0");
        potonganView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                potonganViewKeyReleased(evt);
            }
        });

        sisaKasBonView.setEditable(false);
        sisaKasBonView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sisaKasBonView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sisaKasBonView.setText("0");

        totalJamPelajaranView.setEditable(false);
        totalJamPelajaranView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalJamPelajaranView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalJamPelajaranView.setText("0");

        totalHariKerjaView.setEditable(false);
        totalHariKerjaView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalHariKerjaView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalHariKerjaView.setText("0");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insentif", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Insentif");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Keterangan");

        insentifView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        insentifView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        insentifView.setText("0");

        keteranganView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tombolTambahInsentif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tombolTambahInsentif.setText("Tambah");
        tombolTambahInsentif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolTambahInsentifMouseClicked(evt);
            }
        });

        tabelInsentif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        tombolProses.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tombolProses.setText("PROSES");
        tombolProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tombolProses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Tunjangan)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hariKerjaView, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jamPelajaranView))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalHariKerjaView, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(totalJamPelajaranView)))
                            .addComponent(tunjanganView)
                            .addComponent(kasBonView)
                            .addComponent(potonganView)
                            .addComponent(sisaKasBonView))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolProses, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        //NO ACTIONS
    }//GEN-LAST:event_jamPelajaranViewKeyTyped

    private void jamPelajaranViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamPelajaranViewKeyReleased
        if(!(jamPelajaranView.getText().equals(""))){
            hitungGajiPokok(Integer.parseInt(jamPelajaranView.getText()));
            hitungTotalGaji();
        }else if(jamPelajaranView.getText().equals("")){
            hitungGajiPokok(0);
            hitungTotalGaji();
        }
    }//GEN-LAST:event_jamPelajaranViewKeyReleased

    private void hariKerjaViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hariKerjaViewKeyReleased
        if(!(hariKerjaView.getText().equals(""))){
            hitungUangTransport(Integer.parseInt(hariKerjaView.getText()));
            hitungTotalGaji();
        }else if(hariKerjaView.getText().equals("")){
            hitungUangTransport(0);
            hitungTotalGaji();
        }
    }//GEN-LAST:event_hariKerjaViewKeyReleased

    private void potonganViewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potonganViewKeyReleased
        if(!(potonganView.getText().equals(""))){
            hitungSisaKasBon(Integer.parseInt(potonganView.getText()));
            hitungTotalGaji();
        }else if(potonganView.getText().equals("")){
            hitungSisaKasBon(0);
            hitungTotalGaji();
        }
    }//GEN-LAST:event_potonganViewKeyReleased

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
    private javax.swing.JTextField insentifView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
