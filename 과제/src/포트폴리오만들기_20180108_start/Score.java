package ��Ʈ�����������_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score extends JPanel {
	Vector<Object> dataVector = new Vector<Object>();
	Vector<String> title = new Vector<String>();
	DefaultTableModel model;
	JTable table;
	
	Score(){
		setLayout(null);
		
		JLabel S_dept = new JLabel("�а�");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"��ü", "��ǻ�Ͱ��а�", "��Ƽ�̵���", "����ȸ���", "�������"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 120, 20);
		add(Cb_dept);
		
		title.add("�й�");
		title.add("�̸�");
		title.add("�������");
		title.add("��������");
		title.add("��������");
		
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 40, 460, 250);
		add(scrollpane);
		
		JButton selectBtn = new JButton("��ȸ");
		selectBtn.setBounds(10, 300, 70, 20);
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Cb_dept.getSelectedIndex();
				String Cb_name = Cb_dept.getItemAt(index).toString();
				
				if(Cb_name.equals("��ǻ�Ͱ��а�")) {
					
				} else if(Cb_name.equals("��Ƽ�̵���")) {
					
				} else if(Cb_name.equals("����ȸ���")) {
					
				} else if(Cb_name.equals("�������")) {
					
				} else {
					for(int i =0; i< Student.m_Vector.size(); i++) {
						Info fo = Student.m_Vector.get(i);
						Vector<String> temp = new Vector<String>();
						temp.addElement(fo.getId());
						temp.addElement(fo.getName());
						temp.addElement(fo.getattend());
						temp.addElement(fo.geta_exam());
						temp.addElement(fo.getattitude());
						dataVector.addElement(temp);
					}
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
