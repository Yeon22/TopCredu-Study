package �÷��ǰ���Ǯ��;

import java.util.Vector;

public class test2 {

	public static void main(String[] args) {
//		3. Vector�� 1���� 10���� ���� ��� ¦���� ����Ͻÿ�.
		
		Vector<Integer> vec  = new Vector<Integer>(); 
		
		for(int i =0; i<=10;i++) {
			vec.add(i);
		}
		
		for(int i =0; i<vec.size(); i++)
		{
			if(i%2==0)
			{
				System.out.println(vec.get(i));
			}
		}
	}

}
