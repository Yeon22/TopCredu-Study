package �߻�Ŭ����;

////�߻�Ŭ����
//abstract class DObject{
//	//�߻�޼ҵ�
//	abstract public void draw();
//}

interface DObject{
	abstract public void draw();
}

class Line implements DObject{
	public void draw() {
		System.out.println("����");
	}
}

class Rectangle implements DObject{
	public void draw() {
		System.out.println("�簢��");
	}
}

public class Example {

	public static void main(String[] args) {
		//�߻�Ŭ������ �ν��Ͻ� �Ұ�
//		DObject d = new DObject();
		
		Line l = new Line();
		l.draw();
		
		DObject d = new Line();
		d.draw();

	}

}
