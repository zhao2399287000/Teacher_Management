package management_db;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	
    public static final String url = "jdbc:mysql://127.0.0.1/teacher?useUnicode=true&characterEncoding=utf-8";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "19961027";  
  
    Connection connection;
    //与数据源之间对话的唯一途径
    PreparedStatement pst;
    //一个重要接口，用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
    //一个SQL语句的预编译并存储在一个PreparedStatement对象。此对象可以被用来有效地执行此语句多次。
    ResultSet resultSet;
    //结果集(ResultSet)是数据中查询结果返回的一种对象，可以说结果集是一个存储查询结果的对象.
    //但是结果集并不仅仅具有存储的功能，他同时还具有操纵数据的功能，可能完成对数据的更新等。 
    
    //数据库的连接
    public static Connection getConn() throws ClassNotFoundException, SQLException
    {
        Class.forName(name);
        //此处使用数据库名
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher?useUnicode=true&characterEncoding=utf-8","root","19961027");
    }
    
  
    public void close() {  
        try {  
            this.connection.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    } 

}
