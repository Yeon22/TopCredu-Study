package �޼ҵ�;

class test{
	void Hello() {
		System.out.println("����");
		System.out.println("��ο� �Լ���.");
	}
	
	// String hi = "����";
	void Hello_2(String hi) {
		System.out.println(hi);
		System.out.println("��ο� �Լ�2��.");
	}
	
	String Hello_3(String hi) {
		System.out.println(hi);
		hi = "����";
		return hi;
	}
}

public class Method_1 {

	public static void main(String[] args) {
		// void �Լ���(){
		//		�۾��� �ڵ�
		// }
		
		test t = new test();
		t.Hello();
		System.out.println("����Լ� ������ �Ϸ�Դ�.");
		
		t.Hello_2("����");
		System.out.println("����Լ�2 ������ �Ϸ�Դ�.");
		
		String a = t.Hello_3("����");
		System.out.println(a);

	}

}
