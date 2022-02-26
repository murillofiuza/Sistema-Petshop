package Interface;

import ConexaoBD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.Cliente;
//import utilitarios.Cliente;
import utilitarios.Servico;


public class IServico {
   
    Servico serv = new Servico();
    private Connection connection;
    
    
    public IServico(){
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
    public void inserirServico(Servico serv){
        String sql ="INSERT INTO servicos (serv_ds_tipo_servico ,serv_nr_valor) VALUES (?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, serv.getTipo_servico());
            stmt.setDouble(2, serv.getValor_servico());
            
            stmt.executeUpdate();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Lançamento!","Aviso",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public void removerServico(int id){
        try{           
           PreparedStatement stmt=connection.prepareStatement("DELETE FROM servicos WHERE serv_cd_servico=?");
           stmt.setInt(1, id);
           
           stmt.executeUpdate();
           stmt.close();
       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }                        
    }

public void atualizarServico(Servico serv, int id){
            String sql ="UPDATE servicos SET serv_ds_tipo_servico=? ,serv_nr_valor=?  WHERE serv_cd_servico=?";
        try{
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, serv.getTipo_servico());
            stmt.setDouble(2, serv.getValor_servico());
           
            
                
                stmt.setInt(3, id);
                
                stmt.executeUpdate();
                stmt.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
}
