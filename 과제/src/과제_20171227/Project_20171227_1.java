package ����_20171227;

import javax.swing.JFrame;

public class Project_20171227_1 extends JFrame {
	public Project_20171227_1() {
//	1. ���� �׸��� ���� "Hello Embedded"��� ���ڿ��� 
//	Ÿ��Ʋ�� ������ �������� ũ�Ⱑ 400x200�� �������α׷��� �ۼ��϶�.
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_1();
	}

}
