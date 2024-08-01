package com.mycompany.interfaces;

public class Sacar extends javax.swing.JPanel {

    public Sacar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_sacar_pt = new javax.swing.JPanel();
        lb_sacar_pt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_titulo = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lb_valorSacar = new javax.swing.JLabel();
        txt_sacar = new javax.swing.JTextField();
        bt_voltar = new javax.swing.JButton();
        bt_sacar = new javax.swing.JButton();
        pn_withdraw_eng = new javax.swing.JPanel();
        lb_withdraw_eng = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb_titulo1 = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lb_withdraw_value = new javax.swing.JLabel();
        txt_withdraw = new javax.swing.JTextField();
        bt_back = new javax.swing.JButton();
        bt_withdraw = new javax.swing.JButton();

        pn_sacar_pt.setBackground(new java.awt.Color(244, 239, 239));

        lb_sacar_pt.setBackground(new java.awt.Color(0, 51, 51));
        lb_sacar_pt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_sacar_pt.setForeground(new java.awt.Color(0, 102, 0));
        lb_sacar_pt.setText("SACAR");

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo.setText("NewBank");

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(0, 102, 0));
        bt_sair.setText("Sair");
        bt_sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_valorSacar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_valorSacar.setForeground(new java.awt.Color(0, 102, 0));
        lb_valorSacar.setText("VALOR:");

        txt_sacar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 102, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_sacar.setBackground(new java.awt.Color(255, 255, 255));
        bt_sacar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sacar.setForeground(new java.awt.Color(0, 102, 0));
        bt_sacar.setText("Sacar");
        bt_sacar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_sacar_ptLayout = new javax.swing.GroupLayout(pn_sacar_pt);
        pn_sacar_pt.setLayout(pn_sacar_ptLayout);
        pn_sacar_ptLayout.setHorizontalGroup(
            pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))
                            .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                                .addComponent(lb_titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_sacar_pt)
                                .addGap(28, 28, 28))))))
            .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lb_valorSacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_sacar_ptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pn_sacar_ptLayout.setVerticalGroup(
            pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sacar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo)
                    .addComponent(lb_sacar_pt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valorSacar)
                    .addComponent(txt_sacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sacar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_sacar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair)
                    .addComponent(bt_voltar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_withdraw_eng.setBackground(new java.awt.Color(244, 239, 239));

        lb_withdraw_eng.setBackground(new java.awt.Color(0, 51, 51));
        lb_withdraw_eng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_withdraw_eng.setForeground(new java.awt.Color(0, 102, 0));
        lb_withdraw_eng.setText("WITHDRAW");

        jSeparator4.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo1.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo1.setText("NewBank");

        bt_exit.setBackground(new java.awt.Color(255, 255, 255));
        bt_exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_exit.setForeground(new java.awt.Color(0, 102, 0));
        bt_exit.setText("Exit");
        bt_exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_withdraw_value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_withdraw_value.setForeground(new java.awt.Color(0, 102, 0));
        lb_withdraw_value.setText("VALUE:");

        txt_withdraw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        bt_back.setBackground(new java.awt.Color(255, 255, 255));
        bt_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_back.setForeground(new java.awt.Color(0, 102, 0));
        bt_back.setText("Back");
        bt_back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_withdraw.setBackground(new java.awt.Color(255, 255, 255));
        bt_withdraw.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_withdraw.setForeground(new java.awt.Color(0, 102, 0));
        bt_withdraw.setText("Withdraw");
        bt_withdraw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_withdraw_engLayout = new javax.swing.GroupLayout(pn_withdraw_eng);
        pn_withdraw_eng.setLayout(pn_withdraw_engLayout);
        pn_withdraw_engLayout.setHorizontalGroup(
            pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))
                            .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                                .addComponent(lb_titulo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_withdraw_eng)
                                .addGap(28, 28, 28))))))
            .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lb_withdraw_value)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_withdraw_engLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pn_withdraw_engLayout.setVerticalGroup(
            pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_withdraw_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo1)
                    .addComponent(lb_withdraw_eng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_withdraw_value)
                    .addComponent(txt_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_withdraw))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_withdraw_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exit)
                    .addComponent(bt_back))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_withdraw_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_sacar_pt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_sacar_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_withdraw_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_sacar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton bt_withdraw;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lb_sacar_pt;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JLabel lb_valorSacar;
    private javax.swing.JLabel lb_withdraw_eng;
    private javax.swing.JLabel lb_withdraw_value;
    private javax.swing.JPanel pn_sacar_pt;
    private javax.swing.JPanel pn_withdraw_eng;
    private javax.swing.JTextField txt_sacar;
    private javax.swing.JTextField txt_withdraw;
    // End of variables declaration//GEN-END:variables
}
