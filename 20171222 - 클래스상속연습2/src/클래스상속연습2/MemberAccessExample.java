package Ŭ������ӿ���2;

public class MemberAccessExample {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.p = 5;
//		a.n = 5;  n�� private ���, ������ ���� �߻�
		
		b.p = 5;
//		b.n = 5;  n�� private ���, ������ ���� �߻�
		b.setN(10);
		int i = b.getN(); // i�� 10
		
//		b.m = 20;  m�� private ���, ������ ���� �߻�
		b.setM(20);
		System.out.println(b.toString()); // ȭ�鿡 10 20�� ��µ�.

	}

}
