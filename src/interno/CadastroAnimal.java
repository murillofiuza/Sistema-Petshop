
package interno;


import Interface.IAnimal;
import Interface.ICliente;
import utilitarios.Animal;
import com.mysql.jdbc.Connection;
import ConexaoBD.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import subTela.Raca;

public class CadastroAnimal extends javax.swing.JInternalFrame {
    Animal ani = new Animal();
    IAnimal iani = new IAnimal();
    ICliente icli = new ICliente();
    
    public CadastroAnimal() {
        initComponents();
        listarAnimais();
        popularJComboBoxCliente();
        popularJComboBoxRaca();
        popularJComboBoxCor();
        popularJComboBoxTipo();
        
    }
  
    
/********Lista Registro na Tabela Animal*/
   public void listarAnimais(){
        String sql = "SELECT * FROM animal";
                
        try{
            PreparedStatement stmt =  iani.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            jtAnimal.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
    }
   
   
   
/********Lista Registro no Campo ComboBox Cliente*/
   public void popularJComboBoxCliente(){
        String sql="SELECT * FROM cliente";
        try{
        PreparedStatement stmt =  icli.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            jcbNomeClienteAnimal.addItem(rs.getString("cli_ds_nome"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
   }

/********Lista Registro no Campo ComboBox Raça*/   
   public void popularJComboBoxRaca(){
        String sql="SELECT * FROM raca";
        try{
        PreparedStatement stmt =  icli.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            jcbRacaAnimal.addItem(rs.getString("rc_ds_nome"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } 
   }
   
/********Lista Registro no Campo ComboBox Cor*/
   public void popularJComboBoxCor(){
        String sql="SELECT * FROM cor";
        try{
        PreparedStatement stmt =  icli.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            jcbCorAnimal.addItem(rs.getString("cor_ds_nome"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
   }
   
/********Lista Registro no Campo ComboBox Tipo de Animal*/
   public void popularJComboBoxTipo(){
        String sql="SELECT * FROM tipo_animal";
        try{
        PreparedStatement stmt =  icli.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            txtTipoAnimal.addItem(rs.getString("tipo_ds_nome"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
   }
   
   public void mostrarItem(){
        int i = jtAnimal.getSelectedRow();
     
        lbCodigo.setText(jtAnimal.getModel().getValueAt(i, 0).toString());
        
        jcbNomeClienteAnimal.setSelectedItem(jtAnimal.getModel().getValueAt(i, 1).toString ());
        txtTipoAnimal.setSelectedItem( jtAnimal.getModel().getValueAt(i, 2).toString ());
        jcbRacaAnimal.setSelectedItem(jtAnimal.getModel().getValueAt(i, 3).toString ());
        txtNomeAnimal.setText(jtAnimal.getModel().getValueAt(i, 4).toString ());
        jcbPorteAnimal.setSelectedItem(jtAnimal.getModel().getValueAt(i, 5).toString ());
        jcbCorAnimal.setSelectedItem(jtAnimal.getModel().getValueAt(i, 6).toString ());
        
       
    //JOptionPane.showMessageDialog(null,"Registro "+lbCodigo+" excluido com sucesso!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAnimal = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtAnimal = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtTipoAnimal = new javax.swing.JComboBox<>();
        jcbRacaAnimal = new javax.swing.JComboBox<>();
        jcbNomeClienteAnimal = new javax.swing.JComboBox<>();
        txtNomeAnimal = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jcbPorteAnimal = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jcbCorAnimal = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();
        btnRaca = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExluirAnimal = new javax.swing.JButton();
        btnAlterarAnimal = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        lblAnimal = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastaro de Animal");

        jtAnimal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jtAnimal);

        jLabel55.setText("Nome Cliente:");

        jLabel56.setText("Tipo:");

        jLabel57.setText("Raça:");

        jLabel58.setText("Nome:");

        jcbNomeClienteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteAnimalActionPerformed(evt);
            }
        });

        jLabel59.setText("Porte:");

        jcbPorteAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Medio", "Pequeno" }));

        jLabel60.setText("Cor:");

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/add.png"))); // NOI18N

        btnRaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/add.png"))); // NOI18N
        btnRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRacaActionPerformed(evt);
            }
        });

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/add.png"))); // NOI18N

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
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExluirAnimal)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterarAnimal)
                                .addGap(46, 46, 46))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(jLabel56))
                                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jcbNomeClienteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcbRacaAnimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                                .addComponent(jcbPorteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel60)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbCorAnimal, 0, 157, Short.MAX_VALUE)
                                    .addComponent(txtTipoAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAnimalLayout.setVerticalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56)
                                .addComponent(txtTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel60)
                                .addComponent(jcbCorAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbNomeClienteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbRacaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel57)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPorteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))))
                .addGap(25, 25, 25)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExluirAnimal)
                    .addComponent(btnAlterarAnimal)
                    .addComponent(lblAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRacaActionPerformed
        // TODO add your handling code here:
        Raca rc =new Raca();
        jPanelAnimal.add(rc);
        rc.setVisible(true);
        
    }//GEN-LAST:event_btnRacaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(txtNomeAnimal.getText().equals("")){
            txtNomeAnimal.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Nome Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbNomeClienteAnimal.getSelectedItem().equals("  /  /    ")){
            jcbNomeClienteAnimal.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Data Nascimento Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(txtTipoAnimal.getSelectedItem().equals("")){
            txtTipoAnimal.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo CPF Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbRacaAnimal.getSelectedItem().equals("")){
            jcbRacaAnimal.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Telefone Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbPorteAnimal.getSelectedItem().equals("")){
            jcbPorteAnimal.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Telefone Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jcbCorAnimal.getSelectedItem().equals("")){
            jcbCorAnimal.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo Telefone Obrigatorio!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
        ani.setNome(txtNomeAnimal.getText());
        ani.setNome_cliente(jcbNomeClienteAnimal.getSelectedItem().toString());
        ani.setTipo(txtTipoAnimal.getSelectedItem().toString());
        ani.setRaca(jcbRacaAnimal.getSelectedItem().toString());
        ani.setPorte(jcbPorteAnimal.getSelectedItem().toString());
        ani.setCor(jcbCorAnimal.getSelectedItem().toString());
        
        
        iani.inserirAnimal(ani);
        listarAnimais();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExluirAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirAnimalActionPerformed
        // TODO add your handling code here:
        mostrarItem();
        iani.removerAnimal(Integer.parseInt(lbCodigo.getText()));
        listarAnimais();
    }//GEN-LAST:event_btnExluirAnimalActionPerformed

    private void btnAlterarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAnimalActionPerformed
        // TODO add your handling code here:
        
        mostrarItem();
        ani.setNome(txtNomeAnimal.getText());
        ani.setNome_cliente(jcbNomeClienteAnimal.getSelectedItem().toString());
        ani.setTipo(txtTipoAnimal.getSelectedItem().toString());
        ani.setRaca(jcbRacaAnimal.getSelectedItem().toString());
        ani.setPorte(jcbPorteAnimal.getSelectedItem().toString());
        ani.setCor(jcbCorAnimal.getSelectedItem().toString());
        iani.atualizarAnimal(ani, Integer.parseInt(lbCodigo.getText()));
        JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        listarAnimais();
    }//GEN-LAST:event_btnAlterarAnimalActionPerformed

    private void jcbNomeClienteAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeClienteAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAnimal;
    private javax.swing.JButton btnExluirAnimal;
    private javax.swing.JButton btnRaca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanelAnimal;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JComboBox<String> jcbCorAnimal;
    private javax.swing.JComboBox<String> jcbNomeClienteAnimal;
    private javax.swing.JComboBox<String> jcbPorteAnimal;
    private javax.swing.JComboBox<String> jcbRacaAnimal;
    private javax.swing.JTable jtAnimal;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lblAnimal;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JComboBox<String> txtTipoAnimal;
    // End of variables declaration//GEN-END:variables
}
