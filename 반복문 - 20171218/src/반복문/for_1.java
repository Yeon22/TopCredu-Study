package �ݺ���;

public class for_1 {

	public static void main(String[] args) {
		// for
		// for(�ʱⰪ; ���ǽ�; ������){
		// }
		// for ���� ������ ���ٱ��� ������ ź��.
		
//		for(int i=0; i<100; i++) {
//			System.out.println("�ȳ��ϼ���. i = "+i);
//		}
		
//		String str[] = {"��","��","��","��","��"};
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(str[i]);
//		}
		
		//for(1.�ʱ⹮;2.���ǽ�;3.�ݺ��ϱ����� ������)
		//1.for�� ������ �� ���� �ѹ��� ����Ǵ� �ʱ�ȭ �۾�
		//;���еǰ� �������� �Ʒ°���
		
//		for(int i=0,j=0; i<5; i++) {
//		}	
//		int i = 0;
//		for( ;i<10;i++) {
//			
//		}
		
		//2.���� ������ �� ���길 ����
		//�ݺ������� true�̸� �ݺ� ���, false�̸� ����
		//�ݺ� ������ true ����� ���, ���� �ݺ�
		//�ݺ� ������  ��� ������ true�� ����
		
//		for(int i=0; true; i++) {
//			System.out.println("���ѹݺ�");
//		}
//		
//		for(;;) {
//			System.out.println("���ѹݺ�");
//		}
		
		//3.�ݺ� �۾� ������� ���� �� ó�� �۾�
		//, �����ؼ� ���� ���� ���� ����
		
//		for(int i=0,j=0; i<5; i++,j=j+1) {
//			System.out.println("i = "+i+",j = "+j);
//		}
		
//		int sum=0;
//
//		for (int i=0; i<5; i++) {
//			sum = sum + i;
//		}
//		System.out.println("�հ� : "+sum);
		
//		for(int i=5; i>=1; i--) {
//			System.out.println("i = "+i);
//		}
		
//		int array[] = {1,2,3,4,5};
//		for(int i=0; i<5; i++) {
//			System.out.println("array = "+array[i]);
//		}
//		for(int i=4; i>=0; i--) {
//			System.out.println("array = "+array[i]);
//		}
		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		
		int array[][] = new int[3][3];
		int count = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array[i][j] = count++;
				System.out.println("array["+i+"]"+"["+j+"]="+array[i][j]);
			}
		}

	}

}
