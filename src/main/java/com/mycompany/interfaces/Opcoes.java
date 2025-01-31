package com.mycompany.interfaces;

public class Opcoes extends javax.swing.JPanel {

    public Opcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_opcao_eng = new javax.swing.JPanel();
        lb_opcao_eng = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_titulo = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        bt_withdraw = new javax.swing.JButton();
        bt_deposit = new javax.swing.JButton();
        bt_payOnline = new javax.swing.JButton();
        pn_opcao_pt = new javax.swing.JPanel();
        lb_opcao_pt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb_titulo1 = new javax.swing.JLabel();
        bt_sair1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        bt_sacar1 = new javax.swing.JButton();
        bt_depositar1 = new javax.swing.JButton();
        bt_pagarOnline1 = new javax.swing.JButton();

        pn_opcao_eng.setBackground(new java.awt.Color(244, 239, 239));

        lb_opcao_eng.setBackground(new java.awt.Color(0, 51, 51));
        lb_opcao_eng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_opcao_eng.setForeground(new java.awt.Color(0, 102, 0));
        lb_opcao_eng.setText("CHOOSE AN OPTION");

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo.setText("NewBank");

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

        jSeparator5.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_withdraw.setBackground(new java.awt.Color(255, 255, 255));
        bt_withdraw.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_withdraw.setForeground(new java.awt.Color(0, 102, 0));
        bt_withdraw.setText("Withdraw");
        bt_withdraw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_deposit.setBackground(new java.awt.Color(255, 255, 255));
        bt_deposit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_deposit.setForeground(new java.awt.Color(0, 102, 0));
        bt_deposit.setText("Deposit");
        bt_deposit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_payOnline.setBackground(new java.awt.Color(255, 255, 255));
        bt_payOnline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_payOnline.setForeground(new java.awt.Color(0, 102, 0));
        bt_payOnline.setText("Pay Online");
        bt_payOnline.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_opcao_engLayout = new javax.swing.GroupLayout(pn_opcao_eng);
        pn_opcao_eng.setLayout(pn_opcao_engLayout);
        pn_opcao_engLayout.setHorizontalGroup(
            pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_opcao_engLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_opcao_engLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_opcao_engLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pn_opcao_engLayout.createSequentialGroup()
                                    .addComponent(lb_titulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_opcao_eng))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pn_opcao_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_opcao_engLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(pn_opcao_engLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(bt_withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(bt_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bt_payOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        pn_opcao_engLayout.setVerticalGroup(
            pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_opcao_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo)
                    .addComponent(lb_opcao_eng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pn_opcao_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_withdraw)
                    .addComponent(bt_deposit)
                    .addComponent(bt_payOnline))
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bt_exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_opcao_pt.setBackground(new java.awt.Color(244, 239, 239));

        lb_opcao_pt.setBackground(new java.awt.Color(0, 51, 51));
        lb_opcao_pt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_opcao_pt.setForeground(new java.awt.Color(0, 102, 0));
        lb_opcao_pt.setText("ESCOLHA UMA OPÇÃO ");

        jSeparator4.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo1.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo1.setText("NewBank");

        bt_sair1.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair1.setForeground(new java.awt.Color(0, 102, 0));
        bt_sair1.setText("Sair");
        bt_sair1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sair1ActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_sacar1.setBackground(new java.awt.Color(255, 255, 255));
        bt_sacar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sacar1.setForeground(new java.awt.Color(0, 102, 0));
        bt_sacar1.setText("Sacar");
        bt_sacar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_depositar1.setBackground(new java.awt.Color(255, 255, 255));
        bt_depositar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_depositar1.setForeground(new java.awt.Color(0, 102, 0));
        bt_depositar1.setText("Depositar");
        bt_depositar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_pagarOnline1.setBackground(new java.awt.Color(255, 255, 255));
        bt_pagarOnline1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_pagarOnline1.setForeground(new java.awt.Color(0, 102, 0));
        bt_pagarOnline1.setText("Pagar Online");
        bt_pagarOnline1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_opcao_ptLayout = new javax.swing.GroupLayout(pn_opcao_pt);
        pn_opcao_pt.setLayout(pn_opcao_ptLayout);
        pn_opcao_ptLayout.setHorizontalGroup(
            pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                                    .addComponent(lb_titulo1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_opcao_pt))
                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_opcao_ptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(bt_sacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_depositar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bt_pagarOnline1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        pn_opcao_ptLayout.setVerticalGroup(
            pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_opcao_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo1)
                    .addComponent(lb_opcao_pt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pn_opcao_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sacar1)
                    .addComponent(bt_depositar1)
                    .addComponent(bt_pagarOnline1))
                .addGap(54, 54, 54)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bt_sair1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(pn_opcao_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_opcao_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_opcao_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_opcao_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sair1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_sair1ActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_deposit;
    private javax.swing.JButton bt_depositar1;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_pagarOnline1;
    private javax.swing.JButton bt_payOnline;
    private javax.swing.JButton bt_sacar1;
    private javax.swing.JButton bt_sair1;
    private javax.swing.JButton bt_withdraw;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lb_opcao_eng;
    private javax.swing.JLabel lb_opcao_pt;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JPanel pn_opcao_eng;
    private javax.swing.JPanel pn_opcao_pt;
    // End of variables declaration//GEN-END:variables
}
