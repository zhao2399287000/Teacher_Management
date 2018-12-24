package management_db;


import java.sql.SQLException;

import main.Admin;
import main.Teacher;

public class Demo extends DBUtil {
	
	//向数据库中插入数据
    public void teacher_insert(Teacher teacher) throws SQLException, ClassNotFoundException {
        connection = getConn();
        
        String sql = "insert into teacher(name, college, profession, grade, work_time, tel) values(?, ?, ?, ?, ?, ?)";
        pst = connection.prepareStatement(sql);
        pst.setString(1, teacher.getName());
        //将收集的数据发送到数据库
        //对占位符设置值，占位符顺序从1开始，第一个参数是占位符的位置，第二个参数是占位符的值。
        pst.setString(2,teacher.getCollege());
        pst.setString(3, teacher.getProfession());
        pst.setString(4, teacher.getGrade());
        pst.setString(5, teacher.getWork_time());
        pst.setString(6, teacher.getTel());
        pst.executeUpdate();
        //执行sql语句
    }
    
    
    //修改名字
    public void changeName(int uid, String uname) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "update teacher set name =? where id=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1,uname);
        pst.setInt(2,uid);
        pst.execute();
    }
    
    //修改学院
    public void changeCollege(int uid, String ucollege) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "update teacher set college =? where id=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1,ucollege);
        pst.setInt(2,uid);
        pst.execute();
    }
    
    //修改专业
    public void changeProfession(int uid, String uprofession) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "update teacher set profession =? where id=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1,uprofession);
        pst.setInt(2,uid);
        pst.execute();
    }
    
    //修改班级
    public void changeGrade(int uid, String ugrade) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "update teacher set grade =? where id=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1,ugrade);
        pst.setInt(2,uid);
        pst.execute();
    }
    
    //修改工作时间
    public void changeWork_time(int uid, String uwork_time) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "update teacher set work_time =? where id=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1, uwork_time);
        pst.setInt(2,uid);
        pst.execute();
    }
    
    //修改联系方式
    public void changeTel(int uid, String utel) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "update teacher set tel =? where id=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1,utel);
        pst.setInt(2,uid);
        pst.execute();
    }

    //删除数据库中某条记录
    public void delete(int uid) throws SQLException, ClassNotFoundException {
    	connection = getConn();
    	
        String sql = "delete from teacher where id='"+uid+"'";
        pst = connection.prepareStatement(sql);
        pst.executeUpdate();
    }
    
    
    public void admin_insert(Admin admin) throws SQLException, ClassNotFoundException {
        connection = getConn();
        
        String sql = "insert into admin(name, password) values(?, ?)";
        pst = connection.prepareStatement(sql);
        pst.setString(1, admin.getName());
        //将收集的数据发送到数据库
        //对占位符设置值，占位符顺序从1开始，第一个参数是占位符的位置，第二个参数是占位符的值。
        pst.setString(2,admin.getPassword());
        pst.executeUpdate();
        //执行sql语句
    }
    
    //查询密码
    public String selectPassWord(String uname) throws SQLException, ClassNotFoundException {
    	
    	connection = getConn();
    	
        String sql = "select * from admin where name='" + uname + "'";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
        String passWord = null;
        while (resultSet.next()){
            passWord = resultSet.getString("password");
        }
        return passWord;
    }

}
