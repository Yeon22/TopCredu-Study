package ������;

//class Person{
//	String name;
//	int age;
//	
//	//�����ڴ� �ڱ� Ŭ���� �̸��� �Լ���.
//	Person(){
//		name = "ȫ�浿";
//		age = 24;
//	}
//}

public class PersonExample {

	public static void main(String[] args) {
		Person p = new Person("����",22);
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		Person p2 = new Person();
		
		System.out.println(p2.name);
		System.out.println(p2.age);

	}

}
