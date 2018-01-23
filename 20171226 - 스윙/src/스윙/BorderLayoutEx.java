package ����;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(10,10));
		
		//���� �ٿ���
		add(new JButton("add"),BorderLayout.NORTH);
		//�ǹؿ� �ٿ���
		add(new JButton("sub"),BorderLayout.SOUTH);
		//�����ʿ� �ٿ���
		add(new JButton("mul"),BorderLayout.EAST);
		//���ʿ� �ٿ���
		add(new JButton("div"),BorderLayout.WEST);
		//���� �߾ӿ� �ٿ���
		add(new JButton("Calculate"),BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
