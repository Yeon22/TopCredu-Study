package ��Ʈ�����������_20180108_start;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Absence2 extends JPanel implements Runnable{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	JButton searchBtn = new JButton("��ȸ");
	JLabel timeLabel;

	@Override
	public void run() {
		while(true) {
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR)+"��"
					+(cal.get(Calendar.MONTH)+1)+"��"
					+cal.get(Calendar.DATE)+"��";
			timeLabel.setText(now);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void List(String squery) {
		try {
			if(squery.equals("")) {
				query = "select class_id, name, checkme from pofol_score order by class_id";
			} else {
				query = "select class_id, name, checkme from pofol_score "+squery+" order by class_id";
			}
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[3];
				row[0] = rs.getString("class_id");
				row[1] = rs.getString("name");
				row[2] = rs.getString("checkme");
				
				model.addRow(row);
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	
	Absence2(){
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

		setLayout(null);
		
		JLabel department = new JLabel("�а� : ");
		department.setBounds(28,10,45,25);
		add(department);
		
		String dept[] = {"��ü", "��ǻ�Ͱ��а�", "��Ƽ�̵���","����ȸ���","�������"};
		JComboBox cb_dept = new JComboBox(dept);
		cb_dept.setBounds(68,12,120,20);
		add(cb_dept);
		
		String[] colName = {"�й�","�̸�","�⼮����"};
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(420, 300));
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(20,40,430,320);
		add(jsp);
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
		JLabel w_date = new JLabel("���� ��¥ : ");
		w_date.setBounds(240,8,70,30);
		add(w_date);
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Gothic", Font.BOLD, 16));
		timeLabel.setBounds(305,8,120,30);
		add(timeLabel);
		
		Thread thread = new Thread(this);
		thread.start();
		
		
		
		searchBtn.setBounds(370, 370, 80, 30);
		add(searchBtn);
		searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_dept.getSelectedIndex();
				String cb_name = cb_dept.getItemAt(index).toString();
				
				if(cb_name.equals("��ǻ�Ͱ��а�")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'C001')";
					List(squery);
				} else if(cb_name.equals("��Ƽ�̵���")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'M002')";
					List(squery);
				} else if(cb_name.equals("����ȸ���")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'T003')";
					List(squery);
				} else if(cb_name.equals("�������")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'G004')";
					List(squery);
				} else {
					List("");
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
