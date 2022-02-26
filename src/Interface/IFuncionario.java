
package Interface;

import ConexaoBD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.Funcionario;



public class IFuncionario {
    Funcionario func = new Funcionario();
    private Connection connection;
    
    
    public IFuncionario(){
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
    public void inserirFuncionario(Funcionario func){
        String sql ="INSERT INTO funcionario (fu_ds_nome, fu_nr_cpf) VALUES (?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, func.getNome_funcionario());
            stmt.setString(2, func.getCpf_funcionario());
            
            stmt.executeUpdate();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Lançamento!","Aviso",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public void removerFuncionario(int id){
        try{           
           PreparedStatement stmt=connection.prepareStatement("DELETE FROM funcionario WHERE fu_cd_funcionario=?");
           stmt.setInt(1, id);
           
           stmt.executeUpdate();
           stmt.close();
       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }                        
    }
}
