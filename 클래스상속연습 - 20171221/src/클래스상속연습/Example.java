package Ŭ������ӿ���;

class Sample{
	public int id;
	//������
	public Sample() {
		id = 0;
	}
	public Sample(int x) {
		id = x;
	}
}

class Person{
	public String name;
	public int age;
	
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	public Person(String pName) {
		name = pName;
	}
	//�Լ� �����ε�
	public Person() {
		
	}
}

public class Example {

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.id);
		
		Sample s2 = new Sample(100);
		System.out.println(s2.id);
		
		Person p = new Person("ȫ�浿",200);
		System.out.println(p.name+","+p.age);
		
		Person p2 = new Person("�̼���");
		System.out.println(p2.name+","+p2.age);
		
		Person p3 = new Person();
		System.out.println(p3.name+","+p3.age);

	}

}
