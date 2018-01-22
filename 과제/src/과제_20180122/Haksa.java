package ����_20180122;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Haksa extends JFrame {
	Connection conn;
	JPanel panel;
	
	Haksa(){
		setTitle("�л�����ý���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu m_student = new JMenu("�л�����"); //�޴�
		bar.add(m_student);
		JMenu m_book = new JMenu("��������"); //2��° �޴�
		bar.add(m_book);
		
		JMenuItem mi_list = new JMenuItem("�л�����");
		m_student.add(mi_list);
		JMenuItem mi_bookRent = new JMenuItem("������Ȳ");
		m_book.add(mi_bookRent);
		
		//�޴������� �̺�Ʈó��
		mi_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //��� ������Ʈ ����
				panel.revalidate(); //�ٽ� Ȱ��ȭ
				panel.repaint(); //�ٽ� �׸���
				panel.add(new Student()); //�л������� ���� ȭ���� ������ Ŭ������ ����
				panel.setLayout(null); //���̾ƿ� ���� ����.
			}
		});
		
		//������Ȳ ������ �̺�Ʈ ó��
		mi_bookRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //��� ������Ʈ ����
				panel.revalidate(); //�ٽ� Ȱ��ȭ
				panel.repaint(); //�ٽ� �׸���
				panel.add(new Book()); //������Ȳ�� ���� ȭ���� ������ Ŭ������ ����
				panel.setLayout(null); //���̾ƿ� ���� ����.
			}
		});
		
		panel = new JPanel();
		add(panel);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					if(conn!=null) {
						conn.close();
					}
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		setJMenuBar(bar);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();
	}

}
