package ����_20171213;

import java.util.Scanner;

public class Project_20171213_1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner p1 = new Scanner(System.in);
		Scanner p2 = new Scanner(System.in);
		System.out.println("���ڸ� 2�� �Է����ּ���.");
		a = p1.nextInt();
		b = p2.nextInt();
		System.out.println("�� ���� ���� ���� = "+(a+b)+" �Դϴ�.");

		System.out.println("�� ���� �� ���� = "+(a-b)+" �Դϴ�.");
		
		System.out.println("�� ���� ���� ���� = "+(a*b)+" �Դϴ�.");

		System.out.println("�� ���� ���� ���� = "+(a/b)+" �Դϴ�.");

		System.out.println("�� ���� ���� ������ ���� = "+(a%b)+" �Դϴ�.");
	}

}
