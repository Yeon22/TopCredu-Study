package ����2;

public class Test1_2 {

	public static void main(String[] args) {
		// Ʋ�� �ڵ� �κ��� �����Ͻÿ�.
		byte a = 10;
		byte b = 30;
		int c = a * b;
		//������ �� ���� �ڷ����� int���̿��� �Ѵ�.
		
		// Ʋ�� �ڵ� �κ��� �����ּ���.
		float a1 = 0.101f;
		float b1 = 0.899f;
		//float�ڷ����� ���ͷ� �ڿ� f �Ǵ� F�� �ٿ��� �Ѵ�.		
		System.out.println(a1);
		System.out.println(b1);
		
		/* �������� �����Ϸ��� ������ ���α׷� �����ڰ� �Ǿ����ϴ�.
		 * �Ʒ� ȭ��� ���� ��µ� �� �ְ� ���ּ���. ��ǰ������ ������ ��Ƽ� ó���� ������.
		 */
		int no = 1;
		String prd = "���)���Į���200";
		int prc = 200;
		int qty = 1;
		int disc = 0;
		int ript = 200;
		String e = " | ";
		
		System.out.println(" NO|     ��ǰ��           |  �ܰ�   | ���� | ���� | ������ | ��� |");
		System.out.println(" "+no+e+prd+e+" "+prc+e+qty+" "+e+" "+disc+e+ript+e+" "+e);
	}

}
