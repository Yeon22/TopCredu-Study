package ��Ʈ����ü;

public class Example {

	public static void main(String[] args) {
		String s = "ȫ�浿";
		String str = new String("�̼���");
		
		System.out.println(s);
		System.out.println(str);
		
		String a = "             hello world             ";
		//���ڿ��� ����
		System.out.println(a.length());
		
		String s1 = a.trim(); //�յ� ���� ����
		System.out.println(s1.length());
		
		String filename = "movie.jpg";
		
		for(int i=0; i<filename.length(); i++) {
			if(filename.charAt(i)=='.') {
				System.out.println("���� ��ġ : "+i);
			}
		}
		
		//��ǰ�ڵ�, f00001(f: food) e001(e: electronic)
		String goodsCode = "f00001";
		if(goodsCode.charAt(0)=='f') {
			System.out.println("food�Դϴ�.");
		} else if(goodsCode.charAt(0)=='e') {
			System.out.println("electronic�Դϴ�.");
		}
		
		// "f0001" f->l
		String goodsCode2 = goodsCode.replace("f", "l");
		System.out.println(goodsCode2);
		
		System.out.println(filename.replace("jpg", "gif"));
		System.out.println(filename);
		
		String id = "hkd";
		String name = "ȫ�浿";
		String job = "����";
		
		String data = id+","+name+","+job;
		System.out.println(data);
		
		String result[] = data.split(",");
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		String result2[] = filename.split("\\.");
		for(int i=0; i<result2.length; i++) {
			System.out.println(result2[i]);
		}
		
		//�ֹε�Ϲ�ȣ���� �޺κ� ���ϱ�
		String jumin = "123456789";
		System.out.println(jumin.substring(6));
		//�ֹε�Ϲ�ȣ ���� ��������
		System.out.println(jumin.subSequence(0, 6)); // 0~5���� ����������.
		
		String text = "abcd";
		System.out.println(text.toUpperCase());
		String text2 = "ABCD";
		System.out.println(text2.toLowerCase());
		
		//���ڿ� �������� ����ϱ�
		StringBuffer text3 = new StringBuffer("abcd");
		System.out.println(text3.reverse());
		
	}

}
