package test3;

public class test2 {

	public static void main(String[] args) {
		
		//������
//		for(int i =2; i<10; i++)//i�� 2~9 (�տ����ü�)
//		{
//			for(int j =1; j<10;j++) //j�� 1~9(��)
//			{
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		//������ ����
//		for(int i =1; i<10; i++)//i�� 1~9 (�ڿ�������)
//		{
//			for(int j =2; j<10;j++) //j�� 2~9(��)
//			{
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		
//		*
//		**
//		***
//		****
//		*****		
		
//		for(int i=0; i<5; i++) {
//			for(int j=0;j<5;j++) {
//				if(i>=j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		for(int i=0; i<5; i++) {
//			for(int j=0;j<5;j++) {
//				if(i<=j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		

//		*****
//		****
//		***
//		**
//		*
		
		
//		for(int i=0; i<5; i++) {
//			for(int j=0;j<5;j++) {
////				System.out.printf("%d%d ",i,j);
//				if(i+j<=4)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}	
		
		
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
	 
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
//				System.out.printf("%d%d ",i,j);
				if(i+j>=4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
		

	}

}
