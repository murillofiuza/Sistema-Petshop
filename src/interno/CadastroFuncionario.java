/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interno;

import Interface.IFuncionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import utilitarios.Funcionario;

/**
 *
 * @author Fiuza
 */
public class CadastroFuncionario extends javax.swing.JInternalFrame {

    Funcionario func = new Funcionario();
    IFuncionario ifunc = new IFuncionario();
    
    public CadastroFuncionario() {
        initComponents();
        listarFuncionario();
    }

    public void listarFuncionario(){
        String sql = "SELECT * FROM funcionario";
                
        try{
            PreparedStatement stmt =  ifunc.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            jtFuncionario.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
    }
    
    public void mostrarItem(){
        int i = jtFuncionario.getSelectedRow();
     
        lbCodigo.setText(jtFuncionario.getModel().getValueAt(i, 0).toString());
        
        txtNomeFuncionario.setText(jtFuncionario.getModel().getValueAt(i, 1).toString ());
        txtCpfFuncionario.setText( jtFuncionario.getModel().getValueAt(i, 2).toString ());
        
        
       
    //JOptionPane.showMessageDialog(null,"Registro "+lbCodigo+" excluido com sucesso!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAnimal = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtFuncionario = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        btnSalvarFuncionario = new javax.swing.JButton();
        btnExluirAnimal = new javax.swing.JButton();
        btnAlterarAnimal = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        txtCpfFuncionario = new javax.swing.JFormattedTextField();
        lblCodigo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Funcionario");

        jtFuncionario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jtFuncionario);

        jLabel55.setText("CPF:");

        jLabel58.setText("Nome:");

        btnSalvarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/accept.png"))); // NOI18N
        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
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

        try {
            txtCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelAnimalLayout = new javax.swing.GroupLayout(jPanelAnimal);
        jPanelAnimal.setLayout(jPanelAnimalLayout);
        jPanelAnimalLayout.setHorizontalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel58)
                                            .addComponent(jLabel55))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                                .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)
                                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnSalvarFuncionario)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExluirAnimal)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAlterarAnimal)))))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAnimalLayout.setVerticalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(32, 32, 32)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarFuncionario)
                    .addComponent(btnExluirAnimal)
                    .addComponent(btnAlterarAnimal))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jPanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        if(txtNomeFuncionario.getText().equals("")){
            txtNomeFuncionario.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Nome Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(txtCpfFuncionario.getText().equals("  /  /    ")){
            txtCpfFuncionario.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Data Nascimento Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        func.setNome_funcionario(txtNomeFuncionario.getText());
        func.setCpf_funcionario(txtCpfFuncionario.getText());
        

        ifunc.inserirFuncionario(func);
        listarFuncionario();
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void btnExluirAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirAnimalActionPerformed
        // TODO add your handling code here:
        mostrarItem();
        ifunc.removerFuncionario(Integer.parseInt(lbCodigo.getText()));
        listarFuncionario();
    }//GEN-LAST:event_btnExluirAnimalActionPerformed

    private void btnAlterarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAnimalActionPerformed
        // TODO add your handling code here:

        /*mostrarItem();
        func.setNome_funcionario(txtNomeFuncionario.getText());
        func.setCpf_funcionario(txtCpfFuncionario.getText());
        
        ifunc.atualizarFuncionario(func, Integer.parseInt(lbCodigo.getText()));
        JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        listarFuncionario();*/
    }//GEN-LAST:event_btnAlterarAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAnimal;
    private javax.swing.JButton btnExluirAnimal;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanelAnimal;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable jtFuncionario;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JFormattedTextField txtCpfFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
