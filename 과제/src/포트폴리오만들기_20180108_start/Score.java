package ��Ʈ�����������_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score extends JPanel {
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	Score(){
		ResultSet rs = null;
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
		
		JLabel S_dept = new JLabel("�а�");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"��ü", "��ǻ�Ͱ��а�", "��Ƽ�̵���", "����ȸ���", "�������"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 120, 20);
		add(Cb_dept);
		
		String [] colName =  {"�й�", "�̸�", "�µ�����", "�������", "��������", "��������"};
		
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 40, 460, 250);
		add(scrollpane);
		
		JButton selectBtn = new JButton("��ȸ");
		selectBtn.setBounds(10, 300, 70, 20);
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Cb_dept.getSelectedIndex();
				String Cb_name = Cb_dept.getItemAt(index).toString();
				
				if(Cb_name.equals("��ǻ�Ͱ��а�")) {
					
				} else if(Cb_name.equals("��Ƽ�̵���")) {
					
				} else if(Cb_name.equals("����ȸ���")) {
					
				} else if(Cb_name.equals("�������")) {
					
				} else if(Cb_name.equals("��ü")){
					try {
						System.out.println("����Ǿ����ϴ�.......");
						
						query = "select class_id, name, score_attitude, score_check, score_exam, score_work "
								+ "from pofol_score";
						
						ResultSet rs = stmt.executeQuery(query);
						
						model.setNumRows(0);
						
						while(rs.next()) {
							String[] row = new String[6];
							row[0] = rs.getString("class_id");
							row[1] = rs.getString("name");							
							row[2] = rs.getString("score_attitude");						
							row[3] = rs.getString("score_check");							
							row[4] = rs.getString("score_exam");							
							row[5] = rs.getString("score_work");
							
							model.addRow(row);
						}
						
						rs.close();
					} catch(SQLException a) {
						a.getStackTrace();
					}
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
