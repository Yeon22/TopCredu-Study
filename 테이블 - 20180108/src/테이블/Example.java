package ���̺�;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Example extends JFrame {
	
	Example(){
		setTitle("���̺� ����");
		setSize(400, 400);
		
		String header[] = {"�л��̸�", "����", "����", "����"};
		String contents[][] = {
				{"�ڿ���", "90", "87", "98"},
				{"ȫ�浿", "100", "77", "66"},
				{"�̼���", "30", "25", "90"}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scrollpane = new JScrollPane(table);
		
//		2.���� �ٲٰ� �����´�.
		table.setValueAt("200", 1, 1);
		System.out.println(table.getValueAt(1, 1));
		
//		3.���� ��, ���� ��
		System.out.println(table.getRowCount());
		System.out.println(table.getColumnCount());
		
//		4.�÷� �̸� ��������
		System.out.println(table.getColumnName(0));
		System.out.println(table.getColumnName(1));
		
		add(scrollpane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Example();
	}

}
