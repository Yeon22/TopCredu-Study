package ���̳�;

import java.util.Scanner;

//��� �Ұ����� Ŭ����
//final class Person{
//	
//}

public class Example {

	public static void main(String[] args) {
//		final String name = "ȫ�浿";
//		final float pi = 3.14f;

		//���� �������� �Ǽ��� �Է� �޾� ���� �ѷ��� ���̿�
		//������ �Ҽ��� ��° �ڸ����� ����ϴ� ���α׷��� �ۼ��غ���
		Scanner sc = new Scanner(System.in);
		float radius; //������
		final float pi = 3.14f; //���̳�Ű����� ���� 	���
		float perimeter; //���� �ѷ�
		float area; // ���� ����
		
		System.out.print("�������� �Է��ϼ��� : ");
		radius = sc.nextFloat();
		
		perimeter = 2*pi*radius;
		area = pi*radius*radius;
		
		System.out.printf("���� �ѷ� : %.2f \n", perimeter);
		System.out.printf("���� ���� : %.2f", area);
	}

}
