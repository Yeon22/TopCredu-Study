package ����_20171214;

import java.util.Scanner;

public class Project_20171214_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		1�� ����
//		int grades = 0;
//		System.out.print("���� : ");
//		grades = s.nextInt();
//		
//		if (grades>=90 && grades<=100) {
//			System.out.println("A");
//		} else if(grades>=80 && grades<=89) {
//			System.out.println("B");
//		} else if(grades>=70 && grades<=79) {
//			System.out.println("C");
//		} else if(grades>=60 && grades<=69) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		
//		2������
//		String fruit = "";
//		System.out.print("���� : ");
//		fruit = s.nextLine();
//		switch(fruit) {
//		case "���":
//			System.out.println("1000��");
//			break;
//		case "��":
//			System.out.println("2000��");
//			break;
//		case "����":
//			System.out.println("500��");
//			break;
//		case "��":
//			System.out.println("300��");
//			break;
//		}
		
		
//		3������
//		String fruit2 = "";
//		System.out.print("���� : ");
//		fruit2 = s.nextLine();
//		int count = 0;
//		System.out.print("���� : ");
//		count = s.nextInt();
//		switch(fruit2) {
//		case "���":
//			System.out.println(count*1000+"���Դϴ�.");
//			break;
//		case "��":
//			System.out.println(count*2000+"���Դϴ�.");
//			break;
//		case "����":
//			System.out.println(count*500+"���Դϴ�.");
//			break;
//		case "��":
//			System.out.println(count*300+"���Դϴ�.");
//			break;
//		}
		
		
//		4������
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0.0f;
		
		System.out.print("���� ���� : ");
		kor = s.nextInt();
		System.out.print("���� ���� : ");
		eng = s.nextInt();
		System.out.print("���� ���� : ");
		math = s.nextInt();
		
		total = kor+eng+math;
		System.out.println("���� : "+total);
		avg = total/3.0f;
		System.out.println("��� : "+avg);
		
		if(avg>=90 && avg<=100) {
			System.out.println("A");
		} else if(avg>=80 && avg<=89) {
			System.out.println("B");
		} else if(avg>=70 && avg<=79) {
			System.out.println("C");
		} else if(avg>=60 && avg<=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
