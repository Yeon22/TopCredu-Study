package test4;

import java.util.Scanner;

public class Member {
	//�߱�
	//5. MemberŬ������ ����ÿ�.
	//������� : name, address, job, age
	//����Լ� : showInfo() - ��ü ������ ���
	
	String name;
	String address;
	String job;
	int age;
	Scanner s = new Scanner(System.in);
	
	void Input() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = s.nextLine();
		System.out.print("�ּ��� �Է��ϼ��� : ");
		address = s.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		job = s.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		age = s.nextInt();
	}
	
	void ShowInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);
		System.out.println("�� : "+job);
		System.out.println("���� : "+age);
	}
	
	
}
