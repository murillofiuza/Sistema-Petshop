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
//import utilitarios.Animal;
import utilitarios.Cliente;

public class ICliente {
    Cliente cli = new Cliente();
    private Connection connection;
    
    
    public ICliente(){
        this.connection = new Conexao().getConexao();
}
    public Connection getConnection(){
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    //Insere cadastro dispesas no banco de dados
    //@Author Murilo Fiuza 04/02/2016
    public void inserirCliente(Cliente cli){
        String sql ="INSERT INTO cliente(cli_ds_nome,cli_dt_data,cli_nr_cpf,cli_nr_telefone) VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getDt_nascimento());
            stmt.setString(3, cli.getCpf());
            stmt.setString(4, cli.getTelefone());
            
            stmt.executeUpdate();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Lançamento!","Aviso",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public void removerCliente(int id){
        try{           
           PreparedStatement stmt=connection.prepareStatement("DELETE FROM cliente WHERE cli_cd_cliente=?");
           stmt.setInt(1, id);
           
           stmt.executeUpdate();
           stmt.close();
       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }                        
    }

public void atualizarCliente(Cliente cli, int id){
            String sql ="UPDATE cliente SET cli_ds_nome=? ,cli_dt_data=? ,cli_nr_cpf=? ,cli_nr_telefone=?  WHERE cli_cd_cliente=?";
        try{
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getDt_nascimento());
            stmt.setString(3, cli.getCpf());
            stmt.setString(4, cli.getTelefone());
            
                
                stmt.setInt(5, id);
                
                stmt.executeUpdate();
                stmt.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
}
