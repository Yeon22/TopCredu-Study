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
	JButton rememberID;
	JButton rememberPW;
	JButton outBtn;
	
	LoginDialog dialog = new LoginDialog(this, "ȸ������ȭ��");
	Withdrawal withdialog = new Withdrawal();
	ScoreManager sm;
	
	FindID findIDdialog = new FindID();
	FindPW findPWdialog = new FindPW();
	
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
		
		setTitle("������ �α��� ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel l_id = new JLabel("���̵� : ");
		l_id.setBounds(24,10,60,25);
		id_text = new JTextField(10);
		id_text.setBounds(79,10,120,25);
		add(l_id);
		add(id_text);

		rememberID = new JButton("���̵� ã��");
		rememberID.setBounds(204,10,120,25);
		add(rememberID);
		rememberID.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIDdialog.setVisible(true);
			}
		});
		
		JLabel l_pw = new JLabel("��й�ȣ : ");
		l_pw.setBounds(10,40,80,25);
		pw_text = new JTextField(10);
		pw_text.setBounds(79,40,120,25);
		add(l_pw);
		add(pw_text);
		
		rememberPW = new JButton("��й�ȣ ã��");
		rememberPW.setBounds(204,40,120,25);
		add(rememberPW);
		rememberPW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findPWdialog.setVisible(true);
			}
		});
		
		login = new JButton("�����ڷα���");
		login.setBounds(45,80,120,25);
		add(login);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
					id_text.requestFocus();
				} else if(pw_text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.");
					pw_text.requestFocus();
				} else {
					// ���̵�, ��й�ȣ �Է����� ��
					try {
						query = "select login_id, pw, pro_name, address, email, TO_DATE(birth, 'RRRR-MM-DD') as birth, phone_number, gender" + 
								" from pofol_professor where login_id = '"+id_text.getText()+"' and pw = '"+pw_text.getText()+"'";
						
						ResultSet rs;
						
						rs = stmt.executeQuery(query);
						
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
							id_text.setText("");
							id_text.requestFocus();
							pw_text.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "�α����� ���������� �Ϸ�Ǿ����ϴ�. \n���������ý��ۿ� �����մϴ�.");
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
		member.setBounds(185,80,120,25);
		add(member);
		member.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		JLabel Alim = new JLabel("���̵� �� ��й�ȣ�� ������ �е鲲��");
		JLabel Alim2 = new JLabel("���̵� ã�� �Ǵ� ��й�ȣ ã�⸦ �̿����ֽñ� �ٶ��ϴ�.");
		Alim.setBounds(60,115,250,25);
		Alim2.setBounds(10,135,410,25);
		add(Alim);
		add(Alim2);
		
		JLabel jul = new JLabel("---------------------------------------------------------------------------------------");
		jul.setBounds(0,150,355,10);
		add(jul);
		
		JLabel outLbl = new JLabel("Ż�� ���Ͻô� �е��� ���� �ִ� ");
		JLabel outLbl2 = new JLabel("ȸ�� Ż�� ��ư�� �����ñ� �ٶ��ϴ�.");
		outLbl.setBounds(10,165,200,25);
		outLbl2.setBounds(10,182, 250, 25);
		add(outLbl);
		add(outLbl2);
		
		outBtn = new JButton("ȸ�� Ż��");
		outBtn.setBounds(250,170,90,30);
		add(outBtn);
		outBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				withdialog.setVisible(true);
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
		
		setSize(355,250);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginManager();
	}

}
