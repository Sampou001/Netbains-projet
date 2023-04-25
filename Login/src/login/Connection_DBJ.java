
package login;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connection_DBJ {
    public static Connection getConnection() throws ClassNotFoundException{
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/users","root","");
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Erreur de Connection");
        }
        return connection;
    }
    
    
    
}
