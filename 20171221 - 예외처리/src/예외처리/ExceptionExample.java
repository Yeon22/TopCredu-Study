package ����ó��;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		//���� (Exception)
		//���� �� �߻��ϴ� ������ �����Ϸ��� �� �� ����
		//�ڹٿ����� ���� �� �߻��ϴ� ������ ���ܷ� ó��
		//try ~catch ~finally
		//�������α׷����� ���ܸ� ó������ ������
		//���ܰ� �߻��� ���α׷��� ���� ����
		
		Scanner rd = new Scanner(System.in);
		
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��ϼ��� : ");
		dividend = rd.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		divisor = rd.nextInt();
		
		try {
		System.out.println(dividend+"�� "+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�.");
		} 
		catch(ArithmeticException e) //ArithmeticException e : ������ 0���� ���� ��
		{ 
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		//����ó����
		//try-catch-finally��
		
//		try {
//			���ܰ� �߻��� ���ɼ��� �ִ� ���๮(try���)
//		} 
//		catch(ó���� ���� Ÿ�� ����) {
//			���� ó����(catch ���)
//		}
//		finally {
//			���� �߻� ���ο� ������� ������ ����Ǵ� ����
//			(��������)
//		}

	}

}
