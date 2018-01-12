package ��Ʈ�����������_20180108;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class Info {
	static String id;
	static String department;
	static String name;
	String iKor;
	String iEng;
	String iMath;
	String iSience;
	
	public Info(String id, String department, String name, String iKor, String iEng, String iMath, String iSience) {
		super();
		this.id = id;
		this.department = department;
		this.name = name;
		this.iKor = iKor;
		this.iEng = iEng;
		this.iMath = iMath;
		this.iSience = iSience;
	}
	
	public static String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public static String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public static String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getiKor() {
		return iKor;
	}
	
	public void setiKor(String iKor) {
		this.iKor = iKor;
	}
	
	public String getiEng() {
		return iEng;
	}
	
	public void setiEng(String iEng) {
		this.iEng = iEng;
	}
	
	public String getiMath() {
		return iMath;
	}
	
	public void setiMath(String iMath) {
		this.iMath = iMath;
	}
	
	public String getiSience() {
		return iMath;
	}
	
	public void setiSience(String iSience) {
		this.iSience = iSience;
	}
}


public class Student extends JPanel {
	JTextField id;
	JTextField dept;
	JTextField name;
	JTextField iKor;
	JTextField iEng;
	JTextField iMath;
	JTextField iSience;
	JButton insertBtn;
	JButton updateBtn;
	JButton deleteBtn;
	
	DefaultTableModel model;
	JTable table;
	Vector<String> title = new Vector<String>();
	Vector<Info> m_Vector = new Vector<Info>();
	Vector<Object> dataVector = new Vector<Object>();

	Student(){
		add(new JLabel("�й� : "));
		id = new JTextField(25);
		add(id);
		
		add(new JLabel("�а� : "));
		dept = new JTextField(25);
		add(dept);
		
		add(new JLabel("�̸� : "));
		name = new JTextField(25);
		add(name);
		
		add(new JLabel("���� ���� : "));
		iKor = new JTextField(7);
		add(iKor);
		
		add(new JLabel("���� ���� : "));
		iEng = new JTextField(7);
		add(iEng);
		
		add(new JLabel("���� ���� : "));
		iMath = new JTextField(7);
		add(iMath);
		
		add(new JLabel("���� ���� : "));
		iSience = new JTextField(7);
		add(iSience);
		
//		String colName[] = {"�й�", "�а�", "�̸�", "����", "����", "����"};
		title.add("�й�");
		title.add("�а�");
		title.add("�̸�");
		title.add("����");
		title.add("����");
		title.add("����");
		title.add("����");
		
		model = new DefaultTableModel();
		
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 200));
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
				
				String sid = (String)model.getValueAt(table.getSelectedRow(), 0);
				id.setText(sid);
				String sdept = (String)model.getValueAt(table.getSelectedRow(), 1);
				dept.setText(sdept);
				String sname = (String)model.getValueAt(table.getSelectedRow(), 2);
				name.setText(sname);
				String siKor = (String)model.getValueAt(table.getSelectedRow(), 3);
				iKor.setText(siKor);
				String siEng = (String)model.getValueAt(table.getSelectedRow(), 4);
				iEng.setText(siEng);
				String siMath = (String)model.getValueAt(table.getSelectedRow(), 5);
				iMath.setText(siMath);
				String siSience = (String)model.getValueAt(table.getSelectedRow(), 6);
				iSience.setText(siSience);
			}
		});
		
		insertBtn = new JButton("�Է�");
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�й��� �Է��ϼ���.");
				} else if(dept.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�а��� �Է��ϼ���.");
				} else if(name.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�̸��� �Է��ϼ���.");
				} else if(iKor.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���������� �Է��ϼ���.");
				} else if(iEng.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���������� �Է��ϼ���.");
				} else if(iMath.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���������� �Է��ϼ���.");
				} else if(iSience.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���������� �Է��ϼ���.");
				} else {
					Info cInfo = new Info(id.getText(), dept.getText(), name.getText(), iKor.getText(), iEng.getText(), iMath.getText(), iSience.getText());
					m_Vector.add(cInfo);
					dataVector.clear();
					
					for(int i=0; i<m_Vector.size(); i++) {
						Info st = m_Vector.get(i);
						Vector<String> temp = new Vector<String>();
						temp.addElement(st.getId());
						temp.addElement(st.getDepartment());
						temp.addElement(st.getName());
						temp.addElement(st.getiKor());
						temp.addElement(st.getiEng());
						temp.addElement(st.getiMath());
						temp.addElement(st.getiSience());
						dataVector.addElement(temp);
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
				if(JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					Info st = new Info(id.getText(), dept.getText(), name.getText(), iKor.getText(), iEng.getText(), iMath.getText(), iSience.getText());
					m_Vector.setElementAt(st, table.getSelectedRow());
					
					Vector<String> temp = new Vector<String>();
					temp.addElement(id.getText());
					temp.addElement(dept.getText());
					temp.addElement(name.getText());
					temp.addElement(iKor.getText());
					temp.addElement(iEng.getText());
					temp.addElement(iMath.getText());
					temp.addElement(iSience.getText());
					
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
					m_Vector.remove(table.getSelectedRow());
					dataVector.clear();
					
					for(int i=0; i<m_Vector.size(); i++) {
						Info st = m_Vector.get(i);
						Vector<String> temp = new Vector<String>();
						temp.addElement(st.getId());
						temp.addElement(st.getDepartment());
						temp.addElement(st.getName());
						temp.addElement(st.getiKor());
						temp.addElement(st.getiEng());
						temp.addElement(st.getiMath());
						temp.addElement(st.getiSience());
						dataVector.addElement(temp);
					}
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		setSize(350, 480);
		setVisible(true);
	}

}
