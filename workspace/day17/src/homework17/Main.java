package homework17;
//3. 문자열의 쉼표를 느낌표로 바꿔서 출력하는 프로그램(람다식 활용, 익명클래스 먼저 작성)
//인터페이스 : StringInter
//메소드   : String modify(String str);    매개변수 o , 리턴값 o      
//메인 클래스 : Main
//메소드 : main메소드
//   String nation = "Korea,Spain,Germany,America";
public class Main {
	public static void main(String[] args) {
		String nation = "Korea,Spain,Germany,America";
		StringInter si = (a) -> a.replace(",", "!");
		System.out.println(si.modify(nation));
		
		
		
		Account ac = new Account();
		try {
			ac.withdraw(500);
		} catch (NomoneyException e) {
			e.printStackTrace();
		}
	}
}
