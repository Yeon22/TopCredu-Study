package ��¹��Ǵپ���Ȱ��;

public class PrintExapm {

	public static void main(String[] args) {
		//����, ������
		char a = 'A';
		System.out.printf("[%c] \n",'A'); //[A]
		System.out.printf("[%d] \n", 7); //%d int ������ �´�.
		System.out.printf("[%5d] \n", 7); //%5d 5���� ������ �̸� ��� ������ ������ ���ش�.
		System.out.printf("[%-5d] \n", 7); //%-5d 5���� ������ �̸���� ���� ������ ���ش�.
		System.out.printf("[%05d] \n", 7);
		System.out.printf("[%+d] \n", 12345); //%+d    +��ȣ�� �� �ѷ��ش�.
		System.out.printf("[%d] \n", -12345);
		System.out.printf("[%d] \n", -12345); //%d ����� +����, -�� ���´�.
		
		//8����, 16����
		System.out.printf("[%x] \n", 0xff); //16������ ǥ�����ִ� �������
		System.out.printf("[%X] \n", 0xff); //16������ ǥ�� �빮��
		System.out.printf("[%o] \n", 0123); //8���� ǥ��
		
		//�Ҽ���
		//�Ҽ��� �ڸ���
		System.out.printf("[%f] \n", 3.141592); //�Ǽ��� ����
		System.out.printf("[%5f] \n", 3.141592); 
		System.out.printf("[%.2f] \n", 3.141592);
		//�� 20���� �ڸ����� ������ �����ϰ� �Ҽ��� 5° �ڸ�����
		System.out.printf("[%20.5f] \n", 3.141592);
		System.out.printf("[%-20.5f] \n", 3.141592);
		
		//���ڿ���
		System.out.printf("[%s] \n", "�ȳ��ϼ���");
		System.out.printf("[%10s] \n", "�ȳ��ϼ���");
		System.out.printf("[%-10s] \n", "�ȳ��ϼ���");
		System.out.printf("[%2.2s] \n", "�ȳ��ϼ���");
		System.out.printf("[%3.2s] \n", "�ȳ��ϼ���");
		
		//\t�� ���̴�.
		System.out.printf("\t %d" , 1);
	}

}
