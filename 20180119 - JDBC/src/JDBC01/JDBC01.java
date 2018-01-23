package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		Connection conn = null; //DB���ᰴü
		ResultSet rs = null; //select�� ����� �����ϴ� ��ü
		Statement stmnt = null; //sql�� �����ϱ� ���� ��ü
		String url = null;
		String id = "h5"; //DB ID
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		//url = "jdbc:oracle:thin:@localhost:1521:orcl;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery("select * from employees where employee_id = 100");
			
			while(rs.next()) { //���྿ ���ڵ带 �о��, Fetch, �����Ͱ� ������ true
				String employeeId = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				System.out.println(employeeId+","+firstName+","+lastName);
			}
			
			stmnt.close(); //�� �ݾ����� ������ �浹�� �� �� �ִ�.
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("������ �Ǿ����ϴ�.");
	}

}
