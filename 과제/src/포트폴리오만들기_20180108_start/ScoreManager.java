package ��Ʈ�����������_20180108_start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ScoreManager extends JFrame {
	JPanel panel = new JPanel();
	
	ScoreManager(){
		setTitle("���������ý���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu student = new JMenu("�л�����");
		menubar.add(student);
		JMenu score = new JMenu("��������");
		menubar.add(score);
		
		JMenuItem student_info = new JMenuItem("�л�����");
		student.add(student_info);
		JMenuItem score_info = new JMenuItem("������Ȳ");
		score.add(score_info);
		
		student_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Student());
				panel.setLayout(null);
			}
		});
		
		score_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Score());
				panel.setLayout(null);
			}
		});
		
		add(panel);
		setJMenuBar(menubar);
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScoreManager();
	}

}
