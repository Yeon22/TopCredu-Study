package ����_20171220;

public class Project_20171220_�߱� {

	public static void main(String[] args) {
//	 6. 4������ ���� MemberŬ������ ����ؼ�
//		"ȫ�浿","�̼���" ��ü�� �����غ�����.

		Member ȫ�浿 = new Member();
		Member �̼��� = new Member();
		
		
//	7. 4��Ŭ������ �̿��ؼ� �̸�,�ּ�,����,���̸� Ű����� �Է¹޴�
//		�Լ��� ����ϴ� �Լ��� ���� ����ϼ���.
		
		ȫ�浿.Input();
		ȫ�浿.Output();
		
		�̼���.Input();
		�̼���.Output();
		
		
//	8. �ζ� ��ȣ �����⸦ �ϼ��Ͻÿ�, for��, �迭 ��� (�ߺ� �ȵǰ� ������)
		
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					--i;
					break;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
