package ���;

public class test {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "ȫ�浿";
		p.age = 22;
		p.weight = 75.0f;
		
		System.out.println(p.eat());
		System.out.println(p.sleep());
		
		
		Student st = new Student();
		
		st.name = "ȫ�ر�";
		st.age = 10;
		st.weight = 40.0f;
		st.stuNo = 10;
		
		System.out.println(st.eat());
		System.out.println(st.sleep());
		System.out.println(st.study());

	}

}
