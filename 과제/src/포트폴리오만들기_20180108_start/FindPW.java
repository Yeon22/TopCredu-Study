package ��Ʈ�����������_20180108_start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FindPW extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	FindID findIDdialog;
	
	JLabel id;
	JLabel name;
	JLabel phone;
	JTextField t_id = new JTextField(15);
	JTextField t_name = new JTextField(15);
	JTextField t_phone = new JTextField(15);
	
	JButton pwFindcheck = new JButton("��й�ȣ ã��");
	
	FindPW(){
		//DB����
		String url = null;
		String uid = "h5";
		String upw = "h5";
				
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,upw);
			stmt = conn.createStatement();
					
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		setTitle("��й�ȣ ã�� ȭ��");
		setLayout(null);
		
		id = new JLabel ("���̵� : ");
		id.setBounds(40,10,50,25);
		add(id);
		t_id.setBounds(93,10,130,25);
		add(t_id);
		
		name = new JLabel("�̸� : ");
		name.setBounds(52,45,50,25);
		add(name);
		t_name.setBounds(93,45,130,25);
		add(t_name);
		
		phone = new JLabel("��ȭ��ȣ : ");
		phone.setBounds(26,80,80,25);
		add(phone);
		t_phone.setBounds(93,80,130,25);
		add(t_phone);
		JLabel phoneAlim = new JLabel("��ȭ��ȣ ���� : 01012345678 / ���ڸ� �ۼ�!");
		phoneAlim.setBounds(10,108,250,25);
		add(phoneAlim);
		
		pwFindcheck.setBounds(65, 145, 130, 30);
		add(pwFindcheck);
		pwFindcheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
					t_id.requestFocus();
				} else if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է����ּ���.");
					t_name.requestFocus();
				} else if(t_phone.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� �Է����ּ���.");
					t_phone.requestFocus();
				} else {
					//��� �׸��� �Է����� ��
					try {
						query = "select pw from pofol_professor "+
								"where LOGIN_ID = '"
								+t_id.getText()+"' and pro_name = '"
								+t_name.getText()+"' and PHONE_NUMBER = '"
								+t_phone.getText()+"'";
						
						ResultSet rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "ã���ô� ��й�ȣ�� "+rs.getString(1)+" �Դϴ�.");
							setVisible(false);
						} else {
							if(JOptionPane.showConfirmDialog(null, "�Է��Ͻ� ������ ã�� �� �����ϴ�. \nIDã�� ȭ������ ���ðڽ��ϱ�?","�˸�",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
								findIDdialog = new FindID();
								findIDdialog.setVisible(true);
								setVisible(false);
							}
						}
						
						rs.close();
						
					} catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setSize(280, 250);
		setResizable(false);
	}

}
