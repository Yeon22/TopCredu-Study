package JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC02 {

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		String url = null;
		String id = "h5";
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			
			//DML ����, ����, ����
			stmt.executeUpdate("delete student where �а�ID = 2");
			System.out.println("�����Ǿ����ϴ�.");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
