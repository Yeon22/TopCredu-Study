package ����_20171220;

import java.util.Scanner;

public class Project_20171220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//	 1. ũ�Ⱑ 10�� �迭�� ���� 10���� ������ ���� ��ü �հ踦 ����Ͻÿ�. for�� ���
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			sum += arr[i];
		}
		System.out.println("�հ� : "+sum);
		
		
//	 2. 1�������� ���� for������ ����Ͻÿ�.
		
		int myArr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum2=0;
		for(int i : myArr) {
			sum2 += i;
		}
		System.out.println("�հ� : "+sum2);
		
		
//	3. Ű�� ��Ƽ���� ������ �Է��ϼ���.
//		��� Ű�� m  cm �̽ñ���.
//		�Է� ���� ) 173
//		1m 73cm
		
		int m;
		System.out.print("����� Ű�� �Է����ּ���(����:180) : ");
		m = sc.nextInt();
		System.out.println("����� Ű�� "+m/100+"m "+m%100+"cm�̽ñ���.");
		
		
//	4. �¾�� ���ݱ��� ���� ���� �䰪�� �󸶳� �Ǵ��� ��� �ϴ� ���α׷��� �ۼ��ϼ���. 
//		���̴� ����ڷκ��� �Է� �ް� �Ϸ� 3�� �Ļ縦 �ϵ� �ѳ� �Ļ� 5õ������ ����ϼ���.
		
		int age = 0;
		int meal;
		System.out.print("����� ���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		meal = age*3*365*5000;
		System.out.print("����� ���ݱ��� ���� �䰪�� �� "+meal+" �Դϴ�.");
		
	}

}
