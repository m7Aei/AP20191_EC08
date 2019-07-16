/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.view;

import br.com.ap220191.ec08_locacao_veiculos.controller.MenuLocacaoController;
import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.AutomovelDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.MotoristaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.postgresql.core.ConnectionFactory;

public class MenuLocacao extends javax.swing.JFrame {

    private final MenuLocacaoController controller;

    public MenuLocacao() {
        initComponents();
        setLocationRelativeTo(null);
        controller = new MenuLocacaoController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        confirmLocacao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMotorista = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldPrazoLocacao = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxVeiculo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextFieldCpfLocacao = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxValorDiaria = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxValorKilometragem = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 187, 125));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Locação");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        confirmLocacao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        confirmLocacao.setText("Confirmar locação");
        confirmLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmLocacaoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cabriolet_Red_icon-icons.com_54906.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Car_Grey_icon-icons.com_54905.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TowTruck_Yellow_icon-icons.com_54896.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TouringMotorcycle_Green_icon-icons.com_54907.png"))); // NOI18N

        jComboBoxMotorista.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBoxMotorista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thallis", "Ian", "Verônica", "Natalie", "Dhiuly" }));
        jComboBoxMotorista.setToolTipText("");
        jComboBoxMotorista.setAlignmentX(0.0F);
        jComboBoxMotorista.setAlignmentY(0.0F);
        jComboBoxMotorista.setBorder(null);
        jComboBoxMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxMotorista.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jComboBoxMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMotoristaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Escolha seu motorista:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Escolha até quando será locado:");

        try {
            jFormattedTextFieldPrazoLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Escolha seu veículo:");

        jComboBoxVeiculo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBoxVeiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Moto", "Utilitário", "Simples", "Luxo", "Super-Luxo" }));
        jComboBoxVeiculo.setToolTipText("");
        jComboBoxVeiculo.setAlignmentX(0.0F);
        jComboBoxVeiculo.setAlignmentY(0.0F);
        jComboBoxVeiculo.setBorder(null);
        jComboBoxVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxVeiculo.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jComboBoxVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Digite seu cpf:");

        try {
            jFormattedTextFieldCpfLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Escolha o valor da diária:");

        jComboBoxValorDiaria.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBoxValorDiaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "150", "200", "300" }));
        jComboBoxValorDiaria.setToolTipText("");
        jComboBoxValorDiaria.setAlignmentX(0.0F);
        jComboBoxValorDiaria.setAlignmentY(0.0F);
        jComboBoxValorDiaria.setBorder(null);
        jComboBoxValorDiaria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxValorDiaria.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jComboBoxValorDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValorDiariaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Escolha o valor da kilometragem:");

        jComboBoxValorKilometragem.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBoxValorKilometragem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "20", "25", "30", "40" }));
        jComboBoxValorKilometragem.setToolTipText("");
        jComboBoxValorKilometragem.setAlignmentX(0.0F);
        jComboBoxValorKilometragem.setAlignmentY(0.0F);
        jComboBoxValorKilometragem.setBorder(null);
        jComboBoxValorKilometragem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxValorKilometragem.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jComboBoxValorKilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValorKilometragemActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Digite a placa do veículo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmLocacao)
                .addGap(170, 170, 170))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(jComboBoxValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(5, 5, 5)
                                .addComponent(jComboBoxValorKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBoxMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jFormattedTextFieldPrazoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCpfLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextFieldCpfLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldPrazoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPlaca)
                        .addGap(2, 2, 2)))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jComboBoxValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(jComboBoxValorKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(jComboBoxMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)))
                .addComponent(confirmLocacao)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 510, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoActionPerformed


    }//GEN-LAST:event_jComboBoxVeiculoActionPerformed

    private void jComboBoxMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMotoristaActionPerformed

    private void confirmLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLocacaoActionPerformed

        if(jFormattedTextFieldCpfLocacao.getText().equals("   .   .   -  ") || jFormattedTextFieldPrazoLocacao.getText().equals("  /  /  ") || jTextFieldPlaca.getText().equals("")  ){
            JOptionPane.showMessageDialog(null, "Preencha todos os dados");
        }
        else{ 
        try {
            if (controller.validarDisponibilidadeMotorista().equals("true")) {
                if (controller.validarDisponibilidadeVeiculo().equals("true")) {
                    if ((controller.validarHabilitacao().equals("A") && controller.validarTipoVeiculo().equals("Moto")) || 
                            (controller.validarHabilitacao().equals("B") && (controller.validarTipoVeiculo().equals("Simples") || 
                            controller.validarTipoVeiculo().equals("Luxo") || controller.validarTipoVeiculo().equals("Super-Luxo"))) || 
                            (controller.validarHabilitacao().equals("C") || controller.validarHabilitacao().equals("D")) && (controller.validarTipoVeiculo().equals("Utilitário") ||
                            controller.validarTipoVeiculo().equals("Simples")||
                            controller.validarTipoVeiculo().equals("Luxo")||
                            controller.validarTipoVeiculo().equals("Super-Luxo"))) {                       
                            controller.salvarLocacao();
                            controller.alterarDisponibilidadeVeiculo();
                            this.dispose();
                        } else {                          
                                    JOptionPane.showMessageDialog(null, "Este motorista não pode dirigir esse tipo de veículo");
                     
                            }
                    } else {
                    JOptionPane.showMessageDialog(null, "Veículo indisponível");
                }
                 
            } else {
                JOptionPane.showMessageDialog(null, "Motorista indisponível");
            }

        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados indisponíveis");
        }
        }
 
    }//GEN-LAST:event_confirmLocacaoActionPerformed


    private void jComboBoxValorDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValorDiariaActionPerformed

    }//GEN-LAST:event_jComboBoxValorDiariaActionPerformed

    private void jComboBoxValorKilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValorKilometragemActionPerformed

    }//GEN-LAST:event_jComboBoxValorKilometragemActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MenuLocacao().setVisible(true);

            }
        });
    }

    public String getjComboBoxMotorista() {
        String motorista;
        motorista = (String) jComboBoxMotorista.getSelectedItem();

        return motorista;
    }

    public void setjComboBoxMotorista(JComboBox jComboBoxMotorista) {
        this.jComboBoxMotorista = jComboBoxMotorista;
    }

    public String getjComboBoxVeiculo() {
        String veiculo;
        veiculo = (String) jComboBoxVeiculo.getSelectedItem();

        return veiculo;
    }

    public void setjComboBoxVeiculo(JComboBox jComboBoxVeiculo) {
        this.jComboBoxVeiculo = jComboBoxVeiculo;
    }

    public JFormattedTextField getjFormattedTextFieldCpfLocacao() {
        return jFormattedTextFieldCpfLocacao;
    }

    public void setjFormattedTextFieldCpfLocacao(JFormattedTextField jFormattedTextFieldCpfLocacao) {
        this.jFormattedTextFieldCpfLocacao = jFormattedTextFieldCpfLocacao;
    }

    public JFormattedTextField getjFormattedTextFieldPrazoLocacao() {
        return jFormattedTextFieldPrazoLocacao;
    }

    public void setjFormattedTextFieldPrazoLocacao(JFormattedTextField jFormattedTextFieldPrazoLocacao) {
        this.jFormattedTextFieldPrazoLocacao = jFormattedTextFieldPrazoLocacao;
    }

    public String getjComboBoxValorDiaria() {
        String valorDiaria;
        valorDiaria = (String) jComboBoxValorDiaria.getSelectedItem();
        return valorDiaria;
    }

    public void setjComboBoxValorDiaria(JComboBox jComboBoxValorDiaria) {
        this.jComboBoxValorDiaria = jComboBoxValorDiaria;
    }

    public String getjComboBoxValorKilometragem() {
        String valorKilometragem;
        valorKilometragem = (String) jComboBoxValorKilometragem.getSelectedItem();
        return valorKilometragem;
    }

    public void setjComboBoxValorKilometragem(JComboBox jComboBoxValorKilometragem) {
        this.jComboBoxValorKilometragem = jComboBoxValorKilometragem;
    }

    public JTextField getjTextFieldPlaca() {
        return jTextFieldPlaca;
    }

    public void setjTextFieldPlaca(JTextField jTextFieldPlaca) {
        this.jTextFieldPlaca = jTextFieldPlaca;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmLocacao;
    private javax.swing.JComboBox jComboBoxMotorista;
    private javax.swing.JComboBox jComboBoxValorDiaria;
    private javax.swing.JComboBox jComboBoxValorKilometragem;
    private javax.swing.JComboBox jComboBoxVeiculo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfLocacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrazoLocacao;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jTextFieldPlaca;
    // End of variables declaration//GEN-END:variables
}
