package 변수2;

public class Test1_2 {

	public static void main(String[] args) {
		// 틀린 코드 부분을 설명하시오.
		byte a = 10;
		byte b = 30;
		int c = a * b;
		//연산을 할 때는 자료형이 int형이여야 한다.
		
		// 틀린 코드 부분을 고쳐주세요.
		float a1 = 0.101f;
		float b1 = 0.899f;
		//float자료형은 리터럴 뒤에 f 또는 F를 붙여야 한다.		
		System.out.println(a1);
		System.out.println(b1);
		
		/* 여러분은 세븐일레븐 포스기 프로그램 개발자가 되었습니다.
		 * 아래 화면과 같이 출력될 수 있게 해주세요. 상품내용은 변수로 담아서 처리해 보세요.
		 */
		int no = 1;
		String prd = "농심)츄파츕스200";
		int prc = 200;
		int qty = 1;
		int disc = 0;
		int ript = 200;
		String e = " | ";
		
		System.out.println(" NO|     상품명           |  단가   | 수량 | 할인 | 영수액 | 비고 |");
		System.out.println(" "+no+e+prd+e+" "+prc+e+qty+" "+e+" "+disc+e+ript+e+" "+e);
	}

}
