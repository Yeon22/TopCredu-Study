package ��Ʈ�����������_20180108;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JPanel {
	
	Student(){
		JTextField id;
		JTextField dept;
		JTextField name;
		JTextField iKor;
		JTextField iEng;
		JTextField iMath;
		JButton insertBtn;
		JButton updateBtn;
		JButton deleteBtn;
		
		add(new JLabel("�й� : "));
		id = new JTextField(20);
		add(id);
		
		add(new JLabel("�а� : "));
		dept = new JTextField(20);
		add(dept);
		
		add(new JLabel("�̸� : "));
		name = new JTextField(20);
		add(name);
		
		add(new JLabel("���� ���� : "));
		iKor = new JTextField(20);
		add(iKor);
		
		add(new JLabel("���� ���� : "));
		iEng = new JTextField(20);
		add(iEng);
		
		add(new JLabel("���� ���� : "));
		iMath = new JTextField(20);
		add(iMath);
		
		String colName[] = {"�й�", "�а�", "�̸�", "����", "����", "����"};
		DefaultTableModel model = new DefaultTableModel(colName,0);
		
		JTable table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(250, 200));
		add(new JScrollPane(table));
		
		insertBtn = new JButton("�Է�");
		add(insertBtn);
		
		updateBtn = new JButton("����");
		add(updateBtn);
		
		deleteBtn = new JButton("����");
		add(deleteBtn);
		
		setSize(300, 480);
		setVisible(true);
	}

}
