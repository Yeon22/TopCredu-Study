package ��Ʈ�����������_20180108_start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FindPW extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	String query;
//	query = "select pw from pofol_professor "+
//			"where LOGIN_ID = 'hongkildong' and pro_name = 'ȫ�浿' and PHONE_NUMBER = '01079482587'";
	
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
		
		
		
		setSize(280, 250);
	}

}
