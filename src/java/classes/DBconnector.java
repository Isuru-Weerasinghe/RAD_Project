
package classes;

import java.sql.*;

public class DBconnector {
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/inspiraella";
    private final String USER="root";
    private final String PASSWORD="";
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName(DRIVER);
        Connection con=DriverManager.getConnection(URL, USER, PASSWORD);
        return con;
    }
}
