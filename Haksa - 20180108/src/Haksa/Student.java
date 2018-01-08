package Haksa;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		String colName[] = {"�̸�", "�й�", "�а�", "�ּ�"};
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
		
		setSize(300, 420);
		setVisible(true);
	}

}
