package ����_20171212;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//���� �ϳ��� �Է��� �޾Ƽ� ���� �����ڸ� ����ؼ�
		//Ȧ���� ¦���� �Ǻ�
		//¦�̸� true	¦�Դϴ�.
		//Ȧ�̸� false	Ȧ�Դϴ�.
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		System.out.print("���ڸ� �Է��� �ּ���.");
		a = s.nextInt();
		String str = (a%2 == 0)?"¦���Դϴ�.":"Ȧ���Դϴ�.";
		
		System.out.println(str);

	}

}
