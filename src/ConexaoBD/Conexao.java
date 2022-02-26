
package ConexaoBD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

public static Connection con;
    public Statement st ;
    public ResultSet rs ;

    public static Connection getConexao()  {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/estoque";
        String login = "root";
        String senha = "";

        try {
            Class.forName(driver);
            try {
                con = (Connection) DriverManager.getConnection(url, login, senha);
                //st = con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }

    public void close() {
        Connection conn;
        try {
            conn = Conexao.getConexao();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    
}
}
