package ����_20171215;

import java.util.Scanner;

public class Project_20171215 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		1. ũ�Ⱑ 10�� �迭�� ���� 10���� ������ ���� ��ü �հ踦 ����Ͻÿ�.
		
		int i[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("�迭 ũ�� : "+i.length);
		int total = i[0]+i[1]+i[2]+i[3]+i[4]+i[5]+i[6]+i[7]+i[8]+i[9];
		System.out.print("�հ� : "+total);
		
//		2. ���� , ����, ���� ������ �迭�� �Է¹޾Ƽ� ����� �Ҽ���2�ڸ����� ���ؼ� ����Ͻÿ�.
		
		int score[] = new int[3];
		
		System.out.print("����, ����, ���� ������ ���ʷ� �Է��Ͽ� �ּ���. : ");
		score[0] = s.nextInt();
		score[1] = s.nextInt();
		score[2] = s.nextInt();
		
		int total2 = score[0]+score[1]+score[2];
		float avg = total2/3.0f;
		
		System.out.printf("����� : "+"%.2f \n", avg);
		
//		3. 3��3�� �迭�� ����
//		   �Ʒ�ó�� ����ϼ���.
//
//		   01 02 03
//
//		   04 05 06
//
//		   07 08 09
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.printf("%02d ", arr[0][0]);
		System.out.printf("%02d ", arr[0][1]);
		System.out.printf("%02d \n", arr[0][2]);
		System.out.printf("%02d ", arr[1][0]);
		System.out.printf("%02d ", arr[1][1]);
		System.out.printf("%02d \n", arr[1][2]);
		System.out.printf("%02d ", arr[2][0]);
		System.out.printf("%02d ", arr[2][1]);
		System.out.printf("%02d \n", arr[2][2]);
		
//		4. ȸ�������� ���ڿ� �迭�� �Է¹ް� ����غ�����.
//		   �̸�,�ּ�,����,����
		
		String member[] = new String[4];
		System.out.print("�̸��� �Է����ּ��� : ");
		member[0] = s.nextLine();
		System.out.print("�ּҸ� �Է����ּ��� : ");
		member[1] = s.nextLine();
		System.out.print("������ �Է����ּ��� : ");
		member[2] = s.nextLine();
		System.out.print("���̸� �Է����ּ��� : ");
		member[3] = s.nextLine();
		
		System.out.println("�̸� : "+member[0]);
		System.out.println("�ּ� : "+member[1]);
		System.out.println("���� : "+member[2]);
		System.out.println("���� : "+member[3]);
		
//		5. �������� �迭 ����Ͽ� 2���� �迭�� ����� 
//		   ����� �غ�����.
//		   10 11 12
//		   20 21
//		   30 31 32
//		   40 41
		
		int i2[][];
		i2 = new int[4][];
		i2[0] = new int[3];
		i2[1] = new int[2];
		i2[2] = new int[3];
		i2[3] = new int[2];
		
		i2[0][0] = 10;
		i2[0][1] = 11;
		i2[0][2] = 12;
		i2[1][0] = 20;
		i2[1][1] = 21;
		i2[2][0] = 30;
		i2[2][1] = 31;
		i2[2][2] = 32;
		i2[3][0] = 40;
		i2[3][1] = 41;
		
		System.out.printf("%2d ",i2[0][0]);
		System.out.printf("%2d ",i2[0][1]);
		System.out.printf("%2d \n",i2[0][2]);
		System.out.printf("%2d ",i2[1][0]);
		System.out.printf("%2d \n",i2[1][1]);
		System.out.printf("%2d ",i2[2][0]);
		System.out.printf("%2d ",i2[2][1]);
		System.out.printf("%2d \n",i2[2][2]);
		System.out.printf("%2d ",i2[3][0]);
		System.out.printf("%2d ",i2[3][1]);
		
	}

}
