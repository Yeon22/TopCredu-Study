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

public class FindID extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	FindPW pwDialog = new FindPW();
	
	JLabel name;
	JLabel birth;
	JLabel email;
	JTextField t_name = new JTextField(15);
	JTextField t_birth = new JTextField(15);
	JTextField t_email = new JTextField(15);
	
	JButton idFindcheck = new JButton("���̵� ã��");
	
	FindID(){
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
		
		setTitle("���̵� ã�� ȭ��");
		setLayout(null);
		
		name = new JLabel("�̸� : ");
		name.setBounds(50,10,50,25);
		add(name);
		t_name.setBounds(93,10,130,25);
		add(t_name);
		
		birth = new JLabel("���� : ");
		birth.setBounds(50,45,50,25);
		add(birth);
		t_birth.setBounds(93,45,130,25);
		add(t_birth);
		
		JLabel birthAlim = new JLabel("���� �ۼ� ���� : 19yy/mm/dd (���� ����!)");
		birthAlim.setBounds(15,70,250,25);
		add(birthAlim);
		
		email = new JLabel("email �ּ� : ");
		email.setBounds(15,110,70,25);
		add(email);
		t_email.setBounds(93,110,130,25);
		add(t_email);
		
		idFindcheck.setBounds(55, 150, 150, 30);
		add(idFindcheck);
		idFindcheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է����ּ���.");
					t_name.requestFocus();
				} else if(t_birth.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������ �Է����ּ���.");
					t_birth.requestFocus();
				} else if(t_email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �ּҸ� �Է����ּ���.");
				} else {
					//��� �׸��� �Է����� ��
					try {
						query = "select login_id from pofol_professor " + 
								"where pro_name = '"
								+t_name.getText()+"' and birth = '"
								+t_birth.getText()+"' and email = '"
								+t_email.getText()+"'";
						
						ResultSet rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							if(JOptionPane.showConfirmDialog(null, "ã���ô� ID�� "+rs.getString(1)+" �Դϴ�. \n��й�ȣ ã��� �̵��Ͻðڽ��ϱ�?", "�˸�", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
								pwDialog.setVisible(true);
								setVisible(false);
							} else {
								setVisible(false);
							}
						} else {
							JOptionPane.showMessageDialog(null, "�����Ͻ� ȸ���� �ƴϰų� �Է��Ͻ� ���� Ʋ�Ƚ��ϴ�.");
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
