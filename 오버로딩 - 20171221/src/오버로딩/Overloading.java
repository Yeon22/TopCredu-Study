package �����ε�;

class Calculator{
	//�����ε� 
	//����, �Ű����� ������ �ٸ��ų�
	//Ÿ���� �ٸ���
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.0f, 20.1f);
	}

}
