package ����_20171220;

import java.util.Scanner;

public class Member {
	
//	5. MemberŬ������ ����ÿ�.
//	������� : name, address, job, age
//	����Լ� : showInfo() - ��ü ������ ���
	
	String name;
	String address;
	String job;
	int age;
	
	void showInfo() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(job);
		System.out.println(age);
	}
	
//	7. 4��Ŭ������ �̿��ؼ� �̸�,�ּ�,����,���̸� Ű����� �Է¹޴�
//	�Լ��� ����ϴ� �Լ��� ���� ����ϼ���.
	Scanner s = new Scanner(System.in);
	
	void Input() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = s.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = s.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		job = s.next();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		address = s.next();
	}
	
	void Output() {
		System.out.println("�̸��� : "+name);
		System.out.println("�ּҴ� : "+address);
		System.out.println("������ : "+job);
		System.out.println("���̴� : "+age);
	}

}
