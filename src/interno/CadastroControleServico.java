package interno;

import Interface.IControleServico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import utilitarios.ControleServico;


public class CadastroControleServico extends javax.swing.JInternalFrame {

    ControleServico cserv = new ControleServico();
    IControleServico icserv = new IControleServico();
    
            
    public CadastroControleServico() {
        initComponents();
        listarControleServico();
        popularJComboBoxServico();
        popularJComboBoxFuncionario();
        popularJComboBoxCliente();
    }

     public void listarControleServico(){
        String sql = "SELECT cs.cs_cd_controle_servico, fun.fu_ds_nome, cli.cli_ds_nome, serv.serv_ds_tipo_servico,cs.cs_dt_data, cs.cs_ds_status "
                + "FROM controle_servico cs INNER JOIN servicos serv on serv.serv_cd_servico=cs.cs_cd_servico "
                + "INNER JOIN funcionario fun on fun.fu_cd_funcionario=cs.cs_cd_funcionario "
                + "INNER JOIN cliente cli on cli.cli_cd_cliente=cs.cs_cd_cliente";
                
        try{
            PreparedStatement stmt = icserv.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            jtControleServico.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
    }
    
      public void popularJComboBoxServico(){
        String sql="SELECT * FROM servicos";
        try{
        PreparedStatement stmt = icserv.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
           
            jcbServicoCS.addItem(rs.getString("serv_ds_tipo_servico"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } 
   }
    
      public void popularJComboBoxFuncionario(){
        String sql="SELECT * FROM funcionario";
        try{
        PreparedStatement stmt = icserv.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            
            jcbFuncionarioCS.addItem(rs.getString("fu_ds_nome"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } 
   }
      
    public void popularJComboBoxCliente(){
        String sql="SELECT * FROM cliente";
        try{
        PreparedStatement stmt =  icserv.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
           
            jcbNomeClienteCS.addItem(rs.getString("cli_ds_nome"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
      
      public void mostrarItem(){
        int i = jtControleServico.getSelectedRow();
     
        lblCodigo.setText(jtControleServico.getModel().getValueAt(i, 0).toString());

        jcbNomeClienteCS.setSelectedItem(jtControleServico.getModel().getValueAt(i, 1).toString ());
        jcbFuncionarioCS.setSelectedItem( jtControleServico.getModel().getValueAt(i, 2).toString ());
        jcbServicoCS.setSelectedItem(jtControleServico.getModel().getValueAt(i, 3).toString ());
        txtDataServicoCS.setText(jtControleServico.getModel().getValueAt(i, 4).toString ());
        jcbStatusCS.setSelectedItem(jtControleServico.getModel().getValueAt(i, 5).toString ());
        
    //JOptionPane.showMessageDialog(null,"Registro "+lbCodigo+" excluido com sucesso!");
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAnimal = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtControleServico = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jcbServicoCS = new javax.swing.JComboBox<>();
        jcbNomeClienteCS = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jcbFuncionarioCS = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jcbStatusCS = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnExluirAnimal = new javax.swing.JButton();
        btnAlterarControleSevico = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtDataServicoCS = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("controle de serviços");

        jtControleServico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jtControleServico);

        jLabel55.setText("Nome Cliente:");

        jLabel56.setText("Data Serviço:");

        jLabel57.setText("Serviço:");

        jcbNomeClienteCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteCSActionPerformed(evt);
            }
        });

        jLabel59.setText("Funcionario:");

        jLabel60.setText("Status:");

        jcbStatusCS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Andamento", "Finalizado" }));

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

        btnAlterarControleSevico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/application_edit.png"))); // NOI18N
        btnAlterarControleSevico.setText("Alterar");
        btnAlterarControleSevico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarControleSevicoActionPerformed(evt);
            }
        });

        txtDataServicoCS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout jPanelAnimalLayout = new javax.swing.GroupLayout(jPanelAnimal);
        jPanelAnimal.setLayout(jPanelAnimalLayout);
        jPanelAnimalLayout.setHorizontalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbStatusCS, 0, 157, Short.MAX_VALUE)
                                    .addComponent(txtDataServicoCS)))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnAlterarControleSevico))))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAnimalLayout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExluirAnimal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAnimalLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jcbServicoCS, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel55))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbNomeClienteCS, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFuncionarioCS, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(90, 90, 90)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAnimalLayout.setVerticalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(jcbNomeClienteCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel56)
                        .addComponent(txtDataServicoCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(jcbFuncionarioCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(jcbServicoCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(jcbStatusCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExluirAnimal)
                    .addComponent(btnAlterarControleSevico))
                .addGap(35, 35, 35)
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
                .addComponent(jPanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(jcbNomeClienteCS.getSelectedItem().equals("")){
            jcbNomeClienteCS.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Nome Cliente Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbFuncionarioCS.getSelectedItem().equals("")){
            jcbFuncionarioCS.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Funcionario Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbServicoCS.getSelectedItem().equals("")){
            jcbServicoCS.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo CPF Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(txtDataServicoCS.getText().equals("  /  /    ")){
            txtDataServicoCS.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Telefone Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbStatusCS.getSelectedItem().equals("")){
            jcbStatusCS.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Telefone Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
        cserv.setNome_cliente(Integer.parseInt(jcbNomeClienteCS.getSelectedItem().toString()));
        cserv.setNome_funcionario(Integer.parseInt(jcbFuncionarioCS.getSelectedItem().toString()));
        cserv.setNome_servico(Integer.parseInt(jcbServicoCS.getSelectedItem().toString()));
        cserv.setData_servico(txtDataServicoCS.getText());
        cserv.setStatus_servico(jcbStatusCS.getSelectedItem().toString());

        icserv.inserirControleServico(cserv);
        listarControleServico();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExluirAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirAnimalActionPerformed
        // TODO add your handling code here:
        /*mostrarItem();
        iani.removerAnimal(Integer.parseInt(lblCodigo.getText()));
        listarAnimais();*/
    }//GEN-LAST:event_btnExluirAnimalActionPerformed

    private void btnAlterarControleSevicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarControleSevicoActionPerformed
        // TODO add your handling code here:

        //mostrarItem();
        cserv.setNome_cliente(Integer.parseInt(jcbNomeClienteCS.getSelectedItem().toString()));
        cserv.setNome_funcionario(Integer.parseInt(jcbFuncionarioCS.getSelectedItem().toString()));
        cserv.setNome_servico(Integer.parseInt(jcbServicoCS.getSelectedItem().toString()));
        cserv.setData_servico(txtDataServicoCS.getText());
        cserv.setStatus_servico(jcbStatusCS.getSelectedItem().toString());
        icserv.atualizarControleServico(cserv, Integer.parseInt(lblCodigo.getText()));
        JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        listarControleServico();
    }//GEN-LAST:event_btnAlterarControleSevicoActionPerformed

    private void jcbNomeClienteCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeClienteCSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarControleSevico;
    private javax.swing.JButton btnExluirAnimal;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanelAnimal;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JComboBox<String> jcbFuncionarioCS;
    private javax.swing.JComboBox<String> jcbNomeClienteCS;
    private javax.swing.JComboBox<String> jcbServicoCS;
    private javax.swing.JComboBox<String> jcbStatusCS;
    private javax.swing.JTable jtControleServico;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JFormattedTextField txtDataServicoCS;
    // End of variables declaration//GEN-END:variables
}
