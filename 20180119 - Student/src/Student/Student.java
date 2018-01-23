package Student;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Student extends JFrame{
	JTextField name; //�̸�
	JTextField dept; //�а�
	JTextField id; //���̵�
	JTextField address; //�ּ�
	JTextField search; //�˻�
	JTextArea list; //�л����
	JButton selectBtn; //��ȸ
	JButton insertBtn; //�Է�
	JButton updateBtn; //����
	JButton deleteBtn; //����
	JButton idcheckBtn;
	JButton searchBtn;
	
	Connection conn = null;
	Statement stmt = null;
	
	void ListAdd() {
		try {
			list.setText("");
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			String id;
			String name;
			String department_id;
			String address;
			
			list.append("�й�"+"\t"+"�̸�"+"\t"+"�а�"+"\t"+"�ּ�"+"\n");
			list.append("==================================================\n");
			
			while(rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				department_id = rs.getString("department_id");
				address = rs.getString("address");
				list.append(id+"\t"+name+"\t"+department_id+"\t"+address+"\n");
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	Student(){
		
		//db����
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
		
		setTitle("�л��������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("�̸� : "));
		name = new JTextField(20);
		add(name);
		
		add(new JLabel("�а� : "));
		dept = new JTextField(20);
		add(dept);
		
		add(new JLabel("�й� : "));
		id = new JTextField(10);
		add(id);
		
		idcheckBtn = new JButton("�й��ߺ� üũ");
		add(idcheckBtn);
		
		add(new JLabel("�ּ� : "));
		address = new JTextField(20);
		add(address);
		
		list = new JTextArea("", 15, 25);
		add(new JScrollPane(list));
		
		selectBtn = new JButton("���");
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs = stmt.executeQuery("select * from student");
					
					String id;
					String name;
					String department_id;
					String address;
					
					list.append("�й�"+"\t"+"�̸�"+"\t"+"�а�"+"\t"+"�ּ�"+"\n");
					list.append("==================================================\n");
					
					while(rs.next()) {
						id = rs.getString("id");
						name = rs.getString("name");
						department_id = rs.getString("department_id");
						address = rs.getString("address");
						list.append(id+"\t"+name+"\t"+department_id+"\t"+address+"\n");
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		insertBtn = new JButton("�Է�");
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���");
					name.requestFocus();
				} else if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�й��� �Է��ϼ���");
					id.requestFocus();
				} else if(dept.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�а��� �Է��ϼ���");
					dept.requestFocus();
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ּҸ� �Է��ϼ���");
					address.requestFocus();
				} else {
					//�μ�Ʈ �۾�
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
				if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?","����"
						,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
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
		
		
		add(new JLabel("ID �˻� : "));
		search = new JTextField(10);
		add(search);
		
		searchBtn = new JButton("�˻�");
		add(searchBtn);
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs = stmt.executeQuery("select * from student where id = '"
									+ search.getText()+"'");
					String sid;
					String sname;
					String sdepartment_id;
					String saddress;
					
					rs.next();
					
					sid = rs.getString("id");
					sname = rs.getString("name");
					sdepartment_id = rs.getString("department_id");
					saddress = rs.getString("address");
					
					id.setText(sid);
					name.setText(sname);
					dept.setText(sdepartment_id);
					address.setText(saddress);
					
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		setSize(300, 500);
		setVisible(true);
		setResizable(false); //ũ�⺯�� �Ұ�
		
	}

	public static void main(String[] args) {
		new Student();
	}

}
