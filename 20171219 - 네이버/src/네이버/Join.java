package ���̹�;

//ȸ������
public class Join {
	//�ʵ�
	String id;
	String pw;
	String pwCheck;
	String name;
	char mf;
	int birthday;
	String emailCheck;
	String phone;
	String phoneCheck;
	
	//�޼ҵ�
	//����ϱ� �Լ�
	void Print() {
		System.out.println("���̹� ���̵��? "+id);
		System.out.println("���̹� �����? "+pw);
		System.out.println("���������? "+birthday);
		System.out.println("�̸���? "+name);
		System.out.println("������? "+mf);
		System.out.println("�ڵ��� ��ȣ��? "+phone);
		System.out.println("�̸�����? "+emailCheck);
	}
	//�����ϱ�
	String �����ϱ�(String pen) {
		System.out.println(pen);
		System.out.println("�����ϼ̽��ϴ�.");
		return pen;
	}
}
