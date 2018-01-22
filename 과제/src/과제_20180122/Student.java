package ����_20180122;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class MyDialog extends JDialog {
	JTextField idText = new JTextField(10);
	JButton okBtn = new JButton("Ȯ��");
	
	MyDialog(){
		setLayout(new FlowLayout());
		add(idText);
		add(okBtn);
		
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(200, 100);
	}
}

class Info {
	String name;
	String id;
	String department;
	String address;
	
	public Info(String name, String id, String department, String address) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class Student extends JPanel {
	JTextField name; //�̸�
	JTextField dept; //�а�
	JTextField id; //���̵�
	JTextField address; //�ּ�
	JTextField Search; //�˻�
	JTextArea list; //�л����
	JButton selectBtn; //��ȸ��ư
	JButton insertBtn; //�Է¹�ư
	JButton updateBtn; //������ư
	JButton deleteBtn; //������ư
	JButton idCheckBtn; //�й� �ߺ� üũ
	MyDialog dialog = new MyDialog();
	
	Connection conn = null;
	Statement stmt = null;
	
	DefaultTableModel model; //��, ������
	JTable table; //���̺�
	
	void ListAdd() {
		try {
			ResultSet rs = stmt.executeQuery("select * from student");
			
//			String id;
//			String name;
//			String department_id;
//			String address;
//			
//			list.append("�й�"+"\t"+"�̸�"+"\t"+"�а�"+"\t"+"�ּ�"+"\n");
//			list.append("==================================================\n");
//			
//			while(rs.next()) {
//				id = rs.getString("id");
//				name = rs.getString("name");
//				department_id = rs.getString("department_id");
//				address = rs.getString("address");
//				list.append(id+"\t"+name+"\t"+department_id+"\t"+address+"\n");
//			}
			
			//JTable �ʱ�ȭ
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[4];
				row[0] = rs.getString("name");
				row[1] = rs.getString("id");
				row[2] = rs.getString("department_id");
				row[3] = rs.getString("address");
				model.addRow(row);
			}
			rs.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	Student() {
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
		
		
		add(new JLabel("�̸� : ")); //�̸� �� �߰�
		name = new JTextField(20);
		add(name); //�̸� TextField �߰�
		
		add(new JLabel("�й� : ")); //�й� �� �߰�
		id = new JTextField(10);
		add(id); // �й� TextField �߰�
		
		idCheckBtn = new JButton("�й��ߺ�üũ");
		add(idCheckBtn);
		idCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		add(new JLabel("�а� : ")); //�а� �� �߰�
		dept = new JTextField(20);
		add(dept); //�а� TextField �߰�
		
		add(new JLabel("�ּ� : ")); //�ּ� �� �߰�
		address = new JTextField(20);
		add(address); // �ּ� TextField �߰�
		
		String colName[] = {"�̸�", "�й�", "�а�", "�ּ�"};
		
		model = new DefaultTableModel(colName, 0);
		
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(250, 200));
		add(new JScrollPane(table));
		
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
				
				//�̸�
				String sname = (String)model.getValueAt(table.getSelectedRow(), 0);
				name.setText(sname); 
				//�й�
				String sid = (String)model.getValueAt(table.getSelectedRow(), 1);
				id.setText(sid); //id�ؽ�Ʈ�ʵ忡 ǥ���� ������ �����͸� �־�����.
				//�а�
				String sdept = (String)model.getValueAt(table.getSelectedRow(), 2);
				dept.setText(sdept);
				//�ּ�
				String saddress = (String)model.getValueAt(table.getSelectedRow(), 3);
				address.setText(saddress);
			}
		});
		
		
		selectBtn = new JButton("��ȸ");
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ListAdd();
			}
		});
		
		
		insertBtn = new JButton("�Է�");
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�̸��ʵ尡 ����ִ��� �Է��� �Ǿ��ִ��� üũ
				if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���.");
					name.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�й��� �Է��ϼ���.");
					id.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else if(dept.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�а��� �Է��ϼ���.");
					dept.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ּҸ� �Է��ϼ���.");
					address.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else {
					
					try {
						String sql = "insert into student values('"
										+id.getText()+"','"
										+name.getText()+"','"
										+dept.getText()+"','"
										+address.getText()+"')";
						stmt.executeUpdate(sql);
						System.out.println("�ԷµǾ����ϴ�.");
						JOptionPane.showMessageDialog(null, "�ԷµǾ����ϴ�.", "�˸�", JOptionPane.INFORMATION_MESSAGE);
						
						//��ȸ
						ListAdd();
						
					} catch(Exception e2) {
						e2.printStackTrace();
					}
					
				}
			}
		});
		
		
		updateBtn = new JButton("����");
		add(updateBtn);
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//YES��ư�� ������ ��
				if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					try 
					{
						stmt.executeUpdate("update student set name = '"
								+name.getText() +"'," + "department_id='"
								+ dept.getText()+"'," + "address = '"
								+ address.getText()+"'" + "where id = '"
								+ id.getText()+"'");
						JOptionPane.showMessageDialog(null, "�����̵Ǿ����ϴ�.","�˸�"
								,JOptionPane.INFORMATION_MESSAGE);
						
						ListAdd();
						
					} catch(Exception a) {
						a.printStackTrace();
					}
				}
			}
		});
		
		
		deleteBtn = new JButton("����");
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(result == JOptionPane.YES_OPTION) {
					try {
						stmt.executeUpdate("delete from student where id= '"
								+ id.getText()+"'");
						JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
						ListAdd();
						
					}catch(Exception a) {
						a.printStackTrace();
					}
					
				} else if(result == JOptionPane.CLOSED_OPTION) {
					System.out.println("���");
				}
			}
		});
		
		setSize(300, 420);
		setVisible(true);
	}

}
