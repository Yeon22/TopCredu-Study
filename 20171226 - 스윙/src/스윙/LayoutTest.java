package ����;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutTest extends JFrame {
	LayoutTest(){
		setTitle("None Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		// 85*20
		JLabel l = new JLabel("����");
//		l.setLocation(85,20);
//		l.setSize(50,20);
		l.setBounds(85, 20, 50, 20);
		add(l);
		
		// 85*42
		JButton b = new JButton("None"); //��ư
		b.setLocation(85, 42); //��ǥ
		b.setSize(100,20); //������
		add(b); //���̱�
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LayoutTest();

	}

}
