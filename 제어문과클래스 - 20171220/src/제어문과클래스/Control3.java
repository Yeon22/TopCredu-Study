package �����Ŭ����;

import java.util.Scanner;

public class Control3 {
	char gender;
	String regNo = "";
	Scanner scanner = new Scanner(System.in);
	
	//�޼ҵ�
	void Jumin() {
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1112248)> ");
		
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
			break;
		}
	}

}
