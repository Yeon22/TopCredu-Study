package ����_20171227;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Project_20171227_2 extends JFrame {
	public Project_20171227_2() {
//	2. BoaderLayout�� ����Ͽ� ������Ʈ ������ ���򰣰��� 5�ȼ�, 
//	���������� 7�ȼ��� �ǵ��� ���� �׸��� ���� ���� �������α׷��� �ۼ��϶�
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(5,7));
		
		add(new JButton("NORTH"),BorderLayout.NORTH);
		add(new JButton("SOUTH"),BorderLayout.SOUTH);
		add(new JButton("EAST"),BorderLayout.EAST);
		add(new JButton("WEST"),BorderLayout.WEST);
		add(new JButton("CENTER"),BorderLayout.CENTER);
		
		setSize(400, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Project_20171227_2();
	}

}
