package �ݺ�����Ŭ����;

import java.util.Scanner;

public class Loop {
	Scanner s = new Scanner(System.in);
	
	//5���� �л��� �������� �������� ���������� �Է¹ޱ�
	int iKor = 0;
	int iEng = 0;
	int iMath = 0;
	
	//�Է��� �̷����� �޼ҵ�
	void Score() {
			System.out.print("�������� : ");
			iKor = s.nextInt();
			System.out.print("�������� : ");
			iEng = s.nextInt();
			System.out.print("�������� : ");
			iMath = s.nextInt();
	}
	
	//���
	void ScorePrint() {
		System.out.println("�������� : "+iKor);
		System.out.println("�������� : "+iEng);
		System.out.println("�������� : "+iMath);
	}

}
