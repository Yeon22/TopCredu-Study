package ��Ʈ�����������_20180108_start;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginManager extends JFrame {
	Connection conn;
	Statement stmt = null;
	String query;
	
	JTextField id_text;
	JTextField pw_text;
	JButton login;
	JButton member;
	
	LoginDialog dialog = new LoginDialog(this, "ȸ������ȭ��");
	ScoreManager sm;
	
	LoginManager(){
		String url = null;
		String uid = "h5";
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,pw);
			stmt = conn.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		setTitle("�α���ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel l_id = new JLabel("���̵�      : ");
		id_text = new JTextField(10);
		add(l_id);
		add(id_text);
		
		JLabel l_pw = new JLabel("��й�ȣ  : ");
		pw_text = new JTextField(10);
		add(l_pw);
		add(pw_text);
		
		login = new JButton("�����ڷα���");
		add(login);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
				} else if(pw_text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.");
				} else {
					// ���̵�, ��й�ȣ �Է����� ��
					try {
						query = "select login_id, pw, pro_name, address, email, TO_DATE(birth, 'RRRR-MM-DD') as birth, phone_number, gender" + 
								" from pofol_professor where login_id = '"+id_text.getText()+"' and pw = '"+pw_text.getText()+"'";
						
						ResultSet rs;
						
						rs = stmt.executeQuery(query);
						
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
						} else {
							JOptionPane.showMessageDialog(null, "�α����� ���������� �Ϸ�Ǿ����ϴ�.");
							sm = new ScoreManager();
							setVisible(false);
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		
		member = new JButton("ȸ������");
		add(member);
		member.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		//�����̺�Ʈ
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					if(conn!=null) {
						conn.close();
					}
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		setSize(260,130);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginManager();
	}

}
