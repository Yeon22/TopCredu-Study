package �÷��ǰ���Ǯ��;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	String BookName;
	String Name;
	String Publisher;
	int Price;
	
	public Book() {
	}
	
	public Book(String bookName, String name, String publisher, int price) {
		BookName = bookName;
		Name = name;
		Publisher = publisher;
		Price = price;
	}
}


public class test {

	public static void main(String[] args) {
//		1.å����, ����, ���ǻ�, ������ ArrayList�� �����ϰ� ����Ͻÿ�.
		
//		ArrayList<Book> arr = new ArrayList<Book>();
//		
//		arr.add(new Book("Policeman", "Mai", "Kyobo", 12900));
//		arr.add(new Book("Snowman", "Harry", "Kyobo", 15000));
//		arr.add(new Book("Knightkill", "Murakami", "Kyobo", 16000));
//		
//		for(int i =0; i<arr.size(); i++) {
//			System.out.println("å�̸� : "+arr.get(i).BookName);
//			System.out.println("����    : "+arr.get(i).Name);
//			System.out.println("���ǻ� : "+arr.get(i).Publisher);
//			System.out.println("����    : "+arr.get(i).Price);			
//		}
		
		
		
//		2.å����, ����, ���ǻ�, ������ ArrayList�� Ű����� �Է��� �ؼ�
//		�����͸� �Է��ϰ�  ����Ͻÿ�.
		
		ArrayList<Book> arr = new ArrayList<Book>();
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<3; i++) {
			Book b = new Book();
			System.out.println((i+1)+" å�̸� : ");
			b.BookName = s.next();
			System.out.println((i+1)+" ���� : ");
			b.Name = s.next();
			System.out.println((i+1)+" ���ǻ�: ");
			b.Publisher = s.next();
			System.out.println((i+1)+" ���� : ");
			b.Price = s.nextInt();
			arr.add(b);
		}
		
		for(int i =0; i<arr.size(); i++) {
			System.out.println("å�̸� : "+arr.get(i).BookName);
			System.out.println("����    : "+arr.get(i).Name);
			System.out.println("���ǻ� : "+arr.get(i).Publisher);
			System.out.println("����    : "+arr.get(i).Price);			
		}
		
	}

}
