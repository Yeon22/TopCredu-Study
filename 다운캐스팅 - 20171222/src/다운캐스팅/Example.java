package �ٿ�ĳ����;

class DObject{
	void draw() {
		System.out.println("����");
	}
}

class Line extends DObject{
	@Override
	void draw() {
		System.out.println("����");
	}
}

class Rectangle extends DObject{
	@Override
	void draw() {
		System.out.println("�簢��");
	}
}

public class Example {

	public static void main(String[] args) {
//		DObject d = new DObject();
//		d.draw(); //����
		
//		Line l = new Line();
//		l.draw(); //����
		
//		DObject d = new Line();
//		d.draw(); 
//		
//		Line l = (Line)d;
//		l.draw(); //�ٿ�ĳ����
		
//		DObject d2 = new Rectangle();
//		d2.draw(); //��ĳ����
//		
//		Rectangle r = (Rectangle)d2;
//		r.draw(); //�ٿ�ĳ����
		
		DObject d2 = new Line();
		d2 = new Rectangle();
		Rectangle r = (Rectangle)d2;
		r.draw(); //�ٿ� ĳ���� �޸𸮸� �� �־���� �Ѵ�.

	}

}
