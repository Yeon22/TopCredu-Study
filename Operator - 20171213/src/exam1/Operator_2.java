package exam1;

public class Operator_2 {

	public static void main(String[] args) {
		//x = x+y     ->     x+=y
		//x = x-y     ->     x-=y
		//x = x*y     ->     x*=y
		//x = x/y     ->     x/=y
		//x = x%y     ->     x%=y
		
		int a = 10;
		//���� a�� ��� �ִ� ���� 2�� ���ϰ� �� ���� ���� a�� �����Ѵ�.
		a += 2;
		//a���� ������ �ý��� �ֿܼ� ����ϰ� ���� ����. ���� a�� ��´�.
		System.out.println(a);
		
		//���� a�� ��� �ִ� ���� 5�� ���� �������� ���� a�� �����Ѵ�.
		a %= 5;
		System.out.println(a);
		
	}

}
