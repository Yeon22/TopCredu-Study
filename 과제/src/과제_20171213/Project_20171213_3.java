package ����_20171213;

import java.util.Scanner;

public class Project_20171213_3 {

	public static void main(String[] args) {
		float nl = 0;
		float meth = 0;
		float eng = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("���������� �Է��ϼ���.");
		nl = inp.nextFloat();
		System.out.println("���������� �Է��ϼ���.");
		meth = inp.nextFloat();
		System.out.println("���������� �Է��ϼ���.");
		eng = inp.nextFloat();
		
		System.out.println("������ : "+(nl+meth+eng));
		System.out.println("����� : "+(nl+meth+eng)/3);
		
	}

}

