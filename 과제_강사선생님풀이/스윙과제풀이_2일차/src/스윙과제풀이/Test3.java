package ��������Ǯ��;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//	6. �л������� ����, ����,���� ������ �Է¹��� �� �ְ� UI�� �����ϰ�
//	���� ��ư�� ���� ��ư�� ������ ��������� ����
//	90~100 A���� ǥ��
//	80~89  B���� ǥ��
//	70~79  C���� ǥ��
//	60~69  D���� ǥ��
//	60�̸� F���� ǥ�� 

public class Test3 extends JFrame{
	JTextField Kor;
	JTextField Eng;
	JTextField Math;
	JButton ResultBtn;
	JLabel Result;
	
	Test3(){
		setTitle("�л�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(new JLabel("���� : "));
		Kor = new JTextField(20);
		add(Kor);
		
		add(new JLabel("���� : "));
		Eng = new JTextField(20);
		add(Eng);
		
		add(new JLabel("���� : "));
		Math = new JTextField(20);
		add(Math);
		
		ResultBtn = new JButton("                     �������ϱ�                              ");
		
		ResultBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				int iKor = Integer.parseInt(Kor.getText());
				int iEng = Integer.parseInt(Eng.getText());
				int iMath = Integer.parseInt(Math.getText());
				
				float fAvg = (float)(iKor+iEng+iMath)/3.0f;
				
				if(fAvg >=90 && fAvg <=100) {
					Result.setText("A�����Դϴ�.");
				} else if(fAvg >=80 && fAvg <90) {
					Result.setText("B�����Դϴ�.");
				} else if(fAvg >=70 && fAvg <80) {
					Result.setText("C�����Դϴ�.");
				} else if(fAvg >=60 && fAvg <70) {
					Result.setText("D�����Դϴ�.");
				} else {
					Result.setText("F�����Դϴ�.");
				}
				
			}
		});
		
		add(ResultBtn);
		
		Result = new JLabel("���");
		add(Result);
		
		setSize(300,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test3();
	}

}
