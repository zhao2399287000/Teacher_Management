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

import main.Teacher;
import management_db.Demo;

public class Management_insert {
	
	//得到当前电脑显示屏的宽和高
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;

	JFrame frame_in;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Create the application.
	 */
	public Management_insert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame_in = new JFrame();
		frame_in.getContentPane().setBackground(SystemColor.control);
		frame_in.setTitle("教师管理系统-信息添加");
		frame_in.setBounds(0, 0, width, height);
		frame_in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_in.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(63, 13, 1779, 110);
		lblNewLabel.setIcon(new ImageIcon("E:\\Java\u5B9E\u8BAD\\Teacher Management\\image\\image3.png"));
		frame_in.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(63, 136, 1779, 39);
		frame_in.getContentPane().add(panel);
		
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
		        	frame_in.dispose();
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
		frame_in.getContentPane().add(btnNewButton);
		
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
		        }
				
			}
		});
		button.setBounds(63, 336, 180, 79);
		frame_in.getContentPane().add(button);
		
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
		        	frame_in.dispose();
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
		frame_in.getContentPane().add(button_1);
		
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
		        	frame_in.dispose();
		        	Management_maintenance management_maintenance = null;
					try {
						management_maintenance = new Management_maintenance();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
		        	management_maintenance.frame_ma.setVisible(true);

		        }
				
			}
		});
		button_2.setBounds(63, 588, 180, 79);
		frame_in.getContentPane().add(button_2);
		
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
		        	frame_in.dispose();
		        	Management_delete management_delete = new Management_delete();
		        	management_delete.frame_de.setVisible(true);
		        }
				
			}
		});
		button_3.setBounds(63, 714, 180, 79);
		frame_in.getContentPane().add(button_3);
		
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
		        	frame_in.dispose();
		        	Management_start management_start = new Management_start();
		        	management_start.frame.setVisible(true);
		        }
				
			}
		});
		button_4.setBounds(63, 840, 180, 79);
		frame_in.getContentPane().add(button_4);
		
		
		JLabel lblNewLabel_1 = new JLabel("姓名：");
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 40));
		lblNewLabel_1.setBounds(450, 244, 146, 72);
		frame_in.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(613, 244, 321, 65);
		frame_in.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("学院：");
		label.setFont(new Font("楷体", Font.BOLD, 40));
		label.setBounds(450, 413, 146, 72);
		frame_in.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(613, 420, 321, 65);
		frame_in.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("专业：");
		label_1.setFont(new Font("楷体", Font.BOLD, 40));
		label_1.setBounds(450, 582, 146, 72);
		frame_in.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(613, 588, 321, 65);
		frame_in.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("班级：");
		label_2.setFont(new Font("楷体", Font.BOLD, 40));
		label_2.setBounds(450, 751, 146, 72);
		frame_in.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(613, 747, 321, 65);
		frame_in.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("工作时间：");
		label_3.setFont(new Font("楷体", Font.BOLD, 40));
		label_3.setBounds(1000, 244, 210, 72);
		frame_in.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(1260, 244, 321, 65);
		frame_in.getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("联系方式：");
		label_4.setFont(new Font("楷体", Font.BOLD, 40));
		label_4.setBounds(1000, 413, 210, 72);
		frame_in.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(1260, 413, 321, 65);
		frame_in.getContentPane().add(textField_5);

		
		
		JButton btnNewButton_2 = new JButton("确定");
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("楷体", Font.BOLD, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==btnNewButton_2)
		        {
		        	String user_name = textField.getText();
		        	String show_name = user_name + "\r\n";
		        	
		        	String user_college = textField_1.getText();
		        	String show_college = user_college + "\r\n";
		        	
		        	String user_profession = textField_2.getText();
		        	String show_profession = user_profession + "\r\n";
		        	
		        	String user_grade = textField_3.getText();
		        	String show_grade = user_grade + "\r\n";
		        	
		        	String user_work_time = textField_4.getText();
		        	String show_work_time = user_work_time + "\r\n";
		        	
		        	String user_tel = textField_5.getText();
		        	String show_tel = user_tel + "\r\n";
		        	
		        	Teacher teacher = new Teacher();
		        	teacher.setName(user_name);
		        	teacher.setCollege(user_college);
		        	teacher.setProfession(user_profession);
		        	teacher.setGrade(user_grade);
		        	teacher.setWork_time(user_work_time);
		        	teacher.setTel(user_tel);
		        	Demo demo = new Demo();
		            try {		            	
		            	demo.teacher_insert(teacher);
		            } catch (SQLException e1) {
		                e1.printStackTrace();
		            } catch (ClassNotFoundException e1) {
		                e1.printStackTrace();
		            }
		            JOptionPane.showMessageDialog(frame_in, "信息添加成功！\r\n" + "姓名：" + show_name + "学院：" + show_college + "专业：" + show_profession
           		 + "班级：" + show_grade +  "工作时间：" + show_work_time +  "联系方式：" + show_tel, "确定", JOptionPane.CANCEL_OPTION);

		        }
				
			}
		});
		btnNewButton_2.setBounds(1114, 643, 140, 72);
		frame_in.getContentPane().add(btnNewButton_2);
		
		JButton button_5 = new JButton("返回");
		button_5.setForeground(Color.BLUE);
		button_5.setFont(new Font("楷体", Font.BOLD, 30));
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button_5)
		        {
		        	frame_in.dispose();
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
		button_5.setBounds(1397, 643, 140, 72);
		frame_in.getContentPane().add(button_5);
	}
}
