package �����Ŭ����;

import java.util.Scanner;

public class ControlEx4 {

	public static void main(String[] args) {
		int user, com;
		
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.> ");
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp); //���ڿ��� ������ ��ȯ
		
		com = (int)(Math.random()*3+1); // 1,2,3�� �ϳ��� com�� ����
		
		System.out.println("�����  "+user+"�Դϴ�.");
		System.out.println("��ǻ�ʹ� "+com+"�Դϴ�.");
		
		switch(user-com) {
		case 0:
			System.out.println("�����ϴ�.");
			break;
		case 1:
		case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 2:
		case -1:
			System.out.println("����� �����ϴ�.");
			break;
		}

	}

}
