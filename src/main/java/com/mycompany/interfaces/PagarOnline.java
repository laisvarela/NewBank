package com.mycompany.interfaces;

public class PagarOnline extends javax.swing.JPanel {

    public PagarOnline() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_pay_eng = new javax.swing.JPanel();
        lb_pay = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_titulo = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lb_payValue = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        bt_back = new javax.swing.JButton();
        bt_payonline = new javax.swing.JButton();
        pn_pagar_pt = new javax.swing.JPanel();
        lb_pagarOnline_pt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb_titulo1 = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lb_valorPagar = new javax.swing.JLabel();
        txt_pagar = new javax.swing.JTextField();
        bt_voltar = new javax.swing.JButton();
        bt_pagar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        pn_pay_eng.setBackground(new java.awt.Color(244, 239, 239));

        lb_pay.setBackground(new java.awt.Color(0, 51, 51));
        lb_pay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_pay.setForeground(new java.awt.Color(0, 102, 0));
        lb_pay.setText("PAY ONLINE");

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

        lb_payValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_payValue.setForeground(new java.awt.Color(0, 102, 0));
        lb_payValue.setText("VALUE:");

        txt_pay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        bt_back.setBackground(new java.awt.Color(255, 255, 255));
        bt_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_back.setForeground(new java.awt.Color(0, 102, 0));
        bt_back.setText("Back");
        bt_back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_payonline.setBackground(new java.awt.Color(255, 255, 255));
        bt_payonline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_payonline.setForeground(new java.awt.Color(0, 102, 0));
        bt_payonline.setText("Pay Online");
        bt_payonline.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_pay_engLayout = new javax.swing.GroupLayout(pn_pay_eng);
        pn_pay_eng.setLayout(pn_pay_engLayout);
        pn_pay_engLayout.setHorizontalGroup(
            pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pay_engLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_pay_engLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_pay_engLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_pay_engLayout.createSequentialGroup()
                                .addComponent(lb_titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_pay))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(pn_pay_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_pay_engLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lb_payValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_payonline, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pay_engLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_pay_engLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_pay_engLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pn_pay_engLayout.setVerticalGroup(
            pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pay_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo)
                    .addComponent(lb_pay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_payValue)
                    .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_payonline))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pay_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exit)
                    .addComponent(bt_back))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_pagar_pt.setBackground(new java.awt.Color(244, 239, 239));

        lb_pagarOnline_pt.setBackground(new java.awt.Color(0, 51, 51));
        lb_pagarOnline_pt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_pagarOnline_pt.setForeground(new java.awt.Color(0, 102, 0));
        lb_pagarOnline_pt.setText("PAGAR ONLINE");

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

        lb_valorPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_valorPagar.setForeground(new java.awt.Color(0, 102, 0));
        lb_valorPagar.setText("VALOR:");

        txt_pagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 102, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_pagar.setBackground(new java.awt.Color(255, 255, 255));
        bt_pagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_pagar.setForeground(new java.awt.Color(0, 102, 0));
        bt_pagar.setText("Pagar Online");
        bt_pagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_pagar_ptLayout = new javax.swing.GroupLayout(pn_pagar_pt);
        pn_pagar_pt.setLayout(pn_pagar_ptLayout);
        pn_pagar_ptLayout.setHorizontalGroup(
            pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                                .addComponent(lb_titulo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_pagarOnline_pt))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lb_valorPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pagar_ptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pn_pagar_ptLayout.setVerticalGroup(
            pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pagar_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo1)
                    .addComponent(lb_pagarOnline_pt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valorPagar)
                    .addComponent(txt_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pagar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pagar_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_pay_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_pagar_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(pn_pay_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(pn_pagar_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
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
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_pagar;
    private javax.swing.JButton bt_payonline;
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
    private javax.swing.JLabel lb_pagarOnline_pt;
    private javax.swing.JLabel lb_pay;
    private javax.swing.JLabel lb_payValue;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JLabel lb_valorPagar;
    private javax.swing.JPanel pn_pagar_pt;
    private javax.swing.JPanel pn_pay_eng;
    private javax.swing.JTextField txt_pagar;
    private javax.swing.JTextField txt_pay;
    // End of variables declaration//GEN-END:variables
}
