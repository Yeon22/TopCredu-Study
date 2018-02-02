package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMySQL {

	public static void main(String[] args) {
		Connection conn = null; //���ᰴä
		
		ResultSet rs = null;
		Statement stmt = null;
		String id = "root";
		String pw = "1234";
		String url = null;
		
		url = "jdbc:mysql://localhost:3306/sampledb";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("����Ǿ����ϴ�.");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from test"); //��������
			
			while(rs.next()) {
				String sid = rs.getString(1);
				String name = rs.getString(2);
				System.out.println(sid + "," + name);
			}
			
			stmt.close();
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
