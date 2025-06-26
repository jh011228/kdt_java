package variable;

public class Variable03 {
	public static void main(String[] args) {
		//1)문자부터 시작한다
//		int 1num = 10; //숫자부터 시작시 오류 발생
		int num1 = 10;
		int nu1m = 10;
//		int num1 = 100 //같은 영역 내에서 같은 이름의 변수 선언시 오류발생
		
		//2)특수문자 사용 x (단 _와 $ 가능)
//		int @#$%^ = 100; //특수기호 선언시 오류 발생
		int a$b_ = 100; //가능하지만 권장 x
		int _ab$ = 100; //가능하지만 권장 x
		System.out.println(a$b_); //가능하지만 권장 x
		System.out.println(_ab$); //가능하지만 권장 x
		
		//3) 공백 사용 x (카멜표기법, 스네이크표기법, 파스칼표기법 등 활용)
//		String use name = "최장현";
		String userName = "최장현";
		//첫단어 소문자 시작, 단어 바뀔 때 첫문자 대문자 작성(카멜표기법, 변수명/메소드명 작성시)
		String user_name = "최장현";
		//첫단어 소문자 시작, 단어 바뀔 때 언더바(_)로 연결해서 작성(스네이크 표기법, 상수 작성시)
		String UserName = "최장현";
		//첫단어의 첫문자를 대문자로 시작, 단어가 바뀔 때 첫문자 대문자로 작성(파스칼표기법, 클래스명 작성시)
		
		//4) 키워드(예약어) 사용할 수 없다
//		int int = 10;
//		int for = 10;
//		int public = 10;
		
		//5)되도록 소문자 시작
		int Abc = 100;
		int abc = 200;
		System.out.println(Abc);
		System.out.println(abc);
		
	}
}
