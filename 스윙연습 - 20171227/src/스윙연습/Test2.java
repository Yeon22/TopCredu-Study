package ��������;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test2 extends JFrame {
	Test2(){
		Calendar now = Calendar.getInstance(); //getInstance()�ȿ� new�� �־ �̷��� ��ü�� �����.
		
		setTitle("����ð� ���ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		// 0~24�� ǥ��
		int hour = now.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		JLabel jl = new JLabel();
		jl.setBounds(100,100,100,30);
		if(hour>=0 && hour<12) {
			jl.setText("�����Դϴ�.");
		} else if(hour>=12 && hour<19) {
			jl.setText("�����Դϴ�.");
		} else if(hour>18) {
			jl.setText("�����Դϴ�.");
		} else {
			jl.setText("�𸣰ڴ�.");
		}
		
		add(jl);
		setSize(400,400);
		setResizable(false); // âũ�Ⱑ �����˴ϴ�.
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}

}
