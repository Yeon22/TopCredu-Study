package �迭;

public class Array4 {

	public static void main(String[] args) {
//		//�ݵ�� �迭 ���� �� �޸𸮵� �־��ְ� ���� �־�� �ȴ�.
//		int intArray[];
//		intArray = new int[10];
//		
//		intArray[4] = 8; //���� intArray �迭�� �޸𸮰� �Ҵ���� �ʾ���
//		System.out.println(intArray[4]);
		
		int intArray[] = new int[5]; //�ε����� 0~4���� ����
		int n = intArray[4];
		System.out.println(n);
		
		//�迭�� ũ��
		int size = intArray.length;
		System.out.println(size);
		
		
		int i[][] = new int[2][5];
		int size1 = i.length; //2
		int size2 = i[0].length; //5
		int size3 = i[1].length; //5
		
		System.out.println(size1); // 2���� �迭�� ���� ����
		System.out.println(size2); // 0��° ���� ���� ���� ����
		System.out.println(size3); // 1��° ���� ���� ���� ����
		
	}

}
