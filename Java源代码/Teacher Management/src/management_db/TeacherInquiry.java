package management_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherInquiry {
	
    public static final String url = "jdbc:mysql://127.0.0.1/teacher?useUnicode=true&characterEncoding=utf-8";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "19961027";  

    PreparedStatement pst;
    //一个重要接口，用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
    //一个SQL语句的预编译并存储在一个PreparedStatement对象。此对象可以被用来有效地执行此语句多次。
    ResultSet resultSet;
    //结果集(ResultSet)是数据中查询结果返回的一种对象，可以说结果集是一个存储查询结果的对象.
    //但是结果集并不仅仅具有存储的功能，他同时还具有操纵数据的功能，可能完成对数据的更新等。
	
	
    //查询表中行的单个数据
	public String teacher_inquiry_name(int uid) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url,user,password); 
        String sql = "select * from teacher where id='" + uid + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String sql_name = null;
        while (resultSet.next()){
        	sql_name = resultSet.getString("name");
        }
        return sql_name;
	}
	
	public String teacher_inquiry_college(int uid) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url,user,password); 
        String sql = "select * from teacher where id='" + uid + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String sql_college = null;
        while (resultSet.next()){
        	sql_college = resultSet.getString("college");
        }
        return sql_college;
	}
	
	public String teacher_inquiry_profession(int uid) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url,user,password); 
        String sql = "select * from teacher where id='" + uid + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String sql_profession = null;
        while (resultSet.next()){
        	sql_profession = resultSet.getString("profession");
        }
        return sql_profession;
	}
	
	public String teacher_inquiry_grade(int uid) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url,user,password); 
        String sql = "select * from teacher where id='" + uid + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String sql_grade = null;
        while (resultSet.next()){
        	sql_grade = resultSet.getString("grade");
        }
        return sql_grade;
	}
	
	public String teacher_inquiry_work_time(int uid) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url,user,password); 
        String sql = "select * from teacher where id='" + uid + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String sql_work_time = null;
        while (resultSet.next()){
        	sql_work_time = resultSet.getString("work_time");
        }
        return sql_work_time;
	}

	public String teacher_inquiry_tel(int uid) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url,user,password); 
        String sql = "select * from teacher where id='" + uid + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String sql_tel = null;
        while (resultSet.next()){
        	sql_tel = resultSet.getString("tel");
        }
        return sql_tel;
	}

}
