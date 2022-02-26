/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import ConexaoBD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.Cliente;
import utilitarios.ControleServico;
//import utilitarios.Funcionario;

/**
 *
 * @author Fiuza
 */
public class IControleServico {
    ControleServico cs = new ControleServico();
    private Connection connection;
    
    
    public IControleServico(){
        this.connection = new Conexao().getConexao();
}
    public Connection getConnection(){
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    //Insere cadastro dispesas no banco de dados.
    //@Author Murilo Fiuza 04/02/2016
    public void inserirControleServico(ControleServico cs){
        String sql ="INSERT INTO controle_servico(cs_cd_cliente, cs_cd_funcionario, cs_cd_servico, cs_dt_data , cs_ds_status) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, cs.getNome_cliente());
            stmt.setInt(2, cs.getNome_funcionario());
            stmt.setInt(3, cs.getNome_servico());
            stmt.setString(4, cs.getData_servico());
            stmt.setString(5, cs.getStatus_servico());
            
            stmt.executeUpdate();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Lançamento!","Aviso",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
  
    
    public void atualizarControleServico(ControleServico cs, int id){
            String sql ="UPDATE controle_servico SET cs_cd_cliente=?, cs_cd_funcionario=?, cs_cd_servico=?, cs_dt_data=? , cs_ds_status=?  WHERE cs_cd_controle_servico=?";
        try{
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, cs.getNome_cliente());
            stmt.setInt(2, cs.getNome_funcionario());
            stmt.setInt(3, cs.getNome_servico());
            stmt.setString(4, cs.getData_servico());
           
            stmt.setString(5, cs.getStatus_servico());
            
                
                stmt.setInt(6, id);
                
                stmt.executeUpdate();
                stmt.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
