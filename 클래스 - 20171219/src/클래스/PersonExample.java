package Ŭ����;

public class PersonExample {

	public static void main(String[] args) {
		Person a; //Ŭ���� Ÿ������ ����
		
		a = new Person(); // ��ü �������. == �ν��Ͻ� �������.

		a.name = "ȫ�浿";
		a.age = 23;
		a.job = "���";
		a.height = 180.3f;
		a.weight = 75.0f;
		a.area = "����� ������";
		
		//Ŭ���� ���� �� ��ü�� ����
		Person Student = new Person();
		Person Student1 = new Person();
		Student.name = "ȫ�浿";
		Student.age = 11;
		Student.job = "����";
		Student.height = 175.0f;
		Student.weight = 80.0f;
		Student.area = "����";
		
		Student1.name = "�̼���";
		Student1.age = 23;
		Student1.job = "�屺";
		Student1.height = 177.0f;
		Student1.weight = 70.0f;
		Student1.area = "�����";
		
		
//		System.out.println("��� a�� �̸���? "+a.name);
//		System.out.println("��� a�� ���̴�? "+a.age);
//		System.out.println("��� a�� ������? "+a.job);
//		System.out.println("��� a�� Ű��? "+a.height);
//		System.out.println("��� a�� �����Դ�? "+a.weight);
//		System.out.println("��� a�� ������? "+a.area);
//		System.out.println();
//		
//		System.out.println("��� Student�� �̸���? "+Student.name);
//		System.out.println("��� Student�� ���̴�? "+Student.age);
//		System.out.println("��� Student�� ������? "+Student.job);
//		System.out.println("��� Student�� Ű��? "+Student.height);
//		System.out.println("��� Student�� �����Դ�? "+Student.weight);
//		System.out.println("��� Student�� ������? "+Student.area);
//		System.out.println();
//		
//		System.out.println("��� Student1�� �̸���? "+Student1.name);
//		System.out.println("��� Student1�� ���̴�? "+Student1.age);
//		System.out.println("��� Student1�� ������? "+Student1.job);
//		System.out.println("��� Student1�� Ű��? "+Student1.height);
//		System.out.println("��� Student1�� �����Դ�? "+Student1.weight);
//		System.out.println("��� Student1�� ������? "+Student1.area);
//		System.out.println();
		
		
		
		//Ŀ��Ŭ���� ���� ��
		//��ü�ε� �����
		//�����͸� �־��ְ�
		//��µ� �ϱ�
		Coffee cafe = new Coffee();
		cafe.name = "��縶��ƾ";
		cafe.smell = "���ݸ� ��";
		cafe.taste = "�Ÿ�, �ܸ�, ����";
		cafe.price = 30;
		cafe.origin = "����";
		
		System.out.println("Ŀ�� �̸���? "+cafe.name);
		System.out.println("Ŀ�� ������? "+cafe.smell);
		System.out.println("Ŀ�� ����? "+cafe.taste);
		System.out.println("Ŀ�� ������? "+cafe.price);
		System.out.println("Ŀ�� ��������? "+cafe.origin);
		
	}

}
