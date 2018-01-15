package 포트폴리오만들기_20180108;

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
	String id;
	String department;
	String name;
	String iKor;
	String iEng;
	String iMath;
	
	public Info(String id, String department, String name, String iKor, String iEng, String iMath) {
		super();
		this.id = id;
		this.department = department;
		this.name = name;
		this.iKor = iKor;
		this.iEng = iEng;
		this.iMath = iMath;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getName() {
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
}


public class Student extends JPanel {
	
	public static Vector<Info> m_Vector = new Vector<Info>();
	Vector<String> title = new Vector<String>();
	Vector<Object> dataVector = new Vector<Object>();
	
	JTextField id;
	JTextField dept;
	JTextField name;
	JTextField iKor;
	JTextField iEng;
	JTextField iMath;
	JButton insertBtn;
	JButton updateBtn;
	JButton deleteBtn;
	
	DefaultTableModel model;
	JTable table;

	Student(){
		add(new JLabel("학번 : "));
		id = new JTextField(25);
		add(id);
		
		add(new JLabel("학과 : "));
		dept = new JTextField(25);
		add(dept);
		
		add(new JLabel("이름 : "));
		name = new JTextField(25);
		add(name);
		
		add(new JLabel("국어 점수 : "));
		iKor = new JTextField(7);
		add(iKor);
		
		add(new JLabel("영어 점수 : "));
		iEng = new JTextField(7);
		add(iEng);
		
		add(new JLabel("수학 점수 : "));
		iMath = new JTextField(7);
		add(iMath);
		
		title.add("학번");
		title.add("학과");
		title.add("이름");
		title.add("국어");
		title.add("영어");
		title.add("수학");
		
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
			}
		});
		
		insertBtn = new JButton("입력");
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "학번을 입력하세요.");
				} else if(dept.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "학과를 입력하세요.");
				} else if(name.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "이름을 입력하세요.");
				} else if(iKor.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "국어점수를 입력하세요.");
				} else if(iEng.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "영어점수를 입력하세요.");
				} else if(iMath.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "수학점수를 입력하세요.");
				} else {
					Info cInfo = new Info(id.getText(), dept.getText(), name.getText(), iKor.getText(), iEng.getText(), iMath.getText());
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
						dataVector.addElement(temp);
					}
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "수정하시겠습니까?", "수정", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					Info st = new Info(id.getText(), dept.getText(), name.getText(), iKor.getText(), iEng.getText(), iMath.getText());
					m_Vector.setElementAt(st, table.getSelectedRow());
					
					Vector<String> temp = new Vector<String>();
					temp.addElement(id.getText());
					temp.addElement(dept.getText());
					temp.addElement(name.getText());
					temp.addElement(iKor.getText());
					temp.addElement(iEng.getText());
					temp.addElement(iMath.getText());
					
					dataVector.setElementAt(temp, table.getSelectedRow());
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		deleteBtn = new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
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
