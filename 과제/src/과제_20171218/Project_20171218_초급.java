package ����_20171218;

public class Project_20171218_�ʱ� {

	public static void main(String[] args) {
		// 1. for���� �̿��ؼ� 1���� 10���� ���� ����Ͻÿ�.
		for(int i=1; i<=10; i++) {
			System.out.println("i = "+i);
		}
		
		// 2. while���� �̿��ؼ� 1���� 10���� ���� ���� ����Ͻÿ�.
		int i=1;
		int sum = 0;
		while(i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("�հ� : " + sum);
		
		// 3 . do-while���� �̿��ؼ� 0���� 9������ ���� ����ϼ���.
//		int i = 0;
//		do {
//			System.out.println("i = "+i);
//			i++;
//		}while(i<10);
		
		// 4. 1���� 100���� ¦���� ����Ͻÿ�.
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		// 5. 0���� 99���� Ȧ���� ����Ͻÿ�.
//		for(int i=0; i<100; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}

	}

}
