package management_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;


public class TeacherTable extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;
    
    public static final String url = "jdbc:mysql://127.0.0.1/teacher?useUnicode=true&characterEncoding=utf-8";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "19961027";  
	Connection connection = DriverManager.getConnection(url,user,password); 
    PreparedStatement pst;
    //一个重要接口，用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
    //一个SQL语句的预编译并存储在一个PreparedStatement对象。此对象可以被用来有效地执行此语句多次。
    ResultSet resultSet;
    //结果集(ResultSet)是数据中查询结果返回的一种对象，可以说结果集是一个存储查询结果的对象.
    //但是结果集并不仅仅具有存储的功能，他同时还具有操纵数据的功能，可能完成对数据的更新等。
	
	String[] columnNames = 
		{"编号", "姓名", "学院", "专业", "班级", "工作时间", "联系方式"};
	 Object [][]data = new Object[20][7];
	public TeacherTable() throws SQLException{
		int dex = 0;
		String sql = "select * from teacher";
		pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery(sql);
		try {
			resultSet = pst.executeQuery(sql);
			while(resultSet.next()){
				data[dex][0] = resultSet.getInt("id");
				data[dex][1] = resultSet.getString("name");
				data[dex][2] = resultSet.getString("college");
				data[dex][3] = resultSet.getString("profession");
				data[dex][4] = resultSet.getString("grade");
				data[dex][5] = resultSet.getString("work_time");
				data[dex++][6] = resultSet.getString("tel");
			}
			resultSet.close();
		//	c.close();		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public int getColumnCount() {
		return columnNames.length; 
	}

	@Override
	public int getRowCount() {
		return data.length;  
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];  
	}
	public String getColumnName(int column)  
    {  
        return columnNames[column];  
    } 
	public boolean isCellEditable(int rowIndex, int columnIndex)  
    {  
		return false;
    }
	 public void setValueAt(Object aValue, int rowIndex, int columnIndex)  
     {  
         data[rowIndex][columnIndex] = aValue;  
         /*通知监听器数据单元数据已经改变*/  
         fireTableCellUpdated(rowIndex, columnIndex);  
     }
}
