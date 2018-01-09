package Haksa;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	
	DefaultTableModel model; //��, ������
	JTable table; //���̺�
	Vector<String> title = new Vector<String>();
	Vector<Info> m_Vec = new Vector<Info>(); //������ �����ϰų� ����, ������ ���� ����
	Vector<Object> dataVector = new Vector<Object>();
	
	Student() {
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
		
//		String colName[] = {"�̸�", "�й�", "�а�", "�ּ�"};
		title.add("�̸�");
		title.add("�й�");
		title.add("�а�");
		title.add("�ּ�");
		
		model = new DefaultTableModel();
		
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
				
				//�й�
				String sname = (String)model.getValueAt(table.getSelectedRow(), 0);
				name.setText(sname); //id�ؽ�Ʈ�ʵ忡 ǥ���� ������ �����͸� �־�����.
				//�̸�
				String sid = (String)model.getValueAt(table.getSelectedRow(), 1);
				id.setText(sid);
				//�а�
				String sdept = (String)model.getValueAt(table.getSelectedRow(), 2);
				dept.setText(sdept);
				//�ּ�
				String saddress = (String)model.getValueAt(table.getSelectedRow(), 3);
				address.setText(saddress);
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
					name.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else if(dept.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�а��� �Է��ϼ���.");
					name.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ּҸ� �Է��ϼ���.");
					name.requestFocus(); //�ʵ�� Ŀ���� ������.
				} else {
					//ǥ�� �����͸� �־��ִ� ��
					Info cInfo = new Info(name.getText(), id.getText(), dept.getText(), address.getText());
					m_Vec.add(cInfo);
					dataVector.clear();
					
					for(int i=0; i<m_Vec.size(); i++) {
						Info st = m_Vec.get(i); //���Ϳ��� �ϳ� ����
						Vector<String> temp = new Vector<String>();
						temp.addElement(st.getName());
						temp.addElement(st.getId());
						temp.addElement(st.getDepartment());
						temp.addElement(st.getAddress());
						dataVector.addElement(temp); //Vector<Object>�� �־��ָ� ǥ�� ��.
					}
					
					model.setDataVector(dataVector, title);
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
					Info student = new Info(name.getText(), id.getText(), dept.getText(), address.getText());
					
					m_Vec.setElementAt(student, table.getSelectedRow());
					
					Vector<String> temp = new Vector<String>();
					temp.addElement(name.getText());
					temp.addElement(id.getText());
					temp.addElement(dept.getText());
					temp.addElement(address.getText());
					//�� ��ġ�� �ٽ� �־ ����
					dataVector.setElementAt(temp, table.getSelectedRow()); 
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		deleteBtn = new JButton("����");
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					m_Vec.remove(table.getSelectedRow());
					dataVector.clear();
					
					for(int i=0; i<m_Vec.size(); i++) {
						Info st = m_Vec.get(i);
						Vector<String> temp = new Vector<String>();
						temp.addElement(st.getName());
						temp.addElement(st.getId());
						temp.addElement(st.getDepartment());
						temp.addElement(st.getAddress());
						dataVector.addElement(temp);
					}
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		setSize(300, 420);
		setVisible(true);
	}

}
