package ���;

public class IfTest {

	public static void main(String[] args) {
//		boolean b = true;
//		if(b) {
//			System.out.println("���Դϴ�.");
//		} else {
//			System.out.println("�����Դϴ�.");
//		}
//		System.out.println("����");
		
		//2�� ����� �������� 0�̸� ¦���̴�.
		int i = 11;
//		if(i % 2 == 0) {
//			System.out.println("¦��");
//		}
//		if(i % 3 == 0) { //3�� ������ 
//			System.out.println("3�� ���");
//		}
		
		if(i % 5 == 0)  //5�� ������
			System.out.println("5�� ���");
		else if(i % 5 == 1)
			System.out.println("5�� ��� + 1");
		else
			System.out.println("5�� ��� + 2 Ȥ�� 3 Ȥ�� 4");
	}

}
