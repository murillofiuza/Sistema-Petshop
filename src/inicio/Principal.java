package inicio;

import Interface.IAnimal;
import interno.CadastroAnimal;
import interno.CadastroCliente;
import interno.CadastroServico;
import interno.CadastroVenda;
import interno.CadastroControleServico;
import interno.CadastroFuncionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.Animal;

public class Principal extends javax.swing.JFrame {
 
    IAnimal iani = new IAnimal();
    Animal ani = new Animal();
    
    public Principal() {
        initComponents();
        //listarControleServico();
       
    }
//Metodo para aparecer registro do banco numa Label
   /*public void listarControleServico(){
        String sql = "SELECT * FROM animal WHERE ani_cd_animal = 1";      
        try{
            PreparedStatement stmt =  iani.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
            lblAnimal.setText(rs.getString("ani_ds_nome"));
           
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblAnimal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jMenuAnimal = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuServico = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmVendas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmServico = new javax.swing.JMenu();
        jMenuControleServico = new javax.swing.JMenuItem();
        jmOpcoes = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(644, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lblAnimal.getAccessibleContext().setAccessibleDescription("");

        jdPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdPrincipalLayout.createSequentialGroup()
                .addGap(0, 398, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/folder_page.png"))); // NOI18N
        jmCadastros.setText("Cadastros");

        jMenuAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/medal_gold_add.png"))); // NOI18N
        jMenuAnimal.setText("Animal");
        jMenuAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnimalActionPerformed(evt);
            }
        });
        jmCadastros.add(jMenuAnimal);

        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/user_add.png"))); // NOI18N
        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jmCadastros.add(jMenuCliente);

        jMenuServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/wrench.png"))); // NOI18N
        jMenuServico.setText("Serviço");
        jMenuServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuServicoActionPerformed(evt);
            }
        });
        jmCadastros.add(jMenuServico);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/user_gray.png"))); // NOI18N
        jMenuItem1.setText("Funcionario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmCadastros.add(jMenuItem1);

        jMenuBar1.add(jmCadastros);

        jmVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cart.png"))); // NOI18N
        jmVendas.setText("Vendas");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cart_go.png"))); // NOI18N
        jMenuItem4.setText("Venda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmVendas.add(jMenuItem4);

        jMenuBar1.add(jmVendas);

        jmServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/wrench.png"))); // NOI18N
        jmServico.setText("Serviços");

        jMenuControleServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/image_edit.png"))); // NOI18N
        jMenuControleServico.setText("Controle de Serviços");
        jMenuControleServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuControleServicoActionPerformed(evt);
            }
        });
        jmServico.add(jMenuControleServico);

        jMenuBar1.add(jmServico);

        jmOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cog.png"))); // NOI18N
        jmOpcoes.setText("Opções");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/door_in.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmOpcoes.add(jMenuItem3);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/image_edit.png"))); // NOI18N
        jMenuItem2.setText("Relatório");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmOpcoes.add(jMenuItem2);

        jMenuBar1.add(jmOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnimalActionPerformed
        // TODO add your handling code here:
        CadastroAnimal ca =new CadastroAnimal();
        ca.setVisible(true);
        jdPrincipal.add(ca);
       // lbLogo.setVisible(false);
    }//GEN-LAST:event_jMenuAnimalActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        // TODO add your handling code here:
        CadastroCliente cc =new CadastroCliente();
        cc.setVisible(true);
        jdPrincipal.add(cc);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         CadastroVenda ve =new CadastroVenda ();
        ve.setVisible(true);
        jdPrincipal.add(ve);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServicoActionPerformed
        // TODO add your handling code here:
        CadastroServico ser =new CadastroServico ();
        ser.setVisible(true);
        jdPrincipal.add(ser);
        
    }//GEN-LAST:event_jMenuServicoActionPerformed

    private void jMenuControleServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuControleServicoActionPerformed
        // TODO add your handling code here:
        CadastroControleServico cserv = new CadastroControleServico();
        cserv.setVisible(true);
        jdPrincipal.add(cserv);
    }//GEN-LAST:event_jMenuControleServicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Funcionario:
        CadastroFuncionario func = new CadastroFuncionario();
        func.setVisible(true);
        jdPrincipal.add(func);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuAnimal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuControleServico;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmOpcoes;
    private javax.swing.JMenu jmServico;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JLabel lblAnimal;
    // End of variables declaration//GEN-END:variables
}
