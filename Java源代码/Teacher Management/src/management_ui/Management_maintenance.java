package management_ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import management_db.Demo;

public class Management_maintenance {
	
	//得到当前电脑显示屏的宽和高
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;

	
	int user_id;
	String temp_id;
	
	JFrame frame_ma;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Management_maintenance() throws ClassNotFoundException, SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException, SQLException {
		frame_ma = new JFrame();
		frame_ma.getContentPane().setBackground(SystemColor.control);
		frame_ma.setTitle("教师管理系统-信息修改");
		frame_ma.setBounds(0, 0, width, height);
		frame_ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_ma.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(63, 13, 1779, 110);
		lblNewLabel.setIcon(new ImageIcon("E:\\Java\u5B9E\u8BAD\\Teacher Management\\image\\image3.png"));
		frame_ma.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(63, 136, 1779, 39);
		frame_ma.getContentPane().add(panel);
		
		
		//下面为左侧的Button的菜单的界面，分别为信息显示， 信息添加， 信息查询， 信息维护， 信息删除， 注销登陆
		
		//每一个button都是设置了显示的文字，颜色，大小，并且添加了鼠标点击事件，除了当前界面自己不跳转之外，都是关闭当前的界面，然后创建一个新的界面
		//并且设置为可见
		
		JButton btnNewButton = new JButton("信息显示");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("楷体", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==btnNewButton)
		        {
		        	frame_ma.dispose();
		        	Management_interface management_interface = null;
					try {
						management_interface = new Management_interface();
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	management_interface.frame_fa.setVisible(true);
		        }
				
			}
		});
		btnNewButton.setBounds(63, 210, 180, 79);
		frame_ma.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("信息添加");
		button.setForeground(Color.BLUE);
		button.setFont(new Font("楷体", Font.BOLD, 30));
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button)
		        {
		        	frame_ma.dispose();
		        	Management_insert management_insert = new Management_insert();
		        	management_insert.frame_in.setVisible(true);
		        }
				
			}
		});
		button.setBounds(63, 336, 180, 79);
		frame_ma.getContentPane().add(button);
		
		JButton button_1 = new JButton("信息查询");
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("楷体", Font.BOLD, 30));
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_1)
		        {
		        	frame_ma.dispose();
		        	Management_inquiry management_inquiry = null;
					try {
						management_inquiry = new Management_inquiry();
					} catch (SQLException | ClassNotFoundException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	management_inquiry.frame_qu.setVisible(true);
		        }
				
			}
		});
		button_1.setBounds(63, 462, 180, 79);
		frame_ma.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("信息维护");
		button_2.setForeground(Color.BLUE);
		button_2.setFont(new Font("楷体", Font.BOLD, 30));
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_2)
		        {

		        }
				
			}
		});
		button_2.setBounds(63, 588, 180, 79);
		frame_ma.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("信息删除");
		button_3.setForeground(Color.BLUE);
		button_3.setFont(new Font("楷体", Font.BOLD, 30));
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_3)
		        {
		        	frame_ma.dispose();
		        	Management_delete management_delete = new Management_delete();
		        	management_delete.frame_de.setVisible(true);
		        }
				
			}
		});
		button_3.setBounds(63, 714, 180, 79);
		frame_ma.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("注销登陆");
		button_4.setForeground(Color.BLUE);
		button_4.setFont(new Font("楷体", Font.BOLD, 30));
		button_4.setBackground(Color.WHITE);
		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_4)
		        {
		        	frame_ma.dispose();
		        	Management_start management_start = new Management_start();
		        	management_start.frame.setVisible(true);
		        }
				
			}
		});
		button_4.setBounds(63, 840, 180, 79);
		frame_ma.getContentPane().add(button_4);
		
		
		JLabel label = new JLabel("请输入修改的编号：");
		label.setFont(new Font("楷体", Font.BOLD, 40));
		label.setBounds(568, 248, 383, 79);
		frame_ma.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(1010, 260, 410, 50);
		frame_ma.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("姓名：");
		label_1.setFont(new Font("楷体", Font.BOLD, 40));
		label_1.setBounds(377, 372, 146, 72);
		frame_ma.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("学院：");
		label_2.setFont(new Font("楷体", Font.BOLD, 40));
		label_2.setBounds(377, 519, 146, 72);
		frame_ma.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("专业：");
		label_3.setFont(new Font("楷体", Font.BOLD, 40));
		label_3.setBounds(377, 666, 146, 72);
		frame_ma.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("班级：");
		label_4.setFont(new Font("楷体", Font.BOLD, 40));
		label_4.setBounds(377, 813, 146, 72);
		frame_ma.getContentPane().add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(542, 372, 321, 65);
		frame_ma.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(542, 519, 321, 65);
		frame_ma.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(542, 666, 321, 65);
		frame_ma.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(542, 813, 321, 65);
		frame_ma.getContentPane().add(textField_4);
		
		JLabel label_5 = new JLabel("工作时间：");
		label_5.setFont(new Font("楷体", Font.BOLD, 40));
		label_5.setBounds(1100, 372, 210, 72);
		frame_ma.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("联系方式：");
		label_6.setFont(new Font("楷体", Font.BOLD, 40));
		label_6.setBounds(1100, 519, 210, 72);
		frame_ma.getContentPane().add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(1345, 372, 321, 65);
		frame_ma.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(1345, 519, 321, 65);
		frame_ma.getContentPane().add(textField_6);
		
		JButton button_5 = new JButton("确定");
		button_5.setForeground(Color.BLUE);
		button_5.setFont(new Font("楷体", Font.BOLD, 30));
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_5)
		        {
		        	temp_id = textField.getText();
		            user_id = Integer.parseInt(temp_id);
		        	
		        	String user_name = textField_1.getText();
		        	String show_name = user_name + "\r\n";
		        	
		        	String user_college = textField_2.getText();
		        	String show_college = user_college + "\r\n";
		        	
		        	String user_profession = textField_3.getText();
		        	String show_profession = user_profession + "\r\n";
		        	
		        	String user_grade = textField_4.getText();
		        	String show_grade = user_grade + "\r\n";
		        	
		        	String user_work_time = textField_5.getText();
		        	String show_work_time = user_work_time + "\r\n";
		        	
		        	String user_tel = textField_6.getText();
		        	String show_tel = user_tel + "\r\n";
		        	
		        	Demo demo = new Demo();
		        	try {
						demo.changeName(user_id, user_name);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	try {
						demo.changeCollege(user_id, user_college);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	try {
						demo.changeProfession(user_id, user_profession);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	try {
						demo.changeGrade(user_id, user_grade);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	try {
						demo.changeWork_time(user_id, user_work_time);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	try {
						demo.changeTel(user_id, user_tel);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	
		          	
		        	
		            JOptionPane.showMessageDialog(frame_ma, "信息修改成功！\r\n" + "姓名：" + show_name + "学院：" + show_college + "专业：" + show_profession
           		 + "班级：" + show_grade +  "工作时间：" + show_work_time +  "联系方式：" + show_tel, "确定", JOptionPane.CANCEL_OPTION);
		        	
		        }
				
			}
		});
		button_5.setBounds(1170, 746, 140, 72);
		frame_ma.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("返回");
		button_6.setForeground(Color.BLUE);
		button_6.setFont(new Font("楷体", Font.BOLD, 30));
		button_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_6)
		        {
		        	frame_ma.dispose();
		        	Management_interface management_interface = null;
					try {
						management_interface = new Management_interface();
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	management_interface.frame_fa.setVisible(true);
		        }
				
			}
		});
		button_6.setBounds(1457, 746, 140, 72);
		frame_ma.getContentPane().add(button_6);
		


	}
}
