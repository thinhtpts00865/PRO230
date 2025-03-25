package com.tvt.component;

import com.tvt.chart.ModelChart;
import com.tvt.dao.ThongKeDAO;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends JPanel {
    DecimalFormat df = new DecimalFormat("#,##0.##");
    public TrangChu() {
        initComponents();
        setOpaque(false);
        init();
        tblTopSanPham.setShowGrid(false);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelBorder9 = new com.tvt.swing.PanelBorder();
        jPanel2 = new javax.swing.JPanel();
        btnChuaThanhToan = new com.tvt.swing.ButtonMenu();
        btnChuaGiao = new com.tvt.swing.ButtonMenu();
        btnDaGiao = new com.tvt.swing.ButtonMenu();
        btnHuyDon = new com.tvt.swing.ButtonMenu();
        jLabel2 = new javax.swing.JLabel();
        panelBorder8 = new com.tvt.swing.PanelBorder();
        lineChart = new com.tvt.chart.LineChart();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDonHang = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lblSoLuongHang = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTopSanPham = new com.tvt.swing.Table();
        cboYear = new com.tvt.swing.ComboBox();
        panelBorder1 = new com.tvt.swing.PanelBorder();
        jPanel1 = new javax.swing.JPanel();
        card1 = new com.tvt.component.Card();
        card4 = new com.tvt.component.Card();
        jLabel1 = new javax.swing.JLabel();
        panelBorder2 = new com.tvt.swing.PanelBorder();
        calendarPanel2 = new com.tvt.component.CalendarPanel();

        panelBorder9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnChuaThanhToan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 217, 223), 1, true));
        btnChuaThanhToan.setForeground(new java.awt.Color(0, 0, 0));
        btnChuaThanhToan.setText(" 0 chưa thanh toán");
        btnChuaThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnChuaThanhToan, gridBagConstraints);

        btnChuaGiao.setBackground(new java.awt.Color(0, 0, 0));
        btnChuaGiao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 217, 223), 1, true));
        btnChuaGiao.setForeground(new java.awt.Color(0, 0, 0));
        btnChuaGiao.setText(" 0 chưa giao hàng");
        btnChuaGiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChuaGiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuaGiaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnChuaGiao, gridBagConstraints);

        btnDaGiao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223)));
        btnDaGiao.setForeground(new java.awt.Color(0, 0, 0));
        btnDaGiao.setText(" 0 đang giao hàng");
        btnDaGiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDaGiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaGiaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(btnDaGiao, gridBagConstraints);

        btnHuyDon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 217, 223), 1, true));
        btnHuyDon.setForeground(new java.awt.Color(0, 0, 0));
        btnHuyDon.setText(" 2 hủy đơn hàng");
        btnHuyDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(btnHuyDon, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Trạng thái đơn hàng:");

        javax.swing.GroupLayout panelBorder9Layout = new javax.swing.GroupLayout(panelBorder9);
        panelBorder9.setLayout(panelBorder9Layout);
        panelBorder9Layout.setHorizontalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder9Layout.setVerticalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelBorder8.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(214, 217, 223));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tổng Doanh Thu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDoanhThu.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel4.add(lblDoanhThu, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tổng Đơn Hàng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel4.add(jLabel5, gridBagConstraints);

        lblDonHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDonHang.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel4.add(lblDonHang, gridBagConstraints);

        jSeparator2.setForeground(new java.awt.Color(214, 217, 223));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 50);
        jPanel4.add(jSeparator2, gridBagConstraints);

        jSeparator3.setForeground(new java.awt.Color(214, 217, 223));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 50);
        jPanel4.add(jSeparator3, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tổng Số Lượng Hàng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel4.add(jLabel7, gridBagConstraints);

        lblSoLuongHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoLuongHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSoLuongHang.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel4.add(lblSoLuongHang, gridBagConstraints);

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(214, 217, 223));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Doanh Thu Thuần");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Sản Phẩm Bán Chạy");

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblTopSanPham.setForeground(new java.awt.Color(255, 255, 255));
        tblTopSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hình Ảnh", "Tên Sản Phẩm", "Lượt Bán "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTopSanPham);

        cboYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboYearMouseClicked(evt);
            }
        });
        cboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder8Layout = new javax.swing.GroupLayout(panelBorder8);
        panelBorder8.setLayout(panelBorder8Layout);
        panelBorder8Layout.setHorizontalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                            .addGroup(panelBorder8Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder8Layout.setVerticalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(255, 163, 55));
        card1.setColor2(new java.awt.Color(255, 226, 118));
        jPanel1.add(card1);

        card4.setColor1(new java.awt.Color(44, 103, 176));
        card4.setColor2(new java.awt.Color(35, 56, 136));
        jPanel1.add(card4);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kết Quả Kinh Doanh:");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        calendarPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBorder9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaGiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaGiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDaGiaoActionPerformed

    private void btnChuaGiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuaGiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChuaGiaoActionPerformed

    private void cboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboYearActionPerformed
        // TODO add your handling code here:
        this.loadComboBoxYears();
    }//GEN-LAST:event_cboYearActionPerformed

    private void cboYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboYearMouseClicked
        // TODO add your handling code here:
        this.loadComboBoxYears();
    }//GEN-LAST:event_cboYearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.tvt.swing.ButtonMenu btnChuaGiao;
    private com.tvt.swing.ButtonMenu btnChuaThanhToan;
    private com.tvt.swing.ButtonMenu btnDaGiao;
    private com.tvt.swing.ButtonMenu btnHuyDon;
    private com.tvt.component.CalendarPanel calendarPanel2;
    private com.tvt.component.Card card1;
    private com.tvt.component.Card card4;
    private com.tvt.swing.ComboBox cboYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblSoLuongHang;
    private com.tvt.chart.LineChart lineChart;
    private com.tvt.swing.PanelBorder panelBorder1;
    private com.tvt.swing.PanelBorder panelBorder2;
    private com.tvt.swing.PanelBorder panelBorder8;
    private com.tvt.swing.PanelBorder panelBorder9;
    private com.tvt.swing.Table tblTopSanPham;
    // End of variables declaration//GEN-END:variables
    ThongKeDAO tkDAO = new ThongKeDAO();
    
    private void init(){
        loadDataToTableTopProducts();
        loadComboBoxYears();
        loadDataToConditionButton();
        tblTopSanPham.fixTable(jScrollPane2);
        loadDataToTotalRevenueChart();
    }
    
    public void loadDataToTableTopProducts() {
        DefaultTableModel model = (DefaultTableModel) tblTopSanPham.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkDAO.getTopSanPham(WIDTH);

        for (Object[] row : list) {
            String imagePath = "/com/tvt/icon/" + row[0]; 
            ImageIcon icon = new ImageIcon(getClass().getResource(imagePath)); 

            model.addRow(new Object[]{icon, row[1], row[2]});
        }
    }

    public void loadComboBoxYears(){
        cboYear.removeAllItems();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int year = currentYear - 5; year <= currentYear; year++) {
            cboYear.addItem(String.valueOf(year));
        }
        this.loadDataToTotalRevenueChart();
    }
    
    public void loadDataToConditionButton() {
        List<Object[]> list = tkDAO.getTrangThaiDonHang();
        for (Object[] row : list) {
            btnChuaThanhToan.setText(" "+row[0]+" chưa thanh toán");
            btnChuaGiao.setText(" "+row[1]+" chưa giao hàng");
            btnDaGiao.setText(" "+row[2]+" đã giao hàng");
            btnHuyDon.setText(" "+row[3]+" đã hủy");
        }
    }
    
    public void loadDataToTotalRevenueChart() {
        String selectedYear = (String) cboYear.getSelectedItem(); 
        int year = Integer.parseInt(selectedYear);

        String[] monthNames = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        List<Object[]> list = tkDAO.getDoanhThuTheoNam(year);
        lineChart.clear();
        lineChart.addLegend("Doanh Thu Thuần", new Color(12, 84, 175), Color.blue);

        for (Object[] data : list) {
            int monthIndex = (data[0] instanceof Number) ? ((Number) data[0]).intValue() : 0;
            String month = (monthIndex >= 1 && monthIndex <= 12) ? monthNames[monthIndex] : "Unknown"; 

            double revenue = (data[1] != null) ? ((Number) data[1]).doubleValue() : 0; 
            lineChart.addData(new ModelChart(month, new double[]{revenue}));
        }
        lineChart.start();
        
        List<Object[]> list2 = tkDAO.getThongTinTheoNam(year);
        for (Object[] row : list2) {
            double doanhThu = row[3] instanceof Number ? ((Number) row[3]).doubleValue() : 0;
            double soLuong = row[2] instanceof Number ? ((Number) row[2]).doubleValue() : 0;
            lblDoanhThu.setText(df.format(doanhThu));
            lblDonHang.setText(""+ row[1]);
            lblSoLuongHang.setText(""+soLuong);
        }
    }
}
