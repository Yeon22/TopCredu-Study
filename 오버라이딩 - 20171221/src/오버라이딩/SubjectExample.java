package �������̵�;

//�������̵� override �������̵�
//���� Ŭ������ �޼ҵ带 ���� Ŭ�������� �ٽ� �����ϴ� ���� ���Ѵ�.

class Subject{
	String name;
	
	void printInfo() {
		System.out.println("����� : "+name);
	}
}

class MajorSubject extends Subject{
	String targetGrader;
	
	void printInfo() {
//		super.printInfo();
		System.out.println("��� �г� : "+targetGrader);
	}
}

public class SubjectExample {

	public static void main(String[] args) {
//		Subject sb = new Subject();
//		sb.name = "�ڹ�";
//		sb.printInfo();
//		
//		MajorSubject msb = new MajorSubject();
//		msb.targetGrader = "�������̵�";
//		msb.printInfo();
//		
//		//��ĳ����
//		Subject ss = new MajorSubject();
//		ss.name = "�ڹ�";
//		ss.printInfo();
		
//		Subject ss2 = new Subject();
//		ss2.name = "�ڹ�1111";
//		ss2.printInfo();
//		
//		MajorSubject ms = new MajorSubject();
//		ms.targetGrader = "111";
//		ms.printInfo();
		
		//��ĳ����
		Subject sb = new MajorSubject();
		sb.name = "java";
		
		//�ٿ�ĳ����
		MajorSubject msb = (MajorSubject)sb;
		msb.targetGrader = "dd";
		msb.printInfo();

	}

}
