package ����_20180102;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Book{
	String BookName;
	String Author;
	String Publisher;
	int Price;
	
	public Book(String bookname, String author, String publisher, int price) {
		this.BookName = bookname;
		this.Author = author;
		this.Publisher = publisher;
		this.Price = price;
	}
}

public class Project_20180102_�ʱ� {

	public static void main(String[] args) {
//		1.å����, ����, ���ǻ�, ������ ArrayList�� �����ϰ� ����Ͻÿ�.
		ArrayList<Book> arr = new ArrayList<Book>();
		arr.add(new Book("Policeman", "Mai", "Kyobo", 12900));
		arr.add(new Book("Snowman", "Harry", "Kyobo", 15000));
		arr.add(new Book("Knightkill", "Murakami", "Kyobo", 16000));
		for(int i=0; i<arr.size(); i++) {
			System.out.println("å ������ : " + arr.get(i).BookName);
			System.out.println("���ڴ� : " + arr.get(i).Author);
			System.out.println("���ǻ�� : " + arr.get(i).Publisher);
			System.out.println("������ : " + arr.get(i).Price);
		}
		
		
//		2.å����, ����, ���ǻ�, ������ ArrayList�� Ű����� �Է��� �ؼ�
//		�����͸� �Է��ϰ�  ����Ͻÿ�. 
		ArrayList<Book> bk = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		System.out.print("å ������ �Է��ϼ���. : ");
		String name = sc.next();
		System.out.print("���ڸ� �Է��ϼ���. : ");
		String auth = sc.next();
		System.out.print("���ǻ縦 �Է��ϼ���. : ");
		String pb = sc.next();
		System.out.print("������ �Է��ϼ���. : ");
		int pri = sc.nextInt();
			
		bk.add(new Book(name, auth, pb, pri));
		
		for(int i=0; i<bk.size(); i++) {
			System.out.println("å ������ : " + bk.get(i).BookName);
			System.out.println("���ڴ� : " + bk.get(i).Author);
			System.out.println("���ǻ�� : " + bk.get(i).Publisher);
			System.out.println("������ : " + bk.get(i).Price);
		}
		
		
//		3. Vector�� 1���� 10���� ���� ��� ¦���� ����Ͻÿ�.
		Vector<Integer> vc = new Vector<Integer>();
		for(int i=1; i<11; i++) {
			vc.add(i);
		}
		for(int i=0; i<vc.size(); i++) {
			int result = vc.get(i);
			if(result%2 == 0) {
				System.out.println(result);
			}
		}
		
		
//		4. Ű����� ���ڿ��� �Է� �޾� ArrayList�� �����ϰ� ���� ª�� �̸��� ����Ͻÿ�.
		ArrayList<String> str = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String pname = scanner.nextLine();
			str.add(pname);
		}
		
		int Minname = 0;
		for(int i=0; i<str.size(); i++) {
			if(str.get(Minname).length() < str.get(i).length()) {
				Minname = i;
			}
		}
		System.out.println("\n���� ª�� �̸��� : " + str.get(Minname));
		
	}

}
