package Iterator;

import java.util.Iterator;
import java.util.Vector;

import Iterator.Book;

class Book{
	String Title;
	String Author;
	String Company;
	int Price;
	
	public Book(String title, String author, String company, int price) {
		this.Title = title;
		this.Author = author;
		this.Company = company;
		this.Price = price;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Vector<Book> book = new Vector<Book>();
		
		book.add(new Book("Police man", "Mai", "Kyobo", 12700));
		book.add(new Book("Knight kill", "Murasaki", "Kyobo", 13000));
		book.add(new Book("papago", "Naver", "Kyobo", 10000));
		
		// ���ͷ����� ����غ���
		Iterator<Book> it = book.iterator();
		while(it.hasNext()) {
			Book bk = it.next();
			System.out.println("å�̸� : "+bk.Title);
			System.out.println("���� : "+bk.Author);
			System.out.println("���ǻ� : "+bk.Company);
			System.out.println("���� : "+bk.Price);
		}
	}

}
