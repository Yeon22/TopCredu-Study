package ����_20171214;

import java.util.Scanner;

public class Project_20171214_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
//		5�� ����
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int total = 0;
//		float avg = 0.0f;
//		
//		System.out.print("���� ���� : ");
//		kor = s.nextInt();
//		System.out.print("���� ���� : ");
//		eng = s.nextInt();
//		System.out.print("���� ���� : ");
//		math = s.nextInt();
//		
//		total = kor+eng+math;
//		System.out.println("���� : "+total);
//		avg = (float)total/3;
//		System.out.println("��� : "+avg);
//		
//		switch((int)avg/10) {
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
		
		
//		6�� ����
//		int first = 0;
//		int second = 0;
//		String operator = "";
//		
//		System.out.print("�� ���� ���ڸ� �Է��ϼ���. : ");
//		first = s.nextInt();
//		second = s.nextInt();
//		
//		System.out.print("�����ڸ� �Է��ϼ���. : ");
//		operator = s.next();
//		
//		if(operator.equals("+")) {
//			System.out.println("��� : "+first+operator+second+" = "+(first+second)+" �Դϴ�.");
//		} else if(operator.equals("-")) {
//			System.out.println("��� : "+first+operator+second+" = "+(first-second)+" �Դϴ�.");
//		} else if(operator.equals("*")) {
//			System.out.println("��� : "+first+operator+second+" = "+(first*second)+" �Դϴ�.");
//		} else if(operator.equals("/")) {
//			System.out.println("��� : "+first+operator+second+" = "+(first/second)+" �Դϴ�.");
//		} else {
//			System.out.println("�����ڸ� �� �� �Է��Ͽ����ϴ�.");
//		}

		
//		7�� ����
		int first2 = 0;
		int second2 = 0;
		String operator2 = "";
		
		System.out.print("�� ���� ���ڸ� �Է��ϼ���. : ");
		first2 = s.nextInt();
		second2 = s.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ���. : ");
		operator2 = s.next();
		
		switch(operator2) {
		case "+":
			System.out.println("��� : "+first2+operator2+second2+" = "+(first2+second2)+" �Դϴ�.");
			break;
		case "-":
			System.out.println("��� : "+first2+operator2+second2+" = "+(first2-second2)+" �Դϴ�.");
			break;
		case "*":
			System.out.println("��� : "+first2+operator2+second2+" = "+(first2*second2)+" �Դϴ�.");
			break;
		case "/":
			System.out.println("��� : "+first2+operator2+second2+" = "+(first2/second2)+" �Դϴ�.");
			break;
		default:
			System.out.println("�����ڸ� �� �� �Է��Ͽ����ϴ�.");
			break;
		}
	}

}
