package ��ü��Ÿ�Ա���;

class Person{};
class Student extends Person{};
class Researcher extends Person{};
class Professor extends Researcher{};

public class InstanceofExample {

	public static void main(String[] args) {
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
		
		if(jee instanceof Student) //jee�� Student Ÿ���̹Ƿ� true
			System.out.println("jee�� Student Ÿ��");
		if(jee instanceof Researcher) //jee�� Researcher Ÿ���� �ƴϹǷ� false
			System.out.println("jee�� Researcher Ÿ��");
		if(kim instanceof Student) //kim�� Student Ÿ���� �ƴϹǷ� false
			System.out.println("kim�� Student Ÿ��");
		if(kim instanceof Professor) //kim�� Professor Ÿ���̹Ƿ� true
			System.out.println("kim�� Professor Ÿ��");
		if(kim instanceof Researcher) //kim�� Researcher Ÿ���̱⵵ �ϹǷ� true
			System.out.println("kim�� Researcher Ÿ��");
		if(kim instanceof Person) //kim�� Person Ÿ���̱⵵ �ϹǷ� true
			System.out.println("kim�� Person Ÿ��");
		if(lee instanceof Professor) //lee�� Professor Ÿ���� �ƴϹǷ� false
			System.out.println("lee�� Professor Ÿ��");
		if("java" instanceof String) //"java"�� String Ÿ���� �ν��Ͻ��̹Ƿ� true
			System.out.println("java�� String Ÿ��");
	}

}
