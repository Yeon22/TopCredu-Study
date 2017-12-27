package ����_20171227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Project_20171227_6 extends JFrame {
//	6. �л������� ����, ����,���� ������ �Է¹��� �� �ְ� UI�� �����ϰ�
//		���� ��ư�� ���� ��ư�� ������ ��������� ����
//		90~100 A���� ǥ��
//		80~89  B���� ǥ��
//		70~79  C���� ǥ��
//		60~69  D���� ǥ��
//		60�̸� F���� ǥ�� 
	
	public Project_20171227_6() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel iKor = new JLabel("���� ����");
		iKor.setLocation(75,30);
		iKor.setSize(100,20);
		add(iKor);
		JTextField iKor2 = new JTextField("");
		iKor2.setLocation(205, 30);
		iKor2.setSize(100, 20);
		add(iKor2);
		
		JLabel iEng = new JLabel("���� ����");
		iEng.setLocation(75,60);
		iEng.setSize(100,20);
		add(iEng);
		JTextField iEng2 = new JTextField("");
		iEng2.setLocation(205,60);
		iEng2.setSize(100, 20);
		add(iEng2);
		
		JLabel iMath = new JLabel("���� ����");
		iMath.setLocation(75,90);
		iMath.setSize(100,20);
		add(iMath);
		JTextField iMath2 = new JTextField("");
		iMath2.setLocation(205,90);
		iMath2.setSize(100, 20);
		add(iMath2);

		JLabel Score = new JLabel();
		Score.setBounds(130, 170, 150, 90);
		add(Score);
		
		JButton ScoreBtn = new JButton("���� ���");
		ScoreBtn.setLocation(150, 140);
		ScoreBtn.setSize(95, 28);
		add(ScoreBtn);
		
		ScoreBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iKor_ck = Integer.parseInt(iKor2.getText());
				int iEng_ck = Integer.parseInt(iEng2.getText());
				int iMath_ck = Integer.parseInt(iMath2.getText());
				
				int total = iKor_ck+iEng_ck+iMath_ck;
				float avg = total/3.0f;
				
				switch((int)avg/10) {
				case 10:
				case 9:
					Score.setText("����� ������ : A �Դϴ�.");
					break;
				case 8:
					Score.setText("����� ������ : B �Դϴ�.");
					break;
				case 7:
					Score.setText("����� ������ : C �Դϴ�.");
					break;
				case 6:
					Score.setText("����� ������ : D �Դϴ�.");
					break;
				default:
					Score.setText("����� ������ : F �Դϴ�.");
					break;
				}
			}
		});
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_6();
	}

}
