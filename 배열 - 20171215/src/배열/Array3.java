package �迭;

public class Array3 {

	public static void main(String[] args) {
		//������ �ϳ��� �迭�� �ټ��� ���۷����� ���� ����
		
		int intArray[] = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		int myArray[] = intArray;
		
		myArray[1] = 10;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
		
		System.out.println(intArray[1]);
		
		
//		int a[] = {1,2,3};
//		int b[] = new int[3];
//		b[1] = a[1];
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);

	}

}
