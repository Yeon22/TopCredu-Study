package ���̹�;

public class Naver {

	public static void main(String[] args) {
		System.out.println("���̹��� ���Ű��� ȯ���մϴ�.");
		Join member = new Join();
		
		member.id = "abcd";
		member.pw = "*****";
		member.pwCheck = "*****";
		member.name = "ȫ�浿";
		member.mf = '��';
		member.phone = "010-3333-3333";
		member.phoneCheck = "5678";
		member.emailCheck = "abcd@naver.com";
		
		//����ϱ�
		member.Print();
		
		String pen = member.�����ϱ�("���� �������ϴ�.");
		System.out.println(pen);
		
		
		//�޼ҵ�
		//�Լ�
		
//		void �Լ���() {
//			
//		}
		
//		int �ռ���(int a){
//			return 1;
//		}
		
	}

}
