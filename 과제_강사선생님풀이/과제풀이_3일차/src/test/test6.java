package test;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		//�����ϳ��� �Է��� �޾Ƽ�
		//���׿����ڸ� ����ؼ�
		//Ȧ���� ¦���� �Ǻ� 
		//¦�̸� true   ¦�Դϴ�. 
		//false  Ȧ�Դϴ�.
		Scanner s = new Scanner(System.in);
		int a =0;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		a = s.nextInt();
		//���׿�����
		String str = (a%2==0) ? "¦���Դϴ�.":"Ȧ���Դϴ�.";
		System.out.println(str);

	}

}
