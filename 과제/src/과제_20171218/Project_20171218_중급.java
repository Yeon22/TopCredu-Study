package ����_20171218;

public class Project_20171218_�߱� {

	public static void main(String[] args) {
//		1. �������� ����� 
//		2 x 1 = 1 2 x 2 = 4 .......2 x 9 = 18
//		3 x 1 = 3 3 x 2 = 6 ......
//		4 x 1 = 4 4 x 2 = 8 ......
//		����� ���η� ������ּ���.	
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+" x "+j+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		
//		2. 1~20���� 5�� ����� ����ϱ� for��
		for(int i=1; i<21; i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		
//		3. �������� ���η� ����ϱ� �׸�����!
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+" x "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		

//		4.������ ���� ���·� ����Ͻÿ�.���� for�� ���
//		*
//		**
//		***
//		****
//		*****


//		*****
//		****
//		***
//		**
//		*
		
		
// 	      *
//  	 **
//  	***
//     ****
//	  *****
//
//
//	  *****
// 	   ****
//      ***
//   	 **
//        *

		

	}

}
