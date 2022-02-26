/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interno;

import Interface.IServico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import utilitarios.Servico;

public class CadastroServico extends javax.swing.JInternalFrame {

    Servico serv =  new Servico();
    IServico iserv =  new IServico();
    
    public CadastroServico() {
        initComponents();
        listarServico();
    }

    public void listarServico(){
        String sql = "SELECT * FROM servicos";
        try{
            PreparedStatement stmt =  iserv.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            jtServico.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    
    public void mostrarItem(){
        int i = jtServico.getSelectedRow();
     
        lblCodigo.setText(jtServico.getModel().getValueAt(i, 0).toString());
        
        txtNomeServico.setText(jtServico.getModel().getValueAt(i, 1).toString ());
        txtValorServico.setText( jtServico.getModel().getValueAt(i, 2).toString ());
        
        
    //JOptionPane.showMessageDialog(null,"Registro "+lbCodigo+" excluido com sucesso!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAnimal = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtServico = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtNomeServico = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExluirAnimal = new javax.swing.JButton();
        btnAlterarAnimal = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtValorServico = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadatro de serviços");

        jtServico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jtServico);

        jLabel55.setText("Valor:");

        jLabel58.setText("Nome:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/accept.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExluirAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cross.png"))); // NOI18N
        btnExluirAnimal.setText("Excluir");
        btnExluirAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExluirAnimalActionPerformed(evt);
            }
        });

        btnAlterarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/application_edit.png"))); // NOI18N
        btnAlterarAnimal.setText("Alterar");
        btnAlterarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAnimalLayout = new javax.swing.GroupLayout(jPanelAnimal);
        jPanelAnimal.setLayout(jPanelAnimalLayout);
        jPanelAnimalLayout.setHorizontalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExluirAnimal)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterarAnimal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addComponent(txtNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addComponent(txtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelAnimalLayout.setVerticalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExluirAnimal)
                    .addComponent(btnAlterarAnimal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(txtNomeServico.getText().equals("")){
            txtNomeServico.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Nome Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(txtValorServico.getText().equals("  /  /    ")){
            txtValorServico.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Data Nascimento Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
        serv.setTipo_servico(txtNomeServico.getText());
        serv.setValor_servico(Double.parseDouble(txtValorServico.getText()));

        iserv.inserirServico(serv);
        listarServico();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExluirAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirAnimalActionPerformed
        // TODO add your handling code here:
        mostrarItem();
        iserv.removerServico(Integer.parseInt(lblCodigo.getText()));
        listarServico();
    }//GEN-LAST:event_btnExluirAnimalActionPerformed

    private void btnAlterarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAnimalActionPerformed
        // TODO add your handling code here:

        mostrarItem();
        serv.setTipo_servico(txtNomeServico.getText());
        serv.setValor_servico(Double.parseDouble(txtValorServico.getText()));
        
        iserv.atualizarServico(serv, Integer.parseInt(lblCodigo.getText()));
        JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        listarServico();
    }//GEN-LAST:event_btnAlterarAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAnimal;
    private javax.swing.JButton btnExluirAnimal;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanelAnimal;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable jtServico;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtNomeServico;
    private javax.swing.JTextField txtValorServico;
    // End of variables declaration//GEN-END:variables
}
