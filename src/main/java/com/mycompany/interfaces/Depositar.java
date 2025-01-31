package com.mycompany.interfaces;

public class Depositar extends javax.swing.JPanel {

    public Depositar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_deposit_eng = new javax.swing.JPanel();
        lb_cadastro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_titulo = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lb_deposit_value = new javax.swing.JLabel();
        txt_deposit = new javax.swing.JTextField();
        bt_back = new javax.swing.JButton();
        bt_depositar = new javax.swing.JButton();
        pn_depositar_pt = new javax.swing.JPanel();
        lb_deposita_pt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb_titulo1 = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lb_valorDepositar1 = new javax.swing.JLabel();
        txt_valorDepositar1 = new javax.swing.JTextField();
        bt_voltar = new javax.swing.JButton();
        bt_depositar1 = new javax.swing.JButton();

        pn_deposit_eng.setBackground(new java.awt.Color(244, 239, 239));

        lb_cadastro.setBackground(new java.awt.Color(0, 51, 51));
        lb_cadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_cadastro.setForeground(new java.awt.Color(0, 102, 0));
        lb_cadastro.setText("DEPOSIT");

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

        lb_deposit_value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_deposit_value.setForeground(new java.awt.Color(0, 102, 0));
        lb_deposit_value.setText("VALUE:");

        txt_deposit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        bt_back.setBackground(new java.awt.Color(255, 255, 255));
        bt_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_back.setForeground(new java.awt.Color(0, 102, 0));
        bt_back.setText("Back");
        bt_back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_depositar.setBackground(new java.awt.Color(255, 255, 255));
        bt_depositar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_depositar.setForeground(new java.awt.Color(0, 102, 0));
        bt_depositar.setText("Deposit");
        bt_depositar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_deposit_engLayout = new javax.swing.GroupLayout(pn_deposit_eng);
        pn_deposit_eng.setLayout(pn_deposit_engLayout);
        pn_deposit_engLayout.setHorizontalGroup(
            pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_deposit_engLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_deposit_engLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_deposit_engLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_deposit_engLayout.createSequentialGroup()
                                .addComponent(lb_titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_cadastro))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(pn_deposit_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_deposit_engLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lb_deposit_value)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_deposit_engLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_deposit_engLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_deposit_engLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pn_deposit_engLayout.setVerticalGroup(
            pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_deposit_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo)
                    .addComponent(lb_cadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_deposit_value)
                    .addComponent(txt_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_depositar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_deposit_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exit)
                    .addComponent(bt_back))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_depositar_pt.setBackground(new java.awt.Color(244, 239, 239));

        lb_deposita_pt.setBackground(new java.awt.Color(0, 51, 51));
        lb_deposita_pt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_deposita_pt.setForeground(new java.awt.Color(0, 102, 0));
        lb_deposita_pt.setText("DEPOSITAR");

        jSeparator4.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo1.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo1.setText("NewBank");

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

        jSeparator6.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_valorDepositar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_valorDepositar1.setForeground(new java.awt.Color(0, 102, 0));
        lb_valorDepositar1.setText("VALOR:");

        txt_valorDepositar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 102, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_depositar1.setBackground(new java.awt.Color(255, 255, 255));
        bt_depositar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_depositar1.setForeground(new java.awt.Color(0, 102, 0));
        bt_depositar1.setText("Depositar");
        bt_depositar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_depositar_ptLayout = new javax.swing.GroupLayout(pn_depositar_pt);
        pn_depositar_pt.setLayout(pn_depositar_ptLayout);
        pn_depositar_ptLayout.setHorizontalGroup(
            pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                                .addComponent(lb_titulo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_deposita_pt))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lb_valorDepositar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_valorDepositar1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_depositar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_depositar_ptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pn_depositar_ptLayout.setVerticalGroup(
            pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_depositar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo1)
                    .addComponent(lb_deposita_pt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valorDepositar1)
                    .addComponent(txt_valorDepositar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_depositar1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_depositar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair)
                    .addComponent(bt_voltar))
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
                .addComponent(pn_deposit_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_depositar_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(pn_deposit_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(pn_depositar_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_depositar;
    private javax.swing.JButton bt_depositar1;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lb_cadastro;
    private javax.swing.JLabel lb_deposit_value;
    private javax.swing.JLabel lb_deposita_pt;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JLabel lb_valorDepositar1;
    private javax.swing.JPanel pn_deposit_eng;
    private javax.swing.JPanel pn_depositar_pt;
    private javax.swing.JTextField txt_deposit;
    private javax.swing.JTextField txt_valorDepositar1;
    // End of variables declaration//GEN-END:variables
}
