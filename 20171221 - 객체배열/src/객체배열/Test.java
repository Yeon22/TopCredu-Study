package ��ü�迭;

import java.util.Scanner;

class Member{
	String name;
	String address;
	String job;
	int age;
	
	public void ShowInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);
		System.out.println("��    : "+job);
		System.out.println("���� : "+age);
	}
}

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Member MemArr[] = new Member[6];
		
		for(int i=0; i<MemArr.length; i++) {
			MemArr[i] = new Member();
			System.out.print("�̸��� �Է��ϼ��� : ");
			MemArr[i].name = s.next();
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			MemArr[i].address = s.next();
			System.out.print("�ϴ����� �Է��ϼ��� : ");
			MemArr[i].job = s.next();
			System.out.print("���̸� �Է��ϼ��� : ");
			MemArr[i].age = s.nextInt();
		}
		
		for(int i=0; i<MemArr.length;i++) {
			MemArr[i].ShowInfo();
		}

	}

}
