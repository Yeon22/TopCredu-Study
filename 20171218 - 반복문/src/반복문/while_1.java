package �ݺ���;

public class while_1 {

	public static void main(String[] args) {
		// while(���ǹ�){
		//		�۾��� ����
		// }
		
//		int i=0;
//		
//		while(i<5) {
//			System.out.println("�ȳ��ϼ���. i = "+i);
//			i++;
//		}
		
//		int i=0;
//		boolean flag = true;
//		while(true) { 
//			i++;
//			if(i==10) {
////				flag = false;
//				break;
//			}
//			System.out.println("�ȳ��ϼ���.");
//		}
		
//		int i=0;
//		int sum=0;
//		
//		while(i<5) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("�հ� : "+sum);
		
		
//		do {
//			
//		} while(���ǽ�);
		
//		boolean flag = false;
//		while(flag) {
//			System.out.println("�ȳ��ϼ���.");
//		}
		
//		int i=0;
//		do {
//			System.out.println("�ȳ��ϼ���."+i);
//			i++;
//		} while(i<5);
		
		
		//break; �ݺ������� Ż���ϴ� ��ɾ�
//		for(int i=0; i<10; i++) {
//			if(i==3) {
//				System.out.println("3�� �� ����");
//				break;
//			}
//			System.out.println("�ȳ��ϼ���."+i);
//		}
		
//		int i=0;
//		while(i<10) {
//			if(i==3) {
//				System.out.println("3�� �� ����");
//				break;
//			}
//			System.out.println("�ȳ��ϼ���.");
//			i++;
//		}
		
		
		//continue ������ �ݺ��� ó������ �ǵ��ư���.
//		for(int i=0; i<10; i++) {
//			if(i == 3) {
//				continue;
//			}
//			System.out.println("i = "+i);
//		}
		
		
		//�󺧷� �б��ϴ� ���
		//continue ��;
		//Ư¡�� Ư�� ���� ���� �ݺ����� �б�
		//��ø �ݺ����� �ٱ��� �ݺ������� ���� ���� �� �ַ� ���
		
//		int count=1;
//		LABEL:
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j==3) {
//					continue LABEL;
//				}
//				System.out.println("�ȳ��ϼ���."+(count++));
//			}
//		}
//		System.out.println("�ݺ��� ���� �ڵ�");
		
		
		//break ��;
		//�ݺ����� ����� ���� ���� ������ �ٷ� ���
		//��ø �ݺ����� �� ���� ��� �� �ַ� ���
		
		int count=1;
		LABEL:
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					break LABEL;
				}
				System.out.println("�ȳ��ϼ���."+(count++));
			}
		}
		System.out.println("�ݺ��� ���� �ڵ�");
		

	}

}
