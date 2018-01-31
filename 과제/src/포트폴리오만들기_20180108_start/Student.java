package ��Ʈ�����������_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Student extends JPanel {
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	JTextField id;
	JTextField name;
	JButton selectBtn;
	JButton insertBtn;
	JButton updateBtn;
	JButton deleteBtn;
	JButton searchBtn;
	JButton deptListBtn;
	
	String [] score = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E", "F"};
	String [] dept_name = {"C001", "M002", "T003", "G004"};

	JComboBox attitudeCombo = new JComboBox(score);
	JComboBox checkCombo = new JComboBox(score);
	JComboBox examCombo = new JComboBox(score);
	JComboBox workCombo = new JComboBox(score);
	JComboBox deptCombo = new JComboBox(dept_name);
	
	DefaultTableModel model;
	JTable table;
	
	public void AllList(String squery) {
		try {
			System.out.println("����Ǿ����ϴ�.....");
			
			if(squery.equals("")) {
				query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work "
						+"from pofol_score order by class_id";
			} else {
				query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work "
						+"from pofol_score"+ squery + " order by class_id";
			}
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[7];
				row[0] = rs.getString("class_id");
				row[1] = rs.getString("department_id");
				row[2] = rs.getString("name");
				row[3] = rs.getString("score_attitude");
				row[4] = rs.getString("score_check");
				row[5] = rs.getString("score_exam");
				row[6] = rs.getString("score_work");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.getStackTrace();
		}
	}

	Student(){
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
		
		JLabel h_id = new JLabel("�й� : ");
		h_id.setBounds(20,10,50,25);
		add(h_id);
		
		id = new JTextField(25);
		id.setBounds(60,10,150,25);
		add(id);
		
		JButton classBtn = new JButton("�й� �ߺ� üũ");
		classBtn.setBounds(230,10,120,25);
		add(classBtn); 
		classBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�й��� �Է����ּ���.");
					id.requestFocus();
				} else {
					try {
						query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work" + 
								" from pofol_score where class_id = '"+id.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "�̹� ������� �й��Դϴ�.");
							id.setText("");
							id.requestFocus();
						} else {
							JOptionPane.showMessageDialog(null, "��� ������ �й��Դϴ�.");
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		JLabel h_dept = new JLabel("�а� : ");
		h_dept.setBounds(20,45,50,25);
		add(h_dept);
		
		deptCombo.setBounds(60,45,90,25);
		add(deptCombo);
		
		JLabel deptAlim = new JLabel("�а�ID�� �а����� �а� ����Ʈ �޴��� ������ �ּ���.");
		deptAlim.setBounds(170,45,400,30);
		add(deptAlim);
		
		JLabel h_name = new JLabel("�̸� : ");
		h_name.setBounds(20,80,50,25);
		add(h_name);
		
		name = new JTextField(25);
		name.setBounds(60,80,150,25);
		add(name);
		
		JLabel h_attitude = new JLabel("�µ� ���� : ");
		h_attitude.setBounds(10,115,80,25);
		add(h_attitude);
		
		attitudeCombo.setBounds(80,115,50,25);
		add(attitudeCombo);
		
		JLabel h_check = new JLabel("��� ���� : ");
		h_check.setBounds(150,115,80,25);
		add(h_check);
		
		checkCombo.setBounds(220,115,50,25);
		add(checkCombo);
		
		JLabel h_exam = new JLabel("���� ���� : ");
		h_exam.setBounds(10,150,80,25);
		add(h_exam);
		
		examCombo.setBounds(80,150,50,25);
		add(examCombo);
		
		JLabel h_work = new JLabel("���� ���� : ");
		h_work.setBounds(150,150,80,25);
		add(h_work);
		
		workCombo.setBounds(220,150,50,25);
		add(workCombo);
		
		String colName[] = {"�й�", "�а�", "�̸�", "�µ�", "���", "����","����"};
		
		model = new DefaultTableModel(colName,0);
		
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 200));
		JScrollPane h_jp = new JScrollPane(table);
		h_jp.setBounds(20,200,350,200);
		add(h_jp);
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				
				String sid = (String)model.getValueAt(table.getSelectedRow(), 0);
				id.setText(sid);
				String sname = (String)model.getValueAt(table.getSelectedRow(), 2);
				name.setText(sname);
			}
		});
		
		selectBtn = new JButton("��ȸ");
		selectBtn.setBounds(395,208,70,25);
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work" + 
							" from pofol_score where class_id = '"+id.getText()+"'";
					
					ResultSet rs;
					rs = stmt.executeQuery(query);
					
					model.setNumRows(0);
					
					if(rs.next()) {
						String[] row = new String[7];
						row[0] = rs.getString("class_id");
						row[1] = rs.getString("department_id");
						row[2] = rs.getString("name");
						row[3] = rs.getString("score_attitude");
						row[4] = rs.getString("score_check");
						row[5] = rs.getString("score_exam");
						row[6] = rs.getString("score_work");
						model.addRow(row);
					} else {
						AllList("");
					}
					
					rs.close();
					
				} catch(Exception b) {
					b.getStackTrace();
				}
			}
		});
		
		insertBtn = new JButton("�Է�");
		insertBtn.setBounds(395,258,70,25);
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�й��� �Է��ϼ���.");
					id.requestFocus();
				} else if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���.");
					name.requestFocus();
				} else {
					try {
						query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work" + 
								" from pofol_score where class_id = '"+id.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(!rs.next()) {
							String sql = "insert into pofol_score values('"
									+id.getText()+"', '"
									+deptCombo.getSelectedItem()+"', '"
									+name.getText()+"', '"
									+attitudeCombo.getSelectedItem()+"', '"
									+checkCombo.getSelectedItem()+"', '"
									+examCombo.getSelectedItem()+"', '"
									+workCombo.getSelectedItem()+"')";
							stmt.executeUpdate(sql);
							
							AllList("");
							
						} else {
							JOptionPane.showMessageDialog(null, "�̹� �����ϴ� �й��Դϴ�.");
							id.setText("");
							id.requestFocus();
							name.setText("");
						}
						
						rs.close();
						
					} catch(Exception b) {
						b.getStackTrace();
					}
				}
			}
		});
		
		updateBtn = new JButton("����");
		updateBtn.setBounds(395,308,70,25);
		add(updateBtn);
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					try {
						stmt.executeUpdate("update pofol_score set CLASS_ID = '"
								+id.getText()+"', DEPARTMENT_ID = '"
								+deptCombo.getSelectedItem()+"', NAME = '"
								+name.getText()+"', SCORE_ATTITUDE = '"
								+attitudeCombo.getSelectedItem()+"', SCORE_CHECK = '"
								+checkCombo.getSelectedItem()+"', SCORE_EXAM = '"
								+examCombo.getSelectedItem()+"', SCORE_WORK = '"
								+workCombo.getSelectedItem()+"' where CLASS_ID = '"
								+id.getText()+"'");
						JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "�˸�", JOptionPane.INFORMATION_MESSAGE);
						AllList("");
						
					} catch(Exception a1) {
						a1.getStackTrace();
					}
				}
			}
		});
		
		deleteBtn = new JButton("����");
		deleteBtn.setBounds(395,358,70,25);
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					try {
						stmt.executeUpdate("delete from pofol_score where class_id = '"+id.getText()+"'");
						JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
						AllList("");
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setSize(480, 480);
		setVisible(true);
	}

}
