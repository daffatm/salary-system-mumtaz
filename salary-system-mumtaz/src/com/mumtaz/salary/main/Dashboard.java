package com.mumtaz.salary.main;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.mumtaz.salary.view.ViewLaporan;
import com.mumtaz.salary.view.ViewPegawai;
import com.mumtaz.salary.view.ViewPenggajian;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Dashboard extends javax.swing.JFrame {

    ViewPegawai pegawai = new ViewPegawai();
    ViewLaporan laporan = new ViewLaporan();
    ViewPenggajian penggajian = new ViewPenggajian();
    
    
    public Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tombolMenuDashboard = new javax.swing.JButton();
        tombolMenuPegawai = new javax.swing.JButton();
        tombolMenuPenggajian = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panelUtama = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBackground(new java.awt.Color(51, 204, 51));
        panelMenu.setPreferredSize(new java.awt.Dimension(200, 596));

        jPanel1.setBackground(new java.awt.Color(51, 204, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 180));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center>SD-IT <br>MUMTAZ");
        jLabel4.setToolTipText("");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 44));

        jPanel2.setBackground(new java.awt.Color(121, 255, 77));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tombolMenuDashboard.setBackground(new java.awt.Color(112, 219, 112));
        tombolMenuDashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tombolMenuDashboard.setForeground(new java.awt.Color(255, 255, 255));
        tombolMenuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/dashboard (1).png"))); // NOI18N
        tombolMenuDashboard.setText("Dashboard");
        tombolMenuDashboard.setBorder(null);
        tombolMenuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuDashboardActionPerformed(evt);
            }
        });

        tombolMenuPegawai.setBackground(new java.awt.Color(51, 204, 51));
        tombolMenuPegawai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tombolMenuPegawai.setForeground(new java.awt.Color(255, 255, 255));
        tombolMenuPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/division (1).png"))); // NOI18N
        tombolMenuPegawai.setText("Master Pegawai");
        tombolMenuPegawai.setBorder(null);
        tombolMenuPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuPegawaiActionPerformed(evt);
            }
        });

        tombolMenuPenggajian.setBackground(new java.awt.Color(51, 204, 51));
        tombolMenuPenggajian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tombolMenuPenggajian.setForeground(new java.awt.Color(255, 255, 255));
        tombolMenuPenggajian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/debt (1).png"))); // NOI18N
        tombolMenuPenggajian.setText("Master Penggajian");
        tombolMenuPenggajian.setBorder(null);
        tombolMenuPenggajian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuPenggajianActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 204, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/debt (1).png"))); // NOI18N
        jButton4.setText("Master Hutang");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 204, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/report (1).png"))); // NOI18N
        jButton5.setText("Laporan");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tombolMenuPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tombolMenuDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tombolMenuPenggajian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolMenuDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tombolMenuPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolMenuPenggajian, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        panelUtama.setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mumtaz/salary/pictures/back-to-school (1).png"))); // NOI18N

        panelUtama.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUtama))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelUtama)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        tombolMenuDashboard.setBackground(new Color(51,204,51));
        tombolMenuPegawai.setBackground(new Color(51,204,51));
        tombolMenuPenggajian.setBackground(new Color(51,204,51));
        jButton4.setBackground(new Color(51,204,51));
        jButton5.setBackground(new Color(112, 219, 112));
        
        this.panelUtama.add(laporan);
        laporan.show();
        try {
            laporan.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        tombolMenuDashboard.setBackground(new Color(51,204,51));
        tombolMenuPegawai.setBackground(new Color(51,204,51));
        tombolMenuPenggajian.setBackground(new Color(51,204,51));
        jButton4.setBackground(new Color(112, 219, 112));
        jButton5.setBackground(new Color(51,204,51));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tombolMenuPenggajianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuPenggajianActionPerformed
        // TODO add your handling code here:
        tombolMenuDashboard.setBackground(new Color(51,204,51));
        tombolMenuPegawai.setBackground(new Color(51,204,51));
        tombolMenuPenggajian.setBackground(new Color(112, 219, 112));
        jButton4.setBackground(new Color(51,204,51));
        jButton5.setBackground(new Color(51,204,51));
        
        if (pegawai.isShowing()) {
            pegawai.dispose();
        }
        
        this.panelUtama.add(penggajian);
        penggajian.show();
        try {
            penggajian.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tombolMenuPenggajianActionPerformed

    private void tombolMenuPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuPegawaiActionPerformed
        // TODO add your handling code here:
        tombolMenuDashboard.setBackground(new Color(51,204,51));
        tombolMenuPegawai.setBackground(new Color(112, 219, 112));
        tombolMenuPenggajian.setBackground(new Color(51,204,51));
        jButton4.setBackground(new Color(51,204,51));
        jButton5.setBackground(new Color(51,204,51));
        
        if (penggajian.isShowing()) {
            penggajian.dispose();
        }
        
        this.panelUtama.add(pegawai);
        pegawai.show();
        try {
            pegawai.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tombolMenuPegawaiActionPerformed

    private void tombolMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuDashboardActionPerformed
        // TODO add your handling code here:
        // Basic : 51,204,51
        // On : 112, 219, 112
        tombolMenuDashboard.setBackground(new Color(112, 219, 112));
        tombolMenuPegawai.setBackground(new Color(51,204,51));
        tombolMenuPenggajian.setBackground(new Color(51,204,51));
        jButton4.setBackground(new Color(51,204,51));
        jButton5.setBackground(new Color(51,204,51));
        
        this.panelUtama.getSelectedFrame().dispose();
        this.panelUtama.remove(pegawai);
        this.panelUtama.remove(laporan);
    }//GEN-LAST:event_jButton1ActionPerformed
        if(penggajian.isShowing()){
            penggajian.dispose();
        }else if(pegawai.isShowing()){
            pegawai.dispose();
        }
    }//GEN-LAST:event_tombolMenuDashboardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JDesktopPane panelUtama;
    private javax.swing.JButton tombolMenuDashboard;
    private javax.swing.JButton tombolMenuPegawai;
    private javax.swing.JButton tombolMenuPenggajian;
    // End of variables declaration//GEN-END:variables
}
