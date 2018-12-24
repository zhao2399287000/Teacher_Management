package management_ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import main.Admin;
import management_db.Demo;

import javax.swing.JPasswordField;

public class Management_register {
	
	//得到当前电脑显示屏的宽和高
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public int windowsWidth = 800;
	public int windowsHeight = 500;

	JFrame frame_re;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
	/**
	 * Create the application.
	 */
	public Management_register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//创建一个窗口，并设置标题和大小，并且可以关闭
		frame_re = new JFrame();
		frame_re.setTitle("教师管理系统-注册界面");
		frame_re.setBounds((width - windowsWidth) / 2,
				(height - windowsHeight) / 2, windowsWidth, windowsHeight);
		frame_re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_re.getContentPane().setLayout(null);
		
		//设置一个标签，插入自己准备好的图片，也就是山东理工大学——教室管理的图片
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Java\u5B9E\u8BAD\\Teacher Management\\image\\image1.png"));
		lblNewLabel.setBounds(45, 79, 250, 261);
		frame_re.getContentPane().add(lblNewLabel);
		
		//设置一个标签，用来显示用户名，并且设置显示的字体的大小和标签的边框
		JLabel lblNewLabel_1 = new JLabel("用户名：");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel_1.setBounds(352, 50, 180, 75);
		frame_re.getContentPane().add(lblNewLabel_1);
		
		//设置一个文本收集框，用来收集输入的数据，并且设置文本框的大小
		JTextField textField = new JTextField();
		textField.setBounds(520, 50, 244, 52);
		frame_re.getContentPane().add(textField);
		textField.setColumns(10);
		
		//设置一个标签，用来显示密码，并且设置显示的字体的大小和标签的边框
		JLabel label = new JLabel("密  码：");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("宋体", Font.BOLD, 30));
		label.setBounds(352, 150, 180, 75);
		frame_re.getContentPane().add(label);
		
		//设置一个密码收集框，这个类似于一个文本收集框，不过是把文本框中的数据隐藏，同样设置文本框的大小和位置
		passwordField = new JPasswordField();
		passwordField.setBounds(520, 150, 244, 52);
		frame_re.getContentPane().add(passwordField);
		
		//设置一个标签，用来显示确认密码，并且设置显示的字体的大小和标签的边框
		JLabel label_1 = new JLabel("确认密码：");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("宋体", Font.BOLD, 30));
		label_1.setBounds(352, 250, 180, 75);
		frame_re.getContentPane().add(label_1);
		
		//设置一个密码收集框，这个类似于一个文本收集框，不过是把文本框中的数据隐藏，同样设置文本框的大小和位置
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(520, 250, 244, 52);
		frame_re.getContentPane().add(passwordField_1);

		//设置一个确定按钮，这个按钮中添加了点击响应事件，可以响应鼠标点击，并进行页面的跳转，同样设置按钮大小以及里面字体的大小
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("楷体", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(30, 144, 255));
		//添加鼠标点击事件
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==btnNewButton)
		        {
			        	String user_name = textField.getText();
			        	String show_name = user_name + "\r\n";
			        	
			        	char[] pass1 = passwordField.getPassword();
			        	String user_password1 = new String(pass1);
			        	String show_password1 = user_password1 + "\r\n";
			        	
			        	char[] pass2 = passwordField_1.getPassword();
			        	String user_password2 = new String(pass2);
			        	
			        	
			        	
			        	Admin admin = new Admin();
			        	admin.setName(user_name);
			        	if(user_password1.equals(user_password2)){
				        	admin.setPassword(user_password1);
				        	Demo demo = new Demo();
				            try {		            	
				            	demo.admin_insert(admin);
				            } catch (SQLException e1) {
				                e1.printStackTrace();
				            } catch (ClassNotFoundException e1) {
				                e1.printStackTrace();
				            }
				            JOptionPane.showMessageDialog(frame_re, "注册账号成功！\r\n" + "姓名：" + show_name + "密码：" + show_password1, "确定", JOptionPane.CANCEL_OPTION);
			        		
			        	}
			        	else{
			        		 JOptionPane.showMessageDialog(frame_re, "两次密码不同，注册失败！\r\n" , "确定", JOptionPane.CANCEL_OPTION);
			        	}

		        }
			}
		});

		btnNewButton.setBounds(377, 368, 133, 52);
		frame_re.getContentPane().add(btnNewButton);
		
		//设置一个登陆按钮，这个按钮中添加了点击响应事件，可以响应鼠标点击，并进行页面的跳转，同样设置按钮大小以及里面字体的大小
		JButton button = new JButton("登录");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("楷体", Font.BOLD, 30));
		button.setBackground(new Color(30, 144, 255));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		        if(e.getSource()==button)
		        {
		        	//关闭当前的界面
		        	frame_re.dispose();
		        	//创建一个新的登陆界面
		        	Management_start management_start = new Management_start();
		        	management_start.frame.setVisible(true);
		        }
				
			}
		});
		button.setBounds(575, 368, 133, 52);
		frame_re.getContentPane().add(button);
		

	}
}
