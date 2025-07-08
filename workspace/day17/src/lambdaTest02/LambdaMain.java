package lambdaTest02;


//람다 실습
public class LambdaMain {
	public static void main(String[] args) {
//		인터페이스명 : CombInter(함수형 인터페이스)
//		두 문자열을 입력받아 연결하는 추상 메소드를 만든다
//		메인메소드에서 익명클래스로 객체화
//		CombInter inter1 = new CombInter() {
//			
//			@Override
//			public string connect(String a, String b) {
//				return a + b;
//			}
//		};
//		inter1.connect("딸기","주스");
		//이름 없애고 -> 추가
		//반환타입 삭제
		//매개변수 타입 삭제
		//매개변수 괄호 1개 이상이므로 생략 x
		//명령문 개수 1개여서 {},; 삭제//하면 return도 같이 삭제(선택)
//		CombInter inter2 = (a,b) -> {return a + b;};
		CombInter inter2 = (str1,str2) -> str1 +str2;
		System.out.println(inter2.connect("나는어제곰탕을먹", "었다"));
		
	}
	
}
