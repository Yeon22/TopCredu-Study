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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DepartmentList extends JPanel{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	JButton insertDept;
	JButton deleteDept;
	
	public void List() {
		try {
			System.out.println("����Ǿ����ϴ�.....");
			
			query = "select department_id, department_name from pofol_department";
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[2];
				row[0] = rs.getString("department_id");
				row[1] = rs.getString("department_name");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	DepartmentList(){
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
		
		String [] colName =  {"�а�ID", "�а���"};
		
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(80, 10, 300, 200);
		add(scrollpane);
		
		try {
			query = "select department_id, department_name from pofol_department";
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[2];
				row[0] = rs.getString("department_id");
				row[1] = rs.getString("department_name");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException a) {
			a.getStackTrace();
		}
		
		JLabel id = new JLabel("�а�ID : ");
		id.setBounds(120,250,80,25);
		add(id);
		
		JTextField t_id = new JTextField(15);
		t_id.setBounds(170,250,150,25);
		add(t_id);
		
		JLabel name = new JLabel("�а��� : ");
		name.setBounds(120,290,80,25);
		add(name);
		
		JTextField t_name = new JTextField(15);
		t_name.setBounds(170,290,150,25);
		add(t_name);
		
		insertDept = new JButton("�а� ID �� �а��� �߰��ϱ�");
		insertDept.setBounds(130,330,200,30);
		add(insertDept);
		insertDept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�а�ID�� �Է��ϼ���.");
					t_id.requestFocus();
				} else if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�а����� �Է��ϼ���.");
					t_name.requestFocus();
				} else {
					try {
						query = "select department_id, department_name from pofol_department "+
								"where department_id = '"+t_id.getText()+"'"
								+" and department_name = '"+t_name.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(!rs.next()) {
							String sql = "insert into pofol_department values('"
									+t_id.getText()+"', '"
									+t_name.getText()+"')";
							stmt.executeUpdate(sql);
							
							List();
							
						} else {
							JOptionPane.showMessageDialog(null, "�̹� �����ϴ� �а��Դϴ�.");
							t_id.setText("");
							t_id.requestFocus();
							t_name.setText("");
						}
						
						rs.close();
						
					} catch(Exception b) {
						b.getStackTrace();
					}
				}
			}
		});
		
		deleteDept = new JButton("�а� �����ϱ�");
		deleteDept.setBounds(150,370,150,30);
		add(deleteDept);
		deleteDept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�а�ID�� �Է����ּ���.");
					t_id.requestFocus();
				} else {
					if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						try {
							stmt.executeUpdate("delete from pofol_department where department_id = '"+t_id.getText()+"'");
							JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
							List();
							
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		
		JLabel idAlim = new JLabel ("�а�ID�� �ִ� ����+���� �������� 4�ڱ����� �Է°����մϴ�.");
		idAlim.setBounds(65,215,450,30);
		add(idAlim);
		
		setSize(450, 400);
		setVisible(true);
	}

}
