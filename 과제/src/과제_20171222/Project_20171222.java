package ����_20171222;

public class Project_20171222 {

	public static void main(String[] args) {
//		1.��ȭ��ȣ(010-1234-5678)���� ����(010)�� �����Ͻÿ�.
		String phoneNo = "010-1234-5678";
		System.out.println("������ "+phoneNo.subSequence(0, 3)+"�Դϴ�.");
		
		
//		2.��ȭ��ȣ(010-1234-5678)���� '-'�� �����Ͻÿ�.
//		=>01012345678 �� �����ϱ�
		String arr[] = phoneNo.split("-");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
//		3. ��ǰ�ڵ�(E20160001)���� ��ǰī�װ�('E')�� �����Ͻÿ�.
		String code = "E20160001";
		System.out.println("��ǰ ī�װ� "+code.charAt(0)+"�Դϴ�.");
		
		
//		4. ��ǰ�ڵ�(E20160001)���� �⵵('2016')�� �����Ͻÿ�.
		System.out.println("�⵵�� "+code.subSequence(1, 5)+"�Դϴ�.");
		
		
//		5. �ּҷ� ���ڿ��� �и��Ͻÿ�.
//		ȫ�浿,010-1111-2222,hkd@hkd.com
		String name = "ȫ�浿";
		String hPhone = "010-1111-2222";
		String email = "hkd@hkd.com";
		String data = name+","+hPhone+","+email;
		
		String HongArray[] = data.split(",");
		for(int i=0; i<HongArray.length; i++) {
			System.out.println(HongArray[i]);
		}

	}

}
