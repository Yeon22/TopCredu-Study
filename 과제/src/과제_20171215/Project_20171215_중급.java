package ����_20171215;

import java.util.Scanner;

public class Project_20171215_�߱� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1.������ ������ �迭�� �Է¹޾Ƽ� ū���� ����Ͻÿ�.
		int arr[] = new int[3];
		int max = 0;
		System.out.print("�� ���� ������ ���ʷ� �Է��ϼ���. : ");
		int num1 = arr[0] = s.nextInt();
		int num2 = arr[1] = s.nextInt();
		int num3 = arr[2] = s.nextInt();
		if(num1 > num2 && num1 > num3) {
			max = num1;
		} else if(num2 > num1 && num2 > num3) {
			max = num2;
		} else if(num3 > num1 && num3 > num2) {
			max = num3;
		}
		System.out.println("���� ū ���� : "+max+" �Դϴ�.");
		
//		2.������ ������ �迭�� �Է¹޾Ƽ� �������� ����Ͻÿ�.
		int arr2[] = new int[3];
		int min = 0;
		System.out.print("�� ���� ������ ���ʷ� �Է��ϼ���. : ");
		int num4 = arr2[0] = s.nextInt();
		int num5 = arr2[1] = s.nextInt();
		int num6 = arr2[2] = s.nextInt();
		if(num4 < num5 && num4 < num6) {
			min = num4;
		} else if(num5 < num4 && num5 < num6) {
			min = num5;
		} else if(num6 < num4 && num6 < num5) {
			min = num6;
		}
		
		System.out.println("���� ���� ���� : "+min+" �Դϴ�.");
		
//		3. ���� �迭�� �̿��ؼ� 'h','e','l','l','o' �� �ʱ�ȭ �ϼ���.
//		 �� �� int�� �迭 5���� ���ڸ� �Է� �޽��ϴ�.
//		 �Է��� ���ڷ� �̾ �޽��ϴ�.
//		 �ϴ�ó�� ����� ���ü� �ְ� �˰����� �ۼ��մϴ�.
//		  ex)
//		���ڴټ����� �Է��ϼ��� : 0 1 2 3 4
//		��� : hello
//		���ڴټ����� �Է��ϼ��� : 2 3 0 1 4
//		��� : llheo 
//		���ڴټ����� �Է��ϼ��� : 4 3 2 1 1
//		��� : ollee
		
		char str[] = {'h','e','l','l','o'};
		int ii[] = new int[5];
		System.out.print("���� 5���� ���ʷ� �Է����ּ���. : ");
		int n1 = ii[0] = s.nextInt();
		int n2 = ii[1] = s.nextInt();
		int n3 = ii[2] = s.nextInt();
		int n4 = ii[3] = s.nextInt();
		int n5 = ii[4] = s.nextInt();
		
		System.out.print("��� : "+str[n1]+str[n2]+str[n3]+str[n4]+str[n5]);
		
	}

}
