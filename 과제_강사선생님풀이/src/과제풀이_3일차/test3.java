package ����Ǯ��_3����;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
//		1. ����, ����, ���� ������ �Է¹ް� ������ ����ϼ���.
//		2. ����, ����, ���� ������ �Է¹ް� ����� ����ϼ���. 
//		 (�Ҽ������� ��Ȯ�� ���� ���ü� �ְ� �غ�����.)
		Scanner s = new Scanner(System.in);
		int iKor = 0;
		int iEng = 0;
		int iMath = 0;
		int iTotal = 0;
		float fAvg = 0.0f;
		
		System.out.print("���� ���� ���� : ");
		iKor = s.nextInt();
		iEng = s.nextInt();
		iMath= s.nextInt();
		System.out.println("���� : "+iKor+"���� : "+iEng+"���� : "+iMath);
		iTotal = iKor + iEng + iMath;
		System.out.println("���� : "+iTotal);
		fAvg  = iTotal/3.0f;
		System.out.println("��� : "+fAvg);
		//�����ٰ� �̾...
		
	}

}
