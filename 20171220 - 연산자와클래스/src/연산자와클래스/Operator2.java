package �����ڿ�Ŭ����;

public class Operator2 {
	int i=0, j=0;
	
	//���� ����
	void Operation(int a) {
		i = a;
		j = i++;
	}
	
	//���� ����
	void PreOperation(int a) {
		i = a;
		j = ++i;
	}
	
	//���
	void Print(){
		System.out.println("j = i++; ���� ��, i="+i+", j="+j);
	}
	
	void Print2(){
		System.out.println("j = ++i; ���� ��, i="+i+", j="+j);
	}

}
