package ��Ʈ�����������_20180108;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Graph extends JPanel {
	DefaultTableModel model;
	JTable table;
	
	Graph(){
		setLayout(null);
		
		JLabel S_dept = new JLabel("����");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"����", "����", "����"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 70, 20);
		add(Cb_dept);
		
		JLabel avg_graph = new JLabel("��� �׷���");
		avg_graph.setBounds(10, 50, 100, 20);
		add(avg_graph);
		
		JLabel com_dept = new JLabel("��ǻ�Ͱ��а�");
		com_dept.setBounds(10, 100, 80, 20);
		add(com_dept);
		
		JLabel kor_dept = new JLabel("������а�");
		kor_dept.setBounds(10, 140, 80, 20);
		add(kor_dept);
		
		JLabel tax_dept = new JLabel("����ȸ���");
		tax_dept.setBounds(10, 170, 80, 20);
		add(tax_dept);
		
		JLabel food_dept = new JLabel("��ǰ�����");
		food_dept.setBounds(10, 200, 80, 20);
		add(food_dept);
		
		JButton selectBtn = new JButton("��ȸ");
		selectBtn.setBounds(10, 250, 70, 20);
		add(selectBtn);
		
		setSize(490, 400);
		setVisible(true);
	}

}
