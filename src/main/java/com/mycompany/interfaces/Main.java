package com.mycompany.interfaces;

/**
 *
 * @author LaisVarela
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_cadastro_pt = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        lb_endereco = new javax.swing.JLabel();
        lb_cadastro_pt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_titulo = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        cb_tipodeconta = new javax.swing.JComboBox<>();
        lb_tipodeconta = new javax.swing.JLabel();
        bt_continuar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pn_signup_eng = new javax.swing.JPanel();
        lb_name = new javax.swing.JLabel();
        lb_address = new javax.swing.JLabel();
        lb_signup_eng = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb_titulo1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        cb_tipodeconta1 = new javax.swing.JComboBox<>();
        lb_account_type = new javax.swing.JLabel();
        bt_next = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));

        pn_cadastro_pt.setBackground(new java.awt.Color(244, 239, 239));

        lb_nome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(0, 102, 0));
        lb_nome.setText("Nome:");

        lb_endereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_endereco.setForeground(new java.awt.Color(0, 102, 0));
        lb_endereco.setText("Endereço:");

        lb_cadastro_pt.setBackground(new java.awt.Color(0, 51, 51));
        lb_cadastro_pt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_cadastro_pt.setForeground(new java.awt.Color(0, 102, 0));
        lb_cadastro_pt.setText("CADASTRO");

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo.setText("NewBank");

        txt_nome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        txt_endereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, java.awt.Color.green, null));

        cb_tipodeconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cb_tipodeconta.setForeground(new java.awt.Color(0, 102, 0));
        cb_tipodeconta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salário", "Poupança", "Corrente" }));
        cb_tipodeconta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, null));

        lb_tipodeconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_tipodeconta.setForeground(new java.awt.Color(0, 102, 0));
        lb_tipodeconta.setText("Tipo de Conta:");

        bt_continuar.setBackground(new java.awt.Color(255, 255, 255));
        bt_continuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_continuar.setForeground(new java.awt.Color(0, 102, 0));
        bt_continuar.setText("Continuar");
        bt_continuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(0, 102, 0));
        bt_sair.setText("Sair");
        bt_sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_cadastro_ptLayout = new javax.swing.GroupLayout(pn_cadastro_pt);
        pn_cadastro_pt.setLayout(pn_cadastro_ptLayout);
        pn_cadastro_ptLayout.setHorizontalGroup(
            pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                                            .addComponent(lb_titulo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lb_cadastro_pt))
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))))
            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                                .addComponent(lb_tipodeconta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_tipodeconta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                                .addComponent(lb_endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                                .addComponent(lb_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_cadastro_ptLayout.setVerticalGroup(
            pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastro_ptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo)
                    .addComponent(lb_cadastro_pt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_endereco)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tipodeconta)
                    .addComponent(cb_tipodeconta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastro_ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair)
                    .addComponent(bt_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_signup_eng.setBackground(new java.awt.Color(244, 239, 239));

        lb_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_name.setForeground(new java.awt.Color(0, 102, 0));
        lb_name.setText("Name:");

        lb_address.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_address.setForeground(new java.awt.Color(0, 102, 0));
        lb_address.setText("Address:");

        lb_signup_eng.setBackground(new java.awt.Color(0, 51, 51));
        lb_signup_eng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_signup_eng.setForeground(new java.awt.Color(0, 102, 0));
        lb_signup_eng.setText("SIGN UP");

        jSeparator4.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_titulo1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lb_titulo1.setForeground(new java.awt.Color(0, 102, 0));
        lb_titulo1.setText("NewBank");

        txt_name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, java.awt.Color.green));

        txt_address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, java.awt.Color.green, null));

        cb_tipodeconta1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cb_tipodeconta1.setForeground(new java.awt.Color(0, 102, 0));
        cb_tipodeconta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salary", "Savings ", "Current" }));
        cb_tipodeconta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, null));

        lb_account_type.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_account_type.setForeground(new java.awt.Color(0, 102, 0));
        lb_account_type.setText("Account Type:");

        bt_next.setBackground(new java.awt.Color(255, 255, 255));
        bt_next.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_next.setForeground(new java.awt.Color(0, 102, 0));
        bt_next.setText("Next");
        bt_next.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_exit.setBackground(new java.awt.Color(255, 255, 255));
        bt_exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_exit.setForeground(new java.awt.Color(0, 102, 0));
        bt_exit.setText("Exit");
        bt_exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn_signup_engLayout = new javax.swing.GroupLayout(pn_signup_eng);
        pn_signup_eng.setLayout(pn_signup_engLayout);
        pn_signup_engLayout.setHorizontalGroup(
            pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_signup_engLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_signup_engLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_signup_engLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_signup_engLayout.createSequentialGroup()
                                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pn_signup_engLayout.createSequentialGroup()
                                            .addComponent(lb_titulo1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lb_signup_eng))
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pn_signup_engLayout.createSequentialGroup()
                                .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_next, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))))
            .addGroup(pn_signup_engLayout.createSequentialGroup()
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_signup_engLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_signup_engLayout.createSequentialGroup()
                                .addComponent(lb_account_type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_tipodeconta1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_signup_engLayout.createSequentialGroup()
                                .addComponent(lb_address)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_signup_engLayout.createSequentialGroup()
                                .addComponent(lb_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn_signup_engLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_signup_engLayout.setVerticalGroup(
            pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_signup_engLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_titulo1)
                    .addComponent(lb_signup_eng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_address)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_account_type)
                    .addComponent(cb_tipodeconta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_signup_engLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exit)
                    .addComponent(bt_next, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_cadastro_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pn_signup_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_cadastro_pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pn_signup_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                new Main().setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_continuar;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_next;
    private javax.swing.JButton bt_sair;
    private javax.swing.JComboBox<String> cb_tipodeconta;
    private javax.swing.JComboBox<String> cb_tipodeconta1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lb_account_type;
    private javax.swing.JLabel lb_address;
    private javax.swing.JLabel lb_cadastro_pt;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_signup_eng;
    private javax.swing.JLabel lb_tipodeconta;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JPanel pn_cadastro_pt;
    private javax.swing.JPanel pn_signup_eng;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
