package ��Ʈ�����������_20180108;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score extends JPanel {
	DefaultTableModel model;
	JTable table;
	
	Score(){
		setLayout(null);
		
		JLabel S_dept = new JLabel("�а�");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"��ǻ�Ͱ��а�", "������а�", "����ȸ���", "��ǰ�����"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 120, 20);
		add(Cb_dept);
		
		String colName[] = {"�̸�", "����", "����", "����", "�հ�", "���"};
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 40, 460, 250);
		add(scrollpane);
		
		JButton selectBtn = new JButton("��ȸ");
		selectBtn.setBounds(10, 300, 70, 20);
		add(selectBtn);
		
		setSize(490, 400);
		setVisible(true);
	}

}
