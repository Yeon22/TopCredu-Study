package ���׸�;

class MyClass<T>{
	T val;
	
	void set(T a) {
		val = a;
	}
	
	T get() {
		return val;
	}
}

public class Test {

	public static void main(String[] args) {
		
		MyClass<String> s = new MyClass<String>();
		s.set("���ڿ�");
		System.out.println(s.get());
		
		MyClass<Integer> i = new MyClass<Integer>();
		i.set(1);
		System.out.println(i.get());
	}

}
