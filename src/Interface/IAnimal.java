
package Interface;

import ConexaoBD.Conexao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.Animal;


public class IAnimal {
    
    Animal iani = new Animal();
    private Connection connection;
    
    
    public IAnimal(){
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
    public void inserirAnimal(Animal iani){
        String sql ="INSERT INTO animal (ani_ds_cliente ,ani_ds_tipo_animal,ani_ds_raca,ani_ds_nome,ani_ds_porte,ani_ds_cor) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, iani.getNome_cliente());
            stmt.setString(2, iani.getTipo());
            stmt.setString(3, iani.getRaca());
            stmt.setString(4, iani.getNome());
            stmt.setString(5, iani.getPorte());
            stmt.setString(6, iani.getCor());
           
          
            stmt.executeUpdate();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Lançamento!","Aviso",JOptionPane.WARNING_MESSAGE);
        } 
    }
public void inserirRaca(Animal iani){
        String sql ="INSERT INTO raca (rc_ds_nome) VALUES (?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, iani.getRc_raca());
            
          
            stmt.executeUpdate();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!","Aviso",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Lançamento!","Aviso",JOptionPane.WARNING_MESSAGE);
        } 
    }


public void removerAnimal(int id){
        try{           
           PreparedStatement stmt=connection.prepareStatement("DELETE FROM animal WHERE ani_cd_animal=?");
           stmt.setInt(1, id);
           
           stmt.executeUpdate();
           stmt.close();
       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }                        
    }

public void atualizarAnimal(Animal ani, int id){
            String sql ="UPDATE animal SET ani_ds_cliente =? ,ani_ds_tipo_animal=? ,ani_ds_raca=? ,ani_ds_nome=? ,ani_ds_porte=? ,ani_ds_cor=?  WHERE ani_cd_animal=?";
        try{
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, ani.getNome_cliente());
            stmt.setString(2, ani.getTipo());
            stmt.setString(3, ani.getRaca());
            stmt.setString(4, ani.getNome());
            stmt.setString(5, ani.getPorte());
            stmt.setString(6, ani.getCor());
                
                stmt.setInt(7, id);
                
                stmt.executeUpdate();
                stmt.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
}
