package �÷��ǰ���Ǯ��;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
//		4. Ű����� ���ڿ��� �Է� �޾� ArrayList�� �����ϰ� ���� ª�� �̸��� ����Ͻÿ�.
		
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String s = scanner.next();
			a.add(s);
		}
		
		for(int i =0; i<a.size(); i++)
		{
			String name = a.get(i);
			System.out.println(name);
		}
		
		int lowIndex =0;
		
		for(int i =1; i<a.size(); i++) {
			if(a.get(lowIndex).length()>a.get(i).length()) {
				lowIndex = i;
			}
		}
		System.out.println("���� ª�� �̸���?"+a.get(lowIndex));
		
	}

}
